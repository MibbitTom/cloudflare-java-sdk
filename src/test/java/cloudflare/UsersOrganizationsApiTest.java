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
import java.math.BigDecimal;
import org.openapitools.client.model.IamCollectionOrganizationResponse;
import org.openapitools.client.model.IamSingleOrganizationResponse;
import org.openapitools.client.model.UserSOrganizationsLeaveOrganization200Response;
import org.openapitools.client.model.UserSOrganizationsLeaveOrganization4XXResponse;
import org.openapitools.client.model.UserSOrganizationsListOrganizations4XXResponse;
import org.openapitools.client.model.UserSOrganizationsOrganizationDetails4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersOrganizationsApi
 */
@Disabled
public class UsersOrganizationsApiTest {

    private final UsersOrganizationsApi api = new UsersOrganizationsApi();

    /**
     * Leave Organization
     *
     * Removes association to an organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userSOrganizationsLeaveOrganizationTest() throws ApiException {
        String organizationId = null;
        UserSOrganizationsLeaveOrganization200Response response = api.userSOrganizationsLeaveOrganization(organizationId);
        // TODO: test validations
    }

    /**
     * List Organizations
     *
     * Lists organizations the user is associated with.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userSOrganizationsListOrganizationsTest() throws ApiException {
        String name = null;
        BigDecimal page = null;
        BigDecimal perPage = null;
        String order = null;
        String direction = null;
        String match = null;
        String status = null;
        IamCollectionOrganizationResponse response = api.userSOrganizationsListOrganizations(name, page, perPage, order, direction, match, status);
        // TODO: test validations
    }

    /**
     * Organization Details
     *
     * Gets a specific organization the user is associated with.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userSOrganizationsOrganizationDetailsTest() throws ApiException {
        String organizationId = null;
        IamSingleOrganizationResponse response = api.userSOrganizationsOrganizationDetails(organizationId);
        // TODO: test validations
    }

}