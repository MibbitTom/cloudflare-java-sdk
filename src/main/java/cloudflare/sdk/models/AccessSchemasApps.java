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
import cloudflare.sdk.models.AccessSchemasCorsHeaders;
import cloudflare.sdk.models.AccessSchemasSaasPropsSaasApp;
import cloudflare.sdk.models.AppLauncherApplication1;
import cloudflare.sdk.models.BookmarkApplication1;
import cloudflare.sdk.models.BrowserIsolationPermissionsApplication1;
import cloudflare.sdk.models.BrowserSSHApplication1;
import cloudflare.sdk.models.BrowserVNCApplication1;
import cloudflare.sdk.models.DeviceEnrollmentPermissionsApplication1;
import cloudflare.sdk.models.SaaSApplication1;
import cloudflare.sdk.models.SelfHostedApplication1;
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
public class AccessSchemasApps extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AccessSchemasApps.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AccessSchemasApps.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AccessSchemasApps' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SelfHostedApplication1> adapterSelfHostedApplication1 = gson.getDelegateAdapter(this, TypeToken.get(SelfHostedApplication1.class));
            final TypeAdapter<SaaSApplication1> adapterSaaSApplication1 = gson.getDelegateAdapter(this, TypeToken.get(SaaSApplication1.class));
            final TypeAdapter<BrowserSSHApplication1> adapterBrowserSSHApplication1 = gson.getDelegateAdapter(this, TypeToken.get(BrowserSSHApplication1.class));
            final TypeAdapter<BrowserVNCApplication1> adapterBrowserVNCApplication1 = gson.getDelegateAdapter(this, TypeToken.get(BrowserVNCApplication1.class));
            final TypeAdapter<AppLauncherApplication1> adapterAppLauncherApplication1 = gson.getDelegateAdapter(this, TypeToken.get(AppLauncherApplication1.class));
            final TypeAdapter<DeviceEnrollmentPermissionsApplication1> adapterDeviceEnrollmentPermissionsApplication1 = gson.getDelegateAdapter(this, TypeToken.get(DeviceEnrollmentPermissionsApplication1.class));
            final TypeAdapter<BrowserIsolationPermissionsApplication1> adapterBrowserIsolationPermissionsApplication1 = gson.getDelegateAdapter(this, TypeToken.get(BrowserIsolationPermissionsApplication1.class));
            final TypeAdapter<BookmarkApplication1> adapterBookmarkApplication1 = gson.getDelegateAdapter(this, TypeToken.get(BookmarkApplication1.class));

            return (TypeAdapter<T>) new TypeAdapter<AccessSchemasApps>() {
                @Override
                public void write(JsonWriter out, AccessSchemasApps value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `SelfHostedApplication1`
                    if (value.getActualInstance() instanceof SelfHostedApplication1) {
                        JsonElement element = adapterSelfHostedApplication1.toJsonTree((SelfHostedApplication1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `SaaSApplication1`
                    if (value.getActualInstance() instanceof SaaSApplication1) {
                        JsonElement element = adapterSaaSApplication1.toJsonTree((SaaSApplication1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `BrowserSSHApplication1`
                    if (value.getActualInstance() instanceof BrowserSSHApplication1) {
                        JsonElement element = adapterBrowserSSHApplication1.toJsonTree((BrowserSSHApplication1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `BrowserVNCApplication1`
                    if (value.getActualInstance() instanceof BrowserVNCApplication1) {
                        JsonElement element = adapterBrowserVNCApplication1.toJsonTree((BrowserVNCApplication1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `AppLauncherApplication1`
                    if (value.getActualInstance() instanceof AppLauncherApplication1) {
                        JsonElement element = adapterAppLauncherApplication1.toJsonTree((AppLauncherApplication1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `DeviceEnrollmentPermissionsApplication1`
                    if (value.getActualInstance() instanceof DeviceEnrollmentPermissionsApplication1) {
                        JsonElement element = adapterDeviceEnrollmentPermissionsApplication1.toJsonTree((DeviceEnrollmentPermissionsApplication1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `BrowserIsolationPermissionsApplication1`
                    if (value.getActualInstance() instanceof BrowserIsolationPermissionsApplication1) {
                        JsonElement element = adapterBrowserIsolationPermissionsApplication1.toJsonTree((BrowserIsolationPermissionsApplication1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `BookmarkApplication1`
                    if (value.getActualInstance() instanceof BookmarkApplication1) {
                        JsonElement element = adapterBookmarkApplication1.toJsonTree((BookmarkApplication1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: AppLauncherApplication1, BookmarkApplication1, BrowserIsolationPermissionsApplication1, BrowserSSHApplication1, BrowserVNCApplication1, DeviceEnrollmentPermissionsApplication1, SaaSApplication1, SelfHostedApplication1");
                }

                @Override
                public AccessSchemasApps read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize SelfHostedApplication1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SelfHostedApplication1.validateJsonElement(jsonElement);
                        actualAdapter = adapterSelfHostedApplication1;
                        AccessSchemasApps ret = new AccessSchemasApps();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SelfHostedApplication1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SelfHostedApplication1'", e);
                    }
                    // deserialize SaaSApplication1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SaaSApplication1.validateJsonElement(jsonElement);
                        actualAdapter = adapterSaaSApplication1;
                        AccessSchemasApps ret = new AccessSchemasApps();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SaaSApplication1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SaaSApplication1'", e);
                    }
                    // deserialize BrowserSSHApplication1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BrowserSSHApplication1.validateJsonElement(jsonElement);
                        actualAdapter = adapterBrowserSSHApplication1;
                        AccessSchemasApps ret = new AccessSchemasApps();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BrowserSSHApplication1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BrowserSSHApplication1'", e);
                    }
                    // deserialize BrowserVNCApplication1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BrowserVNCApplication1.validateJsonElement(jsonElement);
                        actualAdapter = adapterBrowserVNCApplication1;
                        AccessSchemasApps ret = new AccessSchemasApps();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BrowserVNCApplication1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BrowserVNCApplication1'", e);
                    }
                    // deserialize AppLauncherApplication1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AppLauncherApplication1.validateJsonElement(jsonElement);
                        actualAdapter = adapterAppLauncherApplication1;
                        AccessSchemasApps ret = new AccessSchemasApps();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AppLauncherApplication1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AppLauncherApplication1'", e);
                    }
                    // deserialize DeviceEnrollmentPermissionsApplication1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        DeviceEnrollmentPermissionsApplication1.validateJsonElement(jsonElement);
                        actualAdapter = adapterDeviceEnrollmentPermissionsApplication1;
                        AccessSchemasApps ret = new AccessSchemasApps();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for DeviceEnrollmentPermissionsApplication1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'DeviceEnrollmentPermissionsApplication1'", e);
                    }
                    // deserialize BrowserIsolationPermissionsApplication1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BrowserIsolationPermissionsApplication1.validateJsonElement(jsonElement);
                        actualAdapter = adapterBrowserIsolationPermissionsApplication1;
                        AccessSchemasApps ret = new AccessSchemasApps();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BrowserIsolationPermissionsApplication1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BrowserIsolationPermissionsApplication1'", e);
                    }
                    // deserialize BookmarkApplication1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BookmarkApplication1.validateJsonElement(jsonElement);
                        actualAdapter = adapterBookmarkApplication1;
                        AccessSchemasApps ret = new AccessSchemasApps();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BookmarkApplication1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BookmarkApplication1'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for AccessSchemasApps: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public AccessSchemasApps() {
        super("anyOf", Boolean.FALSE);
    }

    public AccessSchemasApps(AppLauncherApplication1 o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AccessSchemasApps(BookmarkApplication1 o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AccessSchemasApps(BrowserIsolationPermissionsApplication1 o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AccessSchemasApps(BrowserSSHApplication1 o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AccessSchemasApps(BrowserVNCApplication1 o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AccessSchemasApps(DeviceEnrollmentPermissionsApplication1 o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AccessSchemasApps(SaaSApplication1 o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AccessSchemasApps(SelfHostedApplication1 o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SelfHostedApplication1", SelfHostedApplication1.class);
        schemas.put("SaaSApplication1", SaaSApplication1.class);
        schemas.put("BrowserSSHApplication1", BrowserSSHApplication1.class);
        schemas.put("BrowserVNCApplication1", BrowserVNCApplication1.class);
        schemas.put("AppLauncherApplication1", AppLauncherApplication1.class);
        schemas.put("DeviceEnrollmentPermissionsApplication1", DeviceEnrollmentPermissionsApplication1.class);
        schemas.put("BrowserIsolationPermissionsApplication1", BrowserIsolationPermissionsApplication1.class);
        schemas.put("BookmarkApplication1", BookmarkApplication1.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return AccessSchemasApps.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * AppLauncherApplication1, BookmarkApplication1, BrowserIsolationPermissionsApplication1, BrowserSSHApplication1, BrowserVNCApplication1, DeviceEnrollmentPermissionsApplication1, SaaSApplication1, SelfHostedApplication1
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof SelfHostedApplication1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SaaSApplication1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof BrowserSSHApplication1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof BrowserVNCApplication1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof AppLauncherApplication1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof DeviceEnrollmentPermissionsApplication1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof BrowserIsolationPermissionsApplication1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof BookmarkApplication1) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AppLauncherApplication1, BookmarkApplication1, BrowserIsolationPermissionsApplication1, BrowserSSHApplication1, BrowserVNCApplication1, DeviceEnrollmentPermissionsApplication1, SaaSApplication1, SelfHostedApplication1");
    }

    /**
     * Get the actual instance, which can be the following:
     * AppLauncherApplication1, BookmarkApplication1, BrowserIsolationPermissionsApplication1, BrowserSSHApplication1, BrowserVNCApplication1, DeviceEnrollmentPermissionsApplication1, SaaSApplication1, SelfHostedApplication1
     *
     * @return The actual instance (AppLauncherApplication1, BookmarkApplication1, BrowserIsolationPermissionsApplication1, BrowserSSHApplication1, BrowserVNCApplication1, DeviceEnrollmentPermissionsApplication1, SaaSApplication1, SelfHostedApplication1)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SelfHostedApplication1`. If the actual instance is not `SelfHostedApplication1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SelfHostedApplication1`
     * @throws ClassCastException if the instance is not `SelfHostedApplication1`
     */
    public SelfHostedApplication1 getSelfHostedApplication1() throws ClassCastException {
        return (SelfHostedApplication1)super.getActualInstance();
    }
    /**
     * Get the actual instance of `SaaSApplication1`. If the actual instance is not `SaaSApplication1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SaaSApplication1`
     * @throws ClassCastException if the instance is not `SaaSApplication1`
     */
    public SaaSApplication1 getSaaSApplication1() throws ClassCastException {
        return (SaaSApplication1)super.getActualInstance();
    }
    /**
     * Get the actual instance of `BrowserSSHApplication1`. If the actual instance is not `BrowserSSHApplication1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BrowserSSHApplication1`
     * @throws ClassCastException if the instance is not `BrowserSSHApplication1`
     */
    public BrowserSSHApplication1 getBrowserSSHApplication1() throws ClassCastException {
        return (BrowserSSHApplication1)super.getActualInstance();
    }
    /**
     * Get the actual instance of `BrowserVNCApplication1`. If the actual instance is not `BrowserVNCApplication1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BrowserVNCApplication1`
     * @throws ClassCastException if the instance is not `BrowserVNCApplication1`
     */
    public BrowserVNCApplication1 getBrowserVNCApplication1() throws ClassCastException {
        return (BrowserVNCApplication1)super.getActualInstance();
    }
    /**
     * Get the actual instance of `AppLauncherApplication1`. If the actual instance is not `AppLauncherApplication1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppLauncherApplication1`
     * @throws ClassCastException if the instance is not `AppLauncherApplication1`
     */
    public AppLauncherApplication1 getAppLauncherApplication1() throws ClassCastException {
        return (AppLauncherApplication1)super.getActualInstance();
    }
    /**
     * Get the actual instance of `DeviceEnrollmentPermissionsApplication1`. If the actual instance is not `DeviceEnrollmentPermissionsApplication1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DeviceEnrollmentPermissionsApplication1`
     * @throws ClassCastException if the instance is not `DeviceEnrollmentPermissionsApplication1`
     */
    public DeviceEnrollmentPermissionsApplication1 getDeviceEnrollmentPermissionsApplication1() throws ClassCastException {
        return (DeviceEnrollmentPermissionsApplication1)super.getActualInstance();
    }
    /**
     * Get the actual instance of `BrowserIsolationPermissionsApplication1`. If the actual instance is not `BrowserIsolationPermissionsApplication1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BrowserIsolationPermissionsApplication1`
     * @throws ClassCastException if the instance is not `BrowserIsolationPermissionsApplication1`
     */
    public BrowserIsolationPermissionsApplication1 getBrowserIsolationPermissionsApplication1() throws ClassCastException {
        return (BrowserIsolationPermissionsApplication1)super.getActualInstance();
    }
    /**
     * Get the actual instance of `BookmarkApplication1`. If the actual instance is not `BookmarkApplication1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BookmarkApplication1`
     * @throws ClassCastException if the instance is not `BookmarkApplication1`
     */
    public BookmarkApplication1 getBookmarkApplication1() throws ClassCastException {
        return (BookmarkApplication1)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AccessSchemasApps
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with SelfHostedApplication1
        try {
            SelfHostedApplication1.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for SelfHostedApplication1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with SaaSApplication1
        try {
            SaaSApplication1.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for SaaSApplication1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with BrowserSSHApplication1
        try {
            BrowserSSHApplication1.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for BrowserSSHApplication1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with BrowserVNCApplication1
        try {
            BrowserVNCApplication1.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for BrowserVNCApplication1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with AppLauncherApplication1
        try {
            AppLauncherApplication1.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for AppLauncherApplication1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with DeviceEnrollmentPermissionsApplication1
        try {
            DeviceEnrollmentPermissionsApplication1.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for DeviceEnrollmentPermissionsApplication1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with BrowserIsolationPermissionsApplication1
        try {
            BrowserIsolationPermissionsApplication1.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for BrowserIsolationPermissionsApplication1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with BookmarkApplication1
        try {
            BookmarkApplication1.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for BookmarkApplication1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for AccessSchemasApps with anyOf schemas: AppLauncherApplication1, BookmarkApplication1, BrowserIsolationPermissionsApplication1, BrowserSSHApplication1, BrowserVNCApplication1, DeviceEnrollmentPermissionsApplication1, SaaSApplication1, SelfHostedApplication1. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of AccessSchemasApps given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AccessSchemasApps
     * @throws IOException if the JSON string is invalid with respect to AccessSchemasApps
     */
    public static AccessSchemasApps fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AccessSchemasApps.class);
    }

    /**
     * Convert an instance of AccessSchemasApps to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

