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
import org.openapitools.client.model.WaitingRoomCreateACustomWaitingRoomPagePreview4XXResponse;
import org.openapitools.client.model.WaitingRoomCreateEvent4XXResponse;
import org.openapitools.client.model.WaitingRoomCreateWaitingRoom4XXResponse;
import org.openapitools.client.model.WaitingRoomDeleteEvent4XXResponse;
import org.openapitools.client.model.WaitingRoomDeleteWaitingRoom4XXResponse;
import org.openapitools.client.model.WaitingRoomGetWaitingRoomStatus4XXResponse;
import org.openapitools.client.model.WaitingRoomGetZoneSettings4XXResponse;
import org.openapitools.client.model.WaitingRoomListEvents4XXResponse;
import org.openapitools.client.model.WaitingRoomListWaitingRoomRules4XXResponse;
import org.openapitools.client.model.WaitingRoomListWaitingRooms4XXResponse;
import org.openapitools.client.model.WaitingRoomPreviewActiveEventDetails4XXResponse;
import org.openapitools.client.model.WaitingroomCreateRule;
import org.openapitools.client.model.WaitingroomEventDetailsResponse;
import org.openapitools.client.model.WaitingroomEventIdResponse;
import org.openapitools.client.model.WaitingroomEventResponse;
import org.openapitools.client.model.WaitingroomEventResponseCollection;
import org.openapitools.client.model.WaitingroomPatchRule;
import org.openapitools.client.model.WaitingroomPreviewResponse;
import org.openapitools.client.model.WaitingroomQueryEvent;
import org.openapitools.client.model.WaitingroomQueryPreview;
import org.openapitools.client.model.WaitingroomQueryWaitingroom;
import org.openapitools.client.model.WaitingroomResponseCollection;
import org.openapitools.client.model.WaitingroomRulesResponseCollection;
import org.openapitools.client.model.WaitingroomSingleResponse;
import org.openapitools.client.model.WaitingroomStatusResponse;
import org.openapitools.client.model.WaitingroomWaitingRoomIdResponse;
import org.openapitools.client.model.WaitingroomZoneSettings;
import org.openapitools.client.model.WaitingroomZoneSettingsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WaitingRoomApi
 */
@Disabled
public class WaitingRoomApiTest {

    private final WaitingRoomApi api = new WaitingRoomApi();

    /**
     * Create a custom waiting room page preview
     *
     * Creates a waiting room page preview. Upload a custom waiting room page for preview. You will receive a preview URL in the form &#x60;http://waitingrooms.dev/preview/&lt;uuid&gt;&#x60;. You can use the following query parameters to change the state of the preview: 1. &#x60;force_queue&#x60;: Boolean indicating if all users will be queued in the waiting room and no one will be let into the origin website (also known as queueAll). 2. &#x60;queue_is_full&#x60;: Boolean indicating if the waiting room&#39;s queue is currently full and not accepting new users at the moment. 3. &#x60;queueing_method&#x60;: The queueing method currently used by the waiting room.  - **fifo** indicates a FIFO queue.  - **random** indicates a Random queue.  - **passthrough** indicates a Passthrough queue. Keep in mind that the waiting room page will only be displayed if &#x60;force_queue&#x3D;true&#x60; or &#x60;event&#x3D;prequeueing&#x60; — for other cases the request will pass through to the origin. For our preview, this will be a fake origin website returning \&quot;Welcome\&quot;.   - **reject** indicates a Reject queue. 4. &#x60;event&#x60;: Used to preview a waiting room event.  - **none** indicates no event is occurring.  - **prequeueing** indicates that an event is prequeueing (between &#x60;prequeue_start_time&#x60; and &#x60;event_start_time&#x60;).  - **started** indicates that an event has started (between &#x60;event_start_time&#x60; and &#x60;event_end_time&#x60;). 5. &#x60;shuffle_at_event_start&#x60;: Boolean indicating if the event will shuffle users in the prequeue when it starts. This can only be set to **true** if an event is active (&#x60;event&#x60; is not **none**).  For example, you can make a request to &#x60;http://waitingrooms.dev/preview/&lt;uuid&gt;?force_queue&#x3D;false&amp;queue_is_full&#x3D;false&amp;queueing_method&#x3D;random&amp;event&#x3D;started&amp;shuffle_at_event_start&#x3D;true&#x60; 6. &#x60;waitTime&#x60;: Non-zero, positive integer indicating the estimated wait time in minutes. The default value is 10 minutes.  For example, you can make a request to &#x60;http://waitingrooms.dev/preview/&lt;uuid&gt;?waitTime&#x3D;50&#x60; to configure the estimated wait time as 50 minutes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomCreateACustomWaitingRoomPagePreviewTest() throws ApiException {
        String zoneId = null;
        WaitingroomQueryPreview waitingroomQueryPreview = null;
        WaitingroomPreviewResponse response = api.waitingRoomCreateACustomWaitingRoomPagePreview(zoneId, waitingroomQueryPreview);
        // TODO: test validations
    }

    /**
     * Create event
     *
     * Only available for the Waiting Room Advanced subscription. Creates an event for a waiting room. An event takes place during a specified period of time, temporarily changing the behavior of a waiting room. While the event is active, some of the properties in the event&#39;s configuration may either override or inherit from the waiting room&#39;s configuration. Note that events cannot overlap with each other, so only one event can be active at a time.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomCreateEventTest() throws ApiException {
        String waitingRoomId = null;
        String zoneId = null;
        WaitingroomQueryEvent waitingroomQueryEvent = null;
        WaitingroomEventResponse response = api.waitingRoomCreateEvent(waitingRoomId, zoneId, waitingroomQueryEvent);
        // TODO: test validations
    }

    /**
     * Create waiting room
     *
     * Creates a new waiting room.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomCreateWaitingRoomTest() throws ApiException {
        String zoneId = null;
        WaitingroomQueryWaitingroom waitingroomQueryWaitingroom = null;
        WaitingroomSingleResponse response = api.waitingRoomCreateWaitingRoom(zoneId, waitingroomQueryWaitingroom);
        // TODO: test validations
    }

    /**
     * Create Waiting Room Rule
     *
     * Only available for the Waiting Room Advanced subscription. Creates a rule for a waiting room.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomCreateWaitingRoomRuleTest() throws ApiException {
        String waitingRoomId = null;
        String zoneId = null;
        WaitingroomCreateRule waitingroomCreateRule = null;
        WaitingroomRulesResponseCollection response = api.waitingRoomCreateWaitingRoomRule(waitingRoomId, zoneId, waitingroomCreateRule);
        // TODO: test validations
    }

    /**
     * Delete event
     *
     * Deletes an event for a waiting room.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomDeleteEventTest() throws ApiException {
        String eventId = null;
        String waitingRoomId = null;
        String zoneId = null;
        WaitingroomEventIdResponse response = api.waitingRoomDeleteEvent(eventId, waitingRoomId, zoneId);
        // TODO: test validations
    }

    /**
     * Delete waiting room
     *
     * Deletes a waiting room.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomDeleteWaitingRoomTest() throws ApiException {
        String waitingRoomId = null;
        String zoneId = null;
        WaitingroomWaitingRoomIdResponse response = api.waitingRoomDeleteWaitingRoom(waitingRoomId, zoneId);
        // TODO: test validations
    }

    /**
     * Delete Waiting Room Rule
     *
     * Deletes a rule for a waiting room.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomDeleteWaitingRoomRuleTest() throws ApiException {
        String ruleId = null;
        String waitingRoomId = null;
        String zoneId = null;
        WaitingroomRulesResponseCollection response = api.waitingRoomDeleteWaitingRoomRule(ruleId, waitingRoomId, zoneId);
        // TODO: test validations
    }

    /**
     * Event details
     *
     * Fetches a single configured event for a waiting room.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomEventDetailsTest() throws ApiException {
        String eventId = null;
        String waitingRoomId = null;
        String zoneId = null;
        WaitingroomEventResponse response = api.waitingRoomEventDetails(eventId, waitingRoomId, zoneId);
        // TODO: test validations
    }

    /**
     * Get waiting room status
     *
     * Fetches the status of a configured waiting room. Response fields include: 1. &#x60;status&#x60;: String indicating the status of the waiting room. The possible status are:  - **not_queueing** indicates that the configured thresholds have not been met and all users are going through to the origin.  - **queueing** indicates that the thresholds have been met and some users are held in the waiting room.  - **event_prequeueing** indicates that an event is active and is currently prequeueing users before it starts. 2. &#x60;event_id&#x60;: String of the current event&#39;s &#x60;id&#x60; if an event is active, otherwise an empty string. 3. &#x60;estimated_queued_users&#x60;: Integer of the estimated number of users currently waiting in the queue. 4. &#x60;estimated_total_active_users&#x60;: Integer of the estimated number of users currently active on the origin. 5. &#x60;max_estimated_time_minutes&#x60;: Integer of the maximum estimated time currently presented to the users.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomGetWaitingRoomStatusTest() throws ApiException {
        String waitingRoomId = null;
        String zoneId = null;
        WaitingroomStatusResponse response = api.waitingRoomGetWaitingRoomStatus(waitingRoomId, zoneId);
        // TODO: test validations
    }

    /**
     * Get zone-level Waiting Room settings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomGetZoneSettingsTest() throws ApiException {
        String zoneId = null;
        WaitingroomZoneSettingsResponse response = api.waitingRoomGetZoneSettings(zoneId);
        // TODO: test validations
    }

    /**
     * List events
     *
     * Lists events for a waiting room.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomListEventsTest() throws ApiException {
        String waitingRoomId = null;
        String zoneId = null;
        Object page = null;
        Object perPage = null;
        WaitingroomEventResponseCollection response = api.waitingRoomListEvents(waitingRoomId, zoneId, page, perPage);
        // TODO: test validations
    }

    /**
     * List Waiting Room Rules
     *
     * Lists rules for a waiting room.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomListWaitingRoomRulesTest() throws ApiException {
        String waitingRoomId = null;
        String zoneId = null;
        WaitingroomRulesResponseCollection response = api.waitingRoomListWaitingRoomRules(waitingRoomId, zoneId);
        // TODO: test validations
    }

    /**
     * List waiting rooms
     *
     * Lists waiting rooms.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomListWaitingRoomsTest() throws ApiException {
        String zoneId = null;
        Object page = null;
        Object perPage = null;
        WaitingroomResponseCollection response = api.waitingRoomListWaitingRooms(zoneId, page, perPage);
        // TODO: test validations
    }

    /**
     * Patch event
     *
     * Patches a configured event for a waiting room.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomPatchEventTest() throws ApiException {
        String eventId = null;
        String waitingRoomId = null;
        String zoneId = null;
        WaitingroomQueryEvent waitingroomQueryEvent = null;
        WaitingroomEventResponse response = api.waitingRoomPatchEvent(eventId, waitingRoomId, zoneId, waitingroomQueryEvent);
        // TODO: test validations
    }

    /**
     * Patch waiting room
     *
     * Patches a configured waiting room.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomPatchWaitingRoomTest() throws ApiException {
        String waitingRoomId = null;
        String zoneId = null;
        WaitingroomQueryWaitingroom waitingroomQueryWaitingroom = null;
        WaitingroomSingleResponse response = api.waitingRoomPatchWaitingRoom(waitingRoomId, zoneId, waitingroomQueryWaitingroom);
        // TODO: test validations
    }

    /**
     * Patch Waiting Room Rule
     *
     * Patches a rule for a waiting room.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomPatchWaitingRoomRuleTest() throws ApiException {
        String ruleId = null;
        String waitingRoomId = null;
        String zoneId = null;
        WaitingroomPatchRule waitingroomPatchRule = null;
        WaitingroomRulesResponseCollection response = api.waitingRoomPatchWaitingRoomRule(ruleId, waitingRoomId, zoneId, waitingroomPatchRule);
        // TODO: test validations
    }

    /**
     * Patch zone-level Waiting Room settings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomPatchZoneSettingsTest() throws ApiException {
        String zoneId = null;
        WaitingroomZoneSettings waitingroomZoneSettings = null;
        WaitingroomZoneSettingsResponse response = api.waitingRoomPatchZoneSettings(zoneId, waitingroomZoneSettings);
        // TODO: test validations
    }

    /**
     * Preview active event details
     *
     * Previews an event&#39;s configuration as if it was active. Inherited fields from the waiting room will be displayed with their current values.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomPreviewActiveEventDetailsTest() throws ApiException {
        String eventId = null;
        String waitingRoomId = null;
        String zoneId = null;
        WaitingroomEventDetailsResponse response = api.waitingRoomPreviewActiveEventDetails(eventId, waitingRoomId, zoneId);
        // TODO: test validations
    }

    /**
     * Replace Waiting Room Rules
     *
     * Only available for the Waiting Room Advanced subscription. Replaces all rules for a waiting room.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomReplaceWaitingRoomRulesTest() throws ApiException {
        String waitingRoomId = null;
        String zoneId = null;
        List<WaitingroomCreateRule> waitingroomCreateRule = null;
        WaitingroomRulesResponseCollection response = api.waitingRoomReplaceWaitingRoomRules(waitingRoomId, zoneId, waitingroomCreateRule);
        // TODO: test validations
    }

    /**
     * Update event
     *
     * Updates a configured event for a waiting room.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomUpdateEventTest() throws ApiException {
        String eventId = null;
        String waitingRoomId = null;
        String zoneId = null;
        WaitingroomQueryEvent waitingroomQueryEvent = null;
        WaitingroomEventResponse response = api.waitingRoomUpdateEvent(eventId, waitingRoomId, zoneId, waitingroomQueryEvent);
        // TODO: test validations
    }

    /**
     * Update waiting room
     *
     * Updates a configured waiting room.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomUpdateWaitingRoomTest() throws ApiException {
        String waitingRoomId = null;
        String zoneId = null;
        WaitingroomQueryWaitingroom waitingroomQueryWaitingroom = null;
        WaitingroomSingleResponse response = api.waitingRoomUpdateWaitingRoom(waitingRoomId, zoneId, waitingroomQueryWaitingroom);
        // TODO: test validations
    }

    /**
     * Update zone-level Waiting Room settings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomUpdateZoneSettingsTest() throws ApiException {
        String zoneId = null;
        WaitingroomZoneSettings waitingroomZoneSettings = null;
        WaitingroomZoneSettingsResponse response = api.waitingRoomUpdateZoneSettings(zoneId, waitingroomZoneSettings);
        // TODO: test validations
    }

    /**
     * Waiting room details
     *
     * Fetches a single configured waiting room.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void waitingRoomWaitingRoomDetailsTest() throws ApiException {
        String waitingRoomId = null;
        String zoneId = null;
        WaitingroomSingleResponse response = api.waitingRoomWaitingRoomDetails(waitingRoomId, zoneId);
        // TODO: test validations
    }

}
