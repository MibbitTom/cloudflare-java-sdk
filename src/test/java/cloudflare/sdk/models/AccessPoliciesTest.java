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


package cloudflare.sdk.models;

import cloudflare.sdk.models.AccessApprovalGroup;
import cloudflare.sdk.models.AccessDecision;
import cloudflare.sdk.models.AccessRule;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for AccessPolicies
 */
public class AccessPoliciesTest {
    private final AccessPolicies model = new AccessPolicies();

    /**
     * Model tests for AccessPolicies
     */
    @Test
    public void testAccessPolicies() {
        // TODO: test AccessPolicies
    }

    /**
     * Test the property 'approvalGroups'
     */
    @Test
    public void approvalGroupsTest() {
        // TODO: test approvalGroups
    }

    /**
     * Test the property 'approvalRequired'
     */
    @Test
    public void approvalRequiredTest() {
        // TODO: test approvalRequired
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'decision'
     */
    @Test
    public void decisionTest() {
        // TODO: test decision
    }

    /**
     * Test the property 'exclude'
     */
    @Test
    public void excludeTest() {
        // TODO: test exclude
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'include'
     */
    @Test
    public void includeTest() {
        // TODO: test include
    }

    /**
     * Test the property 'isolationRequired'
     */
    @Test
    public void isolationRequiredTest() {
        // TODO: test isolationRequired
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'precedence'
     */
    @Test
    public void precedenceTest() {
        // TODO: test precedence
    }

    /**
     * Test the property 'purposeJustificationPrompt'
     */
    @Test
    public void purposeJustificationPromptTest() {
        // TODO: test purposeJustificationPrompt
    }

    /**
     * Test the property 'purposeJustificationRequired'
     */
    @Test
    public void purposeJustificationRequiredTest() {
        // TODO: test purposeJustificationRequired
    }

    /**
     * Test the property 'require'
     */
    @Test
    public void requireTest() {
        // TODO: test require
    }

    /**
     * Test the property 'sessionDuration'
     */
    @Test
    public void sessionDurationTest() {
        // TODO: test sessionDuration
    }

    /**
     * Test the property 'updatedAt'
     */
    @Test
    public void updatedAtTest() {
        // TODO: test updatedAt
    }

}
