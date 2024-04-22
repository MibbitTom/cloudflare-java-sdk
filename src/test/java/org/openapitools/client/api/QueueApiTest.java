/*
 * Cloudflare API
 * To get started using Cloudflare's products and services via the API, refer to [how to interact with Cloudflare](https://developers.cloudflare.com/fundamentals/basic-tasks/interact-with-cloudflare/), which covers using tools like [Terraform](https://developers.cloudflare.com/terraform/#cloudflare-terraform) and the [official SDKs](https://developers.cloudflare.com/fundamentals/api/reference/sdks/) to maintain your Cloudflare resources.  Using the Cloudflare API requires authentication so that Cloudflare knows who is making requests and what permissions you have. Create an API token to grant access to the API to perform actions.  To create an API token, from the Cloudflare dashboard, go to My Profile > API Tokens and select Create Token. For more information on how to create and troubleshoot API tokens, refer to our [API fundamentals](https://developers.cloudflare.com/fundamentals/api/).  Totally new to Cloudflare? [Start here](https://developers.cloudflare.com/fundamentals/get-started/).
 *
 * The version of the OpenAPI document: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.QueueV2CreateQueue200Response;
import org.openapitools.client.model.QueueV2CreateQueue4XXResponse;
import org.openapitools.client.model.QueueV2CreateQueueConsumer200Response;
import org.openapitools.client.model.QueueV2CreateQueueConsumer4XXResponse;
import org.openapitools.client.model.QueueV2DeleteQueue200Response;
import org.openapitools.client.model.QueueV2DeleteQueue4XXResponse;
import org.openapitools.client.model.QueueV2ListQueueConsumers200Response;
import org.openapitools.client.model.QueueV2ListQueueConsumers4XXResponse;
import org.openapitools.client.model.QueueV2ListQueues200Response;
import org.openapitools.client.model.QueueV2ListQueues4XXResponse;
import org.openapitools.client.model.QueueV2MessagesAck200Response;
import org.openapitools.client.model.QueueV2MessagesAckRequest;
import org.openapitools.client.model.QueueV2MessagesPull200Response;
import org.openapitools.client.model.QueueV2MessagesPullRequest;
import org.openapitools.client.model.QueueV2QueueDetails200Response;
import org.openapitools.client.model.QueueV2QueueDetails4XXResponse;
import org.openapitools.client.model.QueueV2UpdateQueue200Response;
import org.openapitools.client.model.QueueV2UpdateQueue4XXResponse;
import org.openapitools.client.model.QueueV2UpdateQueueConsumer200Response;
import org.openapitools.client.model.QueueV2UpdateQueueConsumer4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QueueApi
 */
@Disabled
public class QueueApiTest {

    private final QueueApi api = new QueueApi();

    /**
     * Create Queue
     *
     * Creates a new queue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queueV2CreateQueueTest() throws ApiException {
        String accountId = null;
        Object body = null;
        QueueV2CreateQueue200Response response = api.queueV2CreateQueue(accountId, body);
        // TODO: test validations
    }

    /**
     * Create Queue Consumer
     *
     * Creates a new consumer for a queue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queueV2CreateQueueConsumerTest() throws ApiException {
        String queueId = null;
        String accountId = null;
        Object body = null;
        QueueV2CreateQueueConsumer200Response response = api.queueV2CreateQueueConsumer(queueId, accountId, body);
        // TODO: test validations
    }

    /**
     * Delete Queue
     *
     * Deletes a queue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queueV2DeleteQueueTest() throws ApiException {
        String queueId = null;
        String accountId = null;
        QueueV2DeleteQueue200Response response = api.queueV2DeleteQueue(queueId, accountId);
        // TODO: test validations
    }

    /**
     * Delete Queue Consumer
     *
     * Deletes the consumer for a queue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queueV2DeleteQueueConsumerTest() throws ApiException {
        String consumerId = null;
        String queueId = null;
        String accountId = null;
        QueueV2DeleteQueue200Response response = api.queueV2DeleteQueueConsumer(consumerId, queueId, accountId);
        // TODO: test validations
    }

    /**
     * List Queue Consumers
     *
     * Returns the consumers for a queue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queueV2ListQueueConsumersTest() throws ApiException {
        String queueId = null;
        String accountId = null;
        QueueV2ListQueueConsumers200Response response = api.queueV2ListQueueConsumers(queueId, accountId);
        // TODO: test validations
    }

    /**
     * List Queues
     *
     * Returns the queues owned by an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queueV2ListQueuesTest() throws ApiException {
        String accountId = null;
        QueueV2ListQueues200Response response = api.queueV2ListQueues(accountId);
        // TODO: test validations
    }

    /**
     * Acknowledge + Retry Queue Messages
     *
     * Acknowledge + Retry messages from a Queue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queueV2MessagesAckTest() throws ApiException {
        String queueId = null;
        String accountId = null;
        QueueV2MessagesAckRequest queueV2MessagesAckRequest = null;
        QueueV2MessagesAck200Response response = api.queueV2MessagesAck(queueId, accountId, queueV2MessagesAckRequest);
        // TODO: test validations
    }

    /**
     * Pull Queue Messages
     *
     * Pull a batch of messages from a Queue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queueV2MessagesPullTest() throws ApiException {
        String queueId = null;
        String accountId = null;
        QueueV2MessagesPullRequest queueV2MessagesPullRequest = null;
        QueueV2MessagesPull200Response response = api.queueV2MessagesPull(queueId, accountId, queueV2MessagesPullRequest);
        // TODO: test validations
    }

    /**
     * Queue Details
     *
     * Get information about a specific queue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queueV2QueueDetailsTest() throws ApiException {
        String queueId = null;
        String accountId = null;
        QueueV2QueueDetails200Response response = api.queueV2QueueDetails(queueId, accountId);
        // TODO: test validations
    }

    /**
     * Update Queue
     *
     * Updates a queue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queueV2UpdateQueueTest() throws ApiException {
        String queueId = null;
        String accountId = null;
        Object body = null;
        QueueV2UpdateQueue200Response response = api.queueV2UpdateQueue(queueId, accountId, body);
        // TODO: test validations
    }

    /**
     * Update Queue Consumer
     *
     * Updates the consumer for a queue, or creates one if it does not exist.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queueV2UpdateQueueConsumerTest() throws ApiException {
        String consumerId = null;
        String queueId = null;
        String accountId = null;
        Object body = null;
        QueueV2UpdateQueueConsumer200Response response = api.queueV2UpdateQueueConsumer(consumerId, queueId, accountId, body);
        // TODO: test validations
    }

}