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
import cloudflare.sdk.models.WorkersD1Binding;
import cloudflare.sdk.models.WorkersDispatchNamespaceBinding;
import cloudflare.sdk.models.WorkersDispatchNamespaceBindingOutbound;
import cloudflare.sdk.models.WorkersDoBinding;
import cloudflare.sdk.models.WorkersKvNamespaceBinding;
import cloudflare.sdk.models.WorkersMtlsCertBinding;
import cloudflare.sdk.models.WorkersQueueBinding;
import cloudflare.sdk.models.WorkersR2Binding;
import cloudflare.sdk.models.WorkersServiceBinding;
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
public class WorkersBinding extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(WorkersBinding.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WorkersBinding.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WorkersBinding' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WorkersKvNamespaceBinding> adapterWorkersKvNamespaceBinding = gson.getDelegateAdapter(this, TypeToken.get(WorkersKvNamespaceBinding.class));
            final TypeAdapter<WorkersServiceBinding> adapterWorkersServiceBinding = gson.getDelegateAdapter(this, TypeToken.get(WorkersServiceBinding.class));
            final TypeAdapter<WorkersDoBinding> adapterWorkersDoBinding = gson.getDelegateAdapter(this, TypeToken.get(WorkersDoBinding.class));
            final TypeAdapter<WorkersR2Binding> adapterWorkersR2Binding = gson.getDelegateAdapter(this, TypeToken.get(WorkersR2Binding.class));
            final TypeAdapter<WorkersQueueBinding> adapterWorkersQueueBinding = gson.getDelegateAdapter(this, TypeToken.get(WorkersQueueBinding.class));
            final TypeAdapter<WorkersD1Binding> adapterWorkersD1Binding = gson.getDelegateAdapter(this, TypeToken.get(WorkersD1Binding.class));
            final TypeAdapter<WorkersDispatchNamespaceBinding> adapterWorkersDispatchNamespaceBinding = gson.getDelegateAdapter(this, TypeToken.get(WorkersDispatchNamespaceBinding.class));
            final TypeAdapter<WorkersMtlsCertBinding> adapterWorkersMtlsCertBinding = gson.getDelegateAdapter(this, TypeToken.get(WorkersMtlsCertBinding.class));

            return (TypeAdapter<T>) new TypeAdapter<WorkersBinding>() {
                @Override
                public void write(JsonWriter out, WorkersBinding value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `WorkersKvNamespaceBinding`
                    if (value.getActualInstance() instanceof WorkersKvNamespaceBinding) {
                        JsonElement element = adapterWorkersKvNamespaceBinding.toJsonTree((WorkersKvNamespaceBinding)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `WorkersServiceBinding`
                    if (value.getActualInstance() instanceof WorkersServiceBinding) {
                        JsonElement element = adapterWorkersServiceBinding.toJsonTree((WorkersServiceBinding)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `WorkersDoBinding`
                    if (value.getActualInstance() instanceof WorkersDoBinding) {
                        JsonElement element = adapterWorkersDoBinding.toJsonTree((WorkersDoBinding)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `WorkersR2Binding`
                    if (value.getActualInstance() instanceof WorkersR2Binding) {
                        JsonElement element = adapterWorkersR2Binding.toJsonTree((WorkersR2Binding)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `WorkersQueueBinding`
                    if (value.getActualInstance() instanceof WorkersQueueBinding) {
                        JsonElement element = adapterWorkersQueueBinding.toJsonTree((WorkersQueueBinding)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `WorkersD1Binding`
                    if (value.getActualInstance() instanceof WorkersD1Binding) {
                        JsonElement element = adapterWorkersD1Binding.toJsonTree((WorkersD1Binding)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `WorkersDispatchNamespaceBinding`
                    if (value.getActualInstance() instanceof WorkersDispatchNamespaceBinding) {
                        JsonElement element = adapterWorkersDispatchNamespaceBinding.toJsonTree((WorkersDispatchNamespaceBinding)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `WorkersMtlsCertBinding`
                    if (value.getActualInstance() instanceof WorkersMtlsCertBinding) {
                        JsonElement element = adapterWorkersMtlsCertBinding.toJsonTree((WorkersMtlsCertBinding)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: WorkersD1Binding, WorkersDispatchNamespaceBinding, WorkersDoBinding, WorkersKvNamespaceBinding, WorkersMtlsCertBinding, WorkersQueueBinding, WorkersR2Binding, WorkersServiceBinding");
                }

                @Override
                public WorkersBinding read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize WorkersKvNamespaceBinding
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WorkersKvNamespaceBinding.validateJsonElement(jsonElement);
                        actualAdapter = adapterWorkersKvNamespaceBinding;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WorkersKvNamespaceBinding'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for WorkersKvNamespaceBinding failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'WorkersKvNamespaceBinding'", e);
                    }
                    // deserialize WorkersServiceBinding
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WorkersServiceBinding.validateJsonElement(jsonElement);
                        actualAdapter = adapterWorkersServiceBinding;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WorkersServiceBinding'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for WorkersServiceBinding failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'WorkersServiceBinding'", e);
                    }
                    // deserialize WorkersDoBinding
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WorkersDoBinding.validateJsonElement(jsonElement);
                        actualAdapter = adapterWorkersDoBinding;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WorkersDoBinding'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for WorkersDoBinding failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'WorkersDoBinding'", e);
                    }
                    // deserialize WorkersR2Binding
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WorkersR2Binding.validateJsonElement(jsonElement);
                        actualAdapter = adapterWorkersR2Binding;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WorkersR2Binding'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for WorkersR2Binding failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'WorkersR2Binding'", e);
                    }
                    // deserialize WorkersQueueBinding
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WorkersQueueBinding.validateJsonElement(jsonElement);
                        actualAdapter = adapterWorkersQueueBinding;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WorkersQueueBinding'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for WorkersQueueBinding failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'WorkersQueueBinding'", e);
                    }
                    // deserialize WorkersD1Binding
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WorkersD1Binding.validateJsonElement(jsonElement);
                        actualAdapter = adapterWorkersD1Binding;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WorkersD1Binding'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for WorkersD1Binding failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'WorkersD1Binding'", e);
                    }
                    // deserialize WorkersDispatchNamespaceBinding
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WorkersDispatchNamespaceBinding.validateJsonElement(jsonElement);
                        actualAdapter = adapterWorkersDispatchNamespaceBinding;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WorkersDispatchNamespaceBinding'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for WorkersDispatchNamespaceBinding failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'WorkersDispatchNamespaceBinding'", e);
                    }
                    // deserialize WorkersMtlsCertBinding
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WorkersMtlsCertBinding.validateJsonElement(jsonElement);
                        actualAdapter = adapterWorkersMtlsCertBinding;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WorkersMtlsCertBinding'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for WorkersMtlsCertBinding failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'WorkersMtlsCertBinding'", e);
                    }

                    if (match == 1) {
                        WorkersBinding ret = new WorkersBinding();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for WorkersBinding: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public WorkersBinding() {
        super("oneOf", Boolean.FALSE);
    }

    public WorkersBinding(WorkersD1Binding o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public WorkersBinding(WorkersDispatchNamespaceBinding o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public WorkersBinding(WorkersDoBinding o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public WorkersBinding(WorkersKvNamespaceBinding o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public WorkersBinding(WorkersMtlsCertBinding o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public WorkersBinding(WorkersQueueBinding o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public WorkersBinding(WorkersR2Binding o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public WorkersBinding(WorkersServiceBinding o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("WorkersKvNamespaceBinding", WorkersKvNamespaceBinding.class);
        schemas.put("WorkersServiceBinding", WorkersServiceBinding.class);
        schemas.put("WorkersDoBinding", WorkersDoBinding.class);
        schemas.put("WorkersR2Binding", WorkersR2Binding.class);
        schemas.put("WorkersQueueBinding", WorkersQueueBinding.class);
        schemas.put("WorkersD1Binding", WorkersD1Binding.class);
        schemas.put("WorkersDispatchNamespaceBinding", WorkersDispatchNamespaceBinding.class);
        schemas.put("WorkersMtlsCertBinding", WorkersMtlsCertBinding.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return WorkersBinding.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * WorkersD1Binding, WorkersDispatchNamespaceBinding, WorkersDoBinding, WorkersKvNamespaceBinding, WorkersMtlsCertBinding, WorkersQueueBinding, WorkersR2Binding, WorkersServiceBinding
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof WorkersKvNamespaceBinding) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof WorkersServiceBinding) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof WorkersDoBinding) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof WorkersR2Binding) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof WorkersQueueBinding) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof WorkersD1Binding) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof WorkersDispatchNamespaceBinding) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof WorkersMtlsCertBinding) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be WorkersD1Binding, WorkersDispatchNamespaceBinding, WorkersDoBinding, WorkersKvNamespaceBinding, WorkersMtlsCertBinding, WorkersQueueBinding, WorkersR2Binding, WorkersServiceBinding");
    }

    /**
     * Get the actual instance, which can be the following:
     * WorkersD1Binding, WorkersDispatchNamespaceBinding, WorkersDoBinding, WorkersKvNamespaceBinding, WorkersMtlsCertBinding, WorkersQueueBinding, WorkersR2Binding, WorkersServiceBinding
     *
     * @return The actual instance (WorkersD1Binding, WorkersDispatchNamespaceBinding, WorkersDoBinding, WorkersKvNamespaceBinding, WorkersMtlsCertBinding, WorkersQueueBinding, WorkersR2Binding, WorkersServiceBinding)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `WorkersKvNamespaceBinding`. If the actual instance is not `WorkersKvNamespaceBinding`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WorkersKvNamespaceBinding`
     * @throws ClassCastException if the instance is not `WorkersKvNamespaceBinding`
     */
    public WorkersKvNamespaceBinding getWorkersKvNamespaceBinding() throws ClassCastException {
        return (WorkersKvNamespaceBinding)super.getActualInstance();
    }
    /**
     * Get the actual instance of `WorkersServiceBinding`. If the actual instance is not `WorkersServiceBinding`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WorkersServiceBinding`
     * @throws ClassCastException if the instance is not `WorkersServiceBinding`
     */
    public WorkersServiceBinding getWorkersServiceBinding() throws ClassCastException {
        return (WorkersServiceBinding)super.getActualInstance();
    }
    /**
     * Get the actual instance of `WorkersDoBinding`. If the actual instance is not `WorkersDoBinding`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WorkersDoBinding`
     * @throws ClassCastException if the instance is not `WorkersDoBinding`
     */
    public WorkersDoBinding getWorkersDoBinding() throws ClassCastException {
        return (WorkersDoBinding)super.getActualInstance();
    }
    /**
     * Get the actual instance of `WorkersR2Binding`. If the actual instance is not `WorkersR2Binding`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WorkersR2Binding`
     * @throws ClassCastException if the instance is not `WorkersR2Binding`
     */
    public WorkersR2Binding getWorkersR2Binding() throws ClassCastException {
        return (WorkersR2Binding)super.getActualInstance();
    }
    /**
     * Get the actual instance of `WorkersQueueBinding`. If the actual instance is not `WorkersQueueBinding`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WorkersQueueBinding`
     * @throws ClassCastException if the instance is not `WorkersQueueBinding`
     */
    public WorkersQueueBinding getWorkersQueueBinding() throws ClassCastException {
        return (WorkersQueueBinding)super.getActualInstance();
    }
    /**
     * Get the actual instance of `WorkersD1Binding`. If the actual instance is not `WorkersD1Binding`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WorkersD1Binding`
     * @throws ClassCastException if the instance is not `WorkersD1Binding`
     */
    public WorkersD1Binding getWorkersD1Binding() throws ClassCastException {
        return (WorkersD1Binding)super.getActualInstance();
    }
    /**
     * Get the actual instance of `WorkersDispatchNamespaceBinding`. If the actual instance is not `WorkersDispatchNamespaceBinding`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WorkersDispatchNamespaceBinding`
     * @throws ClassCastException if the instance is not `WorkersDispatchNamespaceBinding`
     */
    public WorkersDispatchNamespaceBinding getWorkersDispatchNamespaceBinding() throws ClassCastException {
        return (WorkersDispatchNamespaceBinding)super.getActualInstance();
    }
    /**
     * Get the actual instance of `WorkersMtlsCertBinding`. If the actual instance is not `WorkersMtlsCertBinding`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WorkersMtlsCertBinding`
     * @throws ClassCastException if the instance is not `WorkersMtlsCertBinding`
     */
    public WorkersMtlsCertBinding getWorkersMtlsCertBinding() throws ClassCastException {
        return (WorkersMtlsCertBinding)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to WorkersBinding
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with WorkersKvNamespaceBinding
        try {
            WorkersKvNamespaceBinding.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for WorkersKvNamespaceBinding failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with WorkersServiceBinding
        try {
            WorkersServiceBinding.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for WorkersServiceBinding failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with WorkersDoBinding
        try {
            WorkersDoBinding.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for WorkersDoBinding failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with WorkersR2Binding
        try {
            WorkersR2Binding.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for WorkersR2Binding failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with WorkersQueueBinding
        try {
            WorkersQueueBinding.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for WorkersQueueBinding failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with WorkersD1Binding
        try {
            WorkersD1Binding.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for WorkersD1Binding failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with WorkersDispatchNamespaceBinding
        try {
            WorkersDispatchNamespaceBinding.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for WorkersDispatchNamespaceBinding failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with WorkersMtlsCertBinding
        try {
            WorkersMtlsCertBinding.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for WorkersMtlsCertBinding failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for WorkersBinding with oneOf schemas: WorkersD1Binding, WorkersDispatchNamespaceBinding, WorkersDoBinding, WorkersKvNamespaceBinding, WorkersMtlsCertBinding, WorkersQueueBinding, WorkersR2Binding, WorkersServiceBinding. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of WorkersBinding given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of WorkersBinding
     * @throws IOException if the JSON string is invalid with respect to WorkersBinding
     */
    public static WorkersBinding fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WorkersBinding.class);
    }

    /**
     * Convert an instance of WorkersBinding to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

