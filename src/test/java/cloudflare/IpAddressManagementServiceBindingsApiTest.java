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
import org.openapitools.client.model.AddressingApiResponseCommon;
import org.openapitools.client.model.AddressingApiResponseCommonFailure;
import org.openapitools.client.model.AddressingCreateBindingRequest;
import org.openapitools.client.model.IpAddressManagementServiceBindingsCreateServiceBinding201Response;
import org.openapitools.client.model.IpAddressManagementServiceBindingsListServiceBindings200Response;
import org.openapitools.client.model.IpAddressManagementServiceBindingsListServices200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IpAddressManagementServiceBindingsApi
 */
@Disabled
public class IpAddressManagementServiceBindingsApiTest {

    private final IpAddressManagementServiceBindingsApi api = new IpAddressManagementServiceBindingsApi();

    /**
     * Create Service Binding
     *
     * Creates a new Service Binding, routing traffic to IPs within the given CIDR to a service running on Cloudflare&#39;s network. **Note:** This API may only be used on prefixes currently configured with a Magic Transit service binding, and only allows creating service bindings for the Cloudflare CDN or Cloudflare Spectrum. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementServiceBindingsCreateServiceBindingTest() throws ApiException {
        String accountId = null;
        String prefixId = null;
        AddressingCreateBindingRequest addressingCreateBindingRequest = null;
        IpAddressManagementServiceBindingsCreateServiceBinding201Response response = api.ipAddressManagementServiceBindingsCreateServiceBinding(accountId, prefixId, addressingCreateBindingRequest);
        // TODO: test validations
    }

    /**
     * Delete Service Binding
     *
     * Delete a Service Binding
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementServiceBindingsDeleteServiceBindingTest() throws ApiException {
        String accountId = null;
        String prefixId = null;
        String bindingId = null;
        AddressingApiResponseCommon response = api.ipAddressManagementServiceBindingsDeleteServiceBinding(accountId, prefixId, bindingId);
        // TODO: test validations
    }

    /**
     * Get Service Binding
     *
     * Fetch a single Service Binding
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementServiceBindingsGetServiceBindingTest() throws ApiException {
        String accountId = null;
        String prefixId = null;
        String bindingId = null;
        IpAddressManagementServiceBindingsCreateServiceBinding201Response response = api.ipAddressManagementServiceBindingsGetServiceBinding(accountId, prefixId, bindingId);
        // TODO: test validations
    }

    /**
     * List Service Bindings
     *
     * List the Cloudflare services this prefix is currently bound to. Traffic sent to an address within an IP prefix will be routed to the Cloudflare service of the most-specific Service Binding matching the address. **Example:** binding &#x60;192.0.2.0/24&#x60; to Cloudflare Magic Transit and &#x60;192.0.2.1/32&#x60; to the Cloudflare CDN would route traffic for &#x60;192.0.2.1&#x60; to the CDN, and traffic for all other IPs in the prefix to Cloudflare Magic Transit. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementServiceBindingsListServiceBindingsTest() throws ApiException {
        String accountId = null;
        String prefixId = null;
        IpAddressManagementServiceBindingsListServiceBindings200Response response = api.ipAddressManagementServiceBindingsListServiceBindings(accountId, prefixId);
        // TODO: test validations
    }

    /**
     * List Services
     *
     * Bring-Your-Own IP (BYOIP) prefixes onboarded to Cloudflare must be bound to a service running on the Cloudflare network to enable a Cloudflare product on the IP addresses. This endpoint can be used as a reference of available services on the Cloudflare network, and their service IDs. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementServiceBindingsListServicesTest() throws ApiException {
        String accountId = null;
        IpAddressManagementServiceBindingsListServices200Response response = api.ipAddressManagementServiceBindingsListServices(accountId);
        // TODO: test validations
    }

}
