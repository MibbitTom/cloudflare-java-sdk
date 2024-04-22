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

import cloudflare.sdk.models.AccessCorsHeaders;
import cloudflare.sdk.models.AccessSaasPropsSaasApp;
import cloudflare.sdk.models.AppLauncherApplication;
import cloudflare.sdk.models.BookmarkApplication;
import cloudflare.sdk.models.BrowserIsolationPermissionsApplication;
import cloudflare.sdk.models.BrowserSSHApplication;
import cloudflare.sdk.models.BrowserVNCApplication;
import cloudflare.sdk.models.DeviceEnrollmentPermissionsApplication;
import cloudflare.sdk.models.SaaSApplication;
import cloudflare.sdk.models.SelfHostedApplication;
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
 * Model tests for AccessApps
 */
public class AccessAppsTest {
    private final AccessApps model = new AccessApps();

    /**
     * Model tests for AccessApps
     */
    @Test
    public void testAccessApps() {
        // TODO: test AccessApps
    }

    /**
     * Test the property 'aud'
     */
    @Test
    public void audTest() {
        // TODO: test aud
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'updatedAt'
     */
    @Test
    public void updatedAtTest() {
        // TODO: test updatedAt
    }

    /**
     * Test the property 'allowAuthenticateViaWarp'
     */
    @Test
    public void allowAuthenticateViaWarpTest() {
        // TODO: test allowAuthenticateViaWarp
    }

    /**
     * Test the property 'allowedIdps'
     */
    @Test
    public void allowedIdpsTest() {
        // TODO: test allowedIdps
    }

    /**
     * Test the property 'appLauncherVisible'
     */
    @Test
    public void appLauncherVisibleTest() {
        // TODO: test appLauncherVisible
    }

    /**
     * Test the property 'autoRedirectToIdentity'
     */
    @Test
    public void autoRedirectToIdentityTest() {
        // TODO: test autoRedirectToIdentity
    }

    /**
     * Test the property 'corsHeaders'
     */
    @Test
    public void corsHeadersTest() {
        // TODO: test corsHeaders
    }

    /**
     * Test the property 'customDenyMessage'
     */
    @Test
    public void customDenyMessageTest() {
        // TODO: test customDenyMessage
    }

    /**
     * Test the property 'customDenyUrl'
     */
    @Test
    public void customDenyUrlTest() {
        // TODO: test customDenyUrl
    }

    /**
     * Test the property 'customNonIdentityDenyUrl'
     */
    @Test
    public void customNonIdentityDenyUrlTest() {
        // TODO: test customNonIdentityDenyUrl
    }

    /**
     * Test the property 'customPages'
     */
    @Test
    public void customPagesTest() {
        // TODO: test customPages
    }

    /**
     * Test the property 'domain'
     */
    @Test
    public void domainTest() {
        // TODO: test domain
    }

    /**
     * Test the property 'enableBindingCookie'
     */
    @Test
    public void enableBindingCookieTest() {
        // TODO: test enableBindingCookie
    }

    /**
     * Test the property 'httpOnlyCookieAttribute'
     */
    @Test
    public void httpOnlyCookieAttributeTest() {
        // TODO: test httpOnlyCookieAttribute
    }

    /**
     * Test the property 'logoUrl'
     */
    @Test
    public void logoUrlTest() {
        // TODO: test logoUrl
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'optionsPreflightBypass'
     */
    @Test
    public void optionsPreflightBypassTest() {
        // TODO: test optionsPreflightBypass
    }

    /**
     * Test the property 'pathCookieAttribute'
     */
    @Test
    public void pathCookieAttributeTest() {
        // TODO: test pathCookieAttribute
    }

    /**
     * Test the property 'sameSiteCookieAttribute'
     */
    @Test
    public void sameSiteCookieAttributeTest() {
        // TODO: test sameSiteCookieAttribute
    }

    /**
     * Test the property 'selfHostedDomains'
     */
    @Test
    public void selfHostedDomainsTest() {
        // TODO: test selfHostedDomains
    }

    /**
     * Test the property 'serviceAuth401Redirect'
     */
    @Test
    public void serviceAuth401RedirectTest() {
        // TODO: test serviceAuth401Redirect
    }

    /**
     * Test the property 'sessionDuration'
     */
    @Test
    public void sessionDurationTest() {
        // TODO: test sessionDuration
    }

    /**
     * Test the property 'skipInterstitial'
     */
    @Test
    public void skipInterstitialTest() {
        // TODO: test skipInterstitial
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'saasApp'
     */
    @Test
    public void saasAppTest() {
        // TODO: test saasApp
    }

}
