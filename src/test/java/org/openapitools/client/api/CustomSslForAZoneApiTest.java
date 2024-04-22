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
import org.openapitools.client.model.CustomSslForAZoneCreateSslConfiguration4XXResponse;
import org.openapitools.client.model.CustomSslForAZoneCreateSslConfigurationRequest;
import org.openapitools.client.model.CustomSslForAZoneDeleteSslConfiguration4XXResponse;
import org.openapitools.client.model.CustomSslForAZoneEditSslConfigurationRequest;
import org.openapitools.client.model.CustomSslForAZoneListSslConfigurations4XXResponse;
import org.openapitools.client.model.CustomSslForAZoneRePrioritizeSslCertificatesRequest;
import org.openapitools.client.model.TlsCertificatesAndHostnamesCertificateResponseCollection;
import org.openapitools.client.model.TlsCertificatesAndHostnamesCertificateResponseIdOnly;
import org.openapitools.client.model.TlsCertificatesAndHostnamesCertificateResponseSingle;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomSslForAZoneApi
 */
@Disabled
public class CustomSslForAZoneApiTest {

    private final CustomSslForAZoneApi api = new CustomSslForAZoneApi();

    /**
     * Create SSL Configuration
     *
     * Upload a new SSL certificate for a zone.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customSslForAZoneCreateSslConfigurationTest() throws ApiException {
        String zoneId = null;
        CustomSslForAZoneCreateSslConfigurationRequest customSslForAZoneCreateSslConfigurationRequest = null;
        TlsCertificatesAndHostnamesCertificateResponseSingle response = api.customSslForAZoneCreateSslConfiguration(zoneId, customSslForAZoneCreateSslConfigurationRequest);
        // TODO: test validations
    }

    /**
     * Delete SSL Configuration
     *
     * Remove a SSL certificate from a zone.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customSslForAZoneDeleteSslConfigurationTest() throws ApiException {
        String customCertificateId = null;
        String zoneId = null;
        TlsCertificatesAndHostnamesCertificateResponseIdOnly response = api.customSslForAZoneDeleteSslConfiguration(customCertificateId, zoneId);
        // TODO: test validations
    }

    /**
     * Edit SSL Configuration
     *
     * Upload a new private key and/or PEM/CRT for the SSL certificate. Note: PATCHing a configuration for sni_custom certificates will result in a new resource id being returned, and the previous one being deleted.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customSslForAZoneEditSslConfigurationTest() throws ApiException {
        String customCertificateId = null;
        String zoneId = null;
        CustomSslForAZoneEditSslConfigurationRequest customSslForAZoneEditSslConfigurationRequest = null;
        TlsCertificatesAndHostnamesCertificateResponseSingle response = api.customSslForAZoneEditSslConfiguration(customCertificateId, zoneId, customSslForAZoneEditSslConfigurationRequest);
        // TODO: test validations
    }

    /**
     * List SSL Configurations
     *
     * List, search, and filter all of your custom SSL certificates. The higher priority will break ties across overlapping &#39;legacy_custom&#39; certificates, but &#39;legacy_custom&#39; certificates will always supercede &#39;sni_custom&#39; certificates.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customSslForAZoneListSslConfigurationsTest() throws ApiException {
        String zoneId = null;
        BigDecimal page = null;
        BigDecimal perPage = null;
        String match = null;
        String status = null;
        TlsCertificatesAndHostnamesCertificateResponseCollection response = api.customSslForAZoneListSslConfigurations(zoneId, page, perPage, match, status);
        // TODO: test validations
    }

    /**
     * Re-prioritize SSL Certificates
     *
     * If a zone has multiple SSL certificates, you can set the order in which they should be used during a request. The higher priority will break ties across overlapping &#39;legacy_custom&#39; certificates.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customSslForAZoneRePrioritizeSslCertificatesTest() throws ApiException {
        String zoneId = null;
        CustomSslForAZoneRePrioritizeSslCertificatesRequest customSslForAZoneRePrioritizeSslCertificatesRequest = null;
        TlsCertificatesAndHostnamesCertificateResponseCollection response = api.customSslForAZoneRePrioritizeSslCertificates(zoneId, customSslForAZoneRePrioritizeSslCertificatesRequest);
        // TODO: test validations
    }

    /**
     * SSL Configuration Details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customSslForAZoneSslConfigurationDetailsTest() throws ApiException {
        String customCertificateId = null;
        String zoneId = null;
        TlsCertificatesAndHostnamesCertificateResponseSingle response = api.customSslForAZoneSslConfigurationDetails(customCertificateId, zoneId);
        // TODO: test validations
    }

}
