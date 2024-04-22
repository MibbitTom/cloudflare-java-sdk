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
import org.openapitools.client.model.StreamAddAudioTrackResponse;
import org.openapitools.client.model.StreamApiResponseCommonFailure;
import org.openapitools.client.model.StreamCopyAudioTrack;
import org.openapitools.client.model.StreamDeletedResponse;
import org.openapitools.client.model.StreamEditAudioTrack;
import org.openapitools.client.model.StreamListAudioTrackResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StreamAudioTracksApi
 */
@Disabled
public class StreamAudioTracksApiTest {

    private final StreamAudioTracksApi api = new StreamAudioTracksApi();

    /**
     * Add audio tracks to a video
     *
     * Adds an additional audio track to a video using the provided audio track URL.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addAudioTrackTest() throws ApiException {
        String accountId = null;
        String identifier = null;
        StreamCopyAudioTrack streamCopyAudioTrack = null;
        StreamAddAudioTrackResponse response = api.addAudioTrack(accountId, identifier, streamCopyAudioTrack);
        // TODO: test validations
    }

    /**
     * Delete additional audio tracks on a video
     *
     * Deletes additional audio tracks on a video. Deleting a default audio track is not allowed. You must assign another audio track as default prior to deletion.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAudioTracksTest() throws ApiException {
        String accountId = null;
        String identifier = null;
        String audioIdentifier = null;
        StreamDeletedResponse response = api.deleteAudioTracks(accountId, identifier, audioIdentifier);
        // TODO: test validations
    }

    /**
     * Edit additional audio tracks on a video
     *
     * Edits additional audio tracks on a video. Editing the default status of an audio track to &#x60;true&#x60; will mark all other audio tracks on the video default status to &#x60;false&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editAudioTracksTest() throws ApiException {
        String accountId = null;
        String identifier = null;
        String audioIdentifier = null;
        StreamEditAudioTrack streamEditAudioTrack = null;
        StreamAddAudioTrackResponse response = api.editAudioTracks(accountId, identifier, audioIdentifier, streamEditAudioTrack);
        // TODO: test validations
    }

    /**
     * List additional audio tracks on a video
     *
     * Lists additional audio tracks on a video. Note this API will not return information for audio attached to the video upload.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAudioTracksTest() throws ApiException {
        String accountId = null;
        String identifier = null;
        StreamListAudioTrackResponse response = api.listAudioTracks(accountId, identifier);
        // TODO: test validations
    }

}
