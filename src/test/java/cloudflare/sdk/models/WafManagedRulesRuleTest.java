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

import cloudflare.sdk.models.WafManagedRulesAnomalyRule;
import cloudflare.sdk.models.WafManagedRulesBaseGroup;
import cloudflare.sdk.models.WafManagedRulesDefaultMode;
import cloudflare.sdk.models.WafManagedRulesModeAllowTraditional;
import cloudflare.sdk.models.WafManagedRulesTraditionalAllowRule;
import cloudflare.sdk.models.WafManagedRulesTraditionalDenyRule;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for WafManagedRulesRule
 */
public class WafManagedRulesRuleTest {
    private final WafManagedRulesRule model = new WafManagedRulesRule();

    /**
     * Model tests for WafManagedRulesRule
     */
    @Test
    public void testWafManagedRulesRule() {
        // TODO: test WafManagedRulesRule
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'group'
     */
    @Test
    public void groupTest() {
        // TODO: test group
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'packageId'
     */
    @Test
    public void packageIdTest() {
        // TODO: test packageId
    }

    /**
     * Test the property 'priority'
     */
    @Test
    public void priorityTest() {
        // TODO: test priority
    }

    /**
     * Test the property 'allowedModes'
     */
    @Test
    public void allowedModesTest() {
        // TODO: test allowedModes
    }

    /**
     * Test the property 'mode'
     */
    @Test
    public void modeTest() {
        // TODO: test mode
    }

    /**
     * Test the property 'defaultMode'
     */
    @Test
    public void defaultModeTest() {
        // TODO: test defaultMode
    }

}
