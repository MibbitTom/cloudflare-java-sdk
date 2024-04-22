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
import org.openapitools.client.model.WorkerCronTriggerGetCronTriggers4XXResponse;
import org.openapitools.client.model.WorkersCronTriggerResponseCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkerCronTriggerApi
 */
@Disabled
public class WorkerCronTriggerApiTest {

    private final WorkerCronTriggerApi api = new WorkerCronTriggerApi();

    /**
     * Get Cron Triggers
     *
     * Fetches Cron Triggers for a Worker.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workerCronTriggerGetCronTriggersTest() throws ApiException {
        String scriptName = null;
        String accountId = null;
        WorkersCronTriggerResponseCollection response = api.workerCronTriggerGetCronTriggers(scriptName, accountId);
        // TODO: test validations
    }

    /**
     * Update Cron Triggers
     *
     * Updates Cron Triggers for a Worker.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workerCronTriggerUpdateCronTriggersTest() throws ApiException {
        String scriptName = null;
        String accountId = null;
        Object body = null;
        WorkersCronTriggerResponseCollection response = api.workerCronTriggerUpdateCronTriggers(scriptName, accountId, body);
        // TODO: test validations
    }

}
