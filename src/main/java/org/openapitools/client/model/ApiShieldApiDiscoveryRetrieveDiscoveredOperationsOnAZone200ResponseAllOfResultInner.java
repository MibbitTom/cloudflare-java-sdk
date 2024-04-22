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
import java.util.UUID;
import org.openapitools.client.model.ApiShieldApiDiscoveryOrigin;
import org.openapitools.client.model.ApiShieldApiDiscoveryState;
import org.openapitools.client.model.ApiShieldDiscoveryOperation;
import org.openapitools.client.model.ApiShieldMethod;
import org.openapitools.client.model.ApiShieldTrafficStats;



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
public class ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ApiShieldDiscoveryOperation> adapterApiShieldDiscoveryOperation = gson.getDelegateAdapter(this, TypeToken.get(ApiShieldDiscoveryOperation.class));

            return (TypeAdapter<T>) new TypeAdapter<ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner>() {
                @Override
                public void write(JsonWriter out, ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ApiShieldDiscoveryOperation`
                    if (value.getActualInstance() instanceof ApiShieldDiscoveryOperation) {
                        JsonElement element = adapterApiShieldDiscoveryOperation.toJsonTree((ApiShieldDiscoveryOperation)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: ApiShieldDiscoveryOperation");
                }

                @Override
                public ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ApiShieldDiscoveryOperation
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ApiShieldDiscoveryOperation.validateJsonElement(jsonElement);
                        actualAdapter = adapterApiShieldDiscoveryOperation;
                        ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner ret = new ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ApiShieldDiscoveryOperation failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ApiShieldDiscoveryOperation'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner() {
        super("anyOf", Boolean.FALSE);
    }

    public ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner(ApiShieldDiscoveryOperation o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ApiShieldDiscoveryOperation", ApiShieldDiscoveryOperation.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * ApiShieldDiscoveryOperation
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ApiShieldDiscoveryOperation) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ApiShieldDiscoveryOperation");
    }

    /**
     * Get the actual instance, which can be the following:
     * ApiShieldDiscoveryOperation
     *
     * @return The actual instance (ApiShieldDiscoveryOperation)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ApiShieldDiscoveryOperation`. If the actual instance is not `ApiShieldDiscoveryOperation`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ApiShieldDiscoveryOperation`
     * @throws ClassCastException if the instance is not `ApiShieldDiscoveryOperation`
     */
    public ApiShieldDiscoveryOperation getApiShieldDiscoveryOperation() throws ClassCastException {
        return (ApiShieldDiscoveryOperation)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with ApiShieldDiscoveryOperation
        try {
            ApiShieldDiscoveryOperation.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ApiShieldDiscoveryOperation failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner with anyOf schemas: ApiShieldDiscoveryOperation. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner
     * @throws IOException if the JSON string is invalid with respect to ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner
     */
    public static ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner.class);
    }

    /**
     * Convert an instance of ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200ResponseAllOfResultInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

