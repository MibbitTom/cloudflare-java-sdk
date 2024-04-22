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
import java.math.BigDecimal;



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
public class EmailDnsRecordTtl extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(EmailDnsRecordTtl.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EmailDnsRecordTtl.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'EmailDnsRecordTtl' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<BigDecimal> adapterBigDecimal = gson.getDelegateAdapter(this, TypeToken.get(BigDecimal.class));

            return (TypeAdapter<T>) new TypeAdapter<EmailDnsRecordTtl>() {
                @Override
                public void write(JsonWriter out, EmailDnsRecordTtl value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `BigDecimal`
                    if (value.getActualInstance() instanceof BigDecimal) {
                        JsonElement element = adapterBigDecimal.toJsonTree((BigDecimal)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: BigDecimal");
                }

                @Override
                public EmailDnsRecordTtl read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize BigDecimal
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.getAsJsonPrimitive().isNumber()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be of type Number in the JSON string but got `%s`", jsonElement.toString()));
                        }
                        actualAdapter = adapterBigDecimal;
                        EmailDnsRecordTtl ret = new EmailDnsRecordTtl();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BigDecimal failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BigDecimal'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for EmailDnsRecordTtl: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public EmailDnsRecordTtl() {
        super("anyOf", Boolean.FALSE);
    }

    public EmailDnsRecordTtl(BigDecimal o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("BigDecimal", BigDecimal.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return EmailDnsRecordTtl.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * BigDecimal
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof BigDecimal) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BigDecimal");
    }

    /**
     * Get the actual instance, which can be the following:
     * BigDecimal
     *
     * @return The actual instance (BigDecimal)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `BigDecimal`. If the actual instance is not `BigDecimal`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BigDecimal`
     * @throws ClassCastException if the instance is not `BigDecimal`
     */
    public BigDecimal getBigDecimal() throws ClassCastException {
        return (BigDecimal)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to EmailDnsRecordTtl
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with BigDecimal
        try {
            if (!jsonElement.getAsJsonPrimitive().isNumber()) {
                throw new IllegalArgumentException(String.format("Expected json element to be of type Number in the JSON string but got `%s`", jsonElement.toString()));
            }
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for BigDecimal failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for EmailDnsRecordTtl with anyOf schemas: BigDecimal. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of EmailDnsRecordTtl given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of EmailDnsRecordTtl
     * @throws IOException if the JSON string is invalid with respect to EmailDnsRecordTtl
     */
    public static EmailDnsRecordTtl fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, EmailDnsRecordTtl.class);
    }

    /**
     * Convert an instance of EmailDnsRecordTtl to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

