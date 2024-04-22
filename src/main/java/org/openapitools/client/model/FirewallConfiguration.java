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
import org.openapitools.client.model.FirewallAsnConfiguration;
import org.openapitools.client.model.FirewallCidrConfiguration;
import org.openapitools.client.model.FirewallCountryConfiguration;
import org.openapitools.client.model.FirewallIpConfiguration;
import org.openapitools.client.model.FirewallIpv6Configuration;



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
public class FirewallConfiguration extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(FirewallConfiguration.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FirewallConfiguration.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FirewallConfiguration' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FirewallIpConfiguration> adapterFirewallIpConfiguration = gson.getDelegateAdapter(this, TypeToken.get(FirewallIpConfiguration.class));
            final TypeAdapter<FirewallIpv6Configuration> adapterFirewallIpv6Configuration = gson.getDelegateAdapter(this, TypeToken.get(FirewallIpv6Configuration.class));
            final TypeAdapter<FirewallCidrConfiguration> adapterFirewallCidrConfiguration = gson.getDelegateAdapter(this, TypeToken.get(FirewallCidrConfiguration.class));
            final TypeAdapter<FirewallAsnConfiguration> adapterFirewallAsnConfiguration = gson.getDelegateAdapter(this, TypeToken.get(FirewallAsnConfiguration.class));
            final TypeAdapter<FirewallCountryConfiguration> adapterFirewallCountryConfiguration = gson.getDelegateAdapter(this, TypeToken.get(FirewallCountryConfiguration.class));

            return (TypeAdapter<T>) new TypeAdapter<FirewallConfiguration>() {
                @Override
                public void write(JsonWriter out, FirewallConfiguration value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `FirewallIpConfiguration`
                    if (value.getActualInstance() instanceof FirewallIpConfiguration) {
                        JsonElement element = adapterFirewallIpConfiguration.toJsonTree((FirewallIpConfiguration)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `FirewallIpv6Configuration`
                    if (value.getActualInstance() instanceof FirewallIpv6Configuration) {
                        JsonElement element = adapterFirewallIpv6Configuration.toJsonTree((FirewallIpv6Configuration)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `FirewallCidrConfiguration`
                    if (value.getActualInstance() instanceof FirewallCidrConfiguration) {
                        JsonElement element = adapterFirewallCidrConfiguration.toJsonTree((FirewallCidrConfiguration)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `FirewallAsnConfiguration`
                    if (value.getActualInstance() instanceof FirewallAsnConfiguration) {
                        JsonElement element = adapterFirewallAsnConfiguration.toJsonTree((FirewallAsnConfiguration)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `FirewallCountryConfiguration`
                    if (value.getActualInstance() instanceof FirewallCountryConfiguration) {
                        JsonElement element = adapterFirewallCountryConfiguration.toJsonTree((FirewallCountryConfiguration)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: FirewallAsnConfiguration, FirewallCidrConfiguration, FirewallCountryConfiguration, FirewallIpConfiguration, FirewallIpv6Configuration");
                }

                @Override
                public FirewallConfiguration read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize FirewallIpConfiguration
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FirewallIpConfiguration.validateJsonElement(jsonElement);
                        actualAdapter = adapterFirewallIpConfiguration;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'FirewallIpConfiguration'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FirewallIpConfiguration failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FirewallIpConfiguration'", e);
                    }
                    // deserialize FirewallIpv6Configuration
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FirewallIpv6Configuration.validateJsonElement(jsonElement);
                        actualAdapter = adapterFirewallIpv6Configuration;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'FirewallIpv6Configuration'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FirewallIpv6Configuration failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FirewallIpv6Configuration'", e);
                    }
                    // deserialize FirewallCidrConfiguration
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FirewallCidrConfiguration.validateJsonElement(jsonElement);
                        actualAdapter = adapterFirewallCidrConfiguration;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'FirewallCidrConfiguration'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FirewallCidrConfiguration failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FirewallCidrConfiguration'", e);
                    }
                    // deserialize FirewallAsnConfiguration
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FirewallAsnConfiguration.validateJsonElement(jsonElement);
                        actualAdapter = adapterFirewallAsnConfiguration;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'FirewallAsnConfiguration'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FirewallAsnConfiguration failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FirewallAsnConfiguration'", e);
                    }
                    // deserialize FirewallCountryConfiguration
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FirewallCountryConfiguration.validateJsonElement(jsonElement);
                        actualAdapter = adapterFirewallCountryConfiguration;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'FirewallCountryConfiguration'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FirewallCountryConfiguration failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FirewallCountryConfiguration'", e);
                    }

                    if (match == 1) {
                        FirewallConfiguration ret = new FirewallConfiguration();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for FirewallConfiguration: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public FirewallConfiguration() {
        super("oneOf", Boolean.FALSE);
    }

    public FirewallConfiguration(FirewallAsnConfiguration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FirewallConfiguration(FirewallCidrConfiguration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FirewallConfiguration(FirewallCountryConfiguration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FirewallConfiguration(FirewallIpConfiguration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FirewallConfiguration(FirewallIpv6Configuration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("FirewallIpConfiguration", FirewallIpConfiguration.class);
        schemas.put("FirewallIpv6Configuration", FirewallIpv6Configuration.class);
        schemas.put("FirewallCidrConfiguration", FirewallCidrConfiguration.class);
        schemas.put("FirewallAsnConfiguration", FirewallAsnConfiguration.class);
        schemas.put("FirewallCountryConfiguration", FirewallCountryConfiguration.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return FirewallConfiguration.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * FirewallAsnConfiguration, FirewallCidrConfiguration, FirewallCountryConfiguration, FirewallIpConfiguration, FirewallIpv6Configuration
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof FirewallIpConfiguration) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FirewallIpv6Configuration) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FirewallCidrConfiguration) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FirewallAsnConfiguration) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FirewallCountryConfiguration) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be FirewallAsnConfiguration, FirewallCidrConfiguration, FirewallCountryConfiguration, FirewallIpConfiguration, FirewallIpv6Configuration");
    }

    /**
     * Get the actual instance, which can be the following:
     * FirewallAsnConfiguration, FirewallCidrConfiguration, FirewallCountryConfiguration, FirewallIpConfiguration, FirewallIpv6Configuration
     *
     * @return The actual instance (FirewallAsnConfiguration, FirewallCidrConfiguration, FirewallCountryConfiguration, FirewallIpConfiguration, FirewallIpv6Configuration)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `FirewallIpConfiguration`. If the actual instance is not `FirewallIpConfiguration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FirewallIpConfiguration`
     * @throws ClassCastException if the instance is not `FirewallIpConfiguration`
     */
    public FirewallIpConfiguration getFirewallIpConfiguration() throws ClassCastException {
        return (FirewallIpConfiguration)super.getActualInstance();
    }
    /**
     * Get the actual instance of `FirewallIpv6Configuration`. If the actual instance is not `FirewallIpv6Configuration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FirewallIpv6Configuration`
     * @throws ClassCastException if the instance is not `FirewallIpv6Configuration`
     */
    public FirewallIpv6Configuration getFirewallIpv6Configuration() throws ClassCastException {
        return (FirewallIpv6Configuration)super.getActualInstance();
    }
    /**
     * Get the actual instance of `FirewallCidrConfiguration`. If the actual instance is not `FirewallCidrConfiguration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FirewallCidrConfiguration`
     * @throws ClassCastException if the instance is not `FirewallCidrConfiguration`
     */
    public FirewallCidrConfiguration getFirewallCidrConfiguration() throws ClassCastException {
        return (FirewallCidrConfiguration)super.getActualInstance();
    }
    /**
     * Get the actual instance of `FirewallAsnConfiguration`. If the actual instance is not `FirewallAsnConfiguration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FirewallAsnConfiguration`
     * @throws ClassCastException if the instance is not `FirewallAsnConfiguration`
     */
    public FirewallAsnConfiguration getFirewallAsnConfiguration() throws ClassCastException {
        return (FirewallAsnConfiguration)super.getActualInstance();
    }
    /**
     * Get the actual instance of `FirewallCountryConfiguration`. If the actual instance is not `FirewallCountryConfiguration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FirewallCountryConfiguration`
     * @throws ClassCastException if the instance is not `FirewallCountryConfiguration`
     */
    public FirewallCountryConfiguration getFirewallCountryConfiguration() throws ClassCastException {
        return (FirewallCountryConfiguration)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to FirewallConfiguration
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with FirewallIpConfiguration
        try {
            FirewallIpConfiguration.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for FirewallIpConfiguration failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with FirewallIpv6Configuration
        try {
            FirewallIpv6Configuration.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for FirewallIpv6Configuration failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with FirewallCidrConfiguration
        try {
            FirewallCidrConfiguration.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for FirewallCidrConfiguration failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with FirewallAsnConfiguration
        try {
            FirewallAsnConfiguration.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for FirewallAsnConfiguration failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with FirewallCountryConfiguration
        try {
            FirewallCountryConfiguration.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for FirewallCountryConfiguration failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for FirewallConfiguration with oneOf schemas: FirewallAsnConfiguration, FirewallCidrConfiguration, FirewallCountryConfiguration, FirewallIpConfiguration, FirewallIpv6Configuration. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of FirewallConfiguration given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FirewallConfiguration
     * @throws IOException if the JSON string is invalid with respect to FirewallConfiguration
     */
    public static FirewallConfiguration fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FirewallConfiguration.class);
    }

    /**
     * Convert an instance of FirewallConfiguration to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

