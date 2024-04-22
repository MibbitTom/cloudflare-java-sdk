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
import org.openapitools.client.model.ClientCertificateForAZoneCreateClientCertificate4XXResponse;
import org.openapitools.client.model.ClientCertificateForAZoneCreateClientCertificateRequest;
import org.openapitools.client.model.TlsCertificatesAndHostnamesApiResponseCommonFailure;
import org.openapitools.client.model.TlsCertificatesAndHostnamesClientCertificateResponseCollection;
import org.openapitools.client.model.TlsCertificatesAndHostnamesClientCertificateResponseSingle;
import org.openapitools.client.model.TlsCertificatesAndHostnamesHostnameAssociation;
import org.openapitools.client.model.TlsCertificatesAndHostnamesHostnameAssociationsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiShieldClientCertificatesForAZoneApi
 */
@Disabled
public class ApiShieldClientCertificatesForAZoneApiTest {

    private final ApiShieldClientCertificatesForAZoneApi api = new ApiShieldClientCertificatesForAZoneApi();

    /**
     * Client Certificate Details
     *
     * Get Details for a single mTLS API Shield Client Certificate
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clientCertificateForAZoneClientCertificateDetailsTest() throws ApiException {
        String zoneId = null;
        String clientCertificateId = null;
        TlsCertificatesAndHostnamesClientCertificateResponseSingle response = api.clientCertificateForAZoneClientCertificateDetails(zoneId, clientCertificateId);
        // TODO: test validations
    }

    /**
     * Create Client Certificate
     *
     * Create a new API Shield mTLS Client Certificate
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clientCertificateForAZoneCreateClientCertificateTest() throws ApiException {
        String zoneId = null;
        ClientCertificateForAZoneCreateClientCertificateRequest clientCertificateForAZoneCreateClientCertificateRequest = null;
        TlsCertificatesAndHostnamesClientCertificateResponseSingle response = api.clientCertificateForAZoneCreateClientCertificate(zoneId, clientCertificateForAZoneCreateClientCertificateRequest);
        // TODO: test validations
    }

    /**
     * Revoke Client Certificate
     *
     * Set a API Shield mTLS Client Certificate to pending_revocation status for processing to revoked status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clientCertificateForAZoneDeleteClientCertificateTest() throws ApiException {
        String zoneId = null;
        String clientCertificateId = null;
        TlsCertificatesAndHostnamesClientCertificateResponseSingle response = api.clientCertificateForAZoneDeleteClientCertificate(zoneId, clientCertificateId);
        // TODO: test validations
    }

    /**
     * Reactivate Client Certificate
     *
     * If a API Shield mTLS Client Certificate is in a pending_revocation state, you may reactivate it with this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clientCertificateForAZoneEditClientCertificateTest() throws ApiException {
        String zoneId = null;
        String clientCertificateId = null;
        TlsCertificatesAndHostnamesClientCertificateResponseSingle response = api.clientCertificateForAZoneEditClientCertificate(zoneId, clientCertificateId);
        // TODO: test validations
    }

    /**
     * List Client Certificates
     *
     * List all of your Zone&#39;s API Shield mTLS Client Certificates by Status and/or using Pagination
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clientCertificateForAZoneListClientCertificatesTest() throws ApiException {
        String zoneId = null;
        String status = null;
        BigDecimal page = null;
        BigDecimal perPage = null;
        Integer limit = null;
        Integer offset = null;
        TlsCertificatesAndHostnamesClientCertificateResponseCollection response = api.clientCertificateForAZoneListClientCertificates(zoneId, status, page, perPage, limit, offset);
        // TODO: test validations
    }

    /**
     * List Hostname Associations
     *
     * List Hostname Associations
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clientCertificateForAZoneListHostnameAssociationsTest() throws ApiException {
        String zoneId = null;
        String mtlsCertificateId = null;
        TlsCertificatesAndHostnamesHostnameAssociationsResponse response = api.clientCertificateForAZoneListHostnameAssociations(zoneId, mtlsCertificateId);
        // TODO: test validations
    }

    /**
     * Replace Hostname Associations
     *
     * Replace Hostname Associations
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clientCertificateForAZonePutHostnameAssociationsTest() throws ApiException {
        String zoneId = null;
        TlsCertificatesAndHostnamesHostnameAssociation tlsCertificatesAndHostnamesHostnameAssociation = null;
        TlsCertificatesAndHostnamesHostnameAssociationsResponse response = api.clientCertificateForAZonePutHostnameAssociations(zoneId, tlsCertificatesAndHostnamesHostnameAssociation);
        // TODO: test validations
    }

}
