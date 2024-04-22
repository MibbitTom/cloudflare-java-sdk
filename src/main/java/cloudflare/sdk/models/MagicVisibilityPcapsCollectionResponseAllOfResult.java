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
import cloudflare.sdk.models.MagicVisibilityPcapsFilterV1;
import cloudflare.sdk.models.MagicVisibilityPcapsResponseFull;
import cloudflare.sdk.models.MagicVisibilityPcapsResponseSimple;
import cloudflare.sdk.models.MagicVisibilityPcapsStatus;
import cloudflare.sdk.models.MagicVisibilityPcapsSystem;
import cloudflare.sdk.models.MagicVisibilityPcapsType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
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
public class MagicVisibilityPcapsCollectionResponseAllOfResult extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(MagicVisibilityPcapsCollectionResponseAllOfResult.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!MagicVisibilityPcapsCollectionResponseAllOfResult.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'MagicVisibilityPcapsCollectionResponseAllOfResult' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<MagicVisibilityPcapsResponseSimple> adapterMagicVisibilityPcapsResponseSimple = gson.getDelegateAdapter(this, TypeToken.get(MagicVisibilityPcapsResponseSimple.class));
            final TypeAdapter<MagicVisibilityPcapsResponseFull> adapterMagicVisibilityPcapsResponseFull = gson.getDelegateAdapter(this, TypeToken.get(MagicVisibilityPcapsResponseFull.class));

            return (TypeAdapter<T>) new TypeAdapter<MagicVisibilityPcapsCollectionResponseAllOfResult>() {
                @Override
                public void write(JsonWriter out, MagicVisibilityPcapsCollectionResponseAllOfResult value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `MagicVisibilityPcapsResponseSimple`
                    if (value.getActualInstance() instanceof MagicVisibilityPcapsResponseSimple) {
                        JsonElement element = adapterMagicVisibilityPcapsResponseSimple.toJsonTree((MagicVisibilityPcapsResponseSimple)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `MagicVisibilityPcapsResponseFull`
                    if (value.getActualInstance() instanceof MagicVisibilityPcapsResponseFull) {
                        JsonElement element = adapterMagicVisibilityPcapsResponseFull.toJsonTree((MagicVisibilityPcapsResponseFull)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: MagicVisibilityPcapsResponseFull, MagicVisibilityPcapsResponseSimple");
                }

                @Override
                public MagicVisibilityPcapsCollectionResponseAllOfResult read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize MagicVisibilityPcapsResponseSimple
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MagicVisibilityPcapsResponseSimple.validateJsonElement(jsonElement);
                        actualAdapter = adapterMagicVisibilityPcapsResponseSimple;
                        MagicVisibilityPcapsCollectionResponseAllOfResult ret = new MagicVisibilityPcapsCollectionResponseAllOfResult();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MagicVisibilityPcapsResponseSimple failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MagicVisibilityPcapsResponseSimple'", e);
                    }
                    // deserialize MagicVisibilityPcapsResponseFull
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MagicVisibilityPcapsResponseFull.validateJsonElement(jsonElement);
                        actualAdapter = adapterMagicVisibilityPcapsResponseFull;
                        MagicVisibilityPcapsCollectionResponseAllOfResult ret = new MagicVisibilityPcapsCollectionResponseAllOfResult();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MagicVisibilityPcapsResponseFull failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MagicVisibilityPcapsResponseFull'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for MagicVisibilityPcapsCollectionResponseAllOfResult: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public MagicVisibilityPcapsCollectionResponseAllOfResult() {
        super("anyOf", Boolean.FALSE);
    }

    public MagicVisibilityPcapsCollectionResponseAllOfResult(MagicVisibilityPcapsResponseFull o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public MagicVisibilityPcapsCollectionResponseAllOfResult(MagicVisibilityPcapsResponseSimple o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("MagicVisibilityPcapsResponseSimple", MagicVisibilityPcapsResponseSimple.class);
        schemas.put("MagicVisibilityPcapsResponseFull", MagicVisibilityPcapsResponseFull.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return MagicVisibilityPcapsCollectionResponseAllOfResult.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * MagicVisibilityPcapsResponseFull, MagicVisibilityPcapsResponseSimple
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof MagicVisibilityPcapsResponseSimple) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MagicVisibilityPcapsResponseFull) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be MagicVisibilityPcapsResponseFull, MagicVisibilityPcapsResponseSimple");
    }

    /**
     * Get the actual instance, which can be the following:
     * MagicVisibilityPcapsResponseFull, MagicVisibilityPcapsResponseSimple
     *
     * @return The actual instance (MagicVisibilityPcapsResponseFull, MagicVisibilityPcapsResponseSimple)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `MagicVisibilityPcapsResponseSimple`. If the actual instance is not `MagicVisibilityPcapsResponseSimple`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MagicVisibilityPcapsResponseSimple`
     * @throws ClassCastException if the instance is not `MagicVisibilityPcapsResponseSimple`
     */
    public MagicVisibilityPcapsResponseSimple getMagicVisibilityPcapsResponseSimple() throws ClassCastException {
        return (MagicVisibilityPcapsResponseSimple)super.getActualInstance();
    }
    /**
     * Get the actual instance of `MagicVisibilityPcapsResponseFull`. If the actual instance is not `MagicVisibilityPcapsResponseFull`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MagicVisibilityPcapsResponseFull`
     * @throws ClassCastException if the instance is not `MagicVisibilityPcapsResponseFull`
     */
    public MagicVisibilityPcapsResponseFull getMagicVisibilityPcapsResponseFull() throws ClassCastException {
        return (MagicVisibilityPcapsResponseFull)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to MagicVisibilityPcapsCollectionResponseAllOfResult
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with MagicVisibilityPcapsResponseSimple
        try {
            MagicVisibilityPcapsResponseSimple.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MagicVisibilityPcapsResponseSimple failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with MagicVisibilityPcapsResponseFull
        try {
            MagicVisibilityPcapsResponseFull.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MagicVisibilityPcapsResponseFull failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for MagicVisibilityPcapsCollectionResponseAllOfResult with anyOf schemas: MagicVisibilityPcapsResponseFull, MagicVisibilityPcapsResponseSimple. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of MagicVisibilityPcapsCollectionResponseAllOfResult given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of MagicVisibilityPcapsCollectionResponseAllOfResult
     * @throws IOException if the JSON string is invalid with respect to MagicVisibilityPcapsCollectionResponseAllOfResult
     */
    public static MagicVisibilityPcapsCollectionResponseAllOfResult fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, MagicVisibilityPcapsCollectionResponseAllOfResult.class);
    }

    /**
     * Convert an instance of MagicVisibilityPcapsCollectionResponseAllOfResult to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

