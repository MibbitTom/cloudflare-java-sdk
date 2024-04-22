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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.LegacyJhsEdgeIpsOneOf;
import org.openapitools.client.model.LegacyJhsEdgeIpsOneOf1;



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

import invalidPackageName.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class LegacyJhsEdgeIps extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(LegacyJhsEdgeIps.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!LegacyJhsEdgeIps.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'LegacyJhsEdgeIps' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LegacyJhsEdgeIpsOneOf> adapterLegacyJhsEdgeIpsOneOf = gson.getDelegateAdapter(this, TypeToken.get(LegacyJhsEdgeIpsOneOf.class));
            final TypeAdapter<LegacyJhsEdgeIpsOneOf1> adapterLegacyJhsEdgeIpsOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(LegacyJhsEdgeIpsOneOf1.class));

            return (TypeAdapter<T>) new TypeAdapter<LegacyJhsEdgeIps>() {
                @Override
                public void write(JsonWriter out, LegacyJhsEdgeIps value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `LegacyJhsEdgeIpsOneOf`
                    if (value.getActualInstance() instanceof LegacyJhsEdgeIpsOneOf) {
                        JsonElement element = adapterLegacyJhsEdgeIpsOneOf.toJsonTree((LegacyJhsEdgeIpsOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `LegacyJhsEdgeIpsOneOf1`
                    if (value.getActualInstance() instanceof LegacyJhsEdgeIpsOneOf1) {
                        JsonElement element = adapterLegacyJhsEdgeIpsOneOf1.toJsonTree((LegacyJhsEdgeIpsOneOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: LegacyJhsEdgeIpsOneOf, LegacyJhsEdgeIpsOneOf1");
                }

                @Override
                public LegacyJhsEdgeIps read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize LegacyJhsEdgeIpsOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        LegacyJhsEdgeIpsOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterLegacyJhsEdgeIpsOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'LegacyJhsEdgeIpsOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for LegacyJhsEdgeIpsOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'LegacyJhsEdgeIpsOneOf'", e);
                    }
                    // deserialize LegacyJhsEdgeIpsOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        LegacyJhsEdgeIpsOneOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterLegacyJhsEdgeIpsOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'LegacyJhsEdgeIpsOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for LegacyJhsEdgeIpsOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'LegacyJhsEdgeIpsOneOf1'", e);
                    }

                    if (match == 1) {
                        LegacyJhsEdgeIps ret = new LegacyJhsEdgeIps();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for LegacyJhsEdgeIps: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public LegacyJhsEdgeIps() {
        super("oneOf", Boolean.FALSE);
    }

    public LegacyJhsEdgeIps(LegacyJhsEdgeIpsOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public LegacyJhsEdgeIps(LegacyJhsEdgeIpsOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("LegacyJhsEdgeIpsOneOf", LegacyJhsEdgeIpsOneOf.class);
        schemas.put("LegacyJhsEdgeIpsOneOf1", LegacyJhsEdgeIpsOneOf1.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return LegacyJhsEdgeIps.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * LegacyJhsEdgeIpsOneOf, LegacyJhsEdgeIpsOneOf1
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof LegacyJhsEdgeIpsOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof LegacyJhsEdgeIpsOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be LegacyJhsEdgeIpsOneOf, LegacyJhsEdgeIpsOneOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * LegacyJhsEdgeIpsOneOf, LegacyJhsEdgeIpsOneOf1
     *
     * @return The actual instance (LegacyJhsEdgeIpsOneOf, LegacyJhsEdgeIpsOneOf1)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `LegacyJhsEdgeIpsOneOf`. If the actual instance is not `LegacyJhsEdgeIpsOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LegacyJhsEdgeIpsOneOf`
     * @throws ClassCastException if the instance is not `LegacyJhsEdgeIpsOneOf`
     */
    public LegacyJhsEdgeIpsOneOf getLegacyJhsEdgeIpsOneOf() throws ClassCastException {
        return (LegacyJhsEdgeIpsOneOf)super.getActualInstance();
    }
    /**
     * Get the actual instance of `LegacyJhsEdgeIpsOneOf1`. If the actual instance is not `LegacyJhsEdgeIpsOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LegacyJhsEdgeIpsOneOf1`
     * @throws ClassCastException if the instance is not `LegacyJhsEdgeIpsOneOf1`
     */
    public LegacyJhsEdgeIpsOneOf1 getLegacyJhsEdgeIpsOneOf1() throws ClassCastException {
        return (LegacyJhsEdgeIpsOneOf1)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to LegacyJhsEdgeIps
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with LegacyJhsEdgeIpsOneOf
        try {
            LegacyJhsEdgeIpsOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for LegacyJhsEdgeIpsOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with LegacyJhsEdgeIpsOneOf1
        try {
            LegacyJhsEdgeIpsOneOf1.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for LegacyJhsEdgeIpsOneOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for LegacyJhsEdgeIps with oneOf schemas: LegacyJhsEdgeIpsOneOf, LegacyJhsEdgeIpsOneOf1. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of LegacyJhsEdgeIps given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of LegacyJhsEdgeIps
     * @throws IOException if the JSON string is invalid with respect to LegacyJhsEdgeIps
     */
    public static LegacyJhsEdgeIps fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, LegacyJhsEdgeIps.class);
    }

    /**
     * Convert an instance of LegacyJhsEdgeIps to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

