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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.TeamsDevicesCrowdstrikeConfigRequest;
import org.openapitools.client.model.TeamsDevicesIntuneConfigRequest;
import org.openapitools.client.model.TeamsDevicesKolideConfigRequest;
import org.openapitools.client.model.TeamsDevicesSentineloneS2sConfigRequest;
import org.openapitools.client.model.TeamsDevicesTaniumConfigRequest;
import org.openapitools.client.model.TeamsDevicesUptycsConfigRequest;
import org.openapitools.client.model.TeamsDevicesWorkspaceOneConfigRequest;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TeamsDevicesConfigRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(TeamsDevicesConfigRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TeamsDevicesConfigRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TeamsDevicesConfigRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TeamsDevicesWorkspaceOneConfigRequest> adapterTeamsDevicesWorkspaceOneConfigRequest = gson.getDelegateAdapter(this, TypeToken.get(TeamsDevicesWorkspaceOneConfigRequest.class));
            final TypeAdapter<TeamsDevicesCrowdstrikeConfigRequest> adapterTeamsDevicesCrowdstrikeConfigRequest = gson.getDelegateAdapter(this, TypeToken.get(TeamsDevicesCrowdstrikeConfigRequest.class));
            final TypeAdapter<TeamsDevicesUptycsConfigRequest> adapterTeamsDevicesUptycsConfigRequest = gson.getDelegateAdapter(this, TypeToken.get(TeamsDevicesUptycsConfigRequest.class));
            final TypeAdapter<TeamsDevicesIntuneConfigRequest> adapterTeamsDevicesIntuneConfigRequest = gson.getDelegateAdapter(this, TypeToken.get(TeamsDevicesIntuneConfigRequest.class));
            final TypeAdapter<TeamsDevicesKolideConfigRequest> adapterTeamsDevicesKolideConfigRequest = gson.getDelegateAdapter(this, TypeToken.get(TeamsDevicesKolideConfigRequest.class));
            final TypeAdapter<TeamsDevicesTaniumConfigRequest> adapterTeamsDevicesTaniumConfigRequest = gson.getDelegateAdapter(this, TypeToken.get(TeamsDevicesTaniumConfigRequest.class));
            final TypeAdapter<TeamsDevicesSentineloneS2sConfigRequest> adapterTeamsDevicesSentineloneS2sConfigRequest = gson.getDelegateAdapter(this, TypeToken.get(TeamsDevicesSentineloneS2sConfigRequest.class));

            return (TypeAdapter<T>) new TypeAdapter<TeamsDevicesConfigRequest>() {
                @Override
                public void write(JsonWriter out, TeamsDevicesConfigRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `TeamsDevicesWorkspaceOneConfigRequest`
                    if (value.getActualInstance() instanceof TeamsDevicesWorkspaceOneConfigRequest) {
                        JsonElement element = adapterTeamsDevicesWorkspaceOneConfigRequest.toJsonTree((TeamsDevicesWorkspaceOneConfigRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `TeamsDevicesCrowdstrikeConfigRequest`
                    if (value.getActualInstance() instanceof TeamsDevicesCrowdstrikeConfigRequest) {
                        JsonElement element = adapterTeamsDevicesCrowdstrikeConfigRequest.toJsonTree((TeamsDevicesCrowdstrikeConfigRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `TeamsDevicesUptycsConfigRequest`
                    if (value.getActualInstance() instanceof TeamsDevicesUptycsConfigRequest) {
                        JsonElement element = adapterTeamsDevicesUptycsConfigRequest.toJsonTree((TeamsDevicesUptycsConfigRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `TeamsDevicesIntuneConfigRequest`
                    if (value.getActualInstance() instanceof TeamsDevicesIntuneConfigRequest) {
                        JsonElement element = adapterTeamsDevicesIntuneConfigRequest.toJsonTree((TeamsDevicesIntuneConfigRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `TeamsDevicesKolideConfigRequest`
                    if (value.getActualInstance() instanceof TeamsDevicesKolideConfigRequest) {
                        JsonElement element = adapterTeamsDevicesKolideConfigRequest.toJsonTree((TeamsDevicesKolideConfigRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `TeamsDevicesTaniumConfigRequest`
                    if (value.getActualInstance() instanceof TeamsDevicesTaniumConfigRequest) {
                        JsonElement element = adapterTeamsDevicesTaniumConfigRequest.toJsonTree((TeamsDevicesTaniumConfigRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `TeamsDevicesSentineloneS2sConfigRequest`
                    if (value.getActualInstance() instanceof TeamsDevicesSentineloneS2sConfigRequest) {
                        JsonElement element = adapterTeamsDevicesSentineloneS2sConfigRequest.toJsonTree((TeamsDevicesSentineloneS2sConfigRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: TeamsDevicesCrowdstrikeConfigRequest, TeamsDevicesIntuneConfigRequest, TeamsDevicesKolideConfigRequest, TeamsDevicesSentineloneS2sConfigRequest, TeamsDevicesTaniumConfigRequest, TeamsDevicesUptycsConfigRequest, TeamsDevicesWorkspaceOneConfigRequest");
                }

                @Override
                public TeamsDevicesConfigRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize TeamsDevicesWorkspaceOneConfigRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TeamsDevicesWorkspaceOneConfigRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterTeamsDevicesWorkspaceOneConfigRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TeamsDevicesWorkspaceOneConfigRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TeamsDevicesWorkspaceOneConfigRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TeamsDevicesWorkspaceOneConfigRequest'", e);
                    }
                    // deserialize TeamsDevicesCrowdstrikeConfigRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TeamsDevicesCrowdstrikeConfigRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterTeamsDevicesCrowdstrikeConfigRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TeamsDevicesCrowdstrikeConfigRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TeamsDevicesCrowdstrikeConfigRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TeamsDevicesCrowdstrikeConfigRequest'", e);
                    }
                    // deserialize TeamsDevicesUptycsConfigRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TeamsDevicesUptycsConfigRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterTeamsDevicesUptycsConfigRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TeamsDevicesUptycsConfigRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TeamsDevicesUptycsConfigRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TeamsDevicesUptycsConfigRequest'", e);
                    }
                    // deserialize TeamsDevicesIntuneConfigRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TeamsDevicesIntuneConfigRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterTeamsDevicesIntuneConfigRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TeamsDevicesIntuneConfigRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TeamsDevicesIntuneConfigRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TeamsDevicesIntuneConfigRequest'", e);
                    }
                    // deserialize TeamsDevicesKolideConfigRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TeamsDevicesKolideConfigRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterTeamsDevicesKolideConfigRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TeamsDevicesKolideConfigRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TeamsDevicesKolideConfigRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TeamsDevicesKolideConfigRequest'", e);
                    }
                    // deserialize TeamsDevicesTaniumConfigRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TeamsDevicesTaniumConfigRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterTeamsDevicesTaniumConfigRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TeamsDevicesTaniumConfigRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TeamsDevicesTaniumConfigRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TeamsDevicesTaniumConfigRequest'", e);
                    }
                    // deserialize TeamsDevicesSentineloneS2sConfigRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TeamsDevicesSentineloneS2sConfigRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterTeamsDevicesSentineloneS2sConfigRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TeamsDevicesSentineloneS2sConfigRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TeamsDevicesSentineloneS2sConfigRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TeamsDevicesSentineloneS2sConfigRequest'", e);
                    }

                    if (match == 1) {
                        TeamsDevicesConfigRequest ret = new TeamsDevicesConfigRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for TeamsDevicesConfigRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public TeamsDevicesConfigRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public TeamsDevicesConfigRequest(TeamsDevicesCrowdstrikeConfigRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TeamsDevicesConfigRequest(TeamsDevicesIntuneConfigRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TeamsDevicesConfigRequest(TeamsDevicesKolideConfigRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TeamsDevicesConfigRequest(TeamsDevicesSentineloneS2sConfigRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TeamsDevicesConfigRequest(TeamsDevicesTaniumConfigRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TeamsDevicesConfigRequest(TeamsDevicesUptycsConfigRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TeamsDevicesConfigRequest(TeamsDevicesWorkspaceOneConfigRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TeamsDevicesWorkspaceOneConfigRequest", TeamsDevicesWorkspaceOneConfigRequest.class);
        schemas.put("TeamsDevicesCrowdstrikeConfigRequest", TeamsDevicesCrowdstrikeConfigRequest.class);
        schemas.put("TeamsDevicesUptycsConfigRequest", TeamsDevicesUptycsConfigRequest.class);
        schemas.put("TeamsDevicesIntuneConfigRequest", TeamsDevicesIntuneConfigRequest.class);
        schemas.put("TeamsDevicesKolideConfigRequest", TeamsDevicesKolideConfigRequest.class);
        schemas.put("TeamsDevicesTaniumConfigRequest", TeamsDevicesTaniumConfigRequest.class);
        schemas.put("TeamsDevicesSentineloneS2sConfigRequest", TeamsDevicesSentineloneS2sConfigRequest.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return TeamsDevicesConfigRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * TeamsDevicesCrowdstrikeConfigRequest, TeamsDevicesIntuneConfigRequest, TeamsDevicesKolideConfigRequest, TeamsDevicesSentineloneS2sConfigRequest, TeamsDevicesTaniumConfigRequest, TeamsDevicesUptycsConfigRequest, TeamsDevicesWorkspaceOneConfigRequest
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof TeamsDevicesWorkspaceOneConfigRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TeamsDevicesCrowdstrikeConfigRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TeamsDevicesUptycsConfigRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TeamsDevicesIntuneConfigRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TeamsDevicesKolideConfigRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TeamsDevicesTaniumConfigRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TeamsDevicesSentineloneS2sConfigRequest) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be TeamsDevicesCrowdstrikeConfigRequest, TeamsDevicesIntuneConfigRequest, TeamsDevicesKolideConfigRequest, TeamsDevicesSentineloneS2sConfigRequest, TeamsDevicesTaniumConfigRequest, TeamsDevicesUptycsConfigRequest, TeamsDevicesWorkspaceOneConfigRequest");
    }

    /**
     * Get the actual instance, which can be the following:
     * TeamsDevicesCrowdstrikeConfigRequest, TeamsDevicesIntuneConfigRequest, TeamsDevicesKolideConfigRequest, TeamsDevicesSentineloneS2sConfigRequest, TeamsDevicesTaniumConfigRequest, TeamsDevicesUptycsConfigRequest, TeamsDevicesWorkspaceOneConfigRequest
     *
     * @return The actual instance (TeamsDevicesCrowdstrikeConfigRequest, TeamsDevicesIntuneConfigRequest, TeamsDevicesKolideConfigRequest, TeamsDevicesSentineloneS2sConfigRequest, TeamsDevicesTaniumConfigRequest, TeamsDevicesUptycsConfigRequest, TeamsDevicesWorkspaceOneConfigRequest)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TeamsDevicesWorkspaceOneConfigRequest`. If the actual instance is not `TeamsDevicesWorkspaceOneConfigRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TeamsDevicesWorkspaceOneConfigRequest`
     * @throws ClassCastException if the instance is not `TeamsDevicesWorkspaceOneConfigRequest`
     */
    public TeamsDevicesWorkspaceOneConfigRequest getTeamsDevicesWorkspaceOneConfigRequest() throws ClassCastException {
        return (TeamsDevicesWorkspaceOneConfigRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TeamsDevicesCrowdstrikeConfigRequest`. If the actual instance is not `TeamsDevicesCrowdstrikeConfigRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TeamsDevicesCrowdstrikeConfigRequest`
     * @throws ClassCastException if the instance is not `TeamsDevicesCrowdstrikeConfigRequest`
     */
    public TeamsDevicesCrowdstrikeConfigRequest getTeamsDevicesCrowdstrikeConfigRequest() throws ClassCastException {
        return (TeamsDevicesCrowdstrikeConfigRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TeamsDevicesUptycsConfigRequest`. If the actual instance is not `TeamsDevicesUptycsConfigRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TeamsDevicesUptycsConfigRequest`
     * @throws ClassCastException if the instance is not `TeamsDevicesUptycsConfigRequest`
     */
    public TeamsDevicesUptycsConfigRequest getTeamsDevicesUptycsConfigRequest() throws ClassCastException {
        return (TeamsDevicesUptycsConfigRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TeamsDevicesIntuneConfigRequest`. If the actual instance is not `TeamsDevicesIntuneConfigRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TeamsDevicesIntuneConfigRequest`
     * @throws ClassCastException if the instance is not `TeamsDevicesIntuneConfigRequest`
     */
    public TeamsDevicesIntuneConfigRequest getTeamsDevicesIntuneConfigRequest() throws ClassCastException {
        return (TeamsDevicesIntuneConfigRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TeamsDevicesKolideConfigRequest`. If the actual instance is not `TeamsDevicesKolideConfigRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TeamsDevicesKolideConfigRequest`
     * @throws ClassCastException if the instance is not `TeamsDevicesKolideConfigRequest`
     */
    public TeamsDevicesKolideConfigRequest getTeamsDevicesKolideConfigRequest() throws ClassCastException {
        return (TeamsDevicesKolideConfigRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TeamsDevicesTaniumConfigRequest`. If the actual instance is not `TeamsDevicesTaniumConfigRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TeamsDevicesTaniumConfigRequest`
     * @throws ClassCastException if the instance is not `TeamsDevicesTaniumConfigRequest`
     */
    public TeamsDevicesTaniumConfigRequest getTeamsDevicesTaniumConfigRequest() throws ClassCastException {
        return (TeamsDevicesTaniumConfigRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TeamsDevicesSentineloneS2sConfigRequest`. If the actual instance is not `TeamsDevicesSentineloneS2sConfigRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TeamsDevicesSentineloneS2sConfigRequest`
     * @throws ClassCastException if the instance is not `TeamsDevicesSentineloneS2sConfigRequest`
     */
    public TeamsDevicesSentineloneS2sConfigRequest getTeamsDevicesSentineloneS2sConfigRequest() throws ClassCastException {
        return (TeamsDevicesSentineloneS2sConfigRequest)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to TeamsDevicesConfigRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with TeamsDevicesWorkspaceOneConfigRequest
        try {
            TeamsDevicesWorkspaceOneConfigRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TeamsDevicesWorkspaceOneConfigRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TeamsDevicesCrowdstrikeConfigRequest
        try {
            TeamsDevicesCrowdstrikeConfigRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TeamsDevicesCrowdstrikeConfigRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TeamsDevicesUptycsConfigRequest
        try {
            TeamsDevicesUptycsConfigRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TeamsDevicesUptycsConfigRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TeamsDevicesIntuneConfigRequest
        try {
            TeamsDevicesIntuneConfigRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TeamsDevicesIntuneConfigRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TeamsDevicesKolideConfigRequest
        try {
            TeamsDevicesKolideConfigRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TeamsDevicesKolideConfigRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TeamsDevicesTaniumConfigRequest
        try {
            TeamsDevicesTaniumConfigRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TeamsDevicesTaniumConfigRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TeamsDevicesSentineloneS2sConfigRequest
        try {
            TeamsDevicesSentineloneS2sConfigRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TeamsDevicesSentineloneS2sConfigRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for TeamsDevicesConfigRequest with oneOf schemas: TeamsDevicesCrowdstrikeConfigRequest, TeamsDevicesIntuneConfigRequest, TeamsDevicesKolideConfigRequest, TeamsDevicesSentineloneS2sConfigRequest, TeamsDevicesTaniumConfigRequest, TeamsDevicesUptycsConfigRequest, TeamsDevicesWorkspaceOneConfigRequest. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of TeamsDevicesConfigRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of TeamsDevicesConfigRequest
     * @throws IOException if the JSON string is invalid with respect to TeamsDevicesConfigRequest
     */
    public static TeamsDevicesConfigRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, TeamsDevicesConfigRequest.class);
    }

    /**
     * Convert an instance of TeamsDevicesConfigRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
