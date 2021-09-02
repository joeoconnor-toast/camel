/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

def AGENT_LABEL = env.AGENT_LABEL ?: 'ubuntu'
def JDK_NAME = env.JDK_NAME ?: 'adoptopenjdk_hotspot_8u282'
def SUBPROJECTS = env.SUBPROJECTS ?: ':camel-core,:camel-main,:camel-management,:camel-metrics,:camel-protobuf,:camel-pulsar,:camel-spring,:camel-test,:camel-testcontainers'

def MAVEN_PARAMS = "-U -B -e -fae -V -Dnoassembly -Dmaven.compiler.fork=true -Dsurefire.rerunFailingTestsCount=2"

pipeline {

    agent {
        label AGENT_LABEL
    }

    tools {
        jdk JDK_NAME
    }

    environment {
        MAVEN_SKIP_RC = true
    }

    options {
        buildDiscarder(
            logRotator(artifactNumToKeepStr: '5', numToKeepStr: '10')
        )
        disableConcurrentBuilds()
    }

    parameters {
        booleanParam(name: 'CLEAN', defaultValue: true, description: 'Perform the build in clean workspace')
    }

    stages {

        stage('Clean workspace') {
             when {
                 expression { params.CLEAN }
             }
             steps {
                 sh 'git clean -fdx'
           }
        }

        stage('Build only') {
            steps {
                sh "cd init; ../mvnw -U install"
                sh "./mvnw -N install"
                sh "cd tooling; ../mvnw -U -pl !:camel-swagger-rest-dsl-generator  install"
                sh "cd core; ../mvnw -N install"
                sh "cd buildingtools; ../mvnw -U install; ../mvnw -U source:jar install"
                sh "cd parent; ../mvnw -U install"
                sh "cd tooling/parent; ../../mvnw -U install"
                sh "cd tooling/maven/camel-package-maven-plugin; ../../../mvnw -U install; ../../../mvnw -U source:jar install"
                sh "cd core/camel-core; ./mvnw $MAVEN_PARAMS -Dmaven.test.skip.exec=true install"
                sh "cd core/camel-main; ./mvnw $MAVEN_PARAMS -Dmaven.test.skip.exec=true install"
                sh "cd core/camel-management; ./mvnw $MAVEN_PARAMS -Dmaven.test.skip.exec=true install"
                sh "cd components/camel-metrics; ./mvnw $MAVEN_PARAMS -Dmaven.test.skip.exec=true install"
                sh "cd components/camel-protobuf; ./mvnw $MAVEN_PARAMS -Dmaven.test.skip.exec=true install"
                sh "cd components/camel-pulsar; ./mvnw $MAVEN_PARAMS -Dmaven.test.skip.exec=true install"
                sh "cd components/camel-spring; ./mvnw $MAVEN_PARAMS -Dmaven.test.skip.exec=true install"
                sh "cd components/camel-test; ./mvnw $MAVEN_PARAMS -Dmaven.test.skip.exec=true install"
                sh "cd components/camel-test/camel-testcontainers; ./mvnw $MAVEN_PARAMS -Dmaven.test.skip.exec=true install"
            }
        }

        stage('Build & Deploy') {
            when {
                branch 'main'
            }
            steps {
                sh "./mvnw $MAVEN_PARAMS -Pdeploy -Dmaven.test.skip.exec=true clean deploy"
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/*.jar', fingerprint: true
            emailext(
                subject: '${DEFAULT_SUBJECT}',
                body: '${DEFAULT_CONTENT}',
                recipientProviders: [[$class: 'CulpritsRecipientProvider']]
            )
        }

    }
}

