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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.Zones0rtt;
import org.openapitools.client.model.ZonesAdvancedDdos;
import org.openapitools.client.model.ZonesAlwaysOnline;
import org.openapitools.client.model.ZonesAlwaysUseHttps;
import org.openapitools.client.model.ZonesAutomaticHttpsRewrites;
import org.openapitools.client.model.ZonesBrotli;
import org.openapitools.client.model.ZonesBrowserCacheTtl;
import org.openapitools.client.model.ZonesBrowserCheck;
import org.openapitools.client.model.ZonesCacheLevel;
import org.openapitools.client.model.ZonesChallengeTtl;
import org.openapitools.client.model.ZonesCiphers;
import org.openapitools.client.model.ZonesCnameFlattening;
import org.openapitools.client.model.ZonesDevelopmentMode;
import org.openapitools.client.model.ZonesEarlyHints;
import org.openapitools.client.model.ZonesEdgeCacheTtl;
import org.openapitools.client.model.ZonesEmailObfuscation;
import org.openapitools.client.model.ZonesH2Prioritization;
import org.openapitools.client.model.ZonesHotlinkProtection;
import org.openapitools.client.model.ZonesHttp2;
import org.openapitools.client.model.ZonesHttp3;
import org.openapitools.client.model.ZonesImageResizing;
import org.openapitools.client.model.ZonesIpGeolocation;
import org.openapitools.client.model.ZonesIpv6;
import org.openapitools.client.model.ZonesMaxUpload;
import org.openapitools.client.model.ZonesMinTlsVersion;
import org.openapitools.client.model.ZonesMinify;
import org.openapitools.client.model.ZonesMirage;
import org.openapitools.client.model.ZonesMobileRedirect;
import org.openapitools.client.model.ZonesNel;
import org.openapitools.client.model.ZonesOpportunisticEncryption;
import org.openapitools.client.model.ZonesOpportunisticOnion;
import org.openapitools.client.model.ZonesOrangeToOrange;
import org.openapitools.client.model.ZonesOriginErrorPagePassThru;
import org.openapitools.client.model.ZonesPolish;
import org.openapitools.client.model.ZonesPrefetchPreload;
import org.openapitools.client.model.ZonesProxyReadTimeout;
import org.openapitools.client.model.ZonesPseudoIpv4;
import org.openapitools.client.model.ZonesResponseBuffering;
import org.openapitools.client.model.ZonesRocketLoader;
import org.openapitools.client.model.ZonesSchemasAutomaticPlatformOptimization;
import org.openapitools.client.model.ZonesSecurityHeader;
import org.openapitools.client.model.ZonesSecurityLevel;
import org.openapitools.client.model.ZonesServerSideExclude;
import org.openapitools.client.model.ZonesSha1Support;
import org.openapitools.client.model.ZonesSortQueryStringForCache;
import org.openapitools.client.model.ZonesSsl;
import org.openapitools.client.model.ZonesSslRecommender;
import org.openapitools.client.model.ZonesTls12Only;
import org.openapitools.client.model.ZonesTls13;
import org.openapitools.client.model.ZonesTlsClientAuth;
import org.openapitools.client.model.ZonesTrueClientIpHeader;
import org.openapitools.client.model.ZonesWaf;
import org.openapitools.client.model.ZonesWebp;
import org.openapitools.client.model.ZonesWebsockets;
import org.openapitools.client.model.ZonesWebsocketsValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for ZonesZoneSettingsResponseCollectionAllOfResult
 */
public class ZonesZoneSettingsResponseCollectionAllOfResultTest {
    private final ZonesZoneSettingsResponseCollectionAllOfResult model = new ZonesZoneSettingsResponseCollectionAllOfResult();

    /**
     * Model tests for ZonesZoneSettingsResponseCollectionAllOfResult
     */
    @Test
    public void testZonesZoneSettingsResponseCollectionAllOfResult() {
        // TODO: test ZonesZoneSettingsResponseCollectionAllOfResult
    }

    /**
     * Test the property 'editable'
     */
    @Test
    public void editableTest() {
        // TODO: test editable
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'modifiedOn'
     */
    @Test
    public void modifiedOnTest() {
        // TODO: test modifiedOn
    }

    /**
     * Test the property 'value'
     */
    @Test
    public void valueTest() {
        // TODO: test value
    }

    /**
     * Test the property 'timeRemaining'
     */
    @Test
    public void timeRemainingTest() {
        // TODO: test timeRemaining
    }

    /**
     * Test the property 'enabled'
     */
    @Test
    public void enabledTest() {
        // TODO: test enabled
    }

}