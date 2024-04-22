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
import org.openapitools.client.model.MTlsCertificateManagementGetMTlsCertificate4XXResponse;
import org.openapitools.client.model.MTlsCertificateManagementListMTlsCertificateAssociations4XXResponse;
import org.openapitools.client.model.MTlsCertificateManagementListMTlsCertificates4XXResponse;
import org.openapitools.client.model.MTlsCertificateManagementUploadMTlsCertificate4XXResponse;
import org.openapitools.client.model.MTlsCertificateManagementUploadMTlsCertificateRequest;
import org.openapitools.client.model.TlsCertificatesAndHostnamesAssociationResponseCollection;
import org.openapitools.client.model.TlsCertificatesAndHostnamesCertificateResponseSinglePost;
import org.openapitools.client.model.TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseCollection;
import org.openapitools.client.model.TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseSingle;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MTlsCertificateManagementApi
 */
@Disabled
public class MTlsCertificateManagementApiTest {

    private final MTlsCertificateManagementApi api = new MTlsCertificateManagementApi();

    /**
     * Delete mTLS certificate
     *
     * Deletes the mTLS certificate unless the certificate is in use by one or more Cloudflare services.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void mTlsCertificateManagementDeleteMTlsCertificateTest() throws ApiException {
        String mtlsCertificateId = null;
        String accountId = null;
        TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseSingle response = api.mTlsCertificateManagementDeleteMTlsCertificate(mtlsCertificateId, accountId);
        // TODO: test validations
    }

    /**
     * Get mTLS certificate
     *
     * Fetches a single mTLS certificate.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void mTlsCertificateManagementGetMTlsCertificateTest() throws ApiException {
        String mtlsCertificateId = null;
        String accountId = null;
        TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseSingle response = api.mTlsCertificateManagementGetMTlsCertificate(mtlsCertificateId, accountId);
        // TODO: test validations
    }

    /**
     * List mTLS certificate associations
     *
     * Lists all active associations between the certificate and Cloudflare services.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void mTlsCertificateManagementListMTlsCertificateAssociationsTest() throws ApiException {
        String mtlsCertificateId = null;
        String accountId = null;
        TlsCertificatesAndHostnamesAssociationResponseCollection response = api.mTlsCertificateManagementListMTlsCertificateAssociations(mtlsCertificateId, accountId);
        // TODO: test validations
    }

    /**
     * List mTLS certificates
     *
     * Lists all mTLS certificates.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void mTlsCertificateManagementListMTlsCertificatesTest() throws ApiException {
        String accountId = null;
        TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseCollection response = api.mTlsCertificateManagementListMTlsCertificates(accountId);
        // TODO: test validations
    }

    /**
     * Upload mTLS certificate
     *
     * Upload a certificate that you want to use with mTLS-enabled Cloudflare services.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void mTlsCertificateManagementUploadMTlsCertificateTest() throws ApiException {
        String accountId = null;
        MTlsCertificateManagementUploadMTlsCertificateRequest mtlsCertificateManagementUploadMTlsCertificateRequest = null;
        TlsCertificatesAndHostnamesCertificateResponseSinglePost response = api.mTlsCertificateManagementUploadMTlsCertificate(accountId, mtlsCertificateManagementUploadMTlsCertificateRequest);
        // TODO: test validations
    }

}
