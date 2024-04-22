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
import org.openapitools.client.model.SslVerificationEditSslCertificatePackValidationMethod4XXResponse;
import org.openapitools.client.model.SslVerificationSslVerificationDetails4XXResponse;
import org.openapitools.client.model.TlsCertificatesAndHostnamesComponentsSchemasValidationMethod;
import org.openapitools.client.model.TlsCertificatesAndHostnamesSslValidationMethodResponseCollection;
import org.openapitools.client.model.TlsCertificatesAndHostnamesSslVerificationResponseCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SslVerificationApi
 */
@Disabled
public class SslVerificationApiTest {

    private final SslVerificationApi api = new SslVerificationApi();

    /**
     * Edit SSL Certificate Pack Validation Method
     *
     * Edit SSL validation method for a certificate pack. A PATCH request will request an immediate validation check on any certificate, and return the updated status. If a validation method is provided, the validation will be immediately attempted using that method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sslVerificationEditSslCertificatePackValidationMethodTest() throws ApiException {
        String certificatePackId = null;
        String zoneId = null;
        TlsCertificatesAndHostnamesComponentsSchemasValidationMethod tlsCertificatesAndHostnamesComponentsSchemasValidationMethod = null;
        TlsCertificatesAndHostnamesSslValidationMethodResponseCollection response = api.sslVerificationEditSslCertificatePackValidationMethod(certificatePackId, zoneId, tlsCertificatesAndHostnamesComponentsSchemasValidationMethod);
        // TODO: test validations
    }

    /**
     * SSL Verification Details
     *
     * Get SSL Verification Info for a Zone.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sslVerificationSslVerificationDetailsTest() throws ApiException {
        String zoneId = null;
        Boolean retry = null;
        TlsCertificatesAndHostnamesSslVerificationResponseCollection response = api.sslVerificationSslVerificationDetails(zoneId, retry);
        // TODO: test validations
    }

}
