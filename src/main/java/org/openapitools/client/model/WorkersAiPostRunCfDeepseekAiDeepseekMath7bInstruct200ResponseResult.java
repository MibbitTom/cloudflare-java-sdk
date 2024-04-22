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
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf;



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
public class WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf> adapterWorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf = gson.getDelegateAdapter(this, TypeToken.get(WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf.class));
            final TypeAdapter<File> adapterFile = gson.getDelegateAdapter(this, TypeToken.get(File.class));

            return (TypeAdapter<T>) new TypeAdapter<WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult>() {
                @Override
                public void write(JsonWriter out, WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf`
                    if (value.getActualInstance() instanceof WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf) {
                        JsonElement element = adapterWorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf.toJsonTree((WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `File`
                    if (value.getActualInstance() instanceof File) {
                        JsonElement element = adapterFile.toJsonTree((File)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: File, WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf");
                }

                @Override
                public WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterWorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf'", e);
                    }
                    // deserialize File
                    try {
                        // validate the JSON object to see if any exception is thrown
                        File.validateJsonElement(jsonElement);
                        actualAdapter = adapterFile;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'File'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for File failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'File'", e);
                    }

                    if (match == 1) {
                        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult ret = new WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult() {
        super("oneOf", Boolean.FALSE);
    }

    public WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult(File o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult(WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf", WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf.class);
        schemas.put("File", File.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * File, WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof File) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be File, WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf");
    }

    /**
     * Get the actual instance, which can be the following:
     * File, WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf
     *
     * @return The actual instance (File, WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf`. If the actual instance is not `WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf`
     * @throws ClassCastException if the instance is not `WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf`
     */
    public WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf getWorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf() throws ClassCastException {
        return (WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf)super.getActualInstance();
    }
    /**
     * Get the actual instance of `File`. If the actual instance is not `File`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `File`
     * @throws ClassCastException if the instance is not `File`
     */
    public File getFile() throws ClassCastException {
        return (File)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf
        try {
            WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with File
        try {
            File.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for File failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult with oneOf schemas: File, WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResultOneOf. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult
     * @throws IOException if the JSON string is invalid with respect to WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult
     */
    public static WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult.class);
    }

    /**
     * Convert an instance of WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200ResponseResult to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

