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
import org.openapitools.client.model.BotManagementBmSubscriptionConfig;
import org.openapitools.client.model.BotManagementBotFightModeConfig;
import org.openapitools.client.model.BotManagementSbfmDefinitelyAutomated;
import org.openapitools.client.model.BotManagementSbfmDefinitelyConfig;
import org.openapitools.client.model.BotManagementSbfmLikelyAutomated;
import org.openapitools.client.model.BotManagementSbfmLikelyConfig;
import org.openapitools.client.model.BotManagementSbfmVerifiedBots;



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
public class BotManagementBotManagementResponseBodyAllOfResult extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(BotManagementBotManagementResponseBodyAllOfResult.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!BotManagementBotManagementResponseBodyAllOfResult.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'BotManagementBotManagementResponseBodyAllOfResult' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<BotManagementBotFightModeConfig> adapterBotManagementBotFightModeConfig = gson.getDelegateAdapter(this, TypeToken.get(BotManagementBotFightModeConfig.class));
            final TypeAdapter<BotManagementSbfmDefinitelyConfig> adapterBotManagementSbfmDefinitelyConfig = gson.getDelegateAdapter(this, TypeToken.get(BotManagementSbfmDefinitelyConfig.class));
            final TypeAdapter<BotManagementSbfmLikelyConfig> adapterBotManagementSbfmLikelyConfig = gson.getDelegateAdapter(this, TypeToken.get(BotManagementSbfmLikelyConfig.class));
            final TypeAdapter<BotManagementBmSubscriptionConfig> adapterBotManagementBmSubscriptionConfig = gson.getDelegateAdapter(this, TypeToken.get(BotManagementBmSubscriptionConfig.class));

            return (TypeAdapter<T>) new TypeAdapter<BotManagementBotManagementResponseBodyAllOfResult>() {
                @Override
                public void write(JsonWriter out, BotManagementBotManagementResponseBodyAllOfResult value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `BotManagementBotFightModeConfig`
                    if (value.getActualInstance() instanceof BotManagementBotFightModeConfig) {
                        JsonElement element = adapterBotManagementBotFightModeConfig.toJsonTree((BotManagementBotFightModeConfig)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `BotManagementSbfmDefinitelyConfig`
                    if (value.getActualInstance() instanceof BotManagementSbfmDefinitelyConfig) {
                        JsonElement element = adapterBotManagementSbfmDefinitelyConfig.toJsonTree((BotManagementSbfmDefinitelyConfig)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `BotManagementSbfmLikelyConfig`
                    if (value.getActualInstance() instanceof BotManagementSbfmLikelyConfig) {
                        JsonElement element = adapterBotManagementSbfmLikelyConfig.toJsonTree((BotManagementSbfmLikelyConfig)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `BotManagementBmSubscriptionConfig`
                    if (value.getActualInstance() instanceof BotManagementBmSubscriptionConfig) {
                        JsonElement element = adapterBotManagementBmSubscriptionConfig.toJsonTree((BotManagementBmSubscriptionConfig)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: BotManagementBmSubscriptionConfig, BotManagementBotFightModeConfig, BotManagementSbfmDefinitelyConfig, BotManagementSbfmLikelyConfig");
                }

                @Override
                public BotManagementBotManagementResponseBodyAllOfResult read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize BotManagementBotFightModeConfig
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BotManagementBotFightModeConfig.validateJsonElement(jsonElement);
                        actualAdapter = adapterBotManagementBotFightModeConfig;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BotManagementBotFightModeConfig'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BotManagementBotFightModeConfig failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BotManagementBotFightModeConfig'", e);
                    }
                    // deserialize BotManagementSbfmDefinitelyConfig
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BotManagementSbfmDefinitelyConfig.validateJsonElement(jsonElement);
                        actualAdapter = adapterBotManagementSbfmDefinitelyConfig;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BotManagementSbfmDefinitelyConfig'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BotManagementSbfmDefinitelyConfig failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BotManagementSbfmDefinitelyConfig'", e);
                    }
                    // deserialize BotManagementSbfmLikelyConfig
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BotManagementSbfmLikelyConfig.validateJsonElement(jsonElement);
                        actualAdapter = adapterBotManagementSbfmLikelyConfig;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BotManagementSbfmLikelyConfig'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BotManagementSbfmLikelyConfig failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BotManagementSbfmLikelyConfig'", e);
                    }
                    // deserialize BotManagementBmSubscriptionConfig
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BotManagementBmSubscriptionConfig.validateJsonElement(jsonElement);
                        actualAdapter = adapterBotManagementBmSubscriptionConfig;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BotManagementBmSubscriptionConfig'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BotManagementBmSubscriptionConfig failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BotManagementBmSubscriptionConfig'", e);
                    }

                    if (match == 1) {
                        BotManagementBotManagementResponseBodyAllOfResult ret = new BotManagementBotManagementResponseBodyAllOfResult();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for BotManagementBotManagementResponseBodyAllOfResult: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public BotManagementBotManagementResponseBodyAllOfResult() {
        super("oneOf", Boolean.FALSE);
    }

    public BotManagementBotManagementResponseBodyAllOfResult(BotManagementBmSubscriptionConfig o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public BotManagementBotManagementResponseBodyAllOfResult(BotManagementBotFightModeConfig o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public BotManagementBotManagementResponseBodyAllOfResult(BotManagementSbfmDefinitelyConfig o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public BotManagementBotManagementResponseBodyAllOfResult(BotManagementSbfmLikelyConfig o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("BotManagementBotFightModeConfig", BotManagementBotFightModeConfig.class);
        schemas.put("BotManagementSbfmDefinitelyConfig", BotManagementSbfmDefinitelyConfig.class);
        schemas.put("BotManagementSbfmLikelyConfig", BotManagementSbfmLikelyConfig.class);
        schemas.put("BotManagementBmSubscriptionConfig", BotManagementBmSubscriptionConfig.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return BotManagementBotManagementResponseBodyAllOfResult.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * BotManagementBmSubscriptionConfig, BotManagementBotFightModeConfig, BotManagementSbfmDefinitelyConfig, BotManagementSbfmLikelyConfig
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof BotManagementBotFightModeConfig) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof BotManagementSbfmDefinitelyConfig) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof BotManagementSbfmLikelyConfig) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof BotManagementBmSubscriptionConfig) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BotManagementBmSubscriptionConfig, BotManagementBotFightModeConfig, BotManagementSbfmDefinitelyConfig, BotManagementSbfmLikelyConfig");
    }

    /**
     * Get the actual instance, which can be the following:
     * BotManagementBmSubscriptionConfig, BotManagementBotFightModeConfig, BotManagementSbfmDefinitelyConfig, BotManagementSbfmLikelyConfig
     *
     * @return The actual instance (BotManagementBmSubscriptionConfig, BotManagementBotFightModeConfig, BotManagementSbfmDefinitelyConfig, BotManagementSbfmLikelyConfig)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `BotManagementBotFightModeConfig`. If the actual instance is not `BotManagementBotFightModeConfig`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BotManagementBotFightModeConfig`
     * @throws ClassCastException if the instance is not `BotManagementBotFightModeConfig`
     */
    public BotManagementBotFightModeConfig getBotManagementBotFightModeConfig() throws ClassCastException {
        return (BotManagementBotFightModeConfig)super.getActualInstance();
    }
    /**
     * Get the actual instance of `BotManagementSbfmDefinitelyConfig`. If the actual instance is not `BotManagementSbfmDefinitelyConfig`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BotManagementSbfmDefinitelyConfig`
     * @throws ClassCastException if the instance is not `BotManagementSbfmDefinitelyConfig`
     */
    public BotManagementSbfmDefinitelyConfig getBotManagementSbfmDefinitelyConfig() throws ClassCastException {
        return (BotManagementSbfmDefinitelyConfig)super.getActualInstance();
    }
    /**
     * Get the actual instance of `BotManagementSbfmLikelyConfig`. If the actual instance is not `BotManagementSbfmLikelyConfig`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BotManagementSbfmLikelyConfig`
     * @throws ClassCastException if the instance is not `BotManagementSbfmLikelyConfig`
     */
    public BotManagementSbfmLikelyConfig getBotManagementSbfmLikelyConfig() throws ClassCastException {
        return (BotManagementSbfmLikelyConfig)super.getActualInstance();
    }
    /**
     * Get the actual instance of `BotManagementBmSubscriptionConfig`. If the actual instance is not `BotManagementBmSubscriptionConfig`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BotManagementBmSubscriptionConfig`
     * @throws ClassCastException if the instance is not `BotManagementBmSubscriptionConfig`
     */
    public BotManagementBmSubscriptionConfig getBotManagementBmSubscriptionConfig() throws ClassCastException {
        return (BotManagementBmSubscriptionConfig)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to BotManagementBotManagementResponseBodyAllOfResult
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with BotManagementBotFightModeConfig
        try {
            BotManagementBotFightModeConfig.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for BotManagementBotFightModeConfig failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with BotManagementSbfmDefinitelyConfig
        try {
            BotManagementSbfmDefinitelyConfig.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for BotManagementSbfmDefinitelyConfig failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with BotManagementSbfmLikelyConfig
        try {
            BotManagementSbfmLikelyConfig.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for BotManagementSbfmLikelyConfig failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with BotManagementBmSubscriptionConfig
        try {
            BotManagementBmSubscriptionConfig.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for BotManagementBmSubscriptionConfig failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for BotManagementBotManagementResponseBodyAllOfResult with oneOf schemas: BotManagementBmSubscriptionConfig, BotManagementBotFightModeConfig, BotManagementSbfmDefinitelyConfig, BotManagementSbfmLikelyConfig. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of BotManagementBotManagementResponseBodyAllOfResult given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of BotManagementBotManagementResponseBodyAllOfResult
     * @throws IOException if the JSON string is invalid with respect to BotManagementBotManagementResponseBodyAllOfResult
     */
    public static BotManagementBotManagementResponseBodyAllOfResult fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, BotManagementBotManagementResponseBodyAllOfResult.class);
    }

    /**
     * Convert an instance of BotManagementBotManagementResponseBodyAllOfResult to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

