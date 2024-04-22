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


package cloudflare;

import invalidPackageName.ApiException;
import org.openapitools.client.model.EventNotificationCreateQueueConfig200Response;
import org.openapitools.client.model.EventNotificationCreateQueueConfigRequest;
import org.openapitools.client.model.EventNotificationGetR2BucketConfigs200Response;
import org.openapitools.client.model.MqApiResponseCommon;
import org.openapitools.client.model.MqApiResponseCommonFailure;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for R2EventNotificationApi
 */
@Disabled
public class R2EventNotificationApiTest {

    private final R2EventNotificationApi api = new R2EventNotificationApi();

    /**
     * Create Configuration
     *
     * Define the rules for a given queue which will determine event notification production.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void eventNotificationCreateQueueConfigTest() throws ApiException {
        String queueId = null;
        String bucketName = null;
        String accountId = null;
        EventNotificationCreateQueueConfigRequest eventNotificationCreateQueueConfigRequest = null;
        EventNotificationCreateQueueConfig200Response response = api.eventNotificationCreateQueueConfig(queueId, bucketName, accountId, eventNotificationCreateQueueConfigRequest);
        // TODO: test validations
    }

    /**
     * Delete Configuration
     *
     * Turn off all event notifications configured for delivery to a given queue. No further notifications will be produced for the queue once complete.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void eventNotificationDeleteQueueConfigTest() throws ApiException {
        String queueId = null;
        String bucketName = null;
        String accountId = null;
        MqApiResponseCommon response = api.eventNotificationDeleteQueueConfig(queueId, bucketName, accountId);
        // TODO: test validations
    }

    /**
     * Read Configuration
     *
     * Returns all notification rules for each queue for which bucket notifications are produced.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void eventNotificationGetR2BucketConfigsTest() throws ApiException {
        String bucketName = null;
        String accountId = null;
        EventNotificationGetR2BucketConfigs200Response response = api.eventNotificationGetR2BucketConfigs(bucketName, accountId);
        // TODO: test validations
    }

}