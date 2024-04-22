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
import org.openapitools.client.model.FirewallActionParametersRewrite;
import org.openapitools.client.model.FirewallActionParametersRewriteUri;



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
public class FirewallTransformRulesComponentsSchemasActionParameters extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(FirewallTransformRulesComponentsSchemasActionParameters.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FirewallTransformRulesComponentsSchemasActionParameters.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FirewallTransformRulesComponentsSchemasActionParameters' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FirewallActionParametersRewrite> adapterFirewallActionParametersRewrite = gson.getDelegateAdapter(this, TypeToken.get(FirewallActionParametersRewrite.class));

            return (TypeAdapter<T>) new TypeAdapter<FirewallTransformRulesComponentsSchemasActionParameters>() {
                @Override
                public void write(JsonWriter out, FirewallTransformRulesComponentsSchemasActionParameters value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `FirewallActionParametersRewrite`
                    if (value.getActualInstance() instanceof FirewallActionParametersRewrite) {
                        JsonElement element = adapterFirewallActionParametersRewrite.toJsonTree((FirewallActionParametersRewrite)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: FirewallActionParametersRewrite");
                }

                @Override
                public FirewallTransformRulesComponentsSchemasActionParameters read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize FirewallActionParametersRewrite
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FirewallActionParametersRewrite.validateJsonElement(jsonElement);
                        actualAdapter = adapterFirewallActionParametersRewrite;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'FirewallActionParametersRewrite'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FirewallActionParametersRewrite failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FirewallActionParametersRewrite'", e);
                    }

                    if (match == 1) {
                        FirewallTransformRulesComponentsSchemasActionParameters ret = new FirewallTransformRulesComponentsSchemasActionParameters();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for FirewallTransformRulesComponentsSchemasActionParameters: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public FirewallTransformRulesComponentsSchemasActionParameters() {
        super("oneOf", Boolean.FALSE);
    }

    public FirewallTransformRulesComponentsSchemasActionParameters(FirewallActionParametersRewrite o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("FirewallActionParametersRewrite", FirewallActionParametersRewrite.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return FirewallTransformRulesComponentsSchemasActionParameters.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * FirewallActionParametersRewrite
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof FirewallActionParametersRewrite) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be FirewallActionParametersRewrite");
    }

    /**
     * Get the actual instance, which can be the following:
     * FirewallActionParametersRewrite
     *
     * @return The actual instance (FirewallActionParametersRewrite)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `FirewallActionParametersRewrite`. If the actual instance is not `FirewallActionParametersRewrite`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FirewallActionParametersRewrite`
     * @throws ClassCastException if the instance is not `FirewallActionParametersRewrite`
     */
    public FirewallActionParametersRewrite getFirewallActionParametersRewrite() throws ClassCastException {
        return (FirewallActionParametersRewrite)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to FirewallTransformRulesComponentsSchemasActionParameters
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with FirewallActionParametersRewrite
        try {
            FirewallActionParametersRewrite.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for FirewallActionParametersRewrite failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for FirewallTransformRulesComponentsSchemasActionParameters with oneOf schemas: FirewallActionParametersRewrite. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of FirewallTransformRulesComponentsSchemasActionParameters given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FirewallTransformRulesComponentsSchemasActionParameters
     * @throws IOException if the JSON string is invalid with respect to FirewallTransformRulesComponentsSchemasActionParameters
     */
    public static FirewallTransformRulesComponentsSchemasActionParameters fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FirewallTransformRulesComponentsSchemasActionParameters.class);
    }

    /**
     * Convert an instance of FirewallTransformRulesComponentsSchemasActionParameters to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

