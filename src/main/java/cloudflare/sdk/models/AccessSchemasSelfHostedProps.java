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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cloudflare.JSON;

/**
 * AccessSchemasSelfHostedProps
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessSchemasSelfHostedProps {
  public static final String SERIALIZED_NAME_ALLOWED_IDPS = "allowed_idps";
  @SerializedName(SERIALIZED_NAME_ALLOWED_IDPS)
  private List<String> allowedIdps = new ArrayList<>();

  public static final String SERIALIZED_NAME_APP_LAUNCHER_VISIBLE = "app_launcher_visible";
  @SerializedName(SERIALIZED_NAME_APP_LAUNCHER_VISIBLE)
  private Boolean appLauncherVisible = true;

  public static final String SERIALIZED_NAME_AUTO_REDIRECT_TO_IDENTITY = "auto_redirect_to_identity";
  @SerializedName(SERIALIZED_NAME_AUTO_REDIRECT_TO_IDENTITY)
  private Boolean autoRedirectToIdentity = false;

  public static final String SERIALIZED_NAME_CORS_HEADERS = "cors_headers";
  @SerializedName(SERIALIZED_NAME_CORS_HEADERS)
  private AccessSchemasCorsHeaders corsHeaders;

  public static final String SERIALIZED_NAME_CUSTOM_DENY_MESSAGE = "custom_deny_message";
  @SerializedName(SERIALIZED_NAME_CUSTOM_DENY_MESSAGE)
  private String customDenyMessage;

  public static final String SERIALIZED_NAME_CUSTOM_DENY_URL = "custom_deny_url";
  @SerializedName(SERIALIZED_NAME_CUSTOM_DENY_URL)
  private String customDenyUrl;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_ENABLE_BINDING_COOKIE = "enable_binding_cookie";
  @SerializedName(SERIALIZED_NAME_ENABLE_BINDING_COOKIE)
  private Boolean enableBindingCookie = false;

  public static final String SERIALIZED_NAME_HTTP_ONLY_COOKIE_ATTRIBUTE = "http_only_cookie_attribute";
  @SerializedName(SERIALIZED_NAME_HTTP_ONLY_COOKIE_ATTRIBUTE)
  private Boolean httpOnlyCookieAttribute = true;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONS_PREFLIGHT_BYPASS = "options_preflight_bypass";
  @SerializedName(SERIALIZED_NAME_OPTIONS_PREFLIGHT_BYPASS)
  private Boolean optionsPreflightBypass;

  public static final String SERIALIZED_NAME_SAME_SITE_COOKIE_ATTRIBUTE = "same_site_cookie_attribute";
  @SerializedName(SERIALIZED_NAME_SAME_SITE_COOKIE_ATTRIBUTE)
  private String sameSiteCookieAttribute;

  public static final String SERIALIZED_NAME_SERVICE_AUTH401_REDIRECT = "service_auth_401_redirect";
  @SerializedName(SERIALIZED_NAME_SERVICE_AUTH401_REDIRECT)
  private Boolean serviceAuth401Redirect;

  public static final String SERIALIZED_NAME_SESSION_DURATION = "session_duration";
  @SerializedName(SERIALIZED_NAME_SESSION_DURATION)
  private String sessionDuration = "24h";

  public static final String SERIALIZED_NAME_SKIP_INTERSTITIAL = "skip_interstitial";
  @SerializedName(SERIALIZED_NAME_SKIP_INTERSTITIAL)
  private Boolean skipInterstitial;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AccessSchemasSelfHostedProps() {
  }

  public AccessSchemasSelfHostedProps allowedIdps(List<String> allowedIdps) {
    this.allowedIdps = allowedIdps;
    return this;
  }

  public AccessSchemasSelfHostedProps addAllowedIdpsItem(String allowedIdpsItem) {
    if (this.allowedIdps == null) {
      this.allowedIdps = new ArrayList<>();
    }
    this.allowedIdps.add(allowedIdpsItem);
    return this;
  }

   /**
   * The identity providers your users can select when connecting to this application. Defaults to all IdPs configured in your account.
   * @return allowedIdps
  **/
  @javax.annotation.Nullable
  public List<String> getAllowedIdps() {
    return allowedIdps;
  }

  public void setAllowedIdps(List<String> allowedIdps) {
    this.allowedIdps = allowedIdps;
  }


  public AccessSchemasSelfHostedProps appLauncherVisible(Boolean appLauncherVisible) {
    this.appLauncherVisible = appLauncherVisible;
    return this;
  }

   /**
   * Displays the application in the App Launcher.
   * @return appLauncherVisible
  **/
  @javax.annotation.Nullable
  public Boolean getAppLauncherVisible() {
    return appLauncherVisible;
  }

  public void setAppLauncherVisible(Boolean appLauncherVisible) {
    this.appLauncherVisible = appLauncherVisible;
  }


  public AccessSchemasSelfHostedProps autoRedirectToIdentity(Boolean autoRedirectToIdentity) {
    this.autoRedirectToIdentity = autoRedirectToIdentity;
    return this;
  }

   /**
   * When set to &#x60;true&#x60;, users skip the identity provider selection step during login. You must specify only one identity provider in allowed_idps.
   * @return autoRedirectToIdentity
  **/
  @javax.annotation.Nullable
  public Boolean getAutoRedirectToIdentity() {
    return autoRedirectToIdentity;
  }

  public void setAutoRedirectToIdentity(Boolean autoRedirectToIdentity) {
    this.autoRedirectToIdentity = autoRedirectToIdentity;
  }


  public AccessSchemasSelfHostedProps corsHeaders(AccessSchemasCorsHeaders corsHeaders) {
    this.corsHeaders = corsHeaders;
    return this;
  }

   /**
   * Get corsHeaders
   * @return corsHeaders
  **/
  @javax.annotation.Nullable
  public AccessSchemasCorsHeaders getCorsHeaders() {
    return corsHeaders;
  }

  public void setCorsHeaders(AccessSchemasCorsHeaders corsHeaders) {
    this.corsHeaders = corsHeaders;
  }


  public AccessSchemasSelfHostedProps customDenyMessage(String customDenyMessage) {
    this.customDenyMessage = customDenyMessage;
    return this;
  }

   /**
   * The custom error message shown to a user when they are denied access to the application.
   * @return customDenyMessage
  **/
  @javax.annotation.Nullable
  public String getCustomDenyMessage() {
    return customDenyMessage;
  }

  public void setCustomDenyMessage(String customDenyMessage) {
    this.customDenyMessage = customDenyMessage;
  }


  public AccessSchemasSelfHostedProps customDenyUrl(String customDenyUrl) {
    this.customDenyUrl = customDenyUrl;
    return this;
  }

   /**
   * The custom URL a user is redirected to when they are denied access to the application.
   * @return customDenyUrl
  **/
  @javax.annotation.Nullable
  public String getCustomDenyUrl() {
    return customDenyUrl;
  }

  public void setCustomDenyUrl(String customDenyUrl) {
    this.customDenyUrl = customDenyUrl;
  }


  public AccessSchemasSelfHostedProps domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * The domain and path that Access will secure.
   * @return domain
  **/
  @javax.annotation.Nonnull
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public AccessSchemasSelfHostedProps enableBindingCookie(Boolean enableBindingCookie) {
    this.enableBindingCookie = enableBindingCookie;
    return this;
  }

   /**
   * Enables the binding cookie, which increases security against compromised authorization tokens and CSRF attacks.
   * @return enableBindingCookie
  **/
  @javax.annotation.Nullable
  public Boolean getEnableBindingCookie() {
    return enableBindingCookie;
  }

  public void setEnableBindingCookie(Boolean enableBindingCookie) {
    this.enableBindingCookie = enableBindingCookie;
  }


  public AccessSchemasSelfHostedProps httpOnlyCookieAttribute(Boolean httpOnlyCookieAttribute) {
    this.httpOnlyCookieAttribute = httpOnlyCookieAttribute;
    return this;
  }

   /**
   * Enables the HttpOnly cookie attribute, which increases security against XSS attacks.
   * @return httpOnlyCookieAttribute
  **/
  @javax.annotation.Nullable
  public Boolean getHttpOnlyCookieAttribute() {
    return httpOnlyCookieAttribute;
  }

  public void setHttpOnlyCookieAttribute(Boolean httpOnlyCookieAttribute) {
    this.httpOnlyCookieAttribute = httpOnlyCookieAttribute;
  }


  public AccessSchemasSelfHostedProps logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * The image URL for the logo shown in the App Launcher dashboard.
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public AccessSchemasSelfHostedProps name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the application.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccessSchemasSelfHostedProps optionsPreflightBypass(Boolean optionsPreflightBypass) {
    this.optionsPreflightBypass = optionsPreflightBypass;
    return this;
  }

   /**
   * Allows options preflight requests to bypass Access authentication and go directly to the origin. Cannot turn on if cors_headers is set.
   * @return optionsPreflightBypass
  **/
  @javax.annotation.Nullable
  public Boolean getOptionsPreflightBypass() {
    return optionsPreflightBypass;
  }

  public void setOptionsPreflightBypass(Boolean optionsPreflightBypass) {
    this.optionsPreflightBypass = optionsPreflightBypass;
  }


  public AccessSchemasSelfHostedProps sameSiteCookieAttribute(String sameSiteCookieAttribute) {
    this.sameSiteCookieAttribute = sameSiteCookieAttribute;
    return this;
  }

   /**
   * Sets the SameSite cookie setting, which provides increased security against CSRF attacks.
   * @return sameSiteCookieAttribute
  **/
  @javax.annotation.Nullable
  public String getSameSiteCookieAttribute() {
    return sameSiteCookieAttribute;
  }

  public void setSameSiteCookieAttribute(String sameSiteCookieAttribute) {
    this.sameSiteCookieAttribute = sameSiteCookieAttribute;
  }


  public AccessSchemasSelfHostedProps serviceAuth401Redirect(Boolean serviceAuth401Redirect) {
    this.serviceAuth401Redirect = serviceAuth401Redirect;
    return this;
  }

   /**
   * Returns a 401 status code when the request is blocked by a Service Auth policy.
   * @return serviceAuth401Redirect
  **/
  @javax.annotation.Nullable
  public Boolean getServiceAuth401Redirect() {
    return serviceAuth401Redirect;
  }

  public void setServiceAuth401Redirect(Boolean serviceAuth401Redirect) {
    this.serviceAuth401Redirect = serviceAuth401Redirect;
  }


  public AccessSchemasSelfHostedProps sessionDuration(String sessionDuration) {
    this.sessionDuration = sessionDuration;
    return this;
  }

   /**
   * The amount of time that tokens issued for this application will be valid. Must be in the format &#x60;300ms&#x60; or &#x60;2h45m&#x60;. Valid time units are: ns, us (or µs), ms, s, m, h.
   * @return sessionDuration
  **/
  @javax.annotation.Nullable
  public String getSessionDuration() {
    return sessionDuration;
  }

  public void setSessionDuration(String sessionDuration) {
    this.sessionDuration = sessionDuration;
  }


  public AccessSchemasSelfHostedProps skipInterstitial(Boolean skipInterstitial) {
    this.skipInterstitial = skipInterstitial;
    return this;
  }

   /**
   * Enables automatic authentication through cloudflared.
   * @return skipInterstitial
  **/
  @javax.annotation.Nullable
  public Boolean getSkipInterstitial() {
    return skipInterstitial;
  }

  public void setSkipInterstitial(Boolean skipInterstitial) {
    this.skipInterstitial = skipInterstitial;
  }


  public AccessSchemasSelfHostedProps type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The application type.
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessSchemasSelfHostedProps accessSchemasSelfHostedProps = (AccessSchemasSelfHostedProps) o;
    return Objects.equals(this.allowedIdps, accessSchemasSelfHostedProps.allowedIdps) &&
        Objects.equals(this.appLauncherVisible, accessSchemasSelfHostedProps.appLauncherVisible) &&
        Objects.equals(this.autoRedirectToIdentity, accessSchemasSelfHostedProps.autoRedirectToIdentity) &&
        Objects.equals(this.corsHeaders, accessSchemasSelfHostedProps.corsHeaders) &&
        Objects.equals(this.customDenyMessage, accessSchemasSelfHostedProps.customDenyMessage) &&
        Objects.equals(this.customDenyUrl, accessSchemasSelfHostedProps.customDenyUrl) &&
        Objects.equals(this.domain, accessSchemasSelfHostedProps.domain) &&
        Objects.equals(this.enableBindingCookie, accessSchemasSelfHostedProps.enableBindingCookie) &&
        Objects.equals(this.httpOnlyCookieAttribute, accessSchemasSelfHostedProps.httpOnlyCookieAttribute) &&
        Objects.equals(this.logoUrl, accessSchemasSelfHostedProps.logoUrl) &&
        Objects.equals(this.name, accessSchemasSelfHostedProps.name) &&
        Objects.equals(this.optionsPreflightBypass, accessSchemasSelfHostedProps.optionsPreflightBypass) &&
        Objects.equals(this.sameSiteCookieAttribute, accessSchemasSelfHostedProps.sameSiteCookieAttribute) &&
        Objects.equals(this.serviceAuth401Redirect, accessSchemasSelfHostedProps.serviceAuth401Redirect) &&
        Objects.equals(this.sessionDuration, accessSchemasSelfHostedProps.sessionDuration) &&
        Objects.equals(this.skipInterstitial, accessSchemasSelfHostedProps.skipInterstitial) &&
        Objects.equals(this.type, accessSchemasSelfHostedProps.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedIdps, appLauncherVisible, autoRedirectToIdentity, corsHeaders, customDenyMessage, customDenyUrl, domain, enableBindingCookie, httpOnlyCookieAttribute, logoUrl, name, optionsPreflightBypass, sameSiteCookieAttribute, serviceAuth401Redirect, sessionDuration, skipInterstitial, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessSchemasSelfHostedProps {\n");
    sb.append("    allowedIdps: ").append(toIndentedString(allowedIdps)).append("\n");
    sb.append("    appLauncherVisible: ").append(toIndentedString(appLauncherVisible)).append("\n");
    sb.append("    autoRedirectToIdentity: ").append(toIndentedString(autoRedirectToIdentity)).append("\n");
    sb.append("    corsHeaders: ").append(toIndentedString(corsHeaders)).append("\n");
    sb.append("    customDenyMessage: ").append(toIndentedString(customDenyMessage)).append("\n");
    sb.append("    customDenyUrl: ").append(toIndentedString(customDenyUrl)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    enableBindingCookie: ").append(toIndentedString(enableBindingCookie)).append("\n");
    sb.append("    httpOnlyCookieAttribute: ").append(toIndentedString(httpOnlyCookieAttribute)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optionsPreflightBypass: ").append(toIndentedString(optionsPreflightBypass)).append("\n");
    sb.append("    sameSiteCookieAttribute: ").append(toIndentedString(sameSiteCookieAttribute)).append("\n");
    sb.append("    serviceAuth401Redirect: ").append(toIndentedString(serviceAuth401Redirect)).append("\n");
    sb.append("    sessionDuration: ").append(toIndentedString(sessionDuration)).append("\n");
    sb.append("    skipInterstitial: ").append(toIndentedString(skipInterstitial)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("allowed_idps");
    openapiFields.add("app_launcher_visible");
    openapiFields.add("auto_redirect_to_identity");
    openapiFields.add("cors_headers");
    openapiFields.add("custom_deny_message");
    openapiFields.add("custom_deny_url");
    openapiFields.add("domain");
    openapiFields.add("enable_binding_cookie");
    openapiFields.add("http_only_cookie_attribute");
    openapiFields.add("logo_url");
    openapiFields.add("name");
    openapiFields.add("options_preflight_bypass");
    openapiFields.add("same_site_cookie_attribute");
    openapiFields.add("service_auth_401_redirect");
    openapiFields.add("session_duration");
    openapiFields.add("skip_interstitial");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("domain");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessSchemasSelfHostedProps
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessSchemasSelfHostedProps.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessSchemasSelfHostedProps is not found in the empty JSON string", AccessSchemasSelfHostedProps.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessSchemasSelfHostedProps.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessSchemasSelfHostedProps` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccessSchemasSelfHostedProps.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed_idps") != null && !jsonObj.get("allowed_idps").isJsonNull() && !jsonObj.get("allowed_idps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_idps` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_idps").toString()));
      }
      // validate the optional field `cors_headers`
      if (jsonObj.get("cors_headers") != null && !jsonObj.get("cors_headers").isJsonNull()) {
        AccessSchemasCorsHeaders.validateJsonElement(jsonObj.get("cors_headers"));
      }
      if ((jsonObj.get("custom_deny_message") != null && !jsonObj.get("custom_deny_message").isJsonNull()) && !jsonObj.get("custom_deny_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_deny_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_deny_message").toString()));
      }
      if ((jsonObj.get("custom_deny_url") != null && !jsonObj.get("custom_deny_url").isJsonNull()) && !jsonObj.get("custom_deny_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_deny_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_deny_url").toString()));
      }
      if (!jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      if ((jsonObj.get("logo_url") != null && !jsonObj.get("logo_url").isJsonNull()) && !jsonObj.get("logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_url").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("same_site_cookie_attribute") != null && !jsonObj.get("same_site_cookie_attribute").isJsonNull()) && !jsonObj.get("same_site_cookie_attribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `same_site_cookie_attribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("same_site_cookie_attribute").toString()));
      }
      if ((jsonObj.get("session_duration") != null && !jsonObj.get("session_duration").isJsonNull()) && !jsonObj.get("session_duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session_duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session_duration").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessSchemasSelfHostedProps.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessSchemasSelfHostedProps' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessSchemasSelfHostedProps> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessSchemasSelfHostedProps.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessSchemasSelfHostedProps>() {
           @Override
           public void write(JsonWriter out, AccessSchemasSelfHostedProps value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessSchemasSelfHostedProps read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessSchemasSelfHostedProps given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessSchemasSelfHostedProps
  * @throws IOException if the JSON string is invalid with respect to AccessSchemasSelfHostedProps
  */
  public static AccessSchemasSelfHostedProps fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessSchemasSelfHostedProps.class);
  }

 /**
  * Convert an instance of AccessSchemasSelfHostedProps to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

