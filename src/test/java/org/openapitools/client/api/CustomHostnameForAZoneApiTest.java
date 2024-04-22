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
import org.openapitools.client.model.CustomHostnameForAZoneCreateCustomHostname4XXResponse;
import org.openapitools.client.model.CustomHostnameForAZoneCreateCustomHostnameRequest;
import org.openapitools.client.model.CustomHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates200Response;
import org.openapitools.client.model.CustomHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates4XXResponse;
import org.openapitools.client.model.CustomHostnameForAZoneEditCustomHostnameRequest;
import org.openapitools.client.model.CustomHostnameForAZoneListCustomHostnames4XXResponse;
import org.openapitools.client.model.TlsCertificatesAndHostnamesCustomHostnameResponseCollection;
import org.openapitools.client.model.TlsCertificatesAndHostnamesCustomHostnameResponseSingle;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomHostnameForAZoneApi
 */
@Disabled
public class CustomHostnameForAZoneApiTest {

    private final CustomHostnameForAZoneApi api = new CustomHostnameForAZoneApi();

    /**
     * Create Custom Hostname
     *
     * Add a new custom hostname and request that an SSL certificate be issued for it. One of three validation methods—http, txt, email—should be used, with &#39;http&#39; recommended if the CNAME is already in place (or will be soon). Specifying &#39;email&#39; will send an email to the WHOIS contacts on file for the base domain plus hostmaster, postmaster, webmaster, admin, administrator. If http is used and the domain is not already pointing to the Managed CNAME host, the PATCH method must be used once it is (to complete validation).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customHostnameForAZoneCreateCustomHostnameTest() throws ApiException {
        String zoneId = null;
        CustomHostnameForAZoneCreateCustomHostnameRequest customHostnameForAZoneCreateCustomHostnameRequest = null;
        TlsCertificatesAndHostnamesCustomHostnameResponseSingle response = api.customHostnameForAZoneCreateCustomHostname(zoneId, customHostnameForAZoneCreateCustomHostnameRequest);
        // TODO: test validations
    }

    /**
     * Custom Hostname Details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customHostnameForAZoneCustomHostnameDetailsTest() throws ApiException {
        String customHostnameId = null;
        String zoneId = null;
        TlsCertificatesAndHostnamesCustomHostnameResponseSingle response = api.customHostnameForAZoneCustomHostnameDetails(customHostnameId, zoneId);
        // TODO: test validations
    }

    /**
     * Delete Custom Hostname (and any issued SSL certificates)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificatesTest() throws ApiException {
        String customHostnameId = null;
        String zoneId = null;
        CustomHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates200Response response = api.customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates(customHostnameId, zoneId);
        // TODO: test validations
    }

    /**
     * Edit Custom Hostname
     *
     * Modify SSL configuration for a custom hostname. When sent with SSL config that matches existing config, used to indicate that hostname should pass domain control validation (DCV). Can also be used to change validation type, e.g., from &#39;http&#39; to &#39;email&#39;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customHostnameForAZoneEditCustomHostnameTest() throws ApiException {
        String customHostnameId = null;
        String zoneId = null;
        CustomHostnameForAZoneEditCustomHostnameRequest customHostnameForAZoneEditCustomHostnameRequest = null;
        TlsCertificatesAndHostnamesCustomHostnameResponseSingle response = api.customHostnameForAZoneEditCustomHostname(customHostnameId, zoneId, customHostnameForAZoneEditCustomHostnameRequest);
        // TODO: test validations
    }

    /**
     * List Custom Hostnames
     *
     * List, search, sort, and filter all of your custom hostnames.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customHostnameForAZoneListCustomHostnamesTest() throws ApiException {
        String zoneId = null;
        String hostname = null;
        String id = null;
        BigDecimal page = null;
        BigDecimal perPage = null;
        String order = null;
        String direction = null;
        BigDecimal ssl = null;
        TlsCertificatesAndHostnamesCustomHostnameResponseCollection response = api.customHostnameForAZoneListCustomHostnames(zoneId, hostname, id, page, perPage, order, direction, ssl);
        // TODO: test validations
    }

}