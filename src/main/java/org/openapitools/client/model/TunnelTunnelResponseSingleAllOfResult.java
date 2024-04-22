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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.TunnelCfdTunnel;
import org.openapitools.client.model.TunnelSchemasConnection;
import org.openapitools.client.model.TunnelTunnelType;
import org.openapitools.client.model.TunnelWarpConnectorTunnel;
import org.openapitools.jackson.nullable.JsonNullable;



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
public class TunnelTunnelResponseSingleAllOfResult extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(TunnelTunnelResponseSingleAllOfResult.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TunnelTunnelResponseSingleAllOfResult.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TunnelTunnelResponseSingleAllOfResult' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TunnelCfdTunnel> adapterTunnelCfdTunnel = gson.getDelegateAdapter(this, TypeToken.get(TunnelCfdTunnel.class));
            final TypeAdapter<TunnelWarpConnectorTunnel> adapterTunnelWarpConnectorTunnel = gson.getDelegateAdapter(this, TypeToken.get(TunnelWarpConnectorTunnel.class));

            return (TypeAdapter<T>) new TypeAdapter<TunnelTunnelResponseSingleAllOfResult>() {
                @Override
                public void write(JsonWriter out, TunnelTunnelResponseSingleAllOfResult value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `TunnelCfdTunnel`
                    if (value.getActualInstance() instanceof TunnelCfdTunnel) {
                        JsonElement element = adapterTunnelCfdTunnel.toJsonTree((TunnelCfdTunnel)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `TunnelWarpConnectorTunnel`
                    if (value.getActualInstance() instanceof TunnelWarpConnectorTunnel) {
                        JsonElement element = adapterTunnelWarpConnectorTunnel.toJsonTree((TunnelWarpConnectorTunnel)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: TunnelCfdTunnel, TunnelWarpConnectorTunnel");
                }

                @Override
                public TunnelTunnelResponseSingleAllOfResult read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize TunnelCfdTunnel
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TunnelCfdTunnel.validateJsonElement(jsonElement);
                        actualAdapter = adapterTunnelCfdTunnel;
                        TunnelTunnelResponseSingleAllOfResult ret = new TunnelTunnelResponseSingleAllOfResult();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TunnelCfdTunnel failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TunnelCfdTunnel'", e);
                    }
                    // deserialize TunnelWarpConnectorTunnel
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TunnelWarpConnectorTunnel.validateJsonElement(jsonElement);
                        actualAdapter = adapterTunnelWarpConnectorTunnel;
                        TunnelTunnelResponseSingleAllOfResult ret = new TunnelTunnelResponseSingleAllOfResult();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TunnelWarpConnectorTunnel failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TunnelWarpConnectorTunnel'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for TunnelTunnelResponseSingleAllOfResult: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public TunnelTunnelResponseSingleAllOfResult() {
        super("anyOf", Boolean.FALSE);
    }

    public TunnelTunnelResponseSingleAllOfResult(TunnelCfdTunnel o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TunnelTunnelResponseSingleAllOfResult(TunnelWarpConnectorTunnel o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TunnelCfdTunnel", TunnelCfdTunnel.class);
        schemas.put("TunnelWarpConnectorTunnel", TunnelWarpConnectorTunnel.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return TunnelTunnelResponseSingleAllOfResult.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * TunnelCfdTunnel, TunnelWarpConnectorTunnel
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof TunnelCfdTunnel) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TunnelWarpConnectorTunnel) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be TunnelCfdTunnel, TunnelWarpConnectorTunnel");
    }

    /**
     * Get the actual instance, which can be the following:
     * TunnelCfdTunnel, TunnelWarpConnectorTunnel
     *
     * @return The actual instance (TunnelCfdTunnel, TunnelWarpConnectorTunnel)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TunnelCfdTunnel`. If the actual instance is not `TunnelCfdTunnel`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TunnelCfdTunnel`
     * @throws ClassCastException if the instance is not `TunnelCfdTunnel`
     */
    public TunnelCfdTunnel getTunnelCfdTunnel() throws ClassCastException {
        return (TunnelCfdTunnel)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TunnelWarpConnectorTunnel`. If the actual instance is not `TunnelWarpConnectorTunnel`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TunnelWarpConnectorTunnel`
     * @throws ClassCastException if the instance is not `TunnelWarpConnectorTunnel`
     */
    public TunnelWarpConnectorTunnel getTunnelWarpConnectorTunnel() throws ClassCastException {
        return (TunnelWarpConnectorTunnel)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to TunnelTunnelResponseSingleAllOfResult
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with TunnelCfdTunnel
        try {
            TunnelCfdTunnel.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TunnelCfdTunnel failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TunnelWarpConnectorTunnel
        try {
            TunnelWarpConnectorTunnel.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TunnelWarpConnectorTunnel failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for TunnelTunnelResponseSingleAllOfResult with anyOf schemas: TunnelCfdTunnel, TunnelWarpConnectorTunnel. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of TunnelTunnelResponseSingleAllOfResult given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of TunnelTunnelResponseSingleAllOfResult
     * @throws IOException if the JSON string is invalid with respect to TunnelTunnelResponseSingleAllOfResult
     */
    public static TunnelTunnelResponseSingleAllOfResult fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, TunnelTunnelResponseSingleAllOfResult.class);
    }

    /**
     * Convert an instance of TunnelTunnelResponseSingleAllOfResult to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

