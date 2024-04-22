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
import java.math.BigDecimal;
import org.openapitools.client.model.BillSubsApiBillingHistoryCollection;
import java.time.OffsetDateTime;
import org.openapitools.client.model.UserBillingHistoryDeprecatedBillingHistoryDetails4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserBillingHistoryApi
 */
@Disabled
public class UserBillingHistoryApiTest {

    private final UserBillingHistoryApi api = new UserBillingHistoryApi();

    /**
     * Billing History Details
     *
     * Accesses your billing history object.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userBillingHistoryDeprecatedBillingHistoryDetailsTest() throws ApiException {
        BigDecimal page = null;
        BigDecimal perPage = null;
        String order = null;
        OffsetDateTime occuredAt = null;
        OffsetDateTime occurredAt = null;
        String type = null;
        String action = null;
        BillSubsApiBillingHistoryCollection response = api.userBillingHistoryDeprecatedBillingHistoryDetails(page, perPage, order, occuredAt, occurredAt, type, action);
        // TODO: test validations
    }

}
