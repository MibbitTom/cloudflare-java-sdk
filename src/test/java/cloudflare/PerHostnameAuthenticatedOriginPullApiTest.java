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
import org.openapitools.client.model.PerHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthentication4XXResponse;
import org.openapitools.client.model.PerHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthenticationRequest;
import org.openapitools.client.model.PerHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthentication4XXResponse;
import org.openapitools.client.model.PerHostnameAuthenticatedOriginPullListCertificates4XXResponse;
import org.openapitools.client.model.PerHostnameAuthenticatedOriginPullUploadAHostnameClientCertificate4XXResponse;
import org.openapitools.client.model.PerHostnameAuthenticatedOriginPullUploadAHostnameClientCertificateRequest;
import org.openapitools.client.model.TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseSingle;
import org.openapitools.client.model.TlsCertificatesAndHostnamesHostnameAopResponseCollection;
import org.openapitools.client.model.TlsCertificatesAndHostnamesHostnameAopSingleResponse;
import org.openapitools.client.model.TlsCertificatesAndHostnamesHostnameAuthenticatedOriginPullComponentsSchemasCertificateResponseCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PerHostnameAuthenticatedOriginPullApi
 */
@Disabled
public class PerHostnameAuthenticatedOriginPullApiTest {

    private final PerHostnameAuthenticatedOriginPullApi api = new PerHostnameAuthenticatedOriginPullApi();

    /**
     * Delete Hostname Client Certificate
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void perHostnameAuthenticatedOriginPullDeleteHostnameClientCertificateTest() throws ApiException {
        String certificateId = null;
        String zoneId = null;
        TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseSingle response = api.perHostnameAuthenticatedOriginPullDeleteHostnameClientCertificate(certificateId, zoneId);
        // TODO: test validations
    }

    /**
     * Enable or Disable a Hostname for Client Authentication
     *
     * Associate a hostname to a certificate and enable, disable or invalidate the association. If disabled, client certificate will not be sent to the hostname even if activated at the zone level. 100 maximum associations on a single certificate are allowed. Note: Use a null value for parameter *enabled* to invalidate the association.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthenticationTest() throws ApiException {
        String zoneId = null;
        PerHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthenticationRequest perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthenticationRequest = null;
        TlsCertificatesAndHostnamesHostnameAopResponseCollection response = api.perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthentication(zoneId, perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthenticationRequest);
        // TODO: test validations
    }

    /**
     * Get the Hostname Client Certificate
     *
     * Get the certificate by ID to be used for client authentication on a hostname.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void perHostnameAuthenticatedOriginPullGetTheHostnameClientCertificateTest() throws ApiException {
        String certificateId = null;
        String zoneId = null;
        TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseSingle response = api.perHostnameAuthenticatedOriginPullGetTheHostnameClientCertificate(certificateId, zoneId);
        // TODO: test validations
    }

    /**
     * Get the Hostname Status for Client Authentication
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void perHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthenticationTest() throws ApiException {
        String hostname = null;
        String zoneId = null;
        TlsCertificatesAndHostnamesHostnameAopSingleResponse response = api.perHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthentication(hostname, zoneId);
        // TODO: test validations
    }

    /**
     * List Certificates
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void perHostnameAuthenticatedOriginPullListCertificatesTest() throws ApiException {
        String zoneId = null;
        TlsCertificatesAndHostnamesHostnameAuthenticatedOriginPullComponentsSchemasCertificateResponseCollection response = api.perHostnameAuthenticatedOriginPullListCertificates(zoneId);
        // TODO: test validations
    }

    /**
     * Upload a Hostname Client Certificate
     *
     * Upload a certificate to be used for client authentication on a hostname. 10 hostname certificates per zone are allowed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificateTest() throws ApiException {
        String zoneId = null;
        PerHostnameAuthenticatedOriginPullUploadAHostnameClientCertificateRequest perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificateRequest = null;
        TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseSingle response = api.perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificate(zoneId, perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificateRequest);
        // TODO: test validations
    }

}
