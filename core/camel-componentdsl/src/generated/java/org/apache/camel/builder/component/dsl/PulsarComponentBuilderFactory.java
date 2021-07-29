/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.pulsar.PulsarComponent;

/**
 * Send and receive messages from/to Apache Pulsar messaging system.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface PulsarComponentBuilderFactory {

    /**
     * Pulsar (camel-pulsar)
     * Send and receive messages from/to Apache Pulsar messaging system.
     * 
     * Category: messaging
     * Since: 2.24
     * Maven coordinates: org.apache.camel:camel-pulsar
     * 
     * @return the dsl builder
     */
    static PulsarComponentBuilder pulsar() {
        return new PulsarComponentBuilderImpl();
    }

    /**
     * Builder for the Pulsar component.
     */
    interface PulsarComponentBuilder
            extends
                ComponentBuilder<PulsarComponent> {
        /**
         * Allows to pre-configure the Pulsar component with common options that
         * the endpoints will reuse.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.pulsar.PulsarConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder configuration(
                org.apache.camel.component.pulsar.PulsarConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Group the consumer acknowledgments for the specified time in
         * milliseconds - defaults to 100.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 100
         * Group: consumer
         * 
         * @param ackGroupTimeMillis the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder ackGroupTimeMillis(
                long ackGroupTimeMillis) {
            doSetProperty("ackGroupTimeMillis", ackGroupTimeMillis);
            return this;
        }
        /**
         * Timeout for unacknowledged messages in milliseconds - defaults to
         * 10000.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 10000
         * Group: consumer
         * 
         * @param ackTimeoutMillis the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder ackTimeoutMillis(long ackTimeoutMillis) {
            doSetProperty("ackTimeoutMillis", ackTimeoutMillis);
            return this;
        }
        /**
         * Whether to allow manual message acknowledgements. If this option is
         * enabled, then messages are not acknowledged automatically after
         * successful route completion. Instead, an instance of
         * PulsarMessageReceipt is stored as a header on the
         * org.apache.camel.Exchange. Messages can then be acknowledged using
         * PulsarMessageReceipt at any time before the ackTimeout occurs.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param allowManualAcknowledgement the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder allowManualAcknowledgement(
                boolean allowManualAcknowledgement) {
            doSetProperty("allowManualAcknowledgement", allowManualAcknowledgement);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Name of the consumer when subscription is EXCLUSIVE.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: sole-consumer
         * Group: consumer
         * 
         * @param consumerName the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder consumerName(
                java.lang.String consumerName) {
            doSetProperty("consumerName", consumerName);
            return this;
        }
        /**
         * Prefix to add to consumer names when a SHARED or FAILOVER
         * subscription is used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: cons
         * Group: consumer
         * 
         * @param consumerNamePrefix the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder consumerNamePrefix(
                java.lang.String consumerNamePrefix) {
            doSetProperty("consumerNamePrefix", consumerNamePrefix);
            return this;
        }
        /**
         * Size of the consumer queue - defaults to 10.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 10
         * Group: consumer
         * 
         * @param consumerQueueSize the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder consumerQueueSize(int consumerQueueSize) {
            doSetProperty("consumerQueueSize", consumerQueueSize);
            return this;
        }
        /**
         * Name of the topic where the messages which fail maxRedeliverCount
         * times will be sent. Note: if not set, default topic name will be
         * topicName-subscriptionName-DLQ.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param deadLetterTopic the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder deadLetterTopic(
                java.lang.String deadLetterTopic) {
            doSetProperty("deadLetterTopic", deadLetterTopic);
            return this;
        }
        /**
         * Maximum number of times that a message will be redelivered before
         * being sent to the dead letter queue. If this value is not set, no
         * Dead Letter Policy will be created.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param maxRedeliverCount the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder maxRedeliverCount(
                java.lang.Integer maxRedeliverCount) {
            doSetProperty("maxRedeliverCount", maxRedeliverCount);
            return this;
        }
        /**
         * Whether to use the messageListener interface, or to receive messages
         * using a separate thread pool.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param messageListener the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder messageListener(boolean messageListener) {
            doSetProperty("messageListener", messageListener);
            return this;
        }
        /**
         * Set the negative acknowledgement delay.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 60000000
         * Group: consumer
         * 
         * @param negativeAckRedeliveryDelayMicros the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder negativeAckRedeliveryDelayMicros(
                long negativeAckRedeliveryDelayMicros) {
            doSetProperty("negativeAckRedeliveryDelayMicros", negativeAckRedeliveryDelayMicros);
            return this;
        }
        /**
         * Number of consumers - defaults to 1.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param numberOfConsumers the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder numberOfConsumers(int numberOfConsumers) {
            doSetProperty("numberOfConsumers", numberOfConsumers);
            return this;
        }
        /**
         * Number of threads to receive and handle messages when using a
         * separate thread pool.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param numberOfConsumerThreads the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder numberOfConsumerThreads(
                int numberOfConsumerThreads) {
            doSetProperty("numberOfConsumerThreads", numberOfConsumerThreads);
            return this;
        }
        /**
         * Enable compacted topic reading.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param readCompacted the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder readCompacted(boolean readCompacted) {
            doSetProperty("readCompacted", readCompacted);
            return this;
        }
        /**
         * Control the initial position in the topic of a newly created
         * subscription. Default is latest message.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.pulsar.utils.consumers.SubscriptionInitialPosition&lt;/code&gt; type.
         * 
         * Default: LATEST
         * Group: consumer
         * 
         * @param subscriptionInitialPosition the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder subscriptionInitialPosition(
                org.apache.camel.component.pulsar.utils.consumers.SubscriptionInitialPosition subscriptionInitialPosition) {
            doSetProperty("subscriptionInitialPosition", subscriptionInitialPosition);
            return this;
        }
        /**
         * Name of the subscription to use.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: subs
         * Group: consumer
         * 
         * @param subscriptionName the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder subscriptionName(
                java.lang.String subscriptionName) {
            doSetProperty("subscriptionName", subscriptionName);
            return this;
        }
        /**
         * Determines to which topics this consumer should be subscribed to -
         * Persistent, Non-Persistent, or both. Only used with pattern
         * subscriptions.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.pulsar.client.api.RegexSubscriptionMode&lt;/code&gt; type.
         * 
         * Default: PersistentOnly
         * Group: consumer
         * 
         * @param subscriptionTopicsMode the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder subscriptionTopicsMode(
                org.apache.pulsar.client.api.RegexSubscriptionMode subscriptionTopicsMode) {
            doSetProperty("subscriptionTopicsMode", subscriptionTopicsMode);
            return this;
        }
        /**
         * Type of the subscription EXCLUSIVESHAREDFAILOVERKEY_SHARED, defaults
         * to EXCLUSIVE.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.pulsar.utils.consumers.SubscriptionType&lt;/code&gt; type.
         * 
         * Default: EXCLUSIVE
         * Group: consumer
         * 
         * @param subscriptionType the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder subscriptionType(
                org.apache.camel.component.pulsar.utils.consumers.SubscriptionType subscriptionType) {
            doSetProperty("subscriptionType", subscriptionType);
            return this;
        }
        /**
         * Whether the topic is a pattern (regular expression) that allows the
         * consumer to subscribe to all matching topics in the namespace.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param topicsPattern the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder topicsPattern(boolean topicsPattern) {
            doSetProperty("topicsPattern", topicsPattern);
            return this;
        }
        /**
         * Provide a factory to create an alternate implementation of
         * PulsarMessageReceipt.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.pulsar.PulsarMessageReceiptFactory&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param pulsarMessageReceiptFactory the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder pulsarMessageReceiptFactory(
                org.apache.camel.component.pulsar.PulsarMessageReceiptFactory pulsarMessageReceiptFactory) {
            doSetProperty("pulsarMessageReceiptFactory", pulsarMessageReceiptFactory);
            return this;
        }
        /**
         * Control batching method used by the producer.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.pulsar.client.api.BatcherBuilder&lt;/code&gt;
         * type.
         * 
         * Default: DEFAULT
         * Group: producer
         * 
         * @param batcherBuilder the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder batcherBuilder(
                org.apache.pulsar.client.api.BatcherBuilder batcherBuilder) {
            doSetProperty("batcherBuilder", batcherBuilder);
            return this;
        }
        /**
         * Control whether automatic batching of messages is enabled for the
         * producer.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param batchingEnabled the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder batchingEnabled(boolean batchingEnabled) {
            doSetProperty("batchingEnabled", batchingEnabled);
            return this;
        }
        /**
         * The maximum size to batch messages.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1000
         * Group: producer
         * 
         * @param batchingMaxMessages the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder batchingMaxMessages(
                int batchingMaxMessages) {
            doSetProperty("batchingMaxMessages", batchingMaxMessages);
            return this;
        }
        /**
         * The maximum time period within which the messages sent will be
         * batched if batchingEnabled is true.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 1000
         * Group: producer
         * 
         * @param batchingMaxPublishDelayMicros the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder batchingMaxPublishDelayMicros(
                long batchingMaxPublishDelayMicros) {
            doSetProperty("batchingMaxPublishDelayMicros", batchingMaxPublishDelayMicros);
            return this;
        }
        /**
         * Whether to block the producing thread if pending messages queue is
         * full or to throw a ProducerQueueIsFullError.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param blockIfQueueFull the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder blockIfQueueFull(boolean blockIfQueueFull) {
            doSetProperty("blockIfQueueFull", blockIfQueueFull);
            return this;
        }
        /**
         * Compression type to use.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.pulsar.client.api.CompressionType&lt;/code&gt;
         * type.
         * 
         * Default: NONE
         * Group: producer
         * 
         * @param compressionType the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder compressionType(
                org.apache.pulsar.client.api.CompressionType compressionType) {
            doSetProperty("compressionType", compressionType);
            return this;
        }
        /**
         * The first message published will have a sequence Id of
         * initialSequenceId 1.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: -1
         * Group: producer
         * 
         * @param initialSequenceId the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder initialSequenceId(long initialSequenceId) {
            doSetProperty("initialSequenceId", initialSequenceId);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Size of the pending massages queue. When the queue is full, by
         * default, any further sends will fail unless blockIfQueueFull=true.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1000
         * Group: producer
         * 
         * @param maxPendingMessages the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder maxPendingMessages(int maxPendingMessages) {
            doSetProperty("maxPendingMessages", maxPendingMessages);
            return this;
        }
        /**
         * The maximum number of pending messages for partitioned topics. The
         * maxPendingMessages value will be reduced if (number of partitions
         * maxPendingMessages) exceeds this value. Partitioned topics have a
         * pending message queue for each partition.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 50000
         * Group: producer
         * 
         * @param maxPendingMessagesAcrossPartitions the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder maxPendingMessagesAcrossPartitions(
                int maxPendingMessagesAcrossPartitions) {
            doSetProperty("maxPendingMessagesAcrossPartitions", maxPendingMessagesAcrossPartitions);
            return this;
        }
        /**
         * Custom Message Router to use.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.pulsar.client.api.MessageRouter&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param messageRouter the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder messageRouter(
                org.apache.pulsar.client.api.MessageRouter messageRouter) {
            doSetProperty("messageRouter", messageRouter);
            return this;
        }
        /**
         * Message Routing Mode to use.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.pulsar.client.api.MessageRoutingMode&lt;/code&gt; type.
         * 
         * Default: RoundRobinPartition
         * Group: producer
         * 
         * @param messageRoutingMode the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder messageRoutingMode(
                org.apache.pulsar.client.api.MessageRoutingMode messageRoutingMode) {
            doSetProperty("messageRoutingMode", messageRoutingMode);
            return this;
        }
        /**
         * Name of the producer. If unset, lets Pulsar select a unique
         * identifier.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param producerName the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder producerName(
                java.lang.String producerName) {
            doSetProperty("producerName", producerName);
            return this;
        }
        /**
         * Send timeout in milliseconds.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 30000
         * Group: producer
         * 
         * @param sendTimeoutMs the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder sendTimeoutMs(int sendTimeoutMs) {
            doSetProperty("sendTimeoutMs", sendTimeoutMs);
            return this;
        }
        /**
         * The pulsar auto configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.pulsar.utils.AutoConfiguration&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param autoConfiguration the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder autoConfiguration(
                org.apache.camel.component.pulsar.utils.AutoConfiguration autoConfiguration) {
            doSetProperty("autoConfiguration", autoConfiguration);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * The pulsar client.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.pulsar.client.api.PulsarClient&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param pulsarClient the value to set
         * @return the dsl builder
         */
        default PulsarComponentBuilder pulsarClient(
                org.apache.pulsar.client.api.PulsarClient pulsarClient) {
            doSetProperty("pulsarClient", pulsarClient);
            return this;
        }
    }

    class PulsarComponentBuilderImpl
            extends
                AbstractComponentBuilder<PulsarComponent>
            implements
                PulsarComponentBuilder {
        @Override
        protected PulsarComponent buildConcreteComponent() {
            return new PulsarComponent();
        }
        private org.apache.camel.component.pulsar.PulsarConfiguration getOrCreateConfiguration(
                org.apache.camel.component.pulsar.PulsarComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.pulsar.PulsarConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((PulsarComponent) component).setConfiguration((org.apache.camel.component.pulsar.PulsarConfiguration) value); return true;
            case "ackGroupTimeMillis": getOrCreateConfiguration((PulsarComponent) component).setAckGroupTimeMillis((long) value); return true;
            case "ackTimeoutMillis": getOrCreateConfiguration((PulsarComponent) component).setAckTimeoutMillis((long) value); return true;
            case "allowManualAcknowledgement": getOrCreateConfiguration((PulsarComponent) component).setAllowManualAcknowledgement((boolean) value); return true;
            case "bridgeErrorHandler": ((PulsarComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "consumerName": getOrCreateConfiguration((PulsarComponent) component).setConsumerName((java.lang.String) value); return true;
            case "consumerNamePrefix": getOrCreateConfiguration((PulsarComponent) component).setConsumerNamePrefix((java.lang.String) value); return true;
            case "consumerQueueSize": getOrCreateConfiguration((PulsarComponent) component).setConsumerQueueSize((int) value); return true;
            case "deadLetterTopic": getOrCreateConfiguration((PulsarComponent) component).setDeadLetterTopic((java.lang.String) value); return true;
            case "maxRedeliverCount": getOrCreateConfiguration((PulsarComponent) component).setMaxRedeliverCount((java.lang.Integer) value); return true;
            case "messageListener": getOrCreateConfiguration((PulsarComponent) component).setMessageListener((boolean) value); return true;
            case "negativeAckRedeliveryDelayMicros": getOrCreateConfiguration((PulsarComponent) component).setNegativeAckRedeliveryDelayMicros((long) value); return true;
            case "numberOfConsumers": getOrCreateConfiguration((PulsarComponent) component).setNumberOfConsumers((int) value); return true;
            case "numberOfConsumerThreads": getOrCreateConfiguration((PulsarComponent) component).setNumberOfConsumerThreads((int) value); return true;
            case "readCompacted": getOrCreateConfiguration((PulsarComponent) component).setReadCompacted((boolean) value); return true;
            case "subscriptionInitialPosition": getOrCreateConfiguration((PulsarComponent) component).setSubscriptionInitialPosition((org.apache.camel.component.pulsar.utils.consumers.SubscriptionInitialPosition) value); return true;
            case "subscriptionName": getOrCreateConfiguration((PulsarComponent) component).setSubscriptionName((java.lang.String) value); return true;
            case "subscriptionTopicsMode": getOrCreateConfiguration((PulsarComponent) component).setSubscriptionTopicsMode((org.apache.pulsar.client.api.RegexSubscriptionMode) value); return true;
            case "subscriptionType": getOrCreateConfiguration((PulsarComponent) component).setSubscriptionType((org.apache.camel.component.pulsar.utils.consumers.SubscriptionType) value); return true;
            case "topicsPattern": getOrCreateConfiguration((PulsarComponent) component).setTopicsPattern((boolean) value); return true;
            case "pulsarMessageReceiptFactory": ((PulsarComponent) component).setPulsarMessageReceiptFactory((org.apache.camel.component.pulsar.PulsarMessageReceiptFactory) value); return true;
            case "batcherBuilder": getOrCreateConfiguration((PulsarComponent) component).setBatcherBuilder((org.apache.pulsar.client.api.BatcherBuilder) value); return true;
            case "batchingEnabled": getOrCreateConfiguration((PulsarComponent) component).setBatchingEnabled((boolean) value); return true;
            case "batchingMaxMessages": getOrCreateConfiguration((PulsarComponent) component).setBatchingMaxMessages((int) value); return true;
            case "batchingMaxPublishDelayMicros": getOrCreateConfiguration((PulsarComponent) component).setBatchingMaxPublishDelayMicros((long) value); return true;
            case "blockIfQueueFull": getOrCreateConfiguration((PulsarComponent) component).setBlockIfQueueFull((boolean) value); return true;
            case "compressionType": getOrCreateConfiguration((PulsarComponent) component).setCompressionType((org.apache.pulsar.client.api.CompressionType) value); return true;
            case "initialSequenceId": getOrCreateConfiguration((PulsarComponent) component).setInitialSequenceId((long) value); return true;
            case "lazyStartProducer": ((PulsarComponent) component).setLazyStartProducer((boolean) value); return true;
            case "maxPendingMessages": getOrCreateConfiguration((PulsarComponent) component).setMaxPendingMessages((int) value); return true;
            case "maxPendingMessagesAcrossPartitions": getOrCreateConfiguration((PulsarComponent) component).setMaxPendingMessagesAcrossPartitions((int) value); return true;
            case "messageRouter": getOrCreateConfiguration((PulsarComponent) component).setMessageRouter((org.apache.pulsar.client.api.MessageRouter) value); return true;
            case "messageRoutingMode": getOrCreateConfiguration((PulsarComponent) component).setMessageRoutingMode((org.apache.pulsar.client.api.MessageRoutingMode) value); return true;
            case "producerName": getOrCreateConfiguration((PulsarComponent) component).setProducerName((java.lang.String) value); return true;
            case "sendTimeoutMs": getOrCreateConfiguration((PulsarComponent) component).setSendTimeoutMs((int) value); return true;
            case "autoConfiguration": ((PulsarComponent) component).setAutoConfiguration((org.apache.camel.component.pulsar.utils.AutoConfiguration) value); return true;
            case "autowiredEnabled": ((PulsarComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "pulsarClient": ((PulsarComponent) component).setPulsarClient((org.apache.pulsar.client.api.PulsarClient) value); return true;
            default: return false;
            }
        }
    }
}