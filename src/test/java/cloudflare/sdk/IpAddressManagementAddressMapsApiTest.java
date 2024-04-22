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


package cloudflare.sdk;

import cloudflare.ApiException;
import cloudflare.sdk.models.AddressingApiResponseCollection;
import cloudflare.sdk.models.AddressingComponentsSchemasResponseCollection;
import cloudflare.sdk.models.AddressingComponentsSchemasSingleResponse;
import cloudflare.sdk.models.AddressingFullResponse;
import cloudflare.sdk.models.IpAddressManagementAddressMapsCreateAddressMap4XXResponse;
import cloudflare.sdk.models.IpAddressManagementAddressMapsCreateAddressMapRequest;
import cloudflare.sdk.models.IpAddressManagementAddressMapsDeleteAddressMap4XXResponse;
import cloudflare.sdk.models.IpAddressManagementAddressMapsListAddressMaps4XXResponse;
import cloudflare.sdk.models.IpAddressManagementAddressMapsUpdateAddressMap4XXResponse;
import cloudflare.sdk.models.IpAddressManagementAddressMapsUpdateAddressMapRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IpAddressManagementAddressMapsApi
 */
@Disabled
public class IpAddressManagementAddressMapsApiTest {

    private final IpAddressManagementAddressMapsApi api = new IpAddressManagementAddressMapsApi();

    /**
     * Add a zone membership to an Address Map
     *
     * Add a zone as a member of a particular address map.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsAddAZoneMembershipToAnAddressMapTest() throws ApiException {
        String zoneId = null;
        String addressMapId = null;
        String accountId = null;
        AddressingApiResponseCollection response = api.ipAddressManagementAddressMapsAddAZoneMembershipToAnAddressMap(zoneId, addressMapId, accountId);
        // TODO: test validations
    }

    /**
     * Add an account membership to an Address Map
     *
     * Add an account as a member of a particular address map.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsAddAnAccountMembershipToAnAddressMapTest() throws ApiException {
        String accountId = null;
        String addressMapId = null;
        AddressingApiResponseCollection response = api.ipAddressManagementAddressMapsAddAnAccountMembershipToAnAddressMap(accountId, addressMapId);
        // TODO: test validations
    }

    /**
     * Add an IP to an Address Map
     *
     * Add an IP from a prefix owned by the account to a particular address map.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsAddAnIpToAnAddressMapTest() throws ApiException {
        String ipAddress = null;
        String addressMapId = null;
        String accountId = null;
        AddressingApiResponseCollection response = api.ipAddressManagementAddressMapsAddAnIpToAnAddressMap(ipAddress, addressMapId, accountId);
        // TODO: test validations
    }

    /**
     * Address Map Details
     *
     * Show a particular address map owned by the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsAddressMapDetailsTest() throws ApiException {
        String addressMapId = null;
        String accountId = null;
        AddressingFullResponse response = api.ipAddressManagementAddressMapsAddressMapDetails(addressMapId, accountId);
        // TODO: test validations
    }

    /**
     * Create Address Map
     *
     * Create a new address map under the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsCreateAddressMapTest() throws ApiException {
        String accountId = null;
        IpAddressManagementAddressMapsCreateAddressMapRequest ipAddressManagementAddressMapsCreateAddressMapRequest = null;
        AddressingFullResponse response = api.ipAddressManagementAddressMapsCreateAddressMap(accountId, ipAddressManagementAddressMapsCreateAddressMapRequest);
        // TODO: test validations
    }

    /**
     * Delete Address Map
     *
     * Delete a particular address map owned by the account. An Address Map must be disabled before it can be deleted.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsDeleteAddressMapTest() throws ApiException {
        String addressMapId = null;
        String accountId = null;
        AddressingApiResponseCollection response = api.ipAddressManagementAddressMapsDeleteAddressMap(addressMapId, accountId);
        // TODO: test validations
    }

    /**
     * List Address Maps
     *
     * List all address maps owned by the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsListAddressMapsTest() throws ApiException {
        String accountId = null;
        AddressingComponentsSchemasResponseCollection response = api.ipAddressManagementAddressMapsListAddressMaps(accountId);
        // TODO: test validations
    }

    /**
     * Remove a zone membership from an Address Map
     *
     * Remove a zone as a member of a particular address map.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsRemoveAZoneMembershipFromAnAddressMapTest() throws ApiException {
        String zoneId = null;
        String addressMapId = null;
        String accountId = null;
        AddressingApiResponseCollection response = api.ipAddressManagementAddressMapsRemoveAZoneMembershipFromAnAddressMap(zoneId, addressMapId, accountId);
        // TODO: test validations
    }

    /**
     * Remove an account membership from an Address Map
     *
     * Remove an account as a member of a particular address map.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsRemoveAnAccountMembershipFromAnAddressMapTest() throws ApiException {
        String accountId = null;
        String addressMapId = null;
        AddressingApiResponseCollection response = api.ipAddressManagementAddressMapsRemoveAnAccountMembershipFromAnAddressMap(accountId, addressMapId);
        // TODO: test validations
    }

    /**
     * Remove an IP from an Address Map
     *
     * Remove an IP from a particular address map.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsRemoveAnIpFromAnAddressMapTest() throws ApiException {
        String ipAddress = null;
        String addressMapId = null;
        String accountId = null;
        AddressingApiResponseCollection response = api.ipAddressManagementAddressMapsRemoveAnIpFromAnAddressMap(ipAddress, addressMapId, accountId);
        // TODO: test validations
    }

    /**
     * Update Address Map
     *
     * Modify properties of an address map owned by the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsUpdateAddressMapTest() throws ApiException {
        String addressMapId = null;
        String accountId = null;
        IpAddressManagementAddressMapsUpdateAddressMapRequest ipAddressManagementAddressMapsUpdateAddressMapRequest = null;
        AddressingComponentsSchemasSingleResponse response = api.ipAddressManagementAddressMapsUpdateAddressMap(addressMapId, accountId, ipAddressManagementAddressMapsUpdateAddressMapRequest);
        // TODO: test validations
    }

}
