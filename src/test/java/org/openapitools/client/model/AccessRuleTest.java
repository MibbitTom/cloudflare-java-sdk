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


package org.openapitools.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.AccessAccessGroupRule;
import org.openapitools.client.model.AccessAccessGroupRuleGroup;
import org.openapitools.client.model.AccessAnyValidServiceTokenRule;
import org.openapitools.client.model.AccessAuthenticationMethodRule;
import org.openapitools.client.model.AccessAuthenticationMethodRuleAuthMethod;
import org.openapitools.client.model.AccessAzureGroupRule;
import org.openapitools.client.model.AccessAzureGroupRuleAzureAD;
import org.openapitools.client.model.AccessCertificateRule;
import org.openapitools.client.model.AccessCountryRule;
import org.openapitools.client.model.AccessCountryRuleGeo;
import org.openapitools.client.model.AccessDevicePostureRule;
import org.openapitools.client.model.AccessDevicePostureRuleDevicePosture;
import org.openapitools.client.model.AccessDomainRule;
import org.openapitools.client.model.AccessDomainRuleEmailDomain;
import org.openapitools.client.model.AccessEmailListRule;
import org.openapitools.client.model.AccessEmailListRuleEmailList;
import org.openapitools.client.model.AccessEmailRule;
import org.openapitools.client.model.AccessEmailRuleEmail;
import org.openapitools.client.model.AccessEveryoneRule;
import org.openapitools.client.model.AccessExternalEvaluationRule;
import org.openapitools.client.model.AccessExternalEvaluationRuleExternalEvaluation;
import org.openapitools.client.model.AccessGithubOrganizationRule;
import org.openapitools.client.model.AccessGithubOrganizationRuleGithubOrganization;
import org.openapitools.client.model.AccessGsuiteGroupRule;
import org.openapitools.client.model.AccessGsuiteGroupRuleGsuite;
import org.openapitools.client.model.AccessIpListRule;
import org.openapitools.client.model.AccessIpListRuleIpList;
import org.openapitools.client.model.AccessIpRule;
import org.openapitools.client.model.AccessIpRuleIp;
import org.openapitools.client.model.AccessOktaGroupRule;
import org.openapitools.client.model.AccessOktaGroupRuleOkta;
import org.openapitools.client.model.AccessSamlGroupRule;
import org.openapitools.client.model.AccessSamlGroupRuleSaml;
import org.openapitools.client.model.AccessServiceTokenRule;
import org.openapitools.client.model.AccessServiceTokenRuleServiceToken;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for AccessRule
 */
public class AccessRuleTest {
    private final AccessRule model = new AccessRule();

    /**
     * Model tests for AccessRule
     */
    @Test
    public void testAccessRule() {
        // TODO: test AccessRule
    }

    /**
     * Test the property 'email'
     */
    @Test
    public void emailTest() {
        // TODO: test email
    }

    /**
     * Test the property 'emailList'
     */
    @Test
    public void emailListTest() {
        // TODO: test emailList
    }

    /**
     * Test the property 'emailDomain'
     */
    @Test
    public void emailDomainTest() {
        // TODO: test emailDomain
    }

    /**
     * Test the property 'everyone'
     */
    @Test
    public void everyoneTest() {
        // TODO: test everyone
    }

    /**
     * Test the property 'ip'
     */
    @Test
    public void ipTest() {
        // TODO: test ip
    }

    /**
     * Test the property 'ipList'
     */
    @Test
    public void ipListTest() {
        // TODO: test ipList
    }

    /**
     * Test the property 'certificate'
     */
    @Test
    public void certificateTest() {
        // TODO: test certificate
    }

    /**
     * Test the property 'group'
     */
    @Test
    public void groupTest() {
        // TODO: test group
    }

    /**
     * Test the property 'azureAD'
     */
    @Test
    public void azureADTest() {
        // TODO: test azureAD
    }

    /**
     * Test the property 'githubOrganization'
     */
    @Test
    public void githubOrganizationTest() {
        // TODO: test githubOrganization
    }

    /**
     * Test the property 'gsuite'
     */
    @Test
    public void gsuiteTest() {
        // TODO: test gsuite
    }

    /**
     * Test the property 'okta'
     */
    @Test
    public void oktaTest() {
        // TODO: test okta
    }

    /**
     * Test the property 'saml'
     */
    @Test
    public void samlTest() {
        // TODO: test saml
    }

    /**
     * Test the property 'serviceToken'
     */
    @Test
    public void serviceTokenTest() {
        // TODO: test serviceToken
    }

    /**
     * Test the property 'anyValidServiceToken'
     */
    @Test
    public void anyValidServiceTokenTest() {
        // TODO: test anyValidServiceToken
    }

    /**
     * Test the property 'externalEvaluation'
     */
    @Test
    public void externalEvaluationTest() {
        // TODO: test externalEvaluation
    }

    /**
     * Test the property 'geo'
     */
    @Test
    public void geoTest() {
        // TODO: test geo
    }

    /**
     * Test the property 'authMethod'
     */
    @Test
    public void authMethodTest() {
        // TODO: test authMethod
    }

    /**
     * Test the property 'devicePosture'
     */
    @Test
    public void devicePostureTest() {
        // TODO: test devicePosture
    }

}