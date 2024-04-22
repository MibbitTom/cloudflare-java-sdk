# WaitingRoomApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**waitingRoomCreateACustomWaitingRoomPagePreview**](WaitingRoomApi.md#waitingRoomCreateACustomWaitingRoomPagePreview) | **POST** /zones/{zone_id}/waiting_rooms/preview | Create a custom waiting room page preview |
| [**waitingRoomCreateEvent**](WaitingRoomApi.md#waitingRoomCreateEvent) | **POST** /zones/{zone_id}/waiting_rooms/{waiting_room_id}/events | Create event |
| [**waitingRoomCreateWaitingRoom**](WaitingRoomApi.md#waitingRoomCreateWaitingRoom) | **POST** /zones/{zone_id}/waiting_rooms | Create waiting room |
| [**waitingRoomCreateWaitingRoomRule**](WaitingRoomApi.md#waitingRoomCreateWaitingRoomRule) | **POST** /zones/{zone_id}/waiting_rooms/{waiting_room_id}/rules | Create Waiting Room Rule |
| [**waitingRoomDeleteEvent**](WaitingRoomApi.md#waitingRoomDeleteEvent) | **DELETE** /zones/{zone_id}/waiting_rooms/{waiting_room_id}/events/{event_id} | Delete event |
| [**waitingRoomDeleteWaitingRoom**](WaitingRoomApi.md#waitingRoomDeleteWaitingRoom) | **DELETE** /zones/{zone_id}/waiting_rooms/{waiting_room_id} | Delete waiting room |
| [**waitingRoomDeleteWaitingRoomRule**](WaitingRoomApi.md#waitingRoomDeleteWaitingRoomRule) | **DELETE** /zones/{zone_id}/waiting_rooms/{waiting_room_id}/rules/{rule_id} | Delete Waiting Room Rule |
| [**waitingRoomEventDetails**](WaitingRoomApi.md#waitingRoomEventDetails) | **GET** /zones/{zone_id}/waiting_rooms/{waiting_room_id}/events/{event_id} | Event details |
| [**waitingRoomGetWaitingRoomStatus**](WaitingRoomApi.md#waitingRoomGetWaitingRoomStatus) | **GET** /zones/{zone_id}/waiting_rooms/{waiting_room_id}/status | Get waiting room status |
| [**waitingRoomGetZoneSettings**](WaitingRoomApi.md#waitingRoomGetZoneSettings) | **GET** /zones/{zone_id}/waiting_rooms/settings | Get zone-level Waiting Room settings |
| [**waitingRoomListEvents**](WaitingRoomApi.md#waitingRoomListEvents) | **GET** /zones/{zone_id}/waiting_rooms/{waiting_room_id}/events | List events |
| [**waitingRoomListWaitingRoomRules**](WaitingRoomApi.md#waitingRoomListWaitingRoomRules) | **GET** /zones/{zone_id}/waiting_rooms/{waiting_room_id}/rules | List Waiting Room Rules |
| [**waitingRoomListWaitingRooms**](WaitingRoomApi.md#waitingRoomListWaitingRooms) | **GET** /zones/{zone_id}/waiting_rooms | List waiting rooms |
| [**waitingRoomPatchEvent**](WaitingRoomApi.md#waitingRoomPatchEvent) | **PATCH** /zones/{zone_id}/waiting_rooms/{waiting_room_id}/events/{event_id} | Patch event |
| [**waitingRoomPatchWaitingRoom**](WaitingRoomApi.md#waitingRoomPatchWaitingRoom) | **PATCH** /zones/{zone_id}/waiting_rooms/{waiting_room_id} | Patch waiting room |
| [**waitingRoomPatchWaitingRoomRule**](WaitingRoomApi.md#waitingRoomPatchWaitingRoomRule) | **PATCH** /zones/{zone_id}/waiting_rooms/{waiting_room_id}/rules/{rule_id} | Patch Waiting Room Rule |
| [**waitingRoomPatchZoneSettings**](WaitingRoomApi.md#waitingRoomPatchZoneSettings) | **PATCH** /zones/{zone_id}/waiting_rooms/settings | Patch zone-level Waiting Room settings |
| [**waitingRoomPreviewActiveEventDetails**](WaitingRoomApi.md#waitingRoomPreviewActiveEventDetails) | **GET** /zones/{zone_id}/waiting_rooms/{waiting_room_id}/events/{event_id}/details | Preview active event details |
| [**waitingRoomReplaceWaitingRoomRules**](WaitingRoomApi.md#waitingRoomReplaceWaitingRoomRules) | **PUT** /zones/{zone_id}/waiting_rooms/{waiting_room_id}/rules | Replace Waiting Room Rules |
| [**waitingRoomUpdateEvent**](WaitingRoomApi.md#waitingRoomUpdateEvent) | **PUT** /zones/{zone_id}/waiting_rooms/{waiting_room_id}/events/{event_id} | Update event |
| [**waitingRoomUpdateWaitingRoom**](WaitingRoomApi.md#waitingRoomUpdateWaitingRoom) | **PUT** /zones/{zone_id}/waiting_rooms/{waiting_room_id} | Update waiting room |
| [**waitingRoomUpdateZoneSettings**](WaitingRoomApi.md#waitingRoomUpdateZoneSettings) | **PUT** /zones/{zone_id}/waiting_rooms/settings | Update zone-level Waiting Room settings |
| [**waitingRoomWaitingRoomDetails**](WaitingRoomApi.md#waitingRoomWaitingRoomDetails) | **GET** /zones/{zone_id}/waiting_rooms/{waiting_room_id} | Waiting room details |


<a id="waitingRoomCreateACustomWaitingRoomPagePreview"></a>
# **waitingRoomCreateACustomWaitingRoomPagePreview**
> WaitingroomPreviewResponse waitingRoomCreateACustomWaitingRoomPagePreview(zoneId, waitingroomQueryPreview)

Create a custom waiting room page preview

Creates a waiting room page preview. Upload a custom waiting room page for preview. You will receive a preview URL in the form &#x60;http://waitingrooms.dev/preview/&lt;uuid&gt;&#x60;. You can use the following query parameters to change the state of the preview: 1. &#x60;force_queue&#x60;: Boolean indicating if all users will be queued in the waiting room and no one will be let into the origin website (also known as queueAll). 2. &#x60;queue_is_full&#x60;: Boolean indicating if the waiting room&#39;s queue is currently full and not accepting new users at the moment. 3. &#x60;queueing_method&#x60;: The queueing method currently used by the waiting room.  - **fifo** indicates a FIFO queue.  - **random** indicates a Random queue.  - **passthrough** indicates a Passthrough queue. Keep in mind that the waiting room page will only be displayed if &#x60;force_queue&#x3D;true&#x60; or &#x60;event&#x3D;prequeueing&#x60; — for other cases the request will pass through to the origin. For our preview, this will be a fake origin website returning \&quot;Welcome\&quot;.   - **reject** indicates a Reject queue. 4. &#x60;event&#x60;: Used to preview a waiting room event.  - **none** indicates no event is occurring.  - **prequeueing** indicates that an event is prequeueing (between &#x60;prequeue_start_time&#x60; and &#x60;event_start_time&#x60;).  - **started** indicates that an event has started (between &#x60;event_start_time&#x60; and &#x60;event_end_time&#x60;). 5. &#x60;shuffle_at_event_start&#x60;: Boolean indicating if the event will shuffle users in the prequeue when it starts. This can only be set to **true** if an event is active (&#x60;event&#x60; is not **none**).  For example, you can make a request to &#x60;http://waitingrooms.dev/preview/&lt;uuid&gt;?force_queue&#x3D;false&amp;queue_is_full&#x3D;false&amp;queueing_method&#x3D;random&amp;event&#x3D;started&amp;shuffle_at_event_start&#x3D;true&#x60; 6. &#x60;waitTime&#x60;: Non-zero, positive integer indicating the estimated wait time in minutes. The default value is 10 minutes.  For example, you can make a request to &#x60;http://waitingrooms.dev/preview/&lt;uuid&gt;?waitTime&#x3D;50&#x60; to configure the estimated wait time as 50 minutes.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    WaitingroomQueryPreview waitingroomQueryPreview = new WaitingroomQueryPreview(); // WaitingroomQueryPreview | 
    try {
      WaitingroomPreviewResponse result = apiInstance.waitingRoomCreateACustomWaitingRoomPagePreview(zoneId, waitingroomQueryPreview);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomCreateACustomWaitingRoomPagePreview");
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
| **waitingroomQueryPreview** | [**WaitingroomQueryPreview**](WaitingroomQueryPreview.md)|  | |

### Return type

[**WaitingroomPreviewResponse**](WaitingroomPreviewResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a custom waiting room page preview response |  -  |
| **4XX** | Create a custom waiting room page preview response failure |  -  |

<a id="waitingRoomCreateEvent"></a>
# **waitingRoomCreateEvent**
> WaitingroomEventResponse waitingRoomCreateEvent(waitingRoomId, zoneId, waitingroomQueryEvent)

Create event

Only available for the Waiting Room Advanced subscription. Creates an event for a waiting room. An event takes place during a specified period of time, temporarily changing the behavior of a waiting room. While the event is active, some of the properties in the event&#39;s configuration may either override or inherit from the waiting room&#39;s configuration. Note that events cannot overlap with each other, so only one event can be active at a time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String waitingRoomId = "waitingRoomId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    WaitingroomQueryEvent waitingroomQueryEvent = new WaitingroomQueryEvent(); // WaitingroomQueryEvent | 
    try {
      WaitingroomEventResponse result = apiInstance.waitingRoomCreateEvent(waitingRoomId, zoneId, waitingroomQueryEvent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomCreateEvent");
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
| **waitingRoomId** | **String**|  | |
| **zoneId** | **String**|  | |
| **waitingroomQueryEvent** | [**WaitingroomQueryEvent**](WaitingroomQueryEvent.md)|  | |

### Return type

[**WaitingroomEventResponse**](WaitingroomEventResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create event response |  -  |
| **4XX** | Create event response failure |  -  |

<a id="waitingRoomCreateWaitingRoom"></a>
# **waitingRoomCreateWaitingRoom**
> WaitingroomSingleResponse waitingRoomCreateWaitingRoom(zoneId, waitingroomQueryWaitingroom)

Create waiting room

Creates a new waiting room.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    WaitingroomQueryWaitingroom waitingroomQueryWaitingroom = new WaitingroomQueryWaitingroom(); // WaitingroomQueryWaitingroom | 
    try {
      WaitingroomSingleResponse result = apiInstance.waitingRoomCreateWaitingRoom(zoneId, waitingroomQueryWaitingroom);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomCreateWaitingRoom");
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
| **waitingroomQueryWaitingroom** | [**WaitingroomQueryWaitingroom**](WaitingroomQueryWaitingroom.md)|  | |

### Return type

[**WaitingroomSingleResponse**](WaitingroomSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create waiting room response |  -  |
| **4XX** | Create waiting room response failure |  -  |

<a id="waitingRoomCreateWaitingRoomRule"></a>
# **waitingRoomCreateWaitingRoomRule**
> WaitingroomRulesResponseCollection waitingRoomCreateWaitingRoomRule(waitingRoomId, zoneId, waitingroomCreateRule)

Create Waiting Room Rule

Only available for the Waiting Room Advanced subscription. Creates a rule for a waiting room.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String waitingRoomId = "waitingRoomId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    WaitingroomCreateRule waitingroomCreateRule = new WaitingroomCreateRule(); // WaitingroomCreateRule | 
    try {
      WaitingroomRulesResponseCollection result = apiInstance.waitingRoomCreateWaitingRoomRule(waitingRoomId, zoneId, waitingroomCreateRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomCreateWaitingRoomRule");
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
| **waitingRoomId** | **String**|  | |
| **zoneId** | **String**|  | |
| **waitingroomCreateRule** | [**WaitingroomCreateRule**](WaitingroomCreateRule.md)|  | |

### Return type

[**WaitingroomRulesResponseCollection**](WaitingroomRulesResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Waiting Room Rule response |  -  |
| **4XX** | Create Waiting Room Rule response failure |  -  |

<a id="waitingRoomDeleteEvent"></a>
# **waitingRoomDeleteEvent**
> WaitingroomEventIdResponse waitingRoomDeleteEvent(eventId, waitingRoomId, zoneId)

Delete event

Deletes an event for a waiting room.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String eventId = "eventId_example"; // String | 
    String waitingRoomId = "waitingRoomId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      WaitingroomEventIdResponse result = apiInstance.waitingRoomDeleteEvent(eventId, waitingRoomId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomDeleteEvent");
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
| **eventId** | **String**|  | |
| **waitingRoomId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**WaitingroomEventIdResponse**](WaitingroomEventIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete event response |  -  |
| **4XX** | Delete event response failure |  -  |

<a id="waitingRoomDeleteWaitingRoom"></a>
# **waitingRoomDeleteWaitingRoom**
> WaitingroomWaitingRoomIdResponse waitingRoomDeleteWaitingRoom(waitingRoomId, zoneId)

Delete waiting room

Deletes a waiting room.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String waitingRoomId = "waitingRoomId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      WaitingroomWaitingRoomIdResponse result = apiInstance.waitingRoomDeleteWaitingRoom(waitingRoomId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomDeleteWaitingRoom");
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
| **waitingRoomId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**WaitingroomWaitingRoomIdResponse**](WaitingroomWaitingRoomIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete waiting room response |  -  |
| **4XX** | Delete waiting room response failure |  -  |

<a id="waitingRoomDeleteWaitingRoomRule"></a>
# **waitingRoomDeleteWaitingRoomRule**
> WaitingroomRulesResponseCollection waitingRoomDeleteWaitingRoomRule(ruleId, waitingRoomId, zoneId)

Delete Waiting Room Rule

Deletes a rule for a waiting room.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    String waitingRoomId = "waitingRoomId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      WaitingroomRulesResponseCollection result = apiInstance.waitingRoomDeleteWaitingRoomRule(ruleId, waitingRoomId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomDeleteWaitingRoomRule");
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
| **ruleId** | **String**|  | |
| **waitingRoomId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**WaitingroomRulesResponseCollection**](WaitingroomRulesResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Waiting Room Rule response |  -  |
| **4XX** | Delete Waiting Room Rule response failure |  -  |

<a id="waitingRoomEventDetails"></a>
# **waitingRoomEventDetails**
> WaitingroomEventResponse waitingRoomEventDetails(eventId, waitingRoomId, zoneId)

Event details

Fetches a single configured event for a waiting room.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String eventId = "eventId_example"; // String | 
    String waitingRoomId = "waitingRoomId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      WaitingroomEventResponse result = apiInstance.waitingRoomEventDetails(eventId, waitingRoomId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomEventDetails");
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
| **eventId** | **String**|  | |
| **waitingRoomId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**WaitingroomEventResponse**](WaitingroomEventResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Event details response |  -  |
| **4XX** | Event details response failure |  -  |

<a id="waitingRoomGetWaitingRoomStatus"></a>
# **waitingRoomGetWaitingRoomStatus**
> WaitingroomStatusResponse waitingRoomGetWaitingRoomStatus(waitingRoomId, zoneId)

Get waiting room status

Fetches the status of a configured waiting room. Response fields include: 1. &#x60;status&#x60;: String indicating the status of the waiting room. The possible status are:  - **not_queueing** indicates that the configured thresholds have not been met and all users are going through to the origin.  - **queueing** indicates that the thresholds have been met and some users are held in the waiting room.  - **event_prequeueing** indicates that an event is active and is currently prequeueing users before it starts. 2. &#x60;event_id&#x60;: String of the current event&#39;s &#x60;id&#x60; if an event is active, otherwise an empty string. 3. &#x60;estimated_queued_users&#x60;: Integer of the estimated number of users currently waiting in the queue. 4. &#x60;estimated_total_active_users&#x60;: Integer of the estimated number of users currently active on the origin. 5. &#x60;max_estimated_time_minutes&#x60;: Integer of the maximum estimated time currently presented to the users.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String waitingRoomId = "waitingRoomId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      WaitingroomStatusResponse result = apiInstance.waitingRoomGetWaitingRoomStatus(waitingRoomId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomGetWaitingRoomStatus");
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
| **waitingRoomId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**WaitingroomStatusResponse**](WaitingroomStatusResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get waiting room status response |  -  |
| **4XX** | Get waiting room status response failure |  -  |

<a id="waitingRoomGetZoneSettings"></a>
# **waitingRoomGetZoneSettings**
> WaitingroomZoneSettingsResponse waitingRoomGetZoneSettings(zoneId)

Get zone-level Waiting Room settings

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      WaitingroomZoneSettingsResponse result = apiInstance.waitingRoomGetZoneSettings(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomGetZoneSettings");
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

[**WaitingroomZoneSettingsResponse**](WaitingroomZoneSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The current zone-level Waiting Room settings |  -  |
| **4XX** | The current zone-level Waiting Room settings response failure |  -  |

<a id="waitingRoomListEvents"></a>
# **waitingRoomListEvents**
> WaitingroomEventResponseCollection waitingRoomListEvents(waitingRoomId, zoneId, page, perPage)

List events

Lists events for a waiting room.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String waitingRoomId = "waitingRoomId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    Object page = 1; // Object | Page number of paginated results.
    Object perPage = 25; // Object | Maximum number of results per page. Must be a multiple of 5.
    try {
      WaitingroomEventResponseCollection result = apiInstance.waitingRoomListEvents(waitingRoomId, zoneId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomListEvents");
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
| **waitingRoomId** | **String**|  | |
| **zoneId** | **String**|  | |
| **page** | [**Object**](.md)| Page number of paginated results. | [optional] [default to 1] |
| **perPage** | [**Object**](.md)| Maximum number of results per page. Must be a multiple of 5. | [optional] [default to 25] |

### Return type

[**WaitingroomEventResponseCollection**](WaitingroomEventResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List events response |  -  |
| **4XX** | List events response failure |  -  |

<a id="waitingRoomListWaitingRoomRules"></a>
# **waitingRoomListWaitingRoomRules**
> WaitingroomRulesResponseCollection waitingRoomListWaitingRoomRules(waitingRoomId, zoneId)

List Waiting Room Rules

Lists rules for a waiting room.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String waitingRoomId = "waitingRoomId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      WaitingroomRulesResponseCollection result = apiInstance.waitingRoomListWaitingRoomRules(waitingRoomId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomListWaitingRoomRules");
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
| **waitingRoomId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**WaitingroomRulesResponseCollection**](WaitingroomRulesResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Waiting Room Rules response |  -  |
| **4XX** | List Waiting Room Rules response failure |  -  |

<a id="waitingRoomListWaitingRooms"></a>
# **waitingRoomListWaitingRooms**
> WaitingroomResponseCollection waitingRoomListWaitingRooms(zoneId, page, perPage)

List waiting rooms

Lists waiting rooms.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    Object page = 1; // Object | Page number of paginated results.
    Object perPage = 25; // Object | Maximum number of results per page. Must be a multiple of 5.
    try {
      WaitingroomResponseCollection result = apiInstance.waitingRoomListWaitingRooms(zoneId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomListWaitingRooms");
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
| **page** | [**Object**](.md)| Page number of paginated results. | [optional] [default to 1] |
| **perPage** | [**Object**](.md)| Maximum number of results per page. Must be a multiple of 5. | [optional] [default to 25] |

### Return type

[**WaitingroomResponseCollection**](WaitingroomResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List waiting rooms response |  -  |
| **4XX** | List waiting rooms response failure |  -  |

<a id="waitingRoomPatchEvent"></a>
# **waitingRoomPatchEvent**
> WaitingroomEventResponse waitingRoomPatchEvent(eventId, waitingRoomId, zoneId, waitingroomQueryEvent)

Patch event

Patches a configured event for a waiting room.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String eventId = "eventId_example"; // String | 
    String waitingRoomId = "waitingRoomId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    WaitingroomQueryEvent waitingroomQueryEvent = new WaitingroomQueryEvent(); // WaitingroomQueryEvent | 
    try {
      WaitingroomEventResponse result = apiInstance.waitingRoomPatchEvent(eventId, waitingRoomId, zoneId, waitingroomQueryEvent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomPatchEvent");
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
| **eventId** | **String**|  | |
| **waitingRoomId** | **String**|  | |
| **zoneId** | **String**|  | |
| **waitingroomQueryEvent** | [**WaitingroomQueryEvent**](WaitingroomQueryEvent.md)|  | |

### Return type

[**WaitingroomEventResponse**](WaitingroomEventResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch event response |  -  |
| **4XX** | Patch event response failure |  -  |

<a id="waitingRoomPatchWaitingRoom"></a>
# **waitingRoomPatchWaitingRoom**
> WaitingroomSingleResponse waitingRoomPatchWaitingRoom(waitingRoomId, zoneId, waitingroomQueryWaitingroom)

Patch waiting room

Patches a configured waiting room.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String waitingRoomId = "waitingRoomId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    WaitingroomQueryWaitingroom waitingroomQueryWaitingroom = new WaitingroomQueryWaitingroom(); // WaitingroomQueryWaitingroom | 
    try {
      WaitingroomSingleResponse result = apiInstance.waitingRoomPatchWaitingRoom(waitingRoomId, zoneId, waitingroomQueryWaitingroom);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomPatchWaitingRoom");
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
| **waitingRoomId** | **String**|  | |
| **zoneId** | **String**|  | |
| **waitingroomQueryWaitingroom** | [**WaitingroomQueryWaitingroom**](WaitingroomQueryWaitingroom.md)|  | |

### Return type

[**WaitingroomSingleResponse**](WaitingroomSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch waiting room response |  -  |
| **4XX** | Patch waiting room response failure |  -  |

<a id="waitingRoomPatchWaitingRoomRule"></a>
# **waitingRoomPatchWaitingRoomRule**
> WaitingroomRulesResponseCollection waitingRoomPatchWaitingRoomRule(ruleId, waitingRoomId, zoneId, waitingroomPatchRule)

Patch Waiting Room Rule

Patches a rule for a waiting room.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    String waitingRoomId = "waitingRoomId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    WaitingroomPatchRule waitingroomPatchRule = new WaitingroomPatchRule(); // WaitingroomPatchRule | 
    try {
      WaitingroomRulesResponseCollection result = apiInstance.waitingRoomPatchWaitingRoomRule(ruleId, waitingRoomId, zoneId, waitingroomPatchRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomPatchWaitingRoomRule");
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
| **ruleId** | **String**|  | |
| **waitingRoomId** | **String**|  | |
| **zoneId** | **String**|  | |
| **waitingroomPatchRule** | [**WaitingroomPatchRule**](WaitingroomPatchRule.md)|  | |

### Return type

[**WaitingroomRulesResponseCollection**](WaitingroomRulesResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch Waiting Room Rule response |  -  |
| **4XX** | Patch Waiting Room Rule response failure |  -  |

<a id="waitingRoomPatchZoneSettings"></a>
# **waitingRoomPatchZoneSettings**
> WaitingroomZoneSettingsResponse waitingRoomPatchZoneSettings(zoneId, waitingroomZoneSettings)

Patch zone-level Waiting Room settings

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    WaitingroomZoneSettings waitingroomZoneSettings = new WaitingroomZoneSettings(); // WaitingroomZoneSettings | 
    try {
      WaitingroomZoneSettingsResponse result = apiInstance.waitingRoomPatchZoneSettings(zoneId, waitingroomZoneSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomPatchZoneSettings");
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
| **waitingroomZoneSettings** | [**WaitingroomZoneSettings**](WaitingroomZoneSettings.md)|  | |

### Return type

[**WaitingroomZoneSettingsResponse**](WaitingroomZoneSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated zone-level Waiting Room settings |  -  |
| **4XX** | The zone-level Waiting Room settings response failure |  -  |

<a id="waitingRoomPreviewActiveEventDetails"></a>
# **waitingRoomPreviewActiveEventDetails**
> WaitingroomEventDetailsResponse waitingRoomPreviewActiveEventDetails(eventId, waitingRoomId, zoneId)

Preview active event details

Previews an event&#39;s configuration as if it was active. Inherited fields from the waiting room will be displayed with their current values.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String eventId = "eventId_example"; // String | 
    String waitingRoomId = "waitingRoomId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      WaitingroomEventDetailsResponse result = apiInstance.waitingRoomPreviewActiveEventDetails(eventId, waitingRoomId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomPreviewActiveEventDetails");
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
| **eventId** | **String**|  | |
| **waitingRoomId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**WaitingroomEventDetailsResponse**](WaitingroomEventDetailsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Preview active event details response |  -  |
| **4XX** | Preview active event details response failure |  -  |

<a id="waitingRoomReplaceWaitingRoomRules"></a>
# **waitingRoomReplaceWaitingRoomRules**
> WaitingroomRulesResponseCollection waitingRoomReplaceWaitingRoomRules(waitingRoomId, zoneId, waitingroomCreateRule)

Replace Waiting Room Rules

Only available for the Waiting Room Advanced subscription. Replaces all rules for a waiting room.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String waitingRoomId = "waitingRoomId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    List<WaitingroomCreateRule> waitingroomCreateRule = Arrays.asList(); // List<WaitingroomCreateRule> | 
    try {
      WaitingroomRulesResponseCollection result = apiInstance.waitingRoomReplaceWaitingRoomRules(waitingRoomId, zoneId, waitingroomCreateRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomReplaceWaitingRoomRules");
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
| **waitingRoomId** | **String**|  | |
| **zoneId** | **String**|  | |
| **waitingroomCreateRule** | [**List&lt;WaitingroomCreateRule&gt;**](WaitingroomCreateRule.md)|  | |

### Return type

[**WaitingroomRulesResponseCollection**](WaitingroomRulesResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Replace Waiting Room Rules response |  -  |
| **4XX** | Replace Waiting Room Rules response failure |  -  |

<a id="waitingRoomUpdateEvent"></a>
# **waitingRoomUpdateEvent**
> WaitingroomEventResponse waitingRoomUpdateEvent(eventId, waitingRoomId, zoneId, waitingroomQueryEvent)

Update event

Updates a configured event for a waiting room.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String eventId = "eventId_example"; // String | 
    String waitingRoomId = "waitingRoomId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    WaitingroomQueryEvent waitingroomQueryEvent = new WaitingroomQueryEvent(); // WaitingroomQueryEvent | 
    try {
      WaitingroomEventResponse result = apiInstance.waitingRoomUpdateEvent(eventId, waitingRoomId, zoneId, waitingroomQueryEvent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomUpdateEvent");
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
| **eventId** | **String**|  | |
| **waitingRoomId** | **String**|  | |
| **zoneId** | **String**|  | |
| **waitingroomQueryEvent** | [**WaitingroomQueryEvent**](WaitingroomQueryEvent.md)|  | |

### Return type

[**WaitingroomEventResponse**](WaitingroomEventResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update event response |  -  |
| **4XX** | Update event response failure |  -  |

<a id="waitingRoomUpdateWaitingRoom"></a>
# **waitingRoomUpdateWaitingRoom**
> WaitingroomSingleResponse waitingRoomUpdateWaitingRoom(waitingRoomId, zoneId, waitingroomQueryWaitingroom)

Update waiting room

Updates a configured waiting room.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String waitingRoomId = "waitingRoomId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    WaitingroomQueryWaitingroom waitingroomQueryWaitingroom = new WaitingroomQueryWaitingroom(); // WaitingroomQueryWaitingroom | 
    try {
      WaitingroomSingleResponse result = apiInstance.waitingRoomUpdateWaitingRoom(waitingRoomId, zoneId, waitingroomQueryWaitingroom);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomUpdateWaitingRoom");
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
| **waitingRoomId** | **String**|  | |
| **zoneId** | **String**|  | |
| **waitingroomQueryWaitingroom** | [**WaitingroomQueryWaitingroom**](WaitingroomQueryWaitingroom.md)|  | |

### Return type

[**WaitingroomSingleResponse**](WaitingroomSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update waiting room response |  -  |
| **4XX** | Update waiting room response failure |  -  |

<a id="waitingRoomUpdateZoneSettings"></a>
# **waitingRoomUpdateZoneSettings**
> WaitingroomZoneSettingsResponse waitingRoomUpdateZoneSettings(zoneId, waitingroomZoneSettings)

Update zone-level Waiting Room settings

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    WaitingroomZoneSettings waitingroomZoneSettings = new WaitingroomZoneSettings(); // WaitingroomZoneSettings | 
    try {
      WaitingroomZoneSettingsResponse result = apiInstance.waitingRoomUpdateZoneSettings(zoneId, waitingroomZoneSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomUpdateZoneSettings");
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
| **waitingroomZoneSettings** | [**WaitingroomZoneSettings**](WaitingroomZoneSettings.md)|  | |

### Return type

[**WaitingroomZoneSettingsResponse**](WaitingroomZoneSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated zone-level Waiting Room settings |  -  |
| **4XX** | The zone-level Waiting Room settings response failure |  -  |

<a id="waitingRoomWaitingRoomDetails"></a>
# **waitingRoomWaitingRoomDetails**
> WaitingroomSingleResponse waitingRoomWaitingRoomDetails(waitingRoomId, zoneId)

Waiting room details

Fetches a single configured waiting room.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WaitingRoomApi;

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

    WaitingRoomApi apiInstance = new WaitingRoomApi(defaultClient);
    String waitingRoomId = "waitingRoomId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      WaitingroomSingleResponse result = apiInstance.waitingRoomWaitingRoomDetails(waitingRoomId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitingRoomApi#waitingRoomWaitingRoomDetails");
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
| **waitingRoomId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**WaitingroomSingleResponse**](WaitingroomSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Waiting room details response |  -  |
| **4XX** | Waiting room details response failure |  -  |

