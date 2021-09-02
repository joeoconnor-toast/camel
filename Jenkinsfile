#!/usr/bin/env groovy

@Library('toast@master')

import toastBuild

def discardStrategy
if (env.JOB_BASE_NAME.contains('PR')) {
  discardStrategy = logRotator(
          artifactDaysToKeepStr: '5',
          artifactNumToKeepStr: '',
          daysToKeepStr: '1',
          numToKeepStr: ''
  )
} else {
  discardStrategy = logRotator(
          artifactDaysToKeepStr: '25',
          artifactNumToKeepStr: '',
          daysToKeepStr: '100',
          numToKeepStr: ''
  )
}

properties([
        buildDiscarder(discardStrategy),
        pipelineTriggers([
                githubPush()
        ]),
        [
                $class   : 'ScannerJobProperty',
                doNotScan: false
        ],
])

def build() {
    configFileProvider([
            configFile(
                    fileId: '74d7cabe-50ef-403d-9ee2-d284c734559d',
                    variable: 'GRADLE_PROPERTIES'
            )
    ]) {
      sh(
              encoding: 'UTF-8',
              returnStatus: false,
              returnStdout: false,
              script: './mvnw clean install -Pfastinstall,sourcecheck -pl :camel-core,:camel-main,:camel-management,:camel-metrics,:camel-protobuf,:camel-pulsar,:camel-spring,:camel-test,:camel-testcontainers  -am'
      )
    }
}

def deploy() {
  if (env.JOB_BASE_NAME.contains('PR')) {
    println 'Deployments disabled for pull request builds.'
  } else {
    configFileProvider([
            configFile(
                    fileId: '74d7cabe-50ef-403d-9ee2-d284c734559d',
                    variable: 'GRADLE_PROPERTIES'
            )
    ]) {
      sh(
              encoding: 'UTF-8',
              returnStatus: false,
              returnStdout: false,
              script: 'cp $GRADLE_PROPERTIES gradle.properties; ./gradlew artifactoryPublish --stacktrace --no-daemon'
      )
    }
  }
}

def g2Build = new g2.Build()

toastBuild {
  try {
    stage('pre-build') {
      checkout scm
      env.JAVA_HOME = tool(
              name: 'corretto8',
              type: 'jdk'
      )
    }

    stage('build') {
      build()
    }

    stage('deploy') {
      deploy()
    }
  } catch (e) {
    currentBuild.result = 'FAILURE'
    println e
  } finally {
    stage('post-build') {
      dir(env.WORKSPACE) { deleteDir() }
    }
  }
}

