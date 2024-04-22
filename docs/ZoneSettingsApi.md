# ZoneSettingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zoneSettingsChange0RttSessionResumptionSetting**](ZoneSettingsApi.md#zoneSettingsChange0RttSessionResumptionSetting) | **PATCH** /zones/{zone_id}/settings/0rtt | Change 0-RTT session resumption setting |
| [**zoneSettingsChangeAlwaysOnlineSetting**](ZoneSettingsApi.md#zoneSettingsChangeAlwaysOnlineSetting) | **PATCH** /zones/{zone_id}/settings/always_online | Change Always Online setting |
| [**zoneSettingsChangeAlwaysUseHttpsSetting**](ZoneSettingsApi.md#zoneSettingsChangeAlwaysUseHttpsSetting) | **PATCH** /zones/{zone_id}/settings/always_use_https | Change Always Use HTTPS setting |
| [**zoneSettingsChangeAutomaticHttpsRewritesSetting**](ZoneSettingsApi.md#zoneSettingsChangeAutomaticHttpsRewritesSetting) | **PATCH** /zones/{zone_id}/settings/automatic_https_rewrites | Change Automatic HTTPS Rewrites setting |
| [**zoneSettingsChangeAutomaticPlatformOptimizationSetting**](ZoneSettingsApi.md#zoneSettingsChangeAutomaticPlatformOptimizationSetting) | **PATCH** /zones/{zone_id}/settings/automatic_platform_optimization | Change Automatic Platform Optimization for WordPress setting |
| [**zoneSettingsChangeBrotliSetting**](ZoneSettingsApi.md#zoneSettingsChangeBrotliSetting) | **PATCH** /zones/{zone_id}/settings/brotli | Change Brotli setting |
| [**zoneSettingsChangeBrowserCacheTtlSetting**](ZoneSettingsApi.md#zoneSettingsChangeBrowserCacheTtlSetting) | **PATCH** /zones/{zone_id}/settings/browser_cache_ttl | Change Browser Cache TTL setting |
| [**zoneSettingsChangeBrowserCheckSetting**](ZoneSettingsApi.md#zoneSettingsChangeBrowserCheckSetting) | **PATCH** /zones/{zone_id}/settings/browser_check | Change Browser Check setting |
| [**zoneSettingsChangeCacheLevelSetting**](ZoneSettingsApi.md#zoneSettingsChangeCacheLevelSetting) | **PATCH** /zones/{zone_id}/settings/cache_level | Change Cache Level setting |
| [**zoneSettingsChangeChallengeTtlSetting**](ZoneSettingsApi.md#zoneSettingsChangeChallengeTtlSetting) | **PATCH** /zones/{zone_id}/settings/challenge_ttl | Change Challenge TTL setting |
| [**zoneSettingsChangeCiphersSetting**](ZoneSettingsApi.md#zoneSettingsChangeCiphersSetting) | **PATCH** /zones/{zone_id}/settings/ciphers | Change ciphers setting |
| [**zoneSettingsChangeDevelopmentModeSetting**](ZoneSettingsApi.md#zoneSettingsChangeDevelopmentModeSetting) | **PATCH** /zones/{zone_id}/settings/development_mode | Change Development Mode setting |
| [**zoneSettingsChangeEarlyHintsSetting**](ZoneSettingsApi.md#zoneSettingsChangeEarlyHintsSetting) | **PATCH** /zones/{zone_id}/settings/early_hints | Change Early Hints setting |
| [**zoneSettingsChangeEmailObfuscationSetting**](ZoneSettingsApi.md#zoneSettingsChangeEmailObfuscationSetting) | **PATCH** /zones/{zone_id}/settings/email_obfuscation | Change Email Obfuscation setting |
| [**zoneSettingsChangeEnableErrorPagesOnSetting**](ZoneSettingsApi.md#zoneSettingsChangeEnableErrorPagesOnSetting) | **PATCH** /zones/{zone_id}/settings/origin_error_page_pass_thru | Change Enable Error Pages On setting |
| [**zoneSettingsChangeEnableQueryStringSortSetting**](ZoneSettingsApi.md#zoneSettingsChangeEnableQueryStringSortSetting) | **PATCH** /zones/{zone_id}/settings/sort_query_string_for_cache | Change Enable Query String Sort setting |
| [**zoneSettingsChangeFontsSetting**](ZoneSettingsApi.md#zoneSettingsChangeFontsSetting) | **PATCH** /zones/{zone_id}/settings/fonts | Change Cloudflare Fonts setting |
| [**zoneSettingsChangeH2PrioritizationSetting**](ZoneSettingsApi.md#zoneSettingsChangeH2PrioritizationSetting) | **PATCH** /zones/{zone_id}/settings/h2_prioritization | Change HTTP/2 Edge Prioritization setting |
| [**zoneSettingsChangeHTTP2Setting**](ZoneSettingsApi.md#zoneSettingsChangeHTTP2Setting) | **PATCH** /zones/{zone_id}/settings/http2 | Change HTTP2 setting |
| [**zoneSettingsChangeHTTP3Setting**](ZoneSettingsApi.md#zoneSettingsChangeHTTP3Setting) | **PATCH** /zones/{zone_id}/settings/http3 | Change HTTP3 setting |
| [**zoneSettingsChangeHotlinkProtectionSetting**](ZoneSettingsApi.md#zoneSettingsChangeHotlinkProtectionSetting) | **PATCH** /zones/{zone_id}/settings/hotlink_protection | Change Hotlink Protection setting |
| [**zoneSettingsChangeIPv6Setting**](ZoneSettingsApi.md#zoneSettingsChangeIPv6Setting) | **PATCH** /zones/{zone_id}/settings/ipv6 | Change IPv6 setting |
| [**zoneSettingsChangeImageResizingSetting**](ZoneSettingsApi.md#zoneSettingsChangeImageResizingSetting) | **PATCH** /zones/{zone_id}/settings/image_resizing | Change Image Resizing setting |
| [**zoneSettingsChangeIpGeolocationSetting**](ZoneSettingsApi.md#zoneSettingsChangeIpGeolocationSetting) | **PATCH** /zones/{zone_id}/settings/ip_geolocation | Change IP Geolocation setting |
| [**zoneSettingsChangeMinifySetting**](ZoneSettingsApi.md#zoneSettingsChangeMinifySetting) | **PATCH** /zones/{zone_id}/settings/minify | Change Minify setting |
| [**zoneSettingsChangeMinimumTlsVersionSetting**](ZoneSettingsApi.md#zoneSettingsChangeMinimumTlsVersionSetting) | **PATCH** /zones/{zone_id}/settings/min_tls_version | Change Minimum TLS Version setting |
| [**zoneSettingsChangeMobileRedirectSetting**](ZoneSettingsApi.md#zoneSettingsChangeMobileRedirectSetting) | **PATCH** /zones/{zone_id}/settings/mobile_redirect | Change Mobile Redirect setting |
| [**zoneSettingsChangeNelSetting**](ZoneSettingsApi.md#zoneSettingsChangeNelSetting) | **PATCH** /zones/{zone_id}/settings/nel | Change Network Error Logging setting |
| [**zoneSettingsChangeOpportunisticEncryptionSetting**](ZoneSettingsApi.md#zoneSettingsChangeOpportunisticEncryptionSetting) | **PATCH** /zones/{zone_id}/settings/opportunistic_encryption | Change Opportunistic Encryption setting |
| [**zoneSettingsChangeOpportunisticOnionSetting**](ZoneSettingsApi.md#zoneSettingsChangeOpportunisticOnionSetting) | **PATCH** /zones/{zone_id}/settings/opportunistic_onion | Change Opportunistic Onion setting |
| [**zoneSettingsChangeOrangeToOrangeSetting**](ZoneSettingsApi.md#zoneSettingsChangeOrangeToOrangeSetting) | **PATCH** /zones/{zone_id}/settings/orange_to_orange | Change Orange to Orange (O2O) setting |
| [**zoneSettingsChangePolishSetting**](ZoneSettingsApi.md#zoneSettingsChangePolishSetting) | **PATCH** /zones/{zone_id}/settings/polish | Change Polish setting |
| [**zoneSettingsChangePrefetchPreloadSetting**](ZoneSettingsApi.md#zoneSettingsChangePrefetchPreloadSetting) | **PATCH** /zones/{zone_id}/settings/prefetch_preload | Change prefetch preload setting |
| [**zoneSettingsChangeProxyReadTimeoutSetting**](ZoneSettingsApi.md#zoneSettingsChangeProxyReadTimeoutSetting) | **PATCH** /zones/{zone_id}/settings/proxy_read_timeout | Change Proxy Read Timeout setting |
| [**zoneSettingsChangePseudoIPv4Setting**](ZoneSettingsApi.md#zoneSettingsChangePseudoIPv4Setting) | **PATCH** /zones/{zone_id}/settings/pseudo_ipv4 | Change Pseudo IPv4 setting |
| [**zoneSettingsChangeResponseBufferingSetting**](ZoneSettingsApi.md#zoneSettingsChangeResponseBufferingSetting) | **PATCH** /zones/{zone_id}/settings/response_buffering | Change Response Buffering setting |
| [**zoneSettingsChangeRocketLoaderSetting**](ZoneSettingsApi.md#zoneSettingsChangeRocketLoaderSetting) | **PATCH** /zones/{zone_id}/settings/rocket_loader | Change Rocket Loader setting |
| [**zoneSettingsChangeSecurityHeaderHstsSetting**](ZoneSettingsApi.md#zoneSettingsChangeSecurityHeaderHstsSetting) | **PATCH** /zones/{zone_id}/settings/security_header | Change Security Header (HSTS) setting |
| [**zoneSettingsChangeSecurityLevelSetting**](ZoneSettingsApi.md#zoneSettingsChangeSecurityLevelSetting) | **PATCH** /zones/{zone_id}/settings/security_level | Change Security Level setting |
| [**zoneSettingsChangeServerSideExcludeSetting**](ZoneSettingsApi.md#zoneSettingsChangeServerSideExcludeSetting) | **PATCH** /zones/{zone_id}/settings/server_side_exclude | Change Server Side Exclude setting |
| [**zoneSettingsChangeSslRecommenderSetting**](ZoneSettingsApi.md#zoneSettingsChangeSslRecommenderSetting) | **PATCH** /zones/{zone_id}/settings/ssl_recommender | Change SSL/TLS Recommender enrollment setting |
| [**zoneSettingsChangeSslSetting**](ZoneSettingsApi.md#zoneSettingsChangeSslSetting) | **PATCH** /zones/{zone_id}/settings/ssl | Change SSL setting |
| [**zoneSettingsChangeTls13Setting**](ZoneSettingsApi.md#zoneSettingsChangeTls13Setting) | **PATCH** /zones/{zone_id}/settings/tls_1_3 | Change TLS 1.3 setting |
| [**zoneSettingsChangeTlsClientAuthSetting**](ZoneSettingsApi.md#zoneSettingsChangeTlsClientAuthSetting) | **PATCH** /zones/{zone_id}/settings/tls_client_auth | Change TLS Client Auth setting |
| [**zoneSettingsChangeTrueClientIpSetting**](ZoneSettingsApi.md#zoneSettingsChangeTrueClientIpSetting) | **PATCH** /zones/{zone_id}/settings/true_client_ip_header | Change True Client IP setting |
| [**zoneSettingsChangeWebApplicationFirewallWafSetting**](ZoneSettingsApi.md#zoneSettingsChangeWebApplicationFirewallWafSetting) | **PATCH** /zones/{zone_id}/settings/waf | Change Web Application Firewall (WAF) setting |
| [**zoneSettingsChangeWebMirageSetting**](ZoneSettingsApi.md#zoneSettingsChangeWebMirageSetting) | **PATCH** /zones/{zone_id}/settings/mirage | Change Mirage setting |
| [**zoneSettingsChangeWebPSetting**](ZoneSettingsApi.md#zoneSettingsChangeWebPSetting) | **PATCH** /zones/{zone_id}/settings/webp | Change WebP setting |
| [**zoneSettingsChangeWebSocketsSetting**](ZoneSettingsApi.md#zoneSettingsChangeWebSocketsSetting) | **PATCH** /zones/{zone_id}/settings/websockets | Change WebSockets setting |
| [**zoneSettingsEditZoneSettingsInfo**](ZoneSettingsApi.md#zoneSettingsEditZoneSettingsInfo) | **PATCH** /zones/{zone_id}/settings | Edit zone settings info |
| [**zoneSettingsGet0RttSessionResumptionSetting**](ZoneSettingsApi.md#zoneSettingsGet0RttSessionResumptionSetting) | **GET** /zones/{zone_id}/settings/0rtt | Get 0-RTT session resumption setting |
| [**zoneSettingsGetAdvancedDdosSetting**](ZoneSettingsApi.md#zoneSettingsGetAdvancedDdosSetting) | **GET** /zones/{zone_id}/settings/advanced_ddos | Get Advanced DDOS setting |
| [**zoneSettingsGetAllZoneSettings**](ZoneSettingsApi.md#zoneSettingsGetAllZoneSettings) | **GET** /zones/{zone_id}/settings | Get all Zone settings |
| [**zoneSettingsGetAlwaysOnlineSetting**](ZoneSettingsApi.md#zoneSettingsGetAlwaysOnlineSetting) | **GET** /zones/{zone_id}/settings/always_online | Get Always Online setting |
| [**zoneSettingsGetAlwaysUseHttpsSetting**](ZoneSettingsApi.md#zoneSettingsGetAlwaysUseHttpsSetting) | **GET** /zones/{zone_id}/settings/always_use_https | Get Always Use HTTPS setting |
| [**zoneSettingsGetAutomaticHttpsRewritesSetting**](ZoneSettingsApi.md#zoneSettingsGetAutomaticHttpsRewritesSetting) | **GET** /zones/{zone_id}/settings/automatic_https_rewrites | Get Automatic HTTPS Rewrites setting |
| [**zoneSettingsGetAutomaticPlatformOptimizationSetting**](ZoneSettingsApi.md#zoneSettingsGetAutomaticPlatformOptimizationSetting) | **GET** /zones/{zone_id}/settings/automatic_platform_optimization | Get Automatic Platform Optimization for WordPress setting |
| [**zoneSettingsGetBrotliSetting**](ZoneSettingsApi.md#zoneSettingsGetBrotliSetting) | **GET** /zones/{zone_id}/settings/brotli | Get Brotli setting |
| [**zoneSettingsGetBrowserCacheTtlSetting**](ZoneSettingsApi.md#zoneSettingsGetBrowserCacheTtlSetting) | **GET** /zones/{zone_id}/settings/browser_cache_ttl | Get Browser Cache TTL setting |
| [**zoneSettingsGetBrowserCheckSetting**](ZoneSettingsApi.md#zoneSettingsGetBrowserCheckSetting) | **GET** /zones/{zone_id}/settings/browser_check | Get Browser Check setting |
| [**zoneSettingsGetCacheLevelSetting**](ZoneSettingsApi.md#zoneSettingsGetCacheLevelSetting) | **GET** /zones/{zone_id}/settings/cache_level | Get Cache Level setting |
| [**zoneSettingsGetChallengeTtlSetting**](ZoneSettingsApi.md#zoneSettingsGetChallengeTtlSetting) | **GET** /zones/{zone_id}/settings/challenge_ttl | Get Challenge TTL setting |
| [**zoneSettingsGetCiphersSetting**](ZoneSettingsApi.md#zoneSettingsGetCiphersSetting) | **GET** /zones/{zone_id}/settings/ciphers | Get ciphers setting |
| [**zoneSettingsGetDevelopmentModeSetting**](ZoneSettingsApi.md#zoneSettingsGetDevelopmentModeSetting) | **GET** /zones/{zone_id}/settings/development_mode | Get Development Mode setting |
| [**zoneSettingsGetEarlyHintsSetting**](ZoneSettingsApi.md#zoneSettingsGetEarlyHintsSetting) | **GET** /zones/{zone_id}/settings/early_hints | Get Early Hints setting |
| [**zoneSettingsGetEmailObfuscationSetting**](ZoneSettingsApi.md#zoneSettingsGetEmailObfuscationSetting) | **GET** /zones/{zone_id}/settings/email_obfuscation | Get Email Obfuscation setting |
| [**zoneSettingsGetEnableErrorPagesOnSetting**](ZoneSettingsApi.md#zoneSettingsGetEnableErrorPagesOnSetting) | **GET** /zones/{zone_id}/settings/origin_error_page_pass_thru | Get Enable Error Pages On setting |
| [**zoneSettingsGetEnableQueryStringSortSetting**](ZoneSettingsApi.md#zoneSettingsGetEnableQueryStringSortSetting) | **GET** /zones/{zone_id}/settings/sort_query_string_for_cache | Get Enable Query String Sort setting |
| [**zoneSettingsGetFontsSetting**](ZoneSettingsApi.md#zoneSettingsGetFontsSetting) | **GET** /zones/{zone_id}/settings/fonts | Get Cloudflare Fonts setting |
| [**zoneSettingsGetH2PrioritizationSetting**](ZoneSettingsApi.md#zoneSettingsGetH2PrioritizationSetting) | **GET** /zones/{zone_id}/settings/h2_prioritization | Get HTTP/2 Edge Prioritization setting |
| [**zoneSettingsGetHTTP2Setting**](ZoneSettingsApi.md#zoneSettingsGetHTTP2Setting) | **GET** /zones/{zone_id}/settings/http2 | Get HTTP2 setting |
| [**zoneSettingsGetHTTP3Setting**](ZoneSettingsApi.md#zoneSettingsGetHTTP3Setting) | **GET** /zones/{zone_id}/settings/http3 | Get HTTP3 setting |
| [**zoneSettingsGetHotlinkProtectionSetting**](ZoneSettingsApi.md#zoneSettingsGetHotlinkProtectionSetting) | **GET** /zones/{zone_id}/settings/hotlink_protection | Get Hotlink Protection setting |
| [**zoneSettingsGetIPv6Setting**](ZoneSettingsApi.md#zoneSettingsGetIPv6Setting) | **GET** /zones/{zone_id}/settings/ipv6 | Get IPv6 setting |
| [**zoneSettingsGetImageResizingSetting**](ZoneSettingsApi.md#zoneSettingsGetImageResizingSetting) | **GET** /zones/{zone_id}/settings/image_resizing | Get Image Resizing setting |
| [**zoneSettingsGetIpGeolocationSetting**](ZoneSettingsApi.md#zoneSettingsGetIpGeolocationSetting) | **GET** /zones/{zone_id}/settings/ip_geolocation | Get IP Geolocation setting |
| [**zoneSettingsGetMinifySetting**](ZoneSettingsApi.md#zoneSettingsGetMinifySetting) | **GET** /zones/{zone_id}/settings/minify | Get Minify setting |
| [**zoneSettingsGetMinimumTlsVersionSetting**](ZoneSettingsApi.md#zoneSettingsGetMinimumTlsVersionSetting) | **GET** /zones/{zone_id}/settings/min_tls_version | Get Minimum TLS Version setting |
| [**zoneSettingsGetMirageSetting**](ZoneSettingsApi.md#zoneSettingsGetMirageSetting) | **GET** /zones/{zone_id}/settings/mirage | Get Mirage setting |
| [**zoneSettingsGetMobileRedirectSetting**](ZoneSettingsApi.md#zoneSettingsGetMobileRedirectSetting) | **GET** /zones/{zone_id}/settings/mobile_redirect | Get Mobile Redirect setting |
| [**zoneSettingsGetNelSetting**](ZoneSettingsApi.md#zoneSettingsGetNelSetting) | **GET** /zones/{zone_id}/settings/nel | Get Network Error Logging setting |
| [**zoneSettingsGetOpportunisticEncryptionSetting**](ZoneSettingsApi.md#zoneSettingsGetOpportunisticEncryptionSetting) | **GET** /zones/{zone_id}/settings/opportunistic_encryption | Get Opportunistic Encryption setting |
| [**zoneSettingsGetOpportunisticOnionSetting**](ZoneSettingsApi.md#zoneSettingsGetOpportunisticOnionSetting) | **GET** /zones/{zone_id}/settings/opportunistic_onion | Get Opportunistic Onion setting |
| [**zoneSettingsGetOrangeToOrangeSetting**](ZoneSettingsApi.md#zoneSettingsGetOrangeToOrangeSetting) | **GET** /zones/{zone_id}/settings/orange_to_orange | Get Orange to Orange (O2O) setting |
| [**zoneSettingsGetPolishSetting**](ZoneSettingsApi.md#zoneSettingsGetPolishSetting) | **GET** /zones/{zone_id}/settings/polish | Get Polish setting |
| [**zoneSettingsGetPrefetchPreloadSetting**](ZoneSettingsApi.md#zoneSettingsGetPrefetchPreloadSetting) | **GET** /zones/{zone_id}/settings/prefetch_preload | Get prefetch preload setting |
| [**zoneSettingsGetProxyReadTimeoutSetting**](ZoneSettingsApi.md#zoneSettingsGetProxyReadTimeoutSetting) | **GET** /zones/{zone_id}/settings/proxy_read_timeout | Get Proxy Read Timeout setting |
| [**zoneSettingsGetPseudoIPv4Setting**](ZoneSettingsApi.md#zoneSettingsGetPseudoIPv4Setting) | **GET** /zones/{zone_id}/settings/pseudo_ipv4 | Get Pseudo IPv4 setting |
| [**zoneSettingsGetResponseBufferingSetting**](ZoneSettingsApi.md#zoneSettingsGetResponseBufferingSetting) | **GET** /zones/{zone_id}/settings/response_buffering | Get Response Buffering setting |
| [**zoneSettingsGetRocketLoaderSetting**](ZoneSettingsApi.md#zoneSettingsGetRocketLoaderSetting) | **GET** /zones/{zone_id}/settings/rocket_loader | Get Rocket Loader setting |
| [**zoneSettingsGetSecurityHeaderHstsSetting**](ZoneSettingsApi.md#zoneSettingsGetSecurityHeaderHstsSetting) | **GET** /zones/{zone_id}/settings/security_header | Get Security Header (HSTS) setting |
| [**zoneSettingsGetSecurityLevelSetting**](ZoneSettingsApi.md#zoneSettingsGetSecurityLevelSetting) | **GET** /zones/{zone_id}/settings/security_level | Get Security Level setting |
| [**zoneSettingsGetServerSideExcludeSetting**](ZoneSettingsApi.md#zoneSettingsGetServerSideExcludeSetting) | **GET** /zones/{zone_id}/settings/server_side_exclude | Get Server Side Exclude setting |
| [**zoneSettingsGetSslRecommenderSetting**](ZoneSettingsApi.md#zoneSettingsGetSslRecommenderSetting) | **GET** /zones/{zone_id}/settings/ssl_recommender | Get SSL/TLS Recommender enrollment setting |
| [**zoneSettingsGetSslSetting**](ZoneSettingsApi.md#zoneSettingsGetSslSetting) | **GET** /zones/{zone_id}/settings/ssl | Get SSL setting |
| [**zoneSettingsGetTls13SettingEnabledForAZone**](ZoneSettingsApi.md#zoneSettingsGetTls13SettingEnabledForAZone) | **GET** /zones/{zone_id}/settings/tls_1_3 | Get TLS 1.3 setting enabled for a zone |
| [**zoneSettingsGetTlsClientAuthSetting**](ZoneSettingsApi.md#zoneSettingsGetTlsClientAuthSetting) | **GET** /zones/{zone_id}/settings/tls_client_auth | Get TLS Client Auth setting |
| [**zoneSettingsGetTrueClientIpSetting**](ZoneSettingsApi.md#zoneSettingsGetTrueClientIpSetting) | **GET** /zones/{zone_id}/settings/true_client_ip_header | Get True Client IP setting |
| [**zoneSettingsGetWebApplicationFirewallWafSetting**](ZoneSettingsApi.md#zoneSettingsGetWebApplicationFirewallWafSetting) | **GET** /zones/{zone_id}/settings/waf | Get Web Application Firewall (WAF) setting |
| [**zoneSettingsGetWebPSetting**](ZoneSettingsApi.md#zoneSettingsGetWebPSetting) | **GET** /zones/{zone_id}/settings/webp | Get WebP setting |
| [**zoneSettingsGetWebSocketsSetting**](ZoneSettingsApi.md#zoneSettingsGetWebSocketsSetting) | **GET** /zones/{zone_id}/settings/websockets | Get WebSockets setting |


<a id="zoneSettingsChange0RttSessionResumptionSetting"></a>
# **zoneSettingsChange0RttSessionResumptionSetting**
> ZoneSettingsGet0RttSessionResumptionSetting200Response zoneSettingsChange0RttSessionResumptionSetting(zoneId, zoneSettingsChange0RttSessionResumptionSettingRequest)

Change 0-RTT session resumption setting

Changes the 0-RTT session resumption setting.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChange0RttSessionResumptionSettingRequest zoneSettingsChange0RttSessionResumptionSettingRequest = new ZoneSettingsChange0RttSessionResumptionSettingRequest(); // ZoneSettingsChange0RttSessionResumptionSettingRequest | 
    try {
      ZoneSettingsGet0RttSessionResumptionSetting200Response result = apiInstance.zoneSettingsChange0RttSessionResumptionSetting(zoneId, zoneSettingsChange0RttSessionResumptionSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChange0RttSessionResumptionSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChange0RttSessionResumptionSettingRequest** | [**ZoneSettingsChange0RttSessionResumptionSettingRequest**](ZoneSettingsChange0RttSessionResumptionSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGet0RttSessionResumptionSetting200Response**](ZoneSettingsGet0RttSessionResumptionSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change 0-RTT session resumption setting response |  -  |
| **4XX** | Change 0-RTT session resumption setting response failure |  -  |

<a id="zoneSettingsChangeAlwaysOnlineSetting"></a>
# **zoneSettingsChangeAlwaysOnlineSetting**
> ZoneSettingsGetAlwaysOnlineSetting200Response zoneSettingsChangeAlwaysOnlineSetting(zoneId, zoneSettingsChangeAlwaysOnlineSettingRequest)

Change Always Online setting

When enabled, Cloudflare serves limited copies of web pages available from the [Internet Archive&#39;s Wayback Machine](https://archive.org/web/) if your server is offline. Refer to [Always Online](https://developers.cloudflare.com/cache/about/always-online) for more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeAlwaysOnlineSettingRequest zoneSettingsChangeAlwaysOnlineSettingRequest = new ZoneSettingsChangeAlwaysOnlineSettingRequest(); // ZoneSettingsChangeAlwaysOnlineSettingRequest | 
    try {
      ZoneSettingsGetAlwaysOnlineSetting200Response result = apiInstance.zoneSettingsChangeAlwaysOnlineSetting(zoneId, zoneSettingsChangeAlwaysOnlineSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeAlwaysOnlineSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeAlwaysOnlineSettingRequest** | [**ZoneSettingsChangeAlwaysOnlineSettingRequest**](ZoneSettingsChangeAlwaysOnlineSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetAlwaysOnlineSetting200Response**](ZoneSettingsGetAlwaysOnlineSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Always Online setting response |  -  |
| **4XX** | Change Always Online setting response failure |  -  |

<a id="zoneSettingsChangeAlwaysUseHttpsSetting"></a>
# **zoneSettingsChangeAlwaysUseHttpsSetting**
> ZoneSettingsGetAlwaysUseHttpsSetting200Response zoneSettingsChangeAlwaysUseHttpsSetting(zoneId, zoneSettingsChangeAlwaysUseHttpsSettingRequest)

Change Always Use HTTPS setting

Reply to all requests for URLs that use \&quot;http\&quot; with a 301 redirect to the equivalent \&quot;https\&quot; URL. If you only want to redirect for a subset of requests, consider creating an \&quot;Always use HTTPS\&quot; page rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeAlwaysUseHttpsSettingRequest zoneSettingsChangeAlwaysUseHttpsSettingRequest = new ZoneSettingsChangeAlwaysUseHttpsSettingRequest(); // ZoneSettingsChangeAlwaysUseHttpsSettingRequest | 
    try {
      ZoneSettingsGetAlwaysUseHttpsSetting200Response result = apiInstance.zoneSettingsChangeAlwaysUseHttpsSetting(zoneId, zoneSettingsChangeAlwaysUseHttpsSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeAlwaysUseHttpsSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeAlwaysUseHttpsSettingRequest** | [**ZoneSettingsChangeAlwaysUseHttpsSettingRequest**](ZoneSettingsChangeAlwaysUseHttpsSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetAlwaysUseHttpsSetting200Response**](ZoneSettingsGetAlwaysUseHttpsSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Always Use HTTPS setting response |  -  |
| **4XX** | Change Always Use HTTPS setting response failure |  -  |

<a id="zoneSettingsChangeAutomaticHttpsRewritesSetting"></a>
# **zoneSettingsChangeAutomaticHttpsRewritesSetting**
> ZoneSettingsGetAutomaticHttpsRewritesSetting200Response zoneSettingsChangeAutomaticHttpsRewritesSetting(zoneId, zoneSettingsChangeAutomaticHttpsRewritesSettingRequest)

Change Automatic HTTPS Rewrites setting

Enable the Automatic HTTPS Rewrites feature for this zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeAutomaticHttpsRewritesSettingRequest zoneSettingsChangeAutomaticHttpsRewritesSettingRequest = new ZoneSettingsChangeAutomaticHttpsRewritesSettingRequest(); // ZoneSettingsChangeAutomaticHttpsRewritesSettingRequest | 
    try {
      ZoneSettingsGetAutomaticHttpsRewritesSetting200Response result = apiInstance.zoneSettingsChangeAutomaticHttpsRewritesSetting(zoneId, zoneSettingsChangeAutomaticHttpsRewritesSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeAutomaticHttpsRewritesSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeAutomaticHttpsRewritesSettingRequest** | [**ZoneSettingsChangeAutomaticHttpsRewritesSettingRequest**](ZoneSettingsChangeAutomaticHttpsRewritesSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetAutomaticHttpsRewritesSetting200Response**](ZoneSettingsGetAutomaticHttpsRewritesSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Automatic HTTPS Rewrites setting response |  -  |
| **4XX** | Change Automatic HTTPS Rewrites setting response failure |  -  |

<a id="zoneSettingsChangeAutomaticPlatformOptimizationSetting"></a>
# **zoneSettingsChangeAutomaticPlatformOptimizationSetting**
> ZoneSettingsGetAutomaticPlatformOptimizationSetting200Response zoneSettingsChangeAutomaticPlatformOptimizationSetting(zoneId, zoneSettingsChangeAutomaticPlatformOptimizationSettingRequest)

Change Automatic Platform Optimization for WordPress setting

[Automatic Platform Optimization for WordPress](https://developers.cloudflare.com/automatic-platform-optimization/) serves your WordPress site from Cloudflare&#39;s edge network and caches third-party fonts. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeAutomaticPlatformOptimizationSettingRequest zoneSettingsChangeAutomaticPlatformOptimizationSettingRequest = new ZoneSettingsChangeAutomaticPlatformOptimizationSettingRequest(); // ZoneSettingsChangeAutomaticPlatformOptimizationSettingRequest | 
    try {
      ZoneSettingsGetAutomaticPlatformOptimizationSetting200Response result = apiInstance.zoneSettingsChangeAutomaticPlatformOptimizationSetting(zoneId, zoneSettingsChangeAutomaticPlatformOptimizationSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeAutomaticPlatformOptimizationSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeAutomaticPlatformOptimizationSettingRequest** | [**ZoneSettingsChangeAutomaticPlatformOptimizationSettingRequest**](ZoneSettingsChangeAutomaticPlatformOptimizationSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetAutomaticPlatformOptimizationSetting200Response**](ZoneSettingsGetAutomaticPlatformOptimizationSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Automatic Platform Optimization for WordPress setting response |  -  |
| **4XX** | Change Automatic Platform Optimization for WordPress setting response failure |  -  |

<a id="zoneSettingsChangeBrotliSetting"></a>
# **zoneSettingsChangeBrotliSetting**
> ZoneSettingsGetBrotliSetting200Response zoneSettingsChangeBrotliSetting(zoneId, zoneSettingsChangeBrotliSettingRequest)

Change Brotli setting

When the client requesting an asset supports the Brotli compression algorithm, Cloudflare will serve a Brotli compressed version of the asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeBrotliSettingRequest zoneSettingsChangeBrotliSettingRequest = new ZoneSettingsChangeBrotliSettingRequest(); // ZoneSettingsChangeBrotliSettingRequest | 
    try {
      ZoneSettingsGetBrotliSetting200Response result = apiInstance.zoneSettingsChangeBrotliSetting(zoneId, zoneSettingsChangeBrotliSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeBrotliSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeBrotliSettingRequest** | [**ZoneSettingsChangeBrotliSettingRequest**](ZoneSettingsChangeBrotliSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetBrotliSetting200Response**](ZoneSettingsGetBrotliSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Brotli setting response |  -  |
| **4XX** | Change Brotli setting response failure |  -  |

<a id="zoneSettingsChangeBrowserCacheTtlSetting"></a>
# **zoneSettingsChangeBrowserCacheTtlSetting**
> ZoneSettingsGetBrowserCacheTtlSetting200Response zoneSettingsChangeBrowserCacheTtlSetting(zoneId, zoneSettingsChangeBrowserCacheTtlSettingRequest)

Change Browser Cache TTL setting

Browser Cache TTL (in seconds) specifies how long Cloudflare-cached resources will remain on your visitors&#39; computers. Cloudflare will honor any larger times specified by your server. (https://support.cloudflare.com/hc/en-us/articles/200168276).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeBrowserCacheTtlSettingRequest zoneSettingsChangeBrowserCacheTtlSettingRequest = new ZoneSettingsChangeBrowserCacheTtlSettingRequest(); // ZoneSettingsChangeBrowserCacheTtlSettingRequest | 
    try {
      ZoneSettingsGetBrowserCacheTtlSetting200Response result = apiInstance.zoneSettingsChangeBrowserCacheTtlSetting(zoneId, zoneSettingsChangeBrowserCacheTtlSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeBrowserCacheTtlSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeBrowserCacheTtlSettingRequest** | [**ZoneSettingsChangeBrowserCacheTtlSettingRequest**](ZoneSettingsChangeBrowserCacheTtlSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetBrowserCacheTtlSetting200Response**](ZoneSettingsGetBrowserCacheTtlSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Browser Cache TTL setting response |  -  |
| **4XX** | Change Browser Cache TTL setting response failure |  -  |

<a id="zoneSettingsChangeBrowserCheckSetting"></a>
# **zoneSettingsChangeBrowserCheckSetting**
> ZoneSettingsGetBrowserCheckSetting200Response zoneSettingsChangeBrowserCheckSetting(zoneId, zoneSettingsChangeBrowserCheckSettingRequest)

Change Browser Check setting

Browser Integrity Check is similar to Bad Behavior and looks for common HTTP headers abused most commonly by spammers and denies access to your page.  It will also challenge visitors that do not have a user agent or a non standard user agent (also commonly used by abuse bots, crawlers or visitors). (https://support.cloudflare.com/hc/en-us/articles/200170086).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeBrowserCheckSettingRequest zoneSettingsChangeBrowserCheckSettingRequest = new ZoneSettingsChangeBrowserCheckSettingRequest(); // ZoneSettingsChangeBrowserCheckSettingRequest | 
    try {
      ZoneSettingsGetBrowserCheckSetting200Response result = apiInstance.zoneSettingsChangeBrowserCheckSetting(zoneId, zoneSettingsChangeBrowserCheckSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeBrowserCheckSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeBrowserCheckSettingRequest** | [**ZoneSettingsChangeBrowserCheckSettingRequest**](ZoneSettingsChangeBrowserCheckSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetBrowserCheckSetting200Response**](ZoneSettingsGetBrowserCheckSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Browser Check setting response |  -  |
| **4XX** | Change Browser Check setting response failure |  -  |

<a id="zoneSettingsChangeCacheLevelSetting"></a>
# **zoneSettingsChangeCacheLevelSetting**
> ZoneSettingsGetCacheLevelSetting200Response zoneSettingsChangeCacheLevelSetting(zoneId, zoneSettingsChangeCacheLevelSettingRequest)

Change Cache Level setting

Cache Level functions based off the setting level. The basic setting will cache most static resources (i.e., css, images, and JavaScript). The simplified setting will ignore the query string when delivering a cached resource. The aggressive setting will cache all static resources, including ones with a query string. (https://support.cloudflare.com/hc/en-us/articles/200168256).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeCacheLevelSettingRequest zoneSettingsChangeCacheLevelSettingRequest = new ZoneSettingsChangeCacheLevelSettingRequest(); // ZoneSettingsChangeCacheLevelSettingRequest | 
    try {
      ZoneSettingsGetCacheLevelSetting200Response result = apiInstance.zoneSettingsChangeCacheLevelSetting(zoneId, zoneSettingsChangeCacheLevelSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeCacheLevelSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeCacheLevelSettingRequest** | [**ZoneSettingsChangeCacheLevelSettingRequest**](ZoneSettingsChangeCacheLevelSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetCacheLevelSetting200Response**](ZoneSettingsGetCacheLevelSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Cache Level setting response |  -  |
| **4XX** | Change Cache Level setting response failure |  -  |

<a id="zoneSettingsChangeChallengeTtlSetting"></a>
# **zoneSettingsChangeChallengeTtlSetting**
> ZoneSettingsGetChallengeTtlSetting200Response zoneSettingsChangeChallengeTtlSetting(zoneId, zoneSettingsChangeChallengeTtlSettingRequest)

Change Challenge TTL setting

Specify how long a visitor is allowed access to your site after successfully completing a challenge (such as a CAPTCHA). After the TTL has expired the visitor will have to complete a new challenge. We recommend a 15 - 45 minute setting and will attempt to honor any setting above 45 minutes. (https://support.cloudflare.com/hc/en-us/articles/200170136).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeChallengeTtlSettingRequest zoneSettingsChangeChallengeTtlSettingRequest = new ZoneSettingsChangeChallengeTtlSettingRequest(); // ZoneSettingsChangeChallengeTtlSettingRequest | 
    try {
      ZoneSettingsGetChallengeTtlSetting200Response result = apiInstance.zoneSettingsChangeChallengeTtlSetting(zoneId, zoneSettingsChangeChallengeTtlSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeChallengeTtlSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeChallengeTtlSettingRequest** | [**ZoneSettingsChangeChallengeTtlSettingRequest**](ZoneSettingsChangeChallengeTtlSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetChallengeTtlSetting200Response**](ZoneSettingsGetChallengeTtlSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Challenge TTL setting response |  -  |
| **4XX** | Change Challenge TTL setting response failure |  -  |

<a id="zoneSettingsChangeCiphersSetting"></a>
# **zoneSettingsChangeCiphersSetting**
> ZoneSettingsGetCiphersSetting200Response zoneSettingsChangeCiphersSetting(zoneId, zoneSettingsChangeCiphersSettingRequest)

Change ciphers setting

Changes ciphers setting.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeCiphersSettingRequest zoneSettingsChangeCiphersSettingRequest = new ZoneSettingsChangeCiphersSettingRequest(); // ZoneSettingsChangeCiphersSettingRequest | 
    try {
      ZoneSettingsGetCiphersSetting200Response result = apiInstance.zoneSettingsChangeCiphersSetting(zoneId, zoneSettingsChangeCiphersSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeCiphersSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeCiphersSettingRequest** | [**ZoneSettingsChangeCiphersSettingRequest**](ZoneSettingsChangeCiphersSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetCiphersSetting200Response**](ZoneSettingsGetCiphersSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change ciphers setting response |  -  |
| **4XX** | Change ciphers setting response failure |  -  |

<a id="zoneSettingsChangeDevelopmentModeSetting"></a>
# **zoneSettingsChangeDevelopmentModeSetting**
> ZoneSettingsGetDevelopmentModeSetting200Response zoneSettingsChangeDevelopmentModeSetting(zoneId, zoneSettingsChangeDevelopmentModeSettingRequest)

Change Development Mode setting

Development Mode temporarily allows you to enter development mode for your websites if you need to make changes to your site. This will bypass Cloudflare&#39;s accelerated cache and slow down your site, but is useful if you are making changes to cacheable content (like images, css, or JavaScript) and would like to see those changes right away. Once entered, development mode will last for 3 hours and then automatically toggle off.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeDevelopmentModeSettingRequest zoneSettingsChangeDevelopmentModeSettingRequest = new ZoneSettingsChangeDevelopmentModeSettingRequest(); // ZoneSettingsChangeDevelopmentModeSettingRequest | 
    try {
      ZoneSettingsGetDevelopmentModeSetting200Response result = apiInstance.zoneSettingsChangeDevelopmentModeSetting(zoneId, zoneSettingsChangeDevelopmentModeSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeDevelopmentModeSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeDevelopmentModeSettingRequest** | [**ZoneSettingsChangeDevelopmentModeSettingRequest**](ZoneSettingsChangeDevelopmentModeSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetDevelopmentModeSetting200Response**](ZoneSettingsGetDevelopmentModeSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Development Mode setting response |  -  |
| **4XX** | Change Development Mode setting response failure |  -  |

<a id="zoneSettingsChangeEarlyHintsSetting"></a>
# **zoneSettingsChangeEarlyHintsSetting**
> ZoneSettingsGetEarlyHintsSetting200Response zoneSettingsChangeEarlyHintsSetting(zoneId, zoneSettingsChangeEarlyHintsSettingRequest)

Change Early Hints setting

When enabled, Cloudflare will attempt to speed up overall page loads by serving &#x60;103&#x60; responses with &#x60;Link&#x60; headers from the final response. Refer to [Early Hints](https://developers.cloudflare.com/cache/about/early-hints) for more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeEarlyHintsSettingRequest zoneSettingsChangeEarlyHintsSettingRequest = new ZoneSettingsChangeEarlyHintsSettingRequest(); // ZoneSettingsChangeEarlyHintsSettingRequest | 
    try {
      ZoneSettingsGetEarlyHintsSetting200Response result = apiInstance.zoneSettingsChangeEarlyHintsSetting(zoneId, zoneSettingsChangeEarlyHintsSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeEarlyHintsSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeEarlyHintsSettingRequest** | [**ZoneSettingsChangeEarlyHintsSettingRequest**](ZoneSettingsChangeEarlyHintsSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetEarlyHintsSetting200Response**](ZoneSettingsGetEarlyHintsSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Early Hints setting response |  -  |
| **4XX** | Change Early Hints setting response failure |  -  |

<a id="zoneSettingsChangeEmailObfuscationSetting"></a>
# **zoneSettingsChangeEmailObfuscationSetting**
> ZoneSettingsGetEmailObfuscationSetting200Response zoneSettingsChangeEmailObfuscationSetting(zoneId, zoneSettingsChangeEmailObfuscationSettingRequest)

Change Email Obfuscation setting

Encrypt email adresses on your web page from bots, while keeping them visible to humans. (https://support.cloudflare.com/hc/en-us/articles/200170016).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeEmailObfuscationSettingRequest zoneSettingsChangeEmailObfuscationSettingRequest = new ZoneSettingsChangeEmailObfuscationSettingRequest(); // ZoneSettingsChangeEmailObfuscationSettingRequest | 
    try {
      ZoneSettingsGetEmailObfuscationSetting200Response result = apiInstance.zoneSettingsChangeEmailObfuscationSetting(zoneId, zoneSettingsChangeEmailObfuscationSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeEmailObfuscationSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeEmailObfuscationSettingRequest** | [**ZoneSettingsChangeEmailObfuscationSettingRequest**](ZoneSettingsChangeEmailObfuscationSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetEmailObfuscationSetting200Response**](ZoneSettingsGetEmailObfuscationSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Email Obfuscation setting response |  -  |
| **4XX** | Change Email Obfuscation setting response failure |  -  |

<a id="zoneSettingsChangeEnableErrorPagesOnSetting"></a>
# **zoneSettingsChangeEnableErrorPagesOnSetting**
> ZoneSettingsGetEnableErrorPagesOnSetting200Response zoneSettingsChangeEnableErrorPagesOnSetting(zoneId, zoneSettingsChangeEnableErrorPagesOnSettingRequest)

Change Enable Error Pages On setting

Cloudflare will proxy customer error pages on any 502,504 errors on origin server instead of showing a default Cloudflare error page. This does not apply to 522 errors and is limited to Enterprise Zones.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeEnableErrorPagesOnSettingRequest zoneSettingsChangeEnableErrorPagesOnSettingRequest = new ZoneSettingsChangeEnableErrorPagesOnSettingRequest(); // ZoneSettingsChangeEnableErrorPagesOnSettingRequest | 
    try {
      ZoneSettingsGetEnableErrorPagesOnSetting200Response result = apiInstance.zoneSettingsChangeEnableErrorPagesOnSetting(zoneId, zoneSettingsChangeEnableErrorPagesOnSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeEnableErrorPagesOnSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeEnableErrorPagesOnSettingRequest** | [**ZoneSettingsChangeEnableErrorPagesOnSettingRequest**](ZoneSettingsChangeEnableErrorPagesOnSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetEnableErrorPagesOnSetting200Response**](ZoneSettingsGetEnableErrorPagesOnSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Enable Error Pages On setting response |  -  |
| **4XX** | Change Enable Error Pages On setting response failure |  -  |

<a id="zoneSettingsChangeEnableQueryStringSortSetting"></a>
# **zoneSettingsChangeEnableQueryStringSortSetting**
> ZoneSettingsGetEnableQueryStringSortSetting200Response zoneSettingsChangeEnableQueryStringSortSetting(zoneId, zoneSettingsChangeEnableQueryStringSortSettingRequest)

Change Enable Query String Sort setting

Cloudflare will treat files with the same query strings as the same file in cache, regardless of the order of the query strings. This is limited to Enterprise Zones.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeEnableQueryStringSortSettingRequest zoneSettingsChangeEnableQueryStringSortSettingRequest = new ZoneSettingsChangeEnableQueryStringSortSettingRequest(); // ZoneSettingsChangeEnableQueryStringSortSettingRequest | 
    try {
      ZoneSettingsGetEnableQueryStringSortSetting200Response result = apiInstance.zoneSettingsChangeEnableQueryStringSortSetting(zoneId, zoneSettingsChangeEnableQueryStringSortSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeEnableQueryStringSortSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeEnableQueryStringSortSettingRequest** | [**ZoneSettingsChangeEnableQueryStringSortSettingRequest**](ZoneSettingsChangeEnableQueryStringSortSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetEnableQueryStringSortSetting200Response**](ZoneSettingsGetEnableQueryStringSortSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Enable Query String Sort setting response |  -  |
| **4XX** | Change Enable Query String Sort setting response failure |  -  |

<a id="zoneSettingsChangeFontsSetting"></a>
# **zoneSettingsChangeFontsSetting**
> ZoneSettingsGetFontsSetting200Response zoneSettingsChangeFontsSetting(zoneId, zoneSettingsChangeFontsSettingRequest)

Change Cloudflare Fonts setting

Enhance your website&#39;s font delivery with Cloudflare Fonts. Deliver Google Hosted fonts from your own domain, boost performance, and enhance user privacy. Refer to the Cloudflare Fonts documentation for more information. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeFontsSettingRequest zoneSettingsChangeFontsSettingRequest = new ZoneSettingsChangeFontsSettingRequest(); // ZoneSettingsChangeFontsSettingRequest | 
    try {
      ZoneSettingsGetFontsSetting200Response result = apiInstance.zoneSettingsChangeFontsSetting(zoneId, zoneSettingsChangeFontsSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeFontsSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeFontsSettingRequest** | [**ZoneSettingsChangeFontsSettingRequest**](ZoneSettingsChangeFontsSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetFontsSetting200Response**](ZoneSettingsGetFontsSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Cloudflare Fonts setting response |  -  |
| **4XX** | Change Cloudflare Fonts setting response failure |  -  |

<a id="zoneSettingsChangeH2PrioritizationSetting"></a>
# **zoneSettingsChangeH2PrioritizationSetting**
> ZoneSettingsGetH2PrioritizationSetting200Response zoneSettingsChangeH2PrioritizationSetting(zoneId, zoneSettingsChangeH2PrioritizationSettingRequest)

Change HTTP/2 Edge Prioritization setting

Gets HTTP/2 Edge Prioritization setting. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeH2PrioritizationSettingRequest zoneSettingsChangeH2PrioritizationSettingRequest = new ZoneSettingsChangeH2PrioritizationSettingRequest(); // ZoneSettingsChangeH2PrioritizationSettingRequest | 
    try {
      ZoneSettingsGetH2PrioritizationSetting200Response result = apiInstance.zoneSettingsChangeH2PrioritizationSetting(zoneId, zoneSettingsChangeH2PrioritizationSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeH2PrioritizationSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeH2PrioritizationSettingRequest** | [**ZoneSettingsChangeH2PrioritizationSettingRequest**](ZoneSettingsChangeH2PrioritizationSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetH2PrioritizationSetting200Response**](ZoneSettingsGetH2PrioritizationSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change HTTP/2 Edge Prioritization setting response |  -  |
| **4XX** | Change HTTP/2 Edge Prioritization setting response failure |  -  |

<a id="zoneSettingsChangeHTTP2Setting"></a>
# **zoneSettingsChangeHTTP2Setting**
> ZoneSettingsGetHTTP2Setting200Response zoneSettingsChangeHTTP2Setting(zoneId, zoneSettingsChangeHTTP2SettingRequest)

Change HTTP2 setting

Value of the HTTP2 setting.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeHTTP2SettingRequest zoneSettingsChangeHTTP2SettingRequest = new ZoneSettingsChangeHTTP2SettingRequest(); // ZoneSettingsChangeHTTP2SettingRequest | 
    try {
      ZoneSettingsGetHTTP2Setting200Response result = apiInstance.zoneSettingsChangeHTTP2Setting(zoneId, zoneSettingsChangeHTTP2SettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeHTTP2Setting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeHTTP2SettingRequest** | [**ZoneSettingsChangeHTTP2SettingRequest**](ZoneSettingsChangeHTTP2SettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetHTTP2Setting200Response**](ZoneSettingsGetHTTP2Setting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change HTTP2 setting response |  -  |
| **4XX** | Change HTTP2 setting response failure |  -  |

<a id="zoneSettingsChangeHTTP3Setting"></a>
# **zoneSettingsChangeHTTP3Setting**
> ZoneSettingsGetHTTP3Setting200Response zoneSettingsChangeHTTP3Setting(zoneId, zoneSettingsChangeHTTP3SettingRequest)

Change HTTP3 setting

Value of the HTTP3 setting.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeHTTP3SettingRequest zoneSettingsChangeHTTP3SettingRequest = new ZoneSettingsChangeHTTP3SettingRequest(); // ZoneSettingsChangeHTTP3SettingRequest | 
    try {
      ZoneSettingsGetHTTP3Setting200Response result = apiInstance.zoneSettingsChangeHTTP3Setting(zoneId, zoneSettingsChangeHTTP3SettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeHTTP3Setting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeHTTP3SettingRequest** | [**ZoneSettingsChangeHTTP3SettingRequest**](ZoneSettingsChangeHTTP3SettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetHTTP3Setting200Response**](ZoneSettingsGetHTTP3Setting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change HTTP3 setting response |  -  |
| **4XX** | Change HTTP3 setting response failure |  -  |

<a id="zoneSettingsChangeHotlinkProtectionSetting"></a>
# **zoneSettingsChangeHotlinkProtectionSetting**
> ZoneSettingsGetHotlinkProtectionSetting200Response zoneSettingsChangeHotlinkProtectionSetting(zoneId, zoneSettingsChangeHotlinkProtectionSettingRequest)

Change Hotlink Protection setting

When enabled, the Hotlink Protection option ensures that other sites cannot suck up your bandwidth by building pages that use images hosted on your site. Anytime a request for an image on your site hits Cloudflare, we check to ensure that it&#39;s not another site requesting them. People will still be able to download and view images from your page, but other sites won&#39;t be able to steal them for use on their own pages. (https://support.cloudflare.com/hc/en-us/articles/200170026).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeHotlinkProtectionSettingRequest zoneSettingsChangeHotlinkProtectionSettingRequest = new ZoneSettingsChangeHotlinkProtectionSettingRequest(); // ZoneSettingsChangeHotlinkProtectionSettingRequest | 
    try {
      ZoneSettingsGetHotlinkProtectionSetting200Response result = apiInstance.zoneSettingsChangeHotlinkProtectionSetting(zoneId, zoneSettingsChangeHotlinkProtectionSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeHotlinkProtectionSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeHotlinkProtectionSettingRequest** | [**ZoneSettingsChangeHotlinkProtectionSettingRequest**](ZoneSettingsChangeHotlinkProtectionSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetHotlinkProtectionSetting200Response**](ZoneSettingsGetHotlinkProtectionSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Hotlink Protection setting response |  -  |
| **4XX** | Change Hotlink Protection setting response failure |  -  |

<a id="zoneSettingsChangeIPv6Setting"></a>
# **zoneSettingsChangeIPv6Setting**
> ZoneSettingsGetIPv6Setting200Response zoneSettingsChangeIPv6Setting(zoneId, zoneSettingsChangeIPv6SettingRequest)

Change IPv6 setting

Enable IPv6 on all subdomains that are Cloudflare enabled.  (https://support.cloudflare.com/hc/en-us/articles/200168586).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeIPv6SettingRequest zoneSettingsChangeIPv6SettingRequest = new ZoneSettingsChangeIPv6SettingRequest(); // ZoneSettingsChangeIPv6SettingRequest | 
    try {
      ZoneSettingsGetIPv6Setting200Response result = apiInstance.zoneSettingsChangeIPv6Setting(zoneId, zoneSettingsChangeIPv6SettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeIPv6Setting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeIPv6SettingRequest** | [**ZoneSettingsChangeIPv6SettingRequest**](ZoneSettingsChangeIPv6SettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetIPv6Setting200Response**](ZoneSettingsGetIPv6Setting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change IPv6 setting response |  -  |
| **4XX** | Change IPv6 setting response failure |  -  |

<a id="zoneSettingsChangeImageResizingSetting"></a>
# **zoneSettingsChangeImageResizingSetting**
> ZoneSettingsGetImageResizingSetting200Response zoneSettingsChangeImageResizingSetting(zoneId, zoneSettingsChangeImageResizingSettingRequest)

Change Image Resizing setting

Image Resizing provides on-demand resizing, conversion and optimisation for images served through Cloudflare&#39;s network. Refer to the [Image Resizing documentation](https://developers.cloudflare.com/images/) for more information. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeImageResizingSettingRequest zoneSettingsChangeImageResizingSettingRequest = new ZoneSettingsChangeImageResizingSettingRequest(); // ZoneSettingsChangeImageResizingSettingRequest | 
    try {
      ZoneSettingsGetImageResizingSetting200Response result = apiInstance.zoneSettingsChangeImageResizingSetting(zoneId, zoneSettingsChangeImageResizingSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeImageResizingSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeImageResizingSettingRequest** | [**ZoneSettingsChangeImageResizingSettingRequest**](ZoneSettingsChangeImageResizingSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetImageResizingSetting200Response**](ZoneSettingsGetImageResizingSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Image Resizing setting response |  -  |
| **4XX** | Change Image Resizing setting response failure |  -  |

<a id="zoneSettingsChangeIpGeolocationSetting"></a>
# **zoneSettingsChangeIpGeolocationSetting**
> ZoneSettingsGetIpGeolocationSetting200Response zoneSettingsChangeIpGeolocationSetting(zoneId, zoneSettingsChangeIpGeolocationSettingRequest)

Change IP Geolocation setting

Enable IP Geolocation to have Cloudflare geolocate visitors to your website and pass the country code to you. (https://support.cloudflare.com/hc/en-us/articles/200168236).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeIpGeolocationSettingRequest zoneSettingsChangeIpGeolocationSettingRequest = new ZoneSettingsChangeIpGeolocationSettingRequest(); // ZoneSettingsChangeIpGeolocationSettingRequest | 
    try {
      ZoneSettingsGetIpGeolocationSetting200Response result = apiInstance.zoneSettingsChangeIpGeolocationSetting(zoneId, zoneSettingsChangeIpGeolocationSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeIpGeolocationSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeIpGeolocationSettingRequest** | [**ZoneSettingsChangeIpGeolocationSettingRequest**](ZoneSettingsChangeIpGeolocationSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetIpGeolocationSetting200Response**](ZoneSettingsGetIpGeolocationSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change IP Geolocation setting response |  -  |
| **4XX** | Change IP Geolocation setting response failure |  -  |

<a id="zoneSettingsChangeMinifySetting"></a>
# **zoneSettingsChangeMinifySetting**
> ZoneSettingsGetMinifySetting200Response zoneSettingsChangeMinifySetting(zoneId, zoneSettingsChangeMinifySettingRequest)

Change Minify setting

Automatically minify certain assets for your website. Refer to [Using Cloudflare Auto Minify](https://support.cloudflare.com/hc/en-us/articles/200168196) for more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeMinifySettingRequest zoneSettingsChangeMinifySettingRequest = new ZoneSettingsChangeMinifySettingRequest(); // ZoneSettingsChangeMinifySettingRequest | 
    try {
      ZoneSettingsGetMinifySetting200Response result = apiInstance.zoneSettingsChangeMinifySetting(zoneId, zoneSettingsChangeMinifySettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeMinifySetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeMinifySettingRequest** | [**ZoneSettingsChangeMinifySettingRequest**](ZoneSettingsChangeMinifySettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetMinifySetting200Response**](ZoneSettingsGetMinifySetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Minify setting response |  -  |
| **4XX** | Change Minify setting response failure |  -  |

<a id="zoneSettingsChangeMinimumTlsVersionSetting"></a>
# **zoneSettingsChangeMinimumTlsVersionSetting**
> ZoneSettingsGetMinimumTlsVersionSetting200Response zoneSettingsChangeMinimumTlsVersionSetting(zoneId, zoneSettingsChangeMinimumTlsVersionSettingRequest)

Change Minimum TLS Version setting

Changes Minimum TLS Version setting.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeMinimumTlsVersionSettingRequest zoneSettingsChangeMinimumTlsVersionSettingRequest = new ZoneSettingsChangeMinimumTlsVersionSettingRequest(); // ZoneSettingsChangeMinimumTlsVersionSettingRequest | 
    try {
      ZoneSettingsGetMinimumTlsVersionSetting200Response result = apiInstance.zoneSettingsChangeMinimumTlsVersionSetting(zoneId, zoneSettingsChangeMinimumTlsVersionSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeMinimumTlsVersionSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeMinimumTlsVersionSettingRequest** | [**ZoneSettingsChangeMinimumTlsVersionSettingRequest**](ZoneSettingsChangeMinimumTlsVersionSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetMinimumTlsVersionSetting200Response**](ZoneSettingsGetMinimumTlsVersionSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Minimum TLS Version setting response |  -  |
| **4XX** | Change Minimum TLS Version setting response failure |  -  |

<a id="zoneSettingsChangeMobileRedirectSetting"></a>
# **zoneSettingsChangeMobileRedirectSetting**
> ZoneSettingsGetMobileRedirectSetting200Response zoneSettingsChangeMobileRedirectSetting(zoneId, zoneSettingsChangeMobileRedirectSettingRequest)

Change Mobile Redirect setting

Automatically redirect visitors on mobile devices to a mobile-optimized subdomain. Refer to [Understanding Cloudflare Mobile Redirect](https://support.cloudflare.com/hc/articles/200168336) for more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeMobileRedirectSettingRequest zoneSettingsChangeMobileRedirectSettingRequest = new ZoneSettingsChangeMobileRedirectSettingRequest(); // ZoneSettingsChangeMobileRedirectSettingRequest | 
    try {
      ZoneSettingsGetMobileRedirectSetting200Response result = apiInstance.zoneSettingsChangeMobileRedirectSetting(zoneId, zoneSettingsChangeMobileRedirectSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeMobileRedirectSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeMobileRedirectSettingRequest** | [**ZoneSettingsChangeMobileRedirectSettingRequest**](ZoneSettingsChangeMobileRedirectSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetMobileRedirectSetting200Response**](ZoneSettingsGetMobileRedirectSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Mobile Redirect setting response |  -  |
| **4XX** | Change Mobile Redirect setting response failure |  -  |

<a id="zoneSettingsChangeNelSetting"></a>
# **zoneSettingsChangeNelSetting**
> ZoneSettingsGetNelSetting200Response zoneSettingsChangeNelSetting(zoneId, zoneSettingsChangeNelSettingRequest)

Change Network Error Logging setting

Automatically optimize image loading for website visitors on mobile devices. Refer to our [blog post](http://blog.cloudflare.com/nel-solving-mobile-speed) for more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeNelSettingRequest zoneSettingsChangeNelSettingRequest = new ZoneSettingsChangeNelSettingRequest(); // ZoneSettingsChangeNelSettingRequest | 
    try {
      ZoneSettingsGetNelSetting200Response result = apiInstance.zoneSettingsChangeNelSetting(zoneId, zoneSettingsChangeNelSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeNelSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeNelSettingRequest** | [**ZoneSettingsChangeNelSettingRequest**](ZoneSettingsChangeNelSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetNelSetting200Response**](ZoneSettingsGetNelSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Network Error Logging setting response |  -  |
| **4XX** | Change Network Error Logging setting response failure |  -  |

<a id="zoneSettingsChangeOpportunisticEncryptionSetting"></a>
# **zoneSettingsChangeOpportunisticEncryptionSetting**
> ZoneSettingsGetOpportunisticEncryptionSetting200Response zoneSettingsChangeOpportunisticEncryptionSetting(zoneId, zoneSettingsChangeOpportunisticEncryptionSettingRequest)

Change Opportunistic Encryption setting

Changes Opportunistic Encryption setting.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeOpportunisticEncryptionSettingRequest zoneSettingsChangeOpportunisticEncryptionSettingRequest = new ZoneSettingsChangeOpportunisticEncryptionSettingRequest(); // ZoneSettingsChangeOpportunisticEncryptionSettingRequest | 
    try {
      ZoneSettingsGetOpportunisticEncryptionSetting200Response result = apiInstance.zoneSettingsChangeOpportunisticEncryptionSetting(zoneId, zoneSettingsChangeOpportunisticEncryptionSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeOpportunisticEncryptionSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeOpportunisticEncryptionSettingRequest** | [**ZoneSettingsChangeOpportunisticEncryptionSettingRequest**](ZoneSettingsChangeOpportunisticEncryptionSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetOpportunisticEncryptionSetting200Response**](ZoneSettingsGetOpportunisticEncryptionSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Opportunistic Encryption setting response |  -  |
| **4XX** | Change Opportunistic Encryption setting response failure |  -  |

<a id="zoneSettingsChangeOpportunisticOnionSetting"></a>
# **zoneSettingsChangeOpportunisticOnionSetting**
> ZoneSettingsGetOpportunisticOnionSetting200Response zoneSettingsChangeOpportunisticOnionSetting(zoneId, zoneSettingsChangeOpportunisticOnionSettingRequest)

Change Opportunistic Onion setting

Add an Alt-Svc header to all legitimate requests from Tor, allowing the connection to use our onion services instead of exit nodes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeOpportunisticOnionSettingRequest zoneSettingsChangeOpportunisticOnionSettingRequest = new ZoneSettingsChangeOpportunisticOnionSettingRequest(); // ZoneSettingsChangeOpportunisticOnionSettingRequest | 
    try {
      ZoneSettingsGetOpportunisticOnionSetting200Response result = apiInstance.zoneSettingsChangeOpportunisticOnionSetting(zoneId, zoneSettingsChangeOpportunisticOnionSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeOpportunisticOnionSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeOpportunisticOnionSettingRequest** | [**ZoneSettingsChangeOpportunisticOnionSettingRequest**](ZoneSettingsChangeOpportunisticOnionSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetOpportunisticOnionSetting200Response**](ZoneSettingsGetOpportunisticOnionSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Opportunistic Onion setting response |  -  |
| **4XX** | Change Opportunistic Onion setting response failure |  -  |

<a id="zoneSettingsChangeOrangeToOrangeSetting"></a>
# **zoneSettingsChangeOrangeToOrangeSetting**
> ZoneSettingsGetOrangeToOrangeSetting200Response zoneSettingsChangeOrangeToOrangeSetting(zoneId, zoneSettingsChangeOrangeToOrangeSettingRequest)

Change Orange to Orange (O2O) setting

Orange to Orange (O2O) allows zones on Cloudflare to CNAME to other zones also on Cloudflare. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeOrangeToOrangeSettingRequest zoneSettingsChangeOrangeToOrangeSettingRequest = new ZoneSettingsChangeOrangeToOrangeSettingRequest(); // ZoneSettingsChangeOrangeToOrangeSettingRequest | 
    try {
      ZoneSettingsGetOrangeToOrangeSetting200Response result = apiInstance.zoneSettingsChangeOrangeToOrangeSetting(zoneId, zoneSettingsChangeOrangeToOrangeSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeOrangeToOrangeSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeOrangeToOrangeSettingRequest** | [**ZoneSettingsChangeOrangeToOrangeSettingRequest**](ZoneSettingsChangeOrangeToOrangeSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetOrangeToOrangeSetting200Response**](ZoneSettingsGetOrangeToOrangeSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Orange to Orange (O2O) setting response |  -  |
| **4XX** | Change Orange to Orange (O2O) setting response failure |  -  |

<a id="zoneSettingsChangePolishSetting"></a>
# **zoneSettingsChangePolishSetting**
> ZoneSettingsGetPolishSetting200Response zoneSettingsChangePolishSetting(zoneId, zoneSettingsChangePolishSettingRequest)

Change Polish setting

Automatically optimize image loading for website visitors on mobile devices. Refer to our [blog post](http://blog.cloudflare.com/polish-solving-mobile-speed) for more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangePolishSettingRequest zoneSettingsChangePolishSettingRequest = new ZoneSettingsChangePolishSettingRequest(); // ZoneSettingsChangePolishSettingRequest | 
    try {
      ZoneSettingsGetPolishSetting200Response result = apiInstance.zoneSettingsChangePolishSetting(zoneId, zoneSettingsChangePolishSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangePolishSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangePolishSettingRequest** | [**ZoneSettingsChangePolishSettingRequest**](ZoneSettingsChangePolishSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetPolishSetting200Response**](ZoneSettingsGetPolishSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Polish setting response |  -  |
| **4XX** | Change Polish setting response failure |  -  |

<a id="zoneSettingsChangePrefetchPreloadSetting"></a>
# **zoneSettingsChangePrefetchPreloadSetting**
> ZoneSettingsGetPrefetchPreloadSetting200Response zoneSettingsChangePrefetchPreloadSetting(zoneId, zoneSettingsChangePrefetchPreloadSettingRequest)

Change prefetch preload setting

Cloudflare will prefetch any URLs that are included in the response headers. This is limited to Enterprise Zones.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangePrefetchPreloadSettingRequest zoneSettingsChangePrefetchPreloadSettingRequest = new ZoneSettingsChangePrefetchPreloadSettingRequest(); // ZoneSettingsChangePrefetchPreloadSettingRequest | 
    try {
      ZoneSettingsGetPrefetchPreloadSetting200Response result = apiInstance.zoneSettingsChangePrefetchPreloadSetting(zoneId, zoneSettingsChangePrefetchPreloadSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangePrefetchPreloadSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangePrefetchPreloadSettingRequest** | [**ZoneSettingsChangePrefetchPreloadSettingRequest**](ZoneSettingsChangePrefetchPreloadSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetPrefetchPreloadSetting200Response**](ZoneSettingsGetPrefetchPreloadSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change prefetch preload setting response |  -  |
| **4XX** | Change prefetch preload setting response failure |  -  |

<a id="zoneSettingsChangeProxyReadTimeoutSetting"></a>
# **zoneSettingsChangeProxyReadTimeoutSetting**
> ZoneSettingsGetProxyReadTimeoutSetting200Response zoneSettingsChangeProxyReadTimeoutSetting(zoneId, zoneSettingsChangeProxyReadTimeoutSettingRequest)

Change Proxy Read Timeout setting

Maximum time between two read operations from origin. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeProxyReadTimeoutSettingRequest zoneSettingsChangeProxyReadTimeoutSettingRequest = new ZoneSettingsChangeProxyReadTimeoutSettingRequest(); // ZoneSettingsChangeProxyReadTimeoutSettingRequest | 
    try {
      ZoneSettingsGetProxyReadTimeoutSetting200Response result = apiInstance.zoneSettingsChangeProxyReadTimeoutSetting(zoneId, zoneSettingsChangeProxyReadTimeoutSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeProxyReadTimeoutSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeProxyReadTimeoutSettingRequest** | [**ZoneSettingsChangeProxyReadTimeoutSettingRequest**](ZoneSettingsChangeProxyReadTimeoutSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetProxyReadTimeoutSetting200Response**](ZoneSettingsGetProxyReadTimeoutSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Proxy Read Timeout setting response |  -  |
| **4XX** | Change Proxy Read Timeout setting response failure |  -  |

<a id="zoneSettingsChangePseudoIPv4Setting"></a>
# **zoneSettingsChangePseudoIPv4Setting**
> ZoneSettingsGetPseudoIPv4Setting200Response zoneSettingsChangePseudoIPv4Setting(zoneId, zoneSettingsChangePseudoIPv4SettingRequest)

Change Pseudo IPv4 setting

Value of the Pseudo IPv4 setting.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangePseudoIPv4SettingRequest zoneSettingsChangePseudoIPv4SettingRequest = new ZoneSettingsChangePseudoIPv4SettingRequest(); // ZoneSettingsChangePseudoIPv4SettingRequest | 
    try {
      ZoneSettingsGetPseudoIPv4Setting200Response result = apiInstance.zoneSettingsChangePseudoIPv4Setting(zoneId, zoneSettingsChangePseudoIPv4SettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangePseudoIPv4Setting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangePseudoIPv4SettingRequest** | [**ZoneSettingsChangePseudoIPv4SettingRequest**](ZoneSettingsChangePseudoIPv4SettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetPseudoIPv4Setting200Response**](ZoneSettingsGetPseudoIPv4Setting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Pseudo IPv4 setting response |  -  |
| **4XX** | Change Pseudo IPv4 setting response failure |  -  |

<a id="zoneSettingsChangeResponseBufferingSetting"></a>
# **zoneSettingsChangeResponseBufferingSetting**
> ZoneSettingsGetResponseBufferingSetting200Response zoneSettingsChangeResponseBufferingSetting(zoneId, zoneSettingsChangeResponseBufferingSettingRequest)

Change Response Buffering setting

Enables or disables buffering of responses from the proxied server. Cloudflare may buffer the whole payload to deliver it at once to the client versus allowing it to be delivered in chunks. By default, the proxied server streams directly and is not buffered by Cloudflare. This is limited to Enterprise Zones.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeResponseBufferingSettingRequest zoneSettingsChangeResponseBufferingSettingRequest = new ZoneSettingsChangeResponseBufferingSettingRequest(); // ZoneSettingsChangeResponseBufferingSettingRequest | 
    try {
      ZoneSettingsGetResponseBufferingSetting200Response result = apiInstance.zoneSettingsChangeResponseBufferingSetting(zoneId, zoneSettingsChangeResponseBufferingSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeResponseBufferingSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeResponseBufferingSettingRequest** | [**ZoneSettingsChangeResponseBufferingSettingRequest**](ZoneSettingsChangeResponseBufferingSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetResponseBufferingSetting200Response**](ZoneSettingsGetResponseBufferingSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Response Buffering setting response |  -  |
| **4XX** | Change Response Buffering setting response failure |  -  |

<a id="zoneSettingsChangeRocketLoaderSetting"></a>
# **zoneSettingsChangeRocketLoaderSetting**
> ZoneSettingsGetRocketLoaderSetting200Response zoneSettingsChangeRocketLoaderSetting(zoneId, zoneSettingsChangeRocketLoaderSettingRequest)

Change Rocket Loader setting

Rocket Loader is a general-purpose asynchronous JavaScript optimisation that prioritises rendering your content while loading your site&#39;s Javascript asynchronously. Turning on Rocket Loader will immediately improve a web page&#39;s rendering time sometimes measured as Time to First Paint (TTFP), and also the &#x60;window.onload&#x60; time (assuming there is JavaScript on the page). This can have a positive impact on your Google search ranking. When turned on, Rocket Loader will automatically defer the loading of all Javascript referenced in your HTML, with no configuration required. Refer to [Understanding Rocket Loader](https://support.cloudflare.com/hc/articles/200168056) for more information. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeRocketLoaderSettingRequest zoneSettingsChangeRocketLoaderSettingRequest = new ZoneSettingsChangeRocketLoaderSettingRequest(); // ZoneSettingsChangeRocketLoaderSettingRequest | 
    try {
      ZoneSettingsGetRocketLoaderSetting200Response result = apiInstance.zoneSettingsChangeRocketLoaderSetting(zoneId, zoneSettingsChangeRocketLoaderSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeRocketLoaderSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeRocketLoaderSettingRequest** | [**ZoneSettingsChangeRocketLoaderSettingRequest**](ZoneSettingsChangeRocketLoaderSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetRocketLoaderSetting200Response**](ZoneSettingsGetRocketLoaderSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Rocket Loader setting response |  -  |
| **4XX** | Change Rocket Loader setting response failure |  -  |

<a id="zoneSettingsChangeSecurityHeaderHstsSetting"></a>
# **zoneSettingsChangeSecurityHeaderHstsSetting**
> ZoneSettingsGetSecurityHeaderHstsSetting200Response zoneSettingsChangeSecurityHeaderHstsSetting(zoneId, zoneSettingsChangeSecurityHeaderHstsSettingRequest)

Change Security Header (HSTS) setting

Cloudflare security header for a zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeSecurityHeaderHstsSettingRequest zoneSettingsChangeSecurityHeaderHstsSettingRequest = new ZoneSettingsChangeSecurityHeaderHstsSettingRequest(); // ZoneSettingsChangeSecurityHeaderHstsSettingRequest | 
    try {
      ZoneSettingsGetSecurityHeaderHstsSetting200Response result = apiInstance.zoneSettingsChangeSecurityHeaderHstsSetting(zoneId, zoneSettingsChangeSecurityHeaderHstsSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeSecurityHeaderHstsSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeSecurityHeaderHstsSettingRequest** | [**ZoneSettingsChangeSecurityHeaderHstsSettingRequest**](ZoneSettingsChangeSecurityHeaderHstsSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetSecurityHeaderHstsSetting200Response**](ZoneSettingsGetSecurityHeaderHstsSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Security Header (HSTS) setting response |  -  |
| **4XX** | Change Security Header (HSTS) setting response failure |  -  |

<a id="zoneSettingsChangeSecurityLevelSetting"></a>
# **zoneSettingsChangeSecurityLevelSetting**
> ZoneSettingsGetSecurityLevelSetting200Response zoneSettingsChangeSecurityLevelSetting(zoneId, zoneSettingsChangeSecurityLevelSettingRequest)

Change Security Level setting

Choose the appropriate security profile for your website, which will automatically adjust each of the security settings. If you choose to customize an individual security setting, the profile will become Custom. (https://support.cloudflare.com/hc/en-us/articles/200170056).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeSecurityLevelSettingRequest zoneSettingsChangeSecurityLevelSettingRequest = new ZoneSettingsChangeSecurityLevelSettingRequest(); // ZoneSettingsChangeSecurityLevelSettingRequest | 
    try {
      ZoneSettingsGetSecurityLevelSetting200Response result = apiInstance.zoneSettingsChangeSecurityLevelSetting(zoneId, zoneSettingsChangeSecurityLevelSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeSecurityLevelSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeSecurityLevelSettingRequest** | [**ZoneSettingsChangeSecurityLevelSettingRequest**](ZoneSettingsChangeSecurityLevelSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetSecurityLevelSetting200Response**](ZoneSettingsGetSecurityLevelSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Security Level setting response |  -  |
| **4XX** | Change Security Level setting response failure |  -  |

<a id="zoneSettingsChangeServerSideExcludeSetting"></a>
# **zoneSettingsChangeServerSideExcludeSetting**
> ZoneSettingsGetServerSideExcludeSetting200Response zoneSettingsChangeServerSideExcludeSetting(zoneId, zoneSettingsChangeServerSideExcludeSettingRequest)

Change Server Side Exclude setting

If there is sensitive content on your website that you want visible to real visitors, but that you want to hide from suspicious visitors, all you have to do is wrap the content with Cloudflare SSE tags. Wrap any content that you want to be excluded from suspicious visitors in the following SSE tags: &lt;!--sse--&gt;&lt;!--/sse--&gt;. For example: &lt;!--sse--&gt;  Bad visitors won&#39;t see my phone number, 555-555-5555 &lt;!--/sse--&gt;. Note: SSE only will work with HTML. If you have HTML minification enabled, you won&#39;t see the SSE tags in your HTML source when it&#39;s served through Cloudflare. SSE will still function in this case, as Cloudflare&#39;s HTML minification and SSE functionality occur on-the-fly as the resource moves through our network to the visitor&#39;s computer. (https://support.cloudflare.com/hc/en-us/articles/200170036).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeServerSideExcludeSettingRequest zoneSettingsChangeServerSideExcludeSettingRequest = new ZoneSettingsChangeServerSideExcludeSettingRequest(); // ZoneSettingsChangeServerSideExcludeSettingRequest | 
    try {
      ZoneSettingsGetServerSideExcludeSetting200Response result = apiInstance.zoneSettingsChangeServerSideExcludeSetting(zoneId, zoneSettingsChangeServerSideExcludeSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeServerSideExcludeSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeServerSideExcludeSettingRequest** | [**ZoneSettingsChangeServerSideExcludeSettingRequest**](ZoneSettingsChangeServerSideExcludeSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetServerSideExcludeSetting200Response**](ZoneSettingsGetServerSideExcludeSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Server Side Exclude setting response |  -  |
| **4XX** | Change Server Side Exclude setting response failure |  -  |

<a id="zoneSettingsChangeSslRecommenderSetting"></a>
# **zoneSettingsChangeSslRecommenderSetting**
> ZoneSettingsGetSslRecommenderSetting200Response zoneSettingsChangeSslRecommenderSetting(zoneId, zoneSettingsChangeSslRecommenderSettingRequest)

Change SSL/TLS Recommender enrollment setting

Enrollment in the SSL/TLS Recommender service which tries to detect and recommend (by sending periodic emails) the most secure SSL/TLS setting your origin servers support. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeSslRecommenderSettingRequest zoneSettingsChangeSslRecommenderSettingRequest = new ZoneSettingsChangeSslRecommenderSettingRequest(); // ZoneSettingsChangeSslRecommenderSettingRequest | 
    try {
      ZoneSettingsGetSslRecommenderSetting200Response result = apiInstance.zoneSettingsChangeSslRecommenderSetting(zoneId, zoneSettingsChangeSslRecommenderSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeSslRecommenderSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeSslRecommenderSettingRequest** | [**ZoneSettingsChangeSslRecommenderSettingRequest**](ZoneSettingsChangeSslRecommenderSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetSslRecommenderSetting200Response**](ZoneSettingsGetSslRecommenderSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change SSL/TLS Recommender enrollment setting response |  -  |
| **4XX** | Change SSL/TLS Recommender enrollment setting response failure |  -  |

<a id="zoneSettingsChangeSslSetting"></a>
# **zoneSettingsChangeSslSetting**
> ZoneSettingsGetSslSetting200Response zoneSettingsChangeSslSetting(zoneId, zoneSettingsChangeSslSettingRequest)

Change SSL setting

SSL encrypts your visitor&#39;s connection and safeguards credit card numbers and other personal data to and from your website. SSL can take up to 5 minutes to fully activate. Requires Cloudflare active on your root domain or www domain. Off: no SSL between the visitor and Cloudflare, and no SSL between Cloudflare and your web server  (all HTTP traffic). Flexible: SSL between the visitor and Cloudflare -- visitor sees HTTPS on your site, but no SSL between Cloudflare and your web server. You don&#39;t need to have an SSL cert on your web server, but your vistors will still see the site as being HTTPS enabled. Full:  SSL between the visitor and Cloudflare -- visitor sees HTTPS on your site, and SSL between Cloudflare and your web server. You&#39;ll need to have your own SSL cert or self-signed cert at the very least. Full (Strict): SSL between the visitor and Cloudflare -- visitor sees HTTPS on your site, and SSL between Cloudflare and your web server. You&#39;ll need to have a valid SSL certificate installed on your web server. This certificate must be signed by a certificate authority, have an expiration date in the future, and respond for the request domain name (hostname). (https://support.cloudflare.com/hc/en-us/articles/200170416).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeSslSettingRequest zoneSettingsChangeSslSettingRequest = new ZoneSettingsChangeSslSettingRequest(); // ZoneSettingsChangeSslSettingRequest | 
    try {
      ZoneSettingsGetSslSetting200Response result = apiInstance.zoneSettingsChangeSslSetting(zoneId, zoneSettingsChangeSslSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeSslSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeSslSettingRequest** | [**ZoneSettingsChangeSslSettingRequest**](ZoneSettingsChangeSslSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetSslSetting200Response**](ZoneSettingsGetSslSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change SSL setting response |  -  |
| **4XX** | Change SSL setting response failure |  -  |

<a id="zoneSettingsChangeTls13Setting"></a>
# **zoneSettingsChangeTls13Setting**
> ZoneSettingsGetTls13SettingEnabledForAZone200Response zoneSettingsChangeTls13Setting(zoneId, zoneSettingsChangeTls13SettingRequest)

Change TLS 1.3 setting

Changes TLS 1.3 setting.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeTls13SettingRequest zoneSettingsChangeTls13SettingRequest = new ZoneSettingsChangeTls13SettingRequest(); // ZoneSettingsChangeTls13SettingRequest | 
    try {
      ZoneSettingsGetTls13SettingEnabledForAZone200Response result = apiInstance.zoneSettingsChangeTls13Setting(zoneId, zoneSettingsChangeTls13SettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeTls13Setting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeTls13SettingRequest** | [**ZoneSettingsChangeTls13SettingRequest**](ZoneSettingsChangeTls13SettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetTls13SettingEnabledForAZone200Response**](ZoneSettingsGetTls13SettingEnabledForAZone200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change TLS 1.3 setting response |  -  |
| **4XX** | Change TLS 1.3 setting response failure |  -  |

<a id="zoneSettingsChangeTlsClientAuthSetting"></a>
# **zoneSettingsChangeTlsClientAuthSetting**
> ZoneSettingsGetTlsClientAuthSetting200Response zoneSettingsChangeTlsClientAuthSetting(zoneId, zoneSettingsChangeTlsClientAuthSettingRequest)

Change TLS Client Auth setting

TLS Client Auth requires Cloudflare to connect to your origin server using a client certificate (Enterprise Only).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeTlsClientAuthSettingRequest zoneSettingsChangeTlsClientAuthSettingRequest = new ZoneSettingsChangeTlsClientAuthSettingRequest(); // ZoneSettingsChangeTlsClientAuthSettingRequest | 
    try {
      ZoneSettingsGetTlsClientAuthSetting200Response result = apiInstance.zoneSettingsChangeTlsClientAuthSetting(zoneId, zoneSettingsChangeTlsClientAuthSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeTlsClientAuthSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeTlsClientAuthSettingRequest** | [**ZoneSettingsChangeTlsClientAuthSettingRequest**](ZoneSettingsChangeTlsClientAuthSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetTlsClientAuthSetting200Response**](ZoneSettingsGetTlsClientAuthSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change TLS Client Auth setting response |  -  |
| **4XX** | Change TLS Client Auth setting response failure |  -  |

<a id="zoneSettingsChangeTrueClientIpSetting"></a>
# **zoneSettingsChangeTrueClientIpSetting**
> ZoneSettingsGetTrueClientIpSetting200Response zoneSettingsChangeTrueClientIpSetting(zoneId, zoneSettingsChangeTrueClientIpSettingRequest)

Change True Client IP setting

Allows customer to continue to use True Client IP (Akamai feature) in the headers we send to the origin. This is limited to Enterprise Zones.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeTrueClientIpSettingRequest zoneSettingsChangeTrueClientIpSettingRequest = new ZoneSettingsChangeTrueClientIpSettingRequest(); // ZoneSettingsChangeTrueClientIpSettingRequest | 
    try {
      ZoneSettingsGetTrueClientIpSetting200Response result = apiInstance.zoneSettingsChangeTrueClientIpSetting(zoneId, zoneSettingsChangeTrueClientIpSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeTrueClientIpSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeTrueClientIpSettingRequest** | [**ZoneSettingsChangeTrueClientIpSettingRequest**](ZoneSettingsChangeTrueClientIpSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetTrueClientIpSetting200Response**](ZoneSettingsGetTrueClientIpSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change True Client IP setting response |  -  |
| **4XX** | Change True Client IP setting response failure |  -  |

<a id="zoneSettingsChangeWebApplicationFirewallWafSetting"></a>
# **zoneSettingsChangeWebApplicationFirewallWafSetting**
> ZoneSettingsGetWebApplicationFirewallWafSetting200Response zoneSettingsChangeWebApplicationFirewallWafSetting(zoneId, zoneSettingsChangeWebApplicationFirewallWafSettingRequest)

Change Web Application Firewall (WAF) setting

The WAF examines HTTP requests to your website.  It inspects both GET and POST requests and applies rules to help filter out illegitimate traffic from legitimate website visitors. The Cloudflare WAF inspects website addresses or URLs to detect anything out of the ordinary. If the Cloudflare WAF determines suspicious user behavior, then the WAF will &#39;challenge&#39; the web visitor with a page that asks them to submit a CAPTCHA successfully  to continue their action. If the challenge is failed, the action will be stopped. What this means is that Cloudflare&#39;s WAF will block any traffic identified as illegitimate before it reaches your origin web server. (https://support.cloudflare.com/hc/en-us/articles/200172016).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeWebApplicationFirewallWafSettingRequest zoneSettingsChangeWebApplicationFirewallWafSettingRequest = new ZoneSettingsChangeWebApplicationFirewallWafSettingRequest(); // ZoneSettingsChangeWebApplicationFirewallWafSettingRequest | 
    try {
      ZoneSettingsGetWebApplicationFirewallWafSetting200Response result = apiInstance.zoneSettingsChangeWebApplicationFirewallWafSetting(zoneId, zoneSettingsChangeWebApplicationFirewallWafSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeWebApplicationFirewallWafSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeWebApplicationFirewallWafSettingRequest** | [**ZoneSettingsChangeWebApplicationFirewallWafSettingRequest**](ZoneSettingsChangeWebApplicationFirewallWafSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetWebApplicationFirewallWafSetting200Response**](ZoneSettingsGetWebApplicationFirewallWafSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Web Application Firewall (WAF) setting response |  -  |
| **4XX** | Change Web Application Firewall (WAF) setting response failure |  -  |

<a id="zoneSettingsChangeWebMirageSetting"></a>
# **zoneSettingsChangeWebMirageSetting**
> ZoneSettingsGetMirageSetting200Response zoneSettingsChangeWebMirageSetting(zoneId, zoneSettingsChangeWebMirageSettingRequest)

Change Mirage setting

Automatically optimize image loading for website visitors on mobile devices. Refer to our [blog post](http://blog.cloudflare.com/mirage2-solving-mobile-speed) for more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeWebMirageSettingRequest zoneSettingsChangeWebMirageSettingRequest = new ZoneSettingsChangeWebMirageSettingRequest(); // ZoneSettingsChangeWebMirageSettingRequest | 
    try {
      ZoneSettingsGetMirageSetting200Response result = apiInstance.zoneSettingsChangeWebMirageSetting(zoneId, zoneSettingsChangeWebMirageSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeWebMirageSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeWebMirageSettingRequest** | [**ZoneSettingsChangeWebMirageSettingRequest**](ZoneSettingsChangeWebMirageSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetMirageSetting200Response**](ZoneSettingsGetMirageSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Mirage setting response |  -  |
| **4XX** | Change Mirage setting response failure |  -  |

<a id="zoneSettingsChangeWebPSetting"></a>
# **zoneSettingsChangeWebPSetting**
> ZoneSettingsGetWebPSetting200Response zoneSettingsChangeWebPSetting(zoneId, zoneSettingsChangeWebPSettingRequest)

Change WebP setting

When the client requesting the image supports the WebP image codec, and WebP offers a performance advantage over the original image format, Cloudflare will serve a WebP version of the original image.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeWebPSettingRequest zoneSettingsChangeWebPSettingRequest = new ZoneSettingsChangeWebPSettingRequest(); // ZoneSettingsChangeWebPSettingRequest | 
    try {
      ZoneSettingsGetWebPSetting200Response result = apiInstance.zoneSettingsChangeWebPSetting(zoneId, zoneSettingsChangeWebPSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeWebPSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeWebPSettingRequest** | [**ZoneSettingsChangeWebPSettingRequest**](ZoneSettingsChangeWebPSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetWebPSetting200Response**](ZoneSettingsGetWebPSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change WebP setting response |  -  |
| **4XX** | Change WebP setting response failure |  -  |

<a id="zoneSettingsChangeWebSocketsSetting"></a>
# **zoneSettingsChangeWebSocketsSetting**
> ZoneSettingsGetWebSocketsSetting200Response zoneSettingsChangeWebSocketsSetting(zoneId, zoneSettingsChangeWebSocketsSettingRequest)

Change WebSockets setting

Changes Websockets setting. For more information about Websockets, please refer to [Using Cloudflare with WebSockets](https://support.cloudflare.com/hc/en-us/articles/200169466-Using-Cloudflare-with-WebSockets).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsChangeWebSocketsSettingRequest zoneSettingsChangeWebSocketsSettingRequest = new ZoneSettingsChangeWebSocketsSettingRequest(); // ZoneSettingsChangeWebSocketsSettingRequest | 
    try {
      ZoneSettingsGetWebSocketsSetting200Response result = apiInstance.zoneSettingsChangeWebSocketsSetting(zoneId, zoneSettingsChangeWebSocketsSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsChangeWebSocketsSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsChangeWebSocketsSettingRequest** | [**ZoneSettingsChangeWebSocketsSettingRequest**](ZoneSettingsChangeWebSocketsSettingRequest.md)|  | |

### Return type

[**ZoneSettingsGetWebSocketsSetting200Response**](ZoneSettingsGetWebSocketsSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change WebSockets setting response |  -  |
| **4XX** | Change WebSockets setting response failure |  -  |

<a id="zoneSettingsEditZoneSettingsInfo"></a>
# **zoneSettingsEditZoneSettingsInfo**
> ZonesZoneSettingsResponseCollection zoneSettingsEditZoneSettingsInfo(zoneId, zoneSettingsEditZoneSettingsInfoRequest)

Edit zone settings info

Edit settings for a zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneSettingsEditZoneSettingsInfoRequest zoneSettingsEditZoneSettingsInfoRequest = new ZoneSettingsEditZoneSettingsInfoRequest(); // ZoneSettingsEditZoneSettingsInfoRequest | 
    try {
      ZonesZoneSettingsResponseCollection result = apiInstance.zoneSettingsEditZoneSettingsInfo(zoneId, zoneSettingsEditZoneSettingsInfoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsEditZoneSettingsInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **zoneSettingsEditZoneSettingsInfoRequest** | [**ZoneSettingsEditZoneSettingsInfoRequest**](ZoneSettingsEditZoneSettingsInfoRequest.md)|  | |

### Return type

[**ZonesZoneSettingsResponseCollection**](ZonesZoneSettingsResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Edit zone settings info response |  -  |
| **4XX** | Edit zone settings info response failure |  -  |

<a id="zoneSettingsGet0RttSessionResumptionSetting"></a>
# **zoneSettingsGet0RttSessionResumptionSetting**
> ZoneSettingsGet0RttSessionResumptionSetting200Response zoneSettingsGet0RttSessionResumptionSetting(zoneId)

Get 0-RTT session resumption setting

Gets 0-RTT session resumption setting.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGet0RttSessionResumptionSetting200Response result = apiInstance.zoneSettingsGet0RttSessionResumptionSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGet0RttSessionResumptionSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGet0RttSessionResumptionSetting200Response**](ZoneSettingsGet0RttSessionResumptionSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get 0-RTT session resumption setting response |  -  |
| **4XX** | Get 0-RTT session resumption setting response failure |  -  |

<a id="zoneSettingsGetAdvancedDdosSetting"></a>
# **zoneSettingsGetAdvancedDdosSetting**
> ZoneSettingsGetAdvancedDdosSetting200Response zoneSettingsGetAdvancedDdosSetting(zoneId)

Get Advanced DDOS setting

Advanced protection from Distributed Denial of Service (DDoS) attacks on your website. This is an uneditable value that is &#39;on&#39; in the case of Business and Enterprise zones.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetAdvancedDdosSetting200Response result = apiInstance.zoneSettingsGetAdvancedDdosSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetAdvancedDdosSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetAdvancedDdosSetting200Response**](ZoneSettingsGetAdvancedDdosSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Advanced DDOS setting response |  -  |
| **4XX** | Get Advanced DDOS setting response failure |  -  |

<a id="zoneSettingsGetAllZoneSettings"></a>
# **zoneSettingsGetAllZoneSettings**
> ZonesZoneSettingsResponseCollection zoneSettingsGetAllZoneSettings(zoneId)

Get all Zone settings

Available settings for your user in relation to a zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZonesZoneSettingsResponseCollection result = apiInstance.zoneSettingsGetAllZoneSettings(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetAllZoneSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZonesZoneSettingsResponseCollection**](ZonesZoneSettingsResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all Zone settings response |  -  |
| **4XX** | Get all Zone settings response failure |  -  |

<a id="zoneSettingsGetAlwaysOnlineSetting"></a>
# **zoneSettingsGetAlwaysOnlineSetting**
> ZoneSettingsGetAlwaysOnlineSetting200Response zoneSettingsGetAlwaysOnlineSetting(zoneId)

Get Always Online setting

When enabled, Cloudflare serves limited copies of web pages available from the [Internet Archive&#39;s Wayback Machine](https://archive.org/web/) if your server is offline. Refer to [Always Online](https://developers.cloudflare.com/cache/about/always-online) for more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetAlwaysOnlineSetting200Response result = apiInstance.zoneSettingsGetAlwaysOnlineSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetAlwaysOnlineSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetAlwaysOnlineSetting200Response**](ZoneSettingsGetAlwaysOnlineSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Always Online setting response |  -  |
| **4XX** | Get Always Online setting response failure |  -  |

<a id="zoneSettingsGetAlwaysUseHttpsSetting"></a>
# **zoneSettingsGetAlwaysUseHttpsSetting**
> ZoneSettingsGetAlwaysUseHttpsSetting200Response zoneSettingsGetAlwaysUseHttpsSetting(zoneId)

Get Always Use HTTPS setting

Reply to all requests for URLs that use \&quot;http\&quot; with a 301 redirect to the equivalent \&quot;https\&quot; URL. If you only want to redirect for a subset of requests, consider creating an \&quot;Always use HTTPS\&quot; page rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetAlwaysUseHttpsSetting200Response result = apiInstance.zoneSettingsGetAlwaysUseHttpsSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetAlwaysUseHttpsSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetAlwaysUseHttpsSetting200Response**](ZoneSettingsGetAlwaysUseHttpsSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Always Use HTTPS setting response |  -  |
| **4XX** | Get Always Use HTTPS setting response failure |  -  |

<a id="zoneSettingsGetAutomaticHttpsRewritesSetting"></a>
# **zoneSettingsGetAutomaticHttpsRewritesSetting**
> ZoneSettingsGetAutomaticHttpsRewritesSetting200Response zoneSettingsGetAutomaticHttpsRewritesSetting(zoneId)

Get Automatic HTTPS Rewrites setting

Enable the Automatic HTTPS Rewrites feature for this zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetAutomaticHttpsRewritesSetting200Response result = apiInstance.zoneSettingsGetAutomaticHttpsRewritesSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetAutomaticHttpsRewritesSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetAutomaticHttpsRewritesSetting200Response**](ZoneSettingsGetAutomaticHttpsRewritesSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Automatic HTTPS Rewrites setting response |  -  |
| **4XX** | Get Automatic HTTPS Rewrites setting response failure |  -  |

<a id="zoneSettingsGetAutomaticPlatformOptimizationSetting"></a>
# **zoneSettingsGetAutomaticPlatformOptimizationSetting**
> ZoneSettingsGetAutomaticPlatformOptimizationSetting200Response zoneSettingsGetAutomaticPlatformOptimizationSetting(zoneId)

Get Automatic Platform Optimization for WordPress setting

[Automatic Platform Optimization for WordPress](https://developers.cloudflare.com/automatic-platform-optimization/) serves your WordPress site from Cloudflare&#39;s edge network and caches third-party fonts. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetAutomaticPlatformOptimizationSetting200Response result = apiInstance.zoneSettingsGetAutomaticPlatformOptimizationSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetAutomaticPlatformOptimizationSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetAutomaticPlatformOptimizationSetting200Response**](ZoneSettingsGetAutomaticPlatformOptimizationSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Automatic Platform Optimization for WordPress setting response |  -  |
| **4XX** | Get Automatic Platform Optimization for WordPress setting response failure |  -  |

<a id="zoneSettingsGetBrotliSetting"></a>
# **zoneSettingsGetBrotliSetting**
> ZoneSettingsGetBrotliSetting200Response zoneSettingsGetBrotliSetting(zoneId)

Get Brotli setting

When the client requesting an asset supports the Brotli compression algorithm, Cloudflare will serve a Brotli compressed version of the asset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetBrotliSetting200Response result = apiInstance.zoneSettingsGetBrotliSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetBrotliSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetBrotliSetting200Response**](ZoneSettingsGetBrotliSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Brotli setting response |  -  |
| **4XX** | Get Brotli setting response failure |  -  |

<a id="zoneSettingsGetBrowserCacheTtlSetting"></a>
# **zoneSettingsGetBrowserCacheTtlSetting**
> ZoneSettingsGetBrowserCacheTtlSetting200Response zoneSettingsGetBrowserCacheTtlSetting(zoneId)

Get Browser Cache TTL setting

Browser Cache TTL (in seconds) specifies how long Cloudflare-cached resources will remain on your visitors&#39; computers. Cloudflare will honor any larger times specified by your server. (https://support.cloudflare.com/hc/en-us/articles/200168276).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetBrowserCacheTtlSetting200Response result = apiInstance.zoneSettingsGetBrowserCacheTtlSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetBrowserCacheTtlSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetBrowserCacheTtlSetting200Response**](ZoneSettingsGetBrowserCacheTtlSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Browser Cache TTL setting response |  -  |
| **4XX** | Get Browser Cache TTL setting response failure |  -  |

<a id="zoneSettingsGetBrowserCheckSetting"></a>
# **zoneSettingsGetBrowserCheckSetting**
> ZoneSettingsGetBrowserCheckSetting200Response zoneSettingsGetBrowserCheckSetting(zoneId)

Get Browser Check setting

Browser Integrity Check is similar to Bad Behavior and looks for common HTTP headers abused most commonly by spammers and denies access to your page.  It will also challenge visitors that do not have a user agent or a non standard user agent (also commonly used by abuse bots, crawlers or visitors). (https://support.cloudflare.com/hc/en-us/articles/200170086).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetBrowserCheckSetting200Response result = apiInstance.zoneSettingsGetBrowserCheckSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetBrowserCheckSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetBrowserCheckSetting200Response**](ZoneSettingsGetBrowserCheckSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Browser Check setting response |  -  |
| **4XX** | Get Browser Check setting response failure |  -  |

<a id="zoneSettingsGetCacheLevelSetting"></a>
# **zoneSettingsGetCacheLevelSetting**
> ZoneSettingsGetCacheLevelSetting200Response zoneSettingsGetCacheLevelSetting(zoneId)

Get Cache Level setting

Cache Level functions based off the setting level. The basic setting will cache most static resources (i.e., css, images, and JavaScript). The simplified setting will ignore the query string when delivering a cached resource. The aggressive setting will cache all static resources, including ones with a query string. (https://support.cloudflare.com/hc/en-us/articles/200168256).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetCacheLevelSetting200Response result = apiInstance.zoneSettingsGetCacheLevelSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetCacheLevelSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetCacheLevelSetting200Response**](ZoneSettingsGetCacheLevelSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Cache Level setting response |  -  |
| **4XX** | Get Cache Level setting response failure |  -  |

<a id="zoneSettingsGetChallengeTtlSetting"></a>
# **zoneSettingsGetChallengeTtlSetting**
> ZoneSettingsGetChallengeTtlSetting200Response zoneSettingsGetChallengeTtlSetting(zoneId)

Get Challenge TTL setting

Specify how long a visitor is allowed access to your site after successfully completing a challenge (such as a CAPTCHA). After the TTL has expired the visitor will have to complete a new challenge. We recommend a 15 - 45 minute setting and will attempt to honor any setting above 45 minutes. (https://support.cloudflare.com/hc/en-us/articles/200170136).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetChallengeTtlSetting200Response result = apiInstance.zoneSettingsGetChallengeTtlSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetChallengeTtlSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetChallengeTtlSetting200Response**](ZoneSettingsGetChallengeTtlSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Challenge TTL setting response |  -  |
| **4XX** | Get Challenge TTL setting response failure |  -  |

<a id="zoneSettingsGetCiphersSetting"></a>
# **zoneSettingsGetCiphersSetting**
> ZoneSettingsGetCiphersSetting200Response zoneSettingsGetCiphersSetting(zoneId)

Get ciphers setting

Gets ciphers setting.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetCiphersSetting200Response result = apiInstance.zoneSettingsGetCiphersSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetCiphersSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetCiphersSetting200Response**](ZoneSettingsGetCiphersSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get ciphers setting response |  -  |
| **4XX** | Get ciphers setting response failure |  -  |

<a id="zoneSettingsGetDevelopmentModeSetting"></a>
# **zoneSettingsGetDevelopmentModeSetting**
> ZoneSettingsGetDevelopmentModeSetting200Response zoneSettingsGetDevelopmentModeSetting(zoneId)

Get Development Mode setting

Development Mode temporarily allows you to enter development mode for your websites if you need to make changes to your site. This will bypass Cloudflare&#39;s accelerated cache and slow down your site, but is useful if you are making changes to cacheable content (like images, css, or JavaScript) and would like to see those changes right away. Once entered, development mode will last for 3 hours and then automatically toggle off.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetDevelopmentModeSetting200Response result = apiInstance.zoneSettingsGetDevelopmentModeSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetDevelopmentModeSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetDevelopmentModeSetting200Response**](ZoneSettingsGetDevelopmentModeSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Development Mode setting response |  -  |
| **4XX** | Get Development Mode setting response failure |  -  |

<a id="zoneSettingsGetEarlyHintsSetting"></a>
# **zoneSettingsGetEarlyHintsSetting**
> ZoneSettingsGetEarlyHintsSetting200Response zoneSettingsGetEarlyHintsSetting(zoneId)

Get Early Hints setting

When enabled, Cloudflare will attempt to speed up overall page loads by serving &#x60;103&#x60; responses with &#x60;Link&#x60; headers from the final response. Refer to [Early Hints](https://developers.cloudflare.com/cache/about/early-hints) for more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetEarlyHintsSetting200Response result = apiInstance.zoneSettingsGetEarlyHintsSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetEarlyHintsSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetEarlyHintsSetting200Response**](ZoneSettingsGetEarlyHintsSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Early Hints setting response |  -  |
| **4XX** | Get Early Hints setting response failure |  -  |

<a id="zoneSettingsGetEmailObfuscationSetting"></a>
# **zoneSettingsGetEmailObfuscationSetting**
> ZoneSettingsGetEmailObfuscationSetting200Response zoneSettingsGetEmailObfuscationSetting(zoneId)

Get Email Obfuscation setting

Encrypt email adresses on your web page from bots, while keeping them visible to humans. (https://support.cloudflare.com/hc/en-us/articles/200170016).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetEmailObfuscationSetting200Response result = apiInstance.zoneSettingsGetEmailObfuscationSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetEmailObfuscationSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetEmailObfuscationSetting200Response**](ZoneSettingsGetEmailObfuscationSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Email Obfuscation setting response |  -  |
| **4XX** | Get Email Obfuscation setting response failure |  -  |

<a id="zoneSettingsGetEnableErrorPagesOnSetting"></a>
# **zoneSettingsGetEnableErrorPagesOnSetting**
> ZoneSettingsGetEnableErrorPagesOnSetting200Response zoneSettingsGetEnableErrorPagesOnSetting(zoneId)

Get Enable Error Pages On setting

Cloudflare will proxy customer error pages on any 502,504 errors on origin server instead of showing a default Cloudflare error page. This does not apply to 522 errors and is limited to Enterprise Zones.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetEnableErrorPagesOnSetting200Response result = apiInstance.zoneSettingsGetEnableErrorPagesOnSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetEnableErrorPagesOnSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetEnableErrorPagesOnSetting200Response**](ZoneSettingsGetEnableErrorPagesOnSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Enable Error Pages On setting response |  -  |
| **4XX** | Get Enable Error Pages On setting response failure |  -  |

<a id="zoneSettingsGetEnableQueryStringSortSetting"></a>
# **zoneSettingsGetEnableQueryStringSortSetting**
> ZoneSettingsGetEnableQueryStringSortSetting200Response zoneSettingsGetEnableQueryStringSortSetting(zoneId)

Get Enable Query String Sort setting

Cloudflare will treat files with the same query strings as the same file in cache, regardless of the order of the query strings. This is limited to Enterprise Zones.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetEnableQueryStringSortSetting200Response result = apiInstance.zoneSettingsGetEnableQueryStringSortSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetEnableQueryStringSortSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetEnableQueryStringSortSetting200Response**](ZoneSettingsGetEnableQueryStringSortSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Enable Query String Sort setting response |  -  |
| **4XX** | Get Enable Query String Sort setting response failure |  -  |

<a id="zoneSettingsGetFontsSetting"></a>
# **zoneSettingsGetFontsSetting**
> ZoneSettingsGetFontsSetting200Response zoneSettingsGetFontsSetting(zoneId)

Get Cloudflare Fonts setting

Enhance your website&#39;s font delivery with Cloudflare Fonts. Deliver Google Hosted fonts from your own domain, boost performance, and enhance user privacy. Refer to the Cloudflare Fonts documentation for more information. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetFontsSetting200Response result = apiInstance.zoneSettingsGetFontsSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetFontsSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetFontsSetting200Response**](ZoneSettingsGetFontsSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Cloudflare Fonts setting response |  -  |
| **4XX** | Get Cloudflare Fonts setting response failure |  -  |

<a id="zoneSettingsGetH2PrioritizationSetting"></a>
# **zoneSettingsGetH2PrioritizationSetting**
> ZoneSettingsGetH2PrioritizationSetting200Response zoneSettingsGetH2PrioritizationSetting(zoneId)

Get HTTP/2 Edge Prioritization setting

Gets HTTP/2 Edge Prioritization setting. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetH2PrioritizationSetting200Response result = apiInstance.zoneSettingsGetH2PrioritizationSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetH2PrioritizationSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetH2PrioritizationSetting200Response**](ZoneSettingsGetH2PrioritizationSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get HTTP/2 Edge Prioritization setting response |  -  |
| **4XX** | Get HTTP/2 Edge Prioritization setting response failure |  -  |

<a id="zoneSettingsGetHTTP2Setting"></a>
# **zoneSettingsGetHTTP2Setting**
> ZoneSettingsGetHTTP2Setting200Response zoneSettingsGetHTTP2Setting(zoneId)

Get HTTP2 setting

Value of the HTTP2 setting.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetHTTP2Setting200Response result = apiInstance.zoneSettingsGetHTTP2Setting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetHTTP2Setting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetHTTP2Setting200Response**](ZoneSettingsGetHTTP2Setting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get HTTP2 setting response |  -  |
| **4XX** | Get HTTP2 setting response failure |  -  |

<a id="zoneSettingsGetHTTP3Setting"></a>
# **zoneSettingsGetHTTP3Setting**
> ZoneSettingsGetHTTP3Setting200Response zoneSettingsGetHTTP3Setting(zoneId)

Get HTTP3 setting

Value of the HTTP3 setting.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetHTTP3Setting200Response result = apiInstance.zoneSettingsGetHTTP3Setting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetHTTP3Setting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetHTTP3Setting200Response**](ZoneSettingsGetHTTP3Setting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get HTTP3 setting response |  -  |
| **4XX** | Get HTTP3 setting response failure |  -  |

<a id="zoneSettingsGetHotlinkProtectionSetting"></a>
# **zoneSettingsGetHotlinkProtectionSetting**
> ZoneSettingsGetHotlinkProtectionSetting200Response zoneSettingsGetHotlinkProtectionSetting(zoneId)

Get Hotlink Protection setting

When enabled, the Hotlink Protection option ensures that other sites cannot suck up your bandwidth by building pages that use images hosted on your site. Anytime a request for an image on your site hits Cloudflare, we check to ensure that it&#39;s not another site requesting them. People will still be able to download and view images from your page, but other sites won&#39;t be able to steal them for use on their own pages. (https://support.cloudflare.com/hc/en-us/articles/200170026).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetHotlinkProtectionSetting200Response result = apiInstance.zoneSettingsGetHotlinkProtectionSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetHotlinkProtectionSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetHotlinkProtectionSetting200Response**](ZoneSettingsGetHotlinkProtectionSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Hotlink Protection setting response |  -  |
| **4XX** | Get Hotlink Protection setting response failure |  -  |

<a id="zoneSettingsGetIPv6Setting"></a>
# **zoneSettingsGetIPv6Setting**
> ZoneSettingsGetIPv6Setting200Response zoneSettingsGetIPv6Setting(zoneId)

Get IPv6 setting

Enable IPv6 on all subdomains that are Cloudflare enabled.  (https://support.cloudflare.com/hc/en-us/articles/200168586).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetIPv6Setting200Response result = apiInstance.zoneSettingsGetIPv6Setting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetIPv6Setting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetIPv6Setting200Response**](ZoneSettingsGetIPv6Setting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get IPv6 setting response |  -  |
| **4XX** | Get IPv6 setting response failure |  -  |

<a id="zoneSettingsGetImageResizingSetting"></a>
# **zoneSettingsGetImageResizingSetting**
> ZoneSettingsGetImageResizingSetting200Response zoneSettingsGetImageResizingSetting(zoneId)

Get Image Resizing setting

Image Resizing provides on-demand resizing, conversion and optimisation for images served through Cloudflare&#39;s network. Refer to the [Image Resizing documentation](https://developers.cloudflare.com/images/) for more information. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetImageResizingSetting200Response result = apiInstance.zoneSettingsGetImageResizingSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetImageResizingSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetImageResizingSetting200Response**](ZoneSettingsGetImageResizingSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Image Resizing setting response |  -  |
| **4XX** | Get Image Resizing setting response failure |  -  |

<a id="zoneSettingsGetIpGeolocationSetting"></a>
# **zoneSettingsGetIpGeolocationSetting**
> ZoneSettingsGetIpGeolocationSetting200Response zoneSettingsGetIpGeolocationSetting(zoneId)

Get IP Geolocation setting

Enable IP Geolocation to have Cloudflare geolocate visitors to your website and pass the country code to you. (https://support.cloudflare.com/hc/en-us/articles/200168236).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetIpGeolocationSetting200Response result = apiInstance.zoneSettingsGetIpGeolocationSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetIpGeolocationSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetIpGeolocationSetting200Response**](ZoneSettingsGetIpGeolocationSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get IP Geolocation setting response |  -  |
| **4XX** | Get IP Geolocation setting response failure |  -  |

<a id="zoneSettingsGetMinifySetting"></a>
# **zoneSettingsGetMinifySetting**
> ZoneSettingsGetMinifySetting200Response zoneSettingsGetMinifySetting(zoneId)

Get Minify setting

Automatically minify certain assets for your website. Refer to [Using Cloudflare Auto Minify](https://support.cloudflare.com/hc/en-us/articles/200168196) for more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetMinifySetting200Response result = apiInstance.zoneSettingsGetMinifySetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetMinifySetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetMinifySetting200Response**](ZoneSettingsGetMinifySetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Minify setting response |  -  |
| **4XX** | Get Minify setting response failure |  -  |

<a id="zoneSettingsGetMinimumTlsVersionSetting"></a>
# **zoneSettingsGetMinimumTlsVersionSetting**
> ZoneSettingsGetMinimumTlsVersionSetting200Response zoneSettingsGetMinimumTlsVersionSetting(zoneId)

Get Minimum TLS Version setting

Gets Minimum TLS Version setting.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetMinimumTlsVersionSetting200Response result = apiInstance.zoneSettingsGetMinimumTlsVersionSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetMinimumTlsVersionSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetMinimumTlsVersionSetting200Response**](ZoneSettingsGetMinimumTlsVersionSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Minimum TLS Version setting response |  -  |
| **4XX** | Get Minimum TLS Version setting response failure |  -  |

<a id="zoneSettingsGetMirageSetting"></a>
# **zoneSettingsGetMirageSetting**
> ZoneSettingsGetMirageSetting200Response zoneSettingsGetMirageSetting(zoneId)

Get Mirage setting

Automatically optimize image loading for website visitors on mobile devices. Refer to our [blog post](http://blog.cloudflare.com/mirage2-solving-mobile-speed) for more information. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetMirageSetting200Response result = apiInstance.zoneSettingsGetMirageSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetMirageSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetMirageSetting200Response**](ZoneSettingsGetMirageSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Mirage setting response |  -  |
| **4XX** | Get Mirage setting response failure |  -  |

<a id="zoneSettingsGetMobileRedirectSetting"></a>
# **zoneSettingsGetMobileRedirectSetting**
> ZoneSettingsGetMobileRedirectSetting200Response zoneSettingsGetMobileRedirectSetting(zoneId)

Get Mobile Redirect setting

Automatically redirect visitors on mobile devices to a mobile-optimized subdomain. Refer to [Understanding Cloudflare Mobile Redirect](https://support.cloudflare.com/hc/articles/200168336) for more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetMobileRedirectSetting200Response result = apiInstance.zoneSettingsGetMobileRedirectSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetMobileRedirectSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetMobileRedirectSetting200Response**](ZoneSettingsGetMobileRedirectSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Mobile Redirect setting response |  -  |
| **4XX** | Get Mobile Redirect setting response failure |  -  |

<a id="zoneSettingsGetNelSetting"></a>
# **zoneSettingsGetNelSetting**
> ZoneSettingsGetNelSetting200Response zoneSettingsGetNelSetting(zoneId)

Get Network Error Logging setting

Enable Network Error Logging reporting on your zone. (Beta) 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetNelSetting200Response result = apiInstance.zoneSettingsGetNelSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetNelSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetNelSetting200Response**](ZoneSettingsGetNelSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Network Error Logging setting response |  -  |
| **4XX** | Get Network Error Logging setting response failure |  -  |

<a id="zoneSettingsGetOpportunisticEncryptionSetting"></a>
# **zoneSettingsGetOpportunisticEncryptionSetting**
> ZoneSettingsGetOpportunisticEncryptionSetting200Response zoneSettingsGetOpportunisticEncryptionSetting(zoneId)

Get Opportunistic Encryption setting

Gets Opportunistic Encryption setting.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetOpportunisticEncryptionSetting200Response result = apiInstance.zoneSettingsGetOpportunisticEncryptionSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetOpportunisticEncryptionSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetOpportunisticEncryptionSetting200Response**](ZoneSettingsGetOpportunisticEncryptionSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Opportunistic Encryption setting response |  -  |
| **4XX** | Get Opportunistic Encryption setting response failure |  -  |

<a id="zoneSettingsGetOpportunisticOnionSetting"></a>
# **zoneSettingsGetOpportunisticOnionSetting**
> ZoneSettingsGetOpportunisticOnionSetting200Response zoneSettingsGetOpportunisticOnionSetting(zoneId)

Get Opportunistic Onion setting

Add an Alt-Svc header to all legitimate requests from Tor, allowing the connection to use our onion services instead of exit nodes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetOpportunisticOnionSetting200Response result = apiInstance.zoneSettingsGetOpportunisticOnionSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetOpportunisticOnionSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetOpportunisticOnionSetting200Response**](ZoneSettingsGetOpportunisticOnionSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Opportunistic Onion setting response |  -  |
| **4XX** | Get Opportunistic Onion setting response failure |  -  |

<a id="zoneSettingsGetOrangeToOrangeSetting"></a>
# **zoneSettingsGetOrangeToOrangeSetting**
> ZoneSettingsGetOrangeToOrangeSetting200Response zoneSettingsGetOrangeToOrangeSetting(zoneId)

Get Orange to Orange (O2O) setting

Orange to Orange (O2O) allows zones on Cloudflare to CNAME to other zones also on Cloudflare. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetOrangeToOrangeSetting200Response result = apiInstance.zoneSettingsGetOrangeToOrangeSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetOrangeToOrangeSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetOrangeToOrangeSetting200Response**](ZoneSettingsGetOrangeToOrangeSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Orange to Orange (O2O) setting response |  -  |
| **4XX** | Get Orange to Orange (O2O) setting response failure |  -  |

<a id="zoneSettingsGetPolishSetting"></a>
# **zoneSettingsGetPolishSetting**
> ZoneSettingsGetPolishSetting200Response zoneSettingsGetPolishSetting(zoneId)

Get Polish setting

Automatically optimize image loading for website visitors on mobile devices. Refer to our [blog post](http://blog.cloudflare.com/polish-solving-mobile-speed) for more information. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetPolishSetting200Response result = apiInstance.zoneSettingsGetPolishSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetPolishSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetPolishSetting200Response**](ZoneSettingsGetPolishSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Polish setting response |  -  |
| **4XX** | Get Polish setting response failure |  -  |

<a id="zoneSettingsGetPrefetchPreloadSetting"></a>
# **zoneSettingsGetPrefetchPreloadSetting**
> ZoneSettingsGetPrefetchPreloadSetting200Response zoneSettingsGetPrefetchPreloadSetting(zoneId)

Get prefetch preload setting

Cloudflare will prefetch any URLs that are included in the response headers. This is limited to Enterprise Zones.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetPrefetchPreloadSetting200Response result = apiInstance.zoneSettingsGetPrefetchPreloadSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetPrefetchPreloadSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetPrefetchPreloadSetting200Response**](ZoneSettingsGetPrefetchPreloadSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get prefetch preload setting response |  -  |
| **4XX** | Get prefetch preload setting response failure |  -  |

<a id="zoneSettingsGetProxyReadTimeoutSetting"></a>
# **zoneSettingsGetProxyReadTimeoutSetting**
> ZoneSettingsGetProxyReadTimeoutSetting200Response zoneSettingsGetProxyReadTimeoutSetting(zoneId)

Get Proxy Read Timeout setting

Maximum time between two read operations from origin. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetProxyReadTimeoutSetting200Response result = apiInstance.zoneSettingsGetProxyReadTimeoutSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetProxyReadTimeoutSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetProxyReadTimeoutSetting200Response**](ZoneSettingsGetProxyReadTimeoutSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Proxy Read Timeout setting response |  -  |
| **4XX** | Get Proxy Read Timeout setting response failure |  -  |

<a id="zoneSettingsGetPseudoIPv4Setting"></a>
# **zoneSettingsGetPseudoIPv4Setting**
> ZoneSettingsGetPseudoIPv4Setting200Response zoneSettingsGetPseudoIPv4Setting(zoneId)

Get Pseudo IPv4 setting

Value of the Pseudo IPv4 setting.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetPseudoIPv4Setting200Response result = apiInstance.zoneSettingsGetPseudoIPv4Setting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetPseudoIPv4Setting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetPseudoIPv4Setting200Response**](ZoneSettingsGetPseudoIPv4Setting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Pseudo IPv4 setting response |  -  |
| **4XX** | Get Pseudo IPv4 setting response failure |  -  |

<a id="zoneSettingsGetResponseBufferingSetting"></a>
# **zoneSettingsGetResponseBufferingSetting**
> ZoneSettingsGetResponseBufferingSetting200Response zoneSettingsGetResponseBufferingSetting(zoneId)

Get Response Buffering setting

Enables or disables buffering of responses from the proxied server. Cloudflare may buffer the whole payload to deliver it at once to the client versus allowing it to be delivered in chunks. By default, the proxied server streams directly and is not buffered by Cloudflare. This is limited to Enterprise Zones.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetResponseBufferingSetting200Response result = apiInstance.zoneSettingsGetResponseBufferingSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetResponseBufferingSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetResponseBufferingSetting200Response**](ZoneSettingsGetResponseBufferingSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Response Buffering setting response |  -  |
| **4XX** | Get Response Buffering setting response failure |  -  |

<a id="zoneSettingsGetRocketLoaderSetting"></a>
# **zoneSettingsGetRocketLoaderSetting**
> ZoneSettingsGetRocketLoaderSetting200Response zoneSettingsGetRocketLoaderSetting(zoneId)

Get Rocket Loader setting

Rocket Loader is a general-purpose asynchronous JavaScript optimisation that prioritises rendering your content while loading your site&#39;s Javascript asynchronously. Turning on Rocket Loader will immediately improve a web page&#39;s rendering time sometimes measured as Time to First Paint (TTFP), and also the &#x60;window.onload&#x60; time (assuming there is JavaScript on the page). This can have a positive impact on your Google search ranking. When turned on, Rocket Loader will automatically defer the loading of all Javascript referenced in your HTML, with no configuration required. Refer to [Understanding Rocket Loader](https://support.cloudflare.com/hc/articles/200168056) for more information. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetRocketLoaderSetting200Response result = apiInstance.zoneSettingsGetRocketLoaderSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetRocketLoaderSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetRocketLoaderSetting200Response**](ZoneSettingsGetRocketLoaderSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Rocket Loader setting response |  -  |
| **4XX** | Get Rocket Loader setting response failure |  -  |

<a id="zoneSettingsGetSecurityHeaderHstsSetting"></a>
# **zoneSettingsGetSecurityHeaderHstsSetting**
> ZoneSettingsGetSecurityHeaderHstsSetting200Response zoneSettingsGetSecurityHeaderHstsSetting(zoneId)

Get Security Header (HSTS) setting

Cloudflare security header for a zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetSecurityHeaderHstsSetting200Response result = apiInstance.zoneSettingsGetSecurityHeaderHstsSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetSecurityHeaderHstsSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetSecurityHeaderHstsSetting200Response**](ZoneSettingsGetSecurityHeaderHstsSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Security Header (HSTS) setting response |  -  |
| **4XX** | Get Security Header (HSTS) setting response failure |  -  |

<a id="zoneSettingsGetSecurityLevelSetting"></a>
# **zoneSettingsGetSecurityLevelSetting**
> ZoneSettingsGetSecurityLevelSetting200Response zoneSettingsGetSecurityLevelSetting(zoneId)

Get Security Level setting

Choose the appropriate security profile for your website, which will automatically adjust each of the security settings. If you choose to customize an individual security setting, the profile will become Custom. (https://support.cloudflare.com/hc/en-us/articles/200170056).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetSecurityLevelSetting200Response result = apiInstance.zoneSettingsGetSecurityLevelSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetSecurityLevelSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetSecurityLevelSetting200Response**](ZoneSettingsGetSecurityLevelSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Security Level setting response |  -  |
| **4XX** | Get Security Level setting response failure |  -  |

<a id="zoneSettingsGetServerSideExcludeSetting"></a>
# **zoneSettingsGetServerSideExcludeSetting**
> ZoneSettingsGetServerSideExcludeSetting200Response zoneSettingsGetServerSideExcludeSetting(zoneId)

Get Server Side Exclude setting

If there is sensitive content on your website that you want visible to real visitors, but that you want to hide from suspicious visitors, all you have to do is wrap the content with Cloudflare SSE tags. Wrap any content that you want to be excluded from suspicious visitors in the following SSE tags: &lt;!--sse--&gt;&lt;!--/sse--&gt;. For example: &lt;!--sse--&gt;  Bad visitors won&#39;t see my phone number, 555-555-5555 &lt;!--/sse--&gt;. Note: SSE only will work with HTML. If you have HTML minification enabled, you won&#39;t see the SSE tags in your HTML source when it&#39;s served through Cloudflare. SSE will still function in this case, as Cloudflare&#39;s HTML minification and SSE functionality occur on-the-fly as the resource moves through our network to the visitor&#39;s computer. (https://support.cloudflare.com/hc/en-us/articles/200170036).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetServerSideExcludeSetting200Response result = apiInstance.zoneSettingsGetServerSideExcludeSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetServerSideExcludeSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetServerSideExcludeSetting200Response**](ZoneSettingsGetServerSideExcludeSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Server Side Exclude setting response |  -  |
| **4XX** | Get Server Side Exclude setting response failure |  -  |

<a id="zoneSettingsGetSslRecommenderSetting"></a>
# **zoneSettingsGetSslRecommenderSetting**
> ZoneSettingsGetSslRecommenderSetting200Response zoneSettingsGetSslRecommenderSetting(zoneId)

Get SSL/TLS Recommender enrollment setting

Enrollment in the SSL/TLS Recommender service which tries to detect and recommend (by sending periodic emails) the most secure SSL/TLS setting your origin servers support. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetSslRecommenderSetting200Response result = apiInstance.zoneSettingsGetSslRecommenderSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetSslRecommenderSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetSslRecommenderSetting200Response**](ZoneSettingsGetSslRecommenderSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get SSL/TLS Recommender enrollment setting response |  -  |
| **4XX** | Get SSL/TLS Recommender enrollment setting response failure |  -  |

<a id="zoneSettingsGetSslSetting"></a>
# **zoneSettingsGetSslSetting**
> ZoneSettingsGetSslSetting200Response zoneSettingsGetSslSetting(zoneId)

Get SSL setting

SSL encrypts your visitor&#39;s connection and safeguards credit card numbers and other personal data to and from your website. SSL can take up to 5 minutes to fully activate. Requires Cloudflare active on your root domain or www domain. Off: no SSL between the visitor and Cloudflare, and no SSL between Cloudflare and your web server  (all HTTP traffic). Flexible: SSL between the visitor and Cloudflare -- visitor sees HTTPS on your site, but no SSL between Cloudflare and your web server. You don&#39;t need to have an SSL cert on your web server, but your vistors will still see the site as being HTTPS enabled. Full:  SSL between the visitor and Cloudflare -- visitor sees HTTPS on your site, and SSL between Cloudflare and your web server. You&#39;ll need to have your own SSL cert or self-signed cert at the very least. Full (Strict): SSL between the visitor and Cloudflare -- visitor sees HTTPS on your site, and SSL between Cloudflare and your web server. You&#39;ll need to have a valid SSL certificate installed on your web server. This certificate must be signed by a certificate authority, have an expiration date in the future, and respond for the request domain name (hostname). (https://support.cloudflare.com/hc/en-us/articles/200170416).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetSslSetting200Response result = apiInstance.zoneSettingsGetSslSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetSslSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetSslSetting200Response**](ZoneSettingsGetSslSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get SSL setting response |  -  |
| **4XX** | Get SSL setting response failure |  -  |

<a id="zoneSettingsGetTls13SettingEnabledForAZone"></a>
# **zoneSettingsGetTls13SettingEnabledForAZone**
> ZoneSettingsGetTls13SettingEnabledForAZone200Response zoneSettingsGetTls13SettingEnabledForAZone(zoneId)

Get TLS 1.3 setting enabled for a zone

Gets TLS 1.3 setting enabled for a zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetTls13SettingEnabledForAZone200Response result = apiInstance.zoneSettingsGetTls13SettingEnabledForAZone(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetTls13SettingEnabledForAZone");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetTls13SettingEnabledForAZone200Response**](ZoneSettingsGetTls13SettingEnabledForAZone200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get TLS 1.3 setting enabled for a zone response |  -  |
| **4XX** | Get TLS 1.3 setting enabled for a zone response failure |  -  |

<a id="zoneSettingsGetTlsClientAuthSetting"></a>
# **zoneSettingsGetTlsClientAuthSetting**
> ZoneSettingsGetTlsClientAuthSetting200Response zoneSettingsGetTlsClientAuthSetting(zoneId)

Get TLS Client Auth setting

TLS Client Auth requires Cloudflare to connect to your origin server using a client certificate (Enterprise Only).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetTlsClientAuthSetting200Response result = apiInstance.zoneSettingsGetTlsClientAuthSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetTlsClientAuthSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetTlsClientAuthSetting200Response**](ZoneSettingsGetTlsClientAuthSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get TLS Client Auth setting response |  -  |
| **4XX** | Get TLS Client Auth setting response failure |  -  |

<a id="zoneSettingsGetTrueClientIpSetting"></a>
# **zoneSettingsGetTrueClientIpSetting**
> ZoneSettingsGetTrueClientIpSetting200Response zoneSettingsGetTrueClientIpSetting(zoneId)

Get True Client IP setting

Allows customer to continue to use True Client IP (Akamai feature) in the headers we send to the origin. This is limited to Enterprise Zones.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetTrueClientIpSetting200Response result = apiInstance.zoneSettingsGetTrueClientIpSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetTrueClientIpSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetTrueClientIpSetting200Response**](ZoneSettingsGetTrueClientIpSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get True Client IP setting response |  -  |
| **4XX** | Get True Client IP setting response failure |  -  |

<a id="zoneSettingsGetWebApplicationFirewallWafSetting"></a>
# **zoneSettingsGetWebApplicationFirewallWafSetting**
> ZoneSettingsGetWebApplicationFirewallWafSetting200Response zoneSettingsGetWebApplicationFirewallWafSetting(zoneId)

Get Web Application Firewall (WAF) setting

The WAF examines HTTP requests to your website.  It inspects both GET and POST requests and applies rules to help filter out illegitimate traffic from legitimate website visitors. The Cloudflare WAF inspects website addresses or URLs to detect anything out of the ordinary. If the Cloudflare WAF determines suspicious user behavior, then the WAF will &#39;challenge&#39; the web visitor with a page that asks them to submit a CAPTCHA successfully  to continue their action. If the challenge is failed, the action will be stopped. What this means is that Cloudflare&#39;s WAF will block any traffic identified as illegitimate before it reaches your origin web server. (https://support.cloudflare.com/hc/en-us/articles/200172016).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetWebApplicationFirewallWafSetting200Response result = apiInstance.zoneSettingsGetWebApplicationFirewallWafSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetWebApplicationFirewallWafSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetWebApplicationFirewallWafSetting200Response**](ZoneSettingsGetWebApplicationFirewallWafSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Web Application Firewall (WAF) setting response |  -  |
| **4XX** | Get Web Application Firewall (WAF) setting response failure |  -  |

<a id="zoneSettingsGetWebPSetting"></a>
# **zoneSettingsGetWebPSetting**
> ZoneSettingsGetWebPSetting200Response zoneSettingsGetWebPSetting(zoneId)

Get WebP setting

When the client requesting the image supports the WebP image codec, and WebP offers a performance advantage over the original image format, Cloudflare will serve a WebP version of the original image.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetWebPSetting200Response result = apiInstance.zoneSettingsGetWebPSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetWebPSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetWebPSetting200Response**](ZoneSettingsGetWebPSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get WebP setting response |  -  |
| **4XX** | Get WebP setting response failure |  -  |

<a id="zoneSettingsGetWebSocketsSetting"></a>
# **zoneSettingsGetWebSocketsSetting**
> ZoneSettingsGetWebSocketsSetting200Response zoneSettingsGetWebSocketsSetting(zoneId)

Get WebSockets setting

Gets Websockets setting. For more information about Websockets, please refer to [Using Cloudflare with WebSockets](https://support.cloudflare.com/hc/en-us/articles/200169466-Using-Cloudflare-with-WebSockets).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneSettingsApi apiInstance = new ZoneSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneSettingsGetWebSocketsSetting200Response result = apiInstance.zoneSettingsGetWebSocketsSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSettingsApi#zoneSettingsGetWebSocketsSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |

### Return type

[**ZoneSettingsGetWebSocketsSetting200Response**](ZoneSettingsGetWebSocketsSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get WebSockets setting response |  -  |
| **4XX** | Get WebSockets setting response failure |  -  |

