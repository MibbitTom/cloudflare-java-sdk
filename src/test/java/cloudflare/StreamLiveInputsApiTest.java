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


package cloudflare;

import invalidPackageName.ApiException;
import org.openapitools.client.model.StreamApiResponseCommonFailure;
import org.openapitools.client.model.StreamCreateInputRequest;
import org.openapitools.client.model.StreamCreateOutputRequest;
import org.openapitools.client.model.StreamLiveInputResponseCollection;
import org.openapitools.client.model.StreamLiveInputResponseSingle;
import org.openapitools.client.model.StreamOutputResponseCollection;
import org.openapitools.client.model.StreamOutputResponseSingle;
import org.openapitools.client.model.StreamUpdateInputRequest;
import org.openapitools.client.model.StreamUpdateOutputRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StreamLiveInputsApi
 */
@Disabled
public class StreamLiveInputsApiTest {

    private final StreamLiveInputsApi api = new StreamLiveInputsApi();

    /**
     * Create a live input
     *
     * Creates a live input, and returns credentials that you or your users can use to stream live video to Cloudflare Stream.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void streamLiveInputsCreateALiveInputTest() throws ApiException {
        String accountId = null;
        StreamCreateInputRequest streamCreateInputRequest = null;
        StreamLiveInputResponseSingle response = api.streamLiveInputsCreateALiveInput(accountId, streamCreateInputRequest);
        // TODO: test validations
    }

    /**
     * Create a new output, connected to a live input
     *
     * Creates a new output that can be used to simulcast or restream live video to other RTMP or SRT destinations. Outputs are always linked to a specific live input — one live input can have many outputs.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void streamLiveInputsCreateANewOutputConnectedToALiveInputTest() throws ApiException {
        String liveInputIdentifier = null;
        String accountId = null;
        StreamCreateOutputRequest streamCreateOutputRequest = null;
        StreamOutputResponseSingle response = api.streamLiveInputsCreateANewOutputConnectedToALiveInput(liveInputIdentifier, accountId, streamCreateOutputRequest);
        // TODO: test validations
    }

    /**
     * Delete a live input
     *
     * Prevents a live input from being streamed to and makes the live input inaccessible to any future API calls.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void streamLiveInputsDeleteALiveInputTest() throws ApiException {
        String liveInputIdentifier = null;
        String accountId = null;
        api.streamLiveInputsDeleteALiveInput(liveInputIdentifier, accountId);
        // TODO: test validations
    }

    /**
     * Delete an output
     *
     * Deletes an output and removes it from the associated live input.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void streamLiveInputsDeleteAnOutputTest() throws ApiException {
        String outputIdentifier = null;
        String liveInputIdentifier = null;
        String accountId = null;
        api.streamLiveInputsDeleteAnOutput(outputIdentifier, liveInputIdentifier, accountId);
        // TODO: test validations
    }

    /**
     * List all outputs associated with a specified live input
     *
     * Retrieves all outputs associated with a specified live input.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void streamLiveInputsListAllOutputsAssociatedWithASpecifiedLiveInputTest() throws ApiException {
        String liveInputIdentifier = null;
        String accountId = null;
        StreamOutputResponseCollection response = api.streamLiveInputsListAllOutputsAssociatedWithASpecifiedLiveInput(liveInputIdentifier, accountId);
        // TODO: test validations
    }

    /**
     * List live inputs
     *
     * Lists the live inputs created for an account. To get the credentials needed to stream to a specific live input, request a single live input.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void streamLiveInputsListLiveInputsTest() throws ApiException {
        String accountId = null;
        Boolean includeCounts = null;
        StreamLiveInputResponseCollection response = api.streamLiveInputsListLiveInputs(accountId, includeCounts);
        // TODO: test validations
    }

    /**
     * Retrieve a live input
     *
     * Retrieves details of an existing live input.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void streamLiveInputsRetrieveALiveInputTest() throws ApiException {
        String liveInputIdentifier = null;
        String accountId = null;
        StreamLiveInputResponseSingle response = api.streamLiveInputsRetrieveALiveInput(liveInputIdentifier, accountId);
        // TODO: test validations
    }

    /**
     * Update a live input
     *
     * Updates a specified live input.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void streamLiveInputsUpdateALiveInputTest() throws ApiException {
        String liveInputIdentifier = null;
        String accountId = null;
        StreamUpdateInputRequest streamUpdateInputRequest = null;
        StreamLiveInputResponseSingle response = api.streamLiveInputsUpdateALiveInput(liveInputIdentifier, accountId, streamUpdateInputRequest);
        // TODO: test validations
    }

    /**
     * Update an output
     *
     * Updates the state of an output.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void streamLiveInputsUpdateAnOutputTest() throws ApiException {
        String outputIdentifier = null;
        String liveInputIdentifier = null;
        String accountId = null;
        StreamUpdateOutputRequest streamUpdateOutputRequest = null;
        StreamOutputResponseSingle response = api.streamLiveInputsUpdateAnOutput(outputIdentifier, liveInputIdentifier, accountId, streamUpdateOutputRequest);
        // TODO: test validations
    }

}
