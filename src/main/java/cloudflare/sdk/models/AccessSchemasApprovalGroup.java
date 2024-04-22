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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
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
 * A group of email addresses that can approve a temporary authentication request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessSchemasApprovalGroup {
  public static final String SERIALIZED_NAME_APPROVALS_NEEDED = "approvals_needed";
  @SerializedName(SERIALIZED_NAME_APPROVALS_NEEDED)
  private BigDecimal approvalsNeeded;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESSES = "email_addresses";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESSES)
  private List<Object> emailAddresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMAIL_LIST_UUID = "email_list_uuid";
  @SerializedName(SERIALIZED_NAME_EMAIL_LIST_UUID)
  private String emailListUuid;

  public AccessSchemasApprovalGroup() {
  }

  public AccessSchemasApprovalGroup approvalsNeeded(BigDecimal approvalsNeeded) {
    this.approvalsNeeded = approvalsNeeded;
    return this;
  }

   /**
   * The number of approvals needed to obtain access.
   * minimum: 0
   * @return approvalsNeeded
  **/
  @javax.annotation.Nonnull
  public BigDecimal getApprovalsNeeded() {
    return approvalsNeeded;
  }

  public void setApprovalsNeeded(BigDecimal approvalsNeeded) {
    this.approvalsNeeded = approvalsNeeded;
  }


  public AccessSchemasApprovalGroup emailAddresses(List<Object> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public AccessSchemasApprovalGroup addEmailAddressesItem(Object emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * A list of emails that can approve the access request.
   * @return emailAddresses
  **/
  @javax.annotation.Nullable
  public List<Object> getEmailAddresses() {
    return emailAddresses;
  }

  public void setEmailAddresses(List<Object> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }


  public AccessSchemasApprovalGroup emailListUuid(String emailListUuid) {
    this.emailListUuid = emailListUuid;
    return this;
  }

   /**
   * The UUID of an re-usable email list.
   * @return emailListUuid
  **/
  @javax.annotation.Nullable
  public String getEmailListUuid() {
    return emailListUuid;
  }

  public void setEmailListUuid(String emailListUuid) {
    this.emailListUuid = emailListUuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessSchemasApprovalGroup accessSchemasApprovalGroup = (AccessSchemasApprovalGroup) o;
    return Objects.equals(this.approvalsNeeded, accessSchemasApprovalGroup.approvalsNeeded) &&
        Objects.equals(this.emailAddresses, accessSchemasApprovalGroup.emailAddresses) &&
        Objects.equals(this.emailListUuid, accessSchemasApprovalGroup.emailListUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalsNeeded, emailAddresses, emailListUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessSchemasApprovalGroup {\n");
    sb.append("    approvalsNeeded: ").append(toIndentedString(approvalsNeeded)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    emailListUuid: ").append(toIndentedString(emailListUuid)).append("\n");
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
    openapiFields.add("approvals_needed");
    openapiFields.add("email_addresses");
    openapiFields.add("email_list_uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("approvals_needed");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessSchemasApprovalGroup
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessSchemasApprovalGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessSchemasApprovalGroup is not found in the empty JSON string", AccessSchemasApprovalGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessSchemasApprovalGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessSchemasApprovalGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccessSchemasApprovalGroup.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("email_addresses") != null && !jsonObj.get("email_addresses").isJsonNull() && !jsonObj.get("email_addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_addresses` to be an array in the JSON string but got `%s`", jsonObj.get("email_addresses").toString()));
      }
      if ((jsonObj.get("email_list_uuid") != null && !jsonObj.get("email_list_uuid").isJsonNull()) && !jsonObj.get("email_list_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_list_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_list_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessSchemasApprovalGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessSchemasApprovalGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessSchemasApprovalGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessSchemasApprovalGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessSchemasApprovalGroup>() {
           @Override
           public void write(JsonWriter out, AccessSchemasApprovalGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessSchemasApprovalGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessSchemasApprovalGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessSchemasApprovalGroup
  * @throws IOException if the JSON string is invalid with respect to AccessSchemasApprovalGroup
  */
  public static AccessSchemasApprovalGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessSchemasApprovalGroup.class);
  }

 /**
  * Convert an instance of AccessSchemasApprovalGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

