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


package cloudflare.sdk.models;

import java.util.Objects;
import cloudflare.sdk.models.DynamicHeader;
import cloudflare.sdk.models.RemoveHeader;
import cloudflare.sdk.models.StaticHeader;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;



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

import cloudflare.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RewriteRuleActionParametersHeaders extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RewriteRuleActionParametersHeaders.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RewriteRuleActionParametersHeaders.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RewriteRuleActionParametersHeaders' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RemoveHeader> adapterRemoveHeader = gson.getDelegateAdapter(this, TypeToken.get(RemoveHeader.class));
            final TypeAdapter<StaticHeader> adapterStaticHeader = gson.getDelegateAdapter(this, TypeToken.get(StaticHeader.class));
            final TypeAdapter<DynamicHeader> adapterDynamicHeader = gson.getDelegateAdapter(this, TypeToken.get(DynamicHeader.class));

            return (TypeAdapter<T>) new TypeAdapter<RewriteRuleActionParametersHeaders>() {
                @Override
                public void write(JsonWriter out, RewriteRuleActionParametersHeaders value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `RemoveHeader`
                    if (value.getActualInstance() instanceof RemoveHeader) {
                        JsonElement element = adapterRemoveHeader.toJsonTree((RemoveHeader)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `StaticHeader`
                    if (value.getActualInstance() instanceof StaticHeader) {
                        JsonElement element = adapterStaticHeader.toJsonTree((StaticHeader)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `DynamicHeader`
                    if (value.getActualInstance() instanceof DynamicHeader) {
                        JsonElement element = adapterDynamicHeader.toJsonTree((DynamicHeader)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: DynamicHeader, RemoveHeader, StaticHeader");
                }

                @Override
                public RewriteRuleActionParametersHeaders read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize RemoveHeader
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RemoveHeader.validateJsonElement(jsonElement);
                        actualAdapter = adapterRemoveHeader;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RemoveHeader'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RemoveHeader failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RemoveHeader'", e);
                    }
                    // deserialize StaticHeader
                    try {
                        // validate the JSON object to see if any exception is thrown
                        StaticHeader.validateJsonElement(jsonElement);
                        actualAdapter = adapterStaticHeader;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'StaticHeader'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for StaticHeader failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'StaticHeader'", e);
                    }
                    // deserialize DynamicHeader
                    try {
                        // validate the JSON object to see if any exception is thrown
                        DynamicHeader.validateJsonElement(jsonElement);
                        actualAdapter = adapterDynamicHeader;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'DynamicHeader'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for DynamicHeader failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'DynamicHeader'", e);
                    }

                    if (match == 1) {
                        RewriteRuleActionParametersHeaders ret = new RewriteRuleActionParametersHeaders();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for RewriteRuleActionParametersHeaders: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public RewriteRuleActionParametersHeaders() {
        super("oneOf", Boolean.FALSE);
    }

    public RewriteRuleActionParametersHeaders(DynamicHeader o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RewriteRuleActionParametersHeaders(RemoveHeader o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RewriteRuleActionParametersHeaders(StaticHeader o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("RemoveHeader", RemoveHeader.class);
        schemas.put("StaticHeader", StaticHeader.class);
        schemas.put("DynamicHeader", DynamicHeader.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return RewriteRuleActionParametersHeaders.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * DynamicHeader, RemoveHeader, StaticHeader
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof RemoveHeader) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof StaticHeader) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof DynamicHeader) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be DynamicHeader, RemoveHeader, StaticHeader");
    }

    /**
     * Get the actual instance, which can be the following:
     * DynamicHeader, RemoveHeader, StaticHeader
     *
     * @return The actual instance (DynamicHeader, RemoveHeader, StaticHeader)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `RemoveHeader`. If the actual instance is not `RemoveHeader`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RemoveHeader`
     * @throws ClassCastException if the instance is not `RemoveHeader`
     */
    public RemoveHeader getRemoveHeader() throws ClassCastException {
        return (RemoveHeader)super.getActualInstance();
    }
    /**
     * Get the actual instance of `StaticHeader`. If the actual instance is not `StaticHeader`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `StaticHeader`
     * @throws ClassCastException if the instance is not `StaticHeader`
     */
    public StaticHeader getStaticHeader() throws ClassCastException {
        return (StaticHeader)super.getActualInstance();
    }
    /**
     * Get the actual instance of `DynamicHeader`. If the actual instance is not `DynamicHeader`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DynamicHeader`
     * @throws ClassCastException if the instance is not `DynamicHeader`
     */
    public DynamicHeader getDynamicHeader() throws ClassCastException {
        return (DynamicHeader)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to RewriteRuleActionParametersHeaders
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with RemoveHeader
        try {
            RemoveHeader.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RemoveHeader failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with StaticHeader
        try {
            StaticHeader.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for StaticHeader failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with DynamicHeader
        try {
            DynamicHeader.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for DynamicHeader failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for RewriteRuleActionParametersHeaders with oneOf schemas: DynamicHeader, RemoveHeader, StaticHeader. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of RewriteRuleActionParametersHeaders given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RewriteRuleActionParametersHeaders
     * @throws IOException if the JSON string is invalid with respect to RewriteRuleActionParametersHeaders
     */
    public static RewriteRuleActionParametersHeaders fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RewriteRuleActionParametersHeaders.class);
    }

    /**
     * Convert an instance of RewriteRuleActionParametersHeaders to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
