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
import org.openapitools.client.model.IamSchemasRole;

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

import invalidPackageName.JSON;

/**
 * IamOrganizationInvite
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class IamOrganizationInvite {
  public static final String SERIALIZED_NAME_EXPIRES_ON = "expires_on";
  @SerializedName(SERIALIZED_NAME_EXPIRES_ON)
  private OffsetDateTime expiresOn;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INVITED_BY = "invited_by";
  @SerializedName(SERIALIZED_NAME_INVITED_BY)
  private String invitedBy;

  public static final String SERIALIZED_NAME_INVITED_MEMBER_EMAIL = "invited_member_email";
  @SerializedName(SERIALIZED_NAME_INVITED_MEMBER_EMAIL)
  private String invitedMemberEmail;

  public static final String SERIALIZED_NAME_INVITED_MEMBER_ID = "invited_member_id";
  @SerializedName(SERIALIZED_NAME_INVITED_MEMBER_ID)
  private String invitedMemberId;

  public static final String SERIALIZED_NAME_INVITED_ON = "invited_on";
  @SerializedName(SERIALIZED_NAME_INVITED_ON)
  private OffsetDateTime invitedOn;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organization_id";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private String organizationId;

  public static final String SERIALIZED_NAME_ORGANIZATION_NAME = "organization_name";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_NAME)
  private String organizationName;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<IamSchemasRole> roles = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORGANIZATION_IS_ENFORCING_TWOFACTOR = "organization_is_enforcing_twofactor";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_IS_ENFORCING_TWOFACTOR)
  private Boolean organizationIsEnforcingTwofactor = false;

  /**
   * Current status of the invitation.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("pending"),
    
    ACCEPTED("accepted"),
    
    REJECTED("rejected"),
    
    CANCELED("canceled"),
    
    LEFT("left"),
    
    EXPIRED("expired");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public IamOrganizationInvite() {
  }

  public IamOrganizationInvite(
     OffsetDateTime expiresOn, 
     String id, 
     String invitedMemberId, 
     OffsetDateTime invitedOn, 
     String organizationId, 
     String organizationName
  ) {
    this();
    this.expiresOn = expiresOn;
    this.id = id;
    this.invitedMemberId = invitedMemberId;
    this.invitedOn = invitedOn;
    this.organizationId = organizationId;
    this.organizationName = organizationName;
  }

   /**
   * When the invite is no longer active.
   * @return expiresOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpiresOn() {
    return expiresOn;
  }



   /**
   * Invite identifier tag.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public IamOrganizationInvite invitedBy(String invitedBy) {
    this.invitedBy = invitedBy;
    return this;
  }

   /**
   * The email address of the user who created the invite.
   * @return invitedBy
  **/
  @javax.annotation.Nullable
  public String getInvitedBy() {
    return invitedBy;
  }

  public void setInvitedBy(String invitedBy) {
    this.invitedBy = invitedBy;
  }


  public IamOrganizationInvite invitedMemberEmail(String invitedMemberEmail) {
    this.invitedMemberEmail = invitedMemberEmail;
    return this;
  }

   /**
   * Email address of the user to add to the organization.
   * @return invitedMemberEmail
  **/
  @javax.annotation.Nullable
  public String getInvitedMemberEmail() {
    return invitedMemberEmail;
  }

  public void setInvitedMemberEmail(String invitedMemberEmail) {
    this.invitedMemberEmail = invitedMemberEmail;
  }


   /**
   * ID of the user to add to the organization.
   * @return invitedMemberId
  **/
  @javax.annotation.Nullable
  public String getInvitedMemberId() {
    return invitedMemberId;
  }



   /**
   * When the invite was sent.
   * @return invitedOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getInvitedOn() {
    return invitedOn;
  }



   /**
   * ID of the organization the user will be added to.
   * @return organizationId
  **/
  @javax.annotation.Nonnull
  public String getOrganizationId() {
    return organizationId;
  }



   /**
   * Organization name.
   * @return organizationName
  **/
  @javax.annotation.Nullable
  public String getOrganizationName() {
    return organizationName;
  }



  public IamOrganizationInvite roles(List<IamSchemasRole> roles) {
    this.roles = roles;
    return this;
  }

  public IamOrganizationInvite addRolesItem(IamSchemasRole rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Roles to be assigned to this user.
   * @return roles
  **/
  @javax.annotation.Nullable
  public List<IamSchemasRole> getRoles() {
    return roles;
  }

  public void setRoles(List<IamSchemasRole> roles) {
    this.roles = roles;
  }


  public IamOrganizationInvite organizationIsEnforcingTwofactor(Boolean organizationIsEnforcingTwofactor) {
    this.organizationIsEnforcingTwofactor = organizationIsEnforcingTwofactor;
    return this;
  }

   /**
   * Current status of two-factor enforcement on the organization.
   * @return organizationIsEnforcingTwofactor
  **/
  @javax.annotation.Nullable
  public Boolean getOrganizationIsEnforcingTwofactor() {
    return organizationIsEnforcingTwofactor;
  }

  public void setOrganizationIsEnforcingTwofactor(Boolean organizationIsEnforcingTwofactor) {
    this.organizationIsEnforcingTwofactor = organizationIsEnforcingTwofactor;
  }


  public IamOrganizationInvite status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Current status of the invitation.
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IamOrganizationInvite iamOrganizationInvite = (IamOrganizationInvite) o;
    return Objects.equals(this.expiresOn, iamOrganizationInvite.expiresOn) &&
        Objects.equals(this.id, iamOrganizationInvite.id) &&
        Objects.equals(this.invitedBy, iamOrganizationInvite.invitedBy) &&
        Objects.equals(this.invitedMemberEmail, iamOrganizationInvite.invitedMemberEmail) &&
        Objects.equals(this.invitedMemberId, iamOrganizationInvite.invitedMemberId) &&
        Objects.equals(this.invitedOn, iamOrganizationInvite.invitedOn) &&
        Objects.equals(this.organizationId, iamOrganizationInvite.organizationId) &&
        Objects.equals(this.organizationName, iamOrganizationInvite.organizationName) &&
        Objects.equals(this.roles, iamOrganizationInvite.roles) &&
        Objects.equals(this.organizationIsEnforcingTwofactor, iamOrganizationInvite.organizationIsEnforcingTwofactor) &&
        Objects.equals(this.status, iamOrganizationInvite.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresOn, id, invitedBy, invitedMemberEmail, invitedMemberId, invitedOn, organizationId, organizationName, roles, organizationIsEnforcingTwofactor, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IamOrganizationInvite {\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invitedBy: ").append(toIndentedString(invitedBy)).append("\n");
    sb.append("    invitedMemberEmail: ").append(toIndentedString(invitedMemberEmail)).append("\n");
    sb.append("    invitedMemberId: ").append(toIndentedString(invitedMemberId)).append("\n");
    sb.append("    invitedOn: ").append(toIndentedString(invitedOn)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    organizationIsEnforcingTwofactor: ").append(toIndentedString(organizationIsEnforcingTwofactor)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("expires_on");
    openapiFields.add("id");
    openapiFields.add("invited_by");
    openapiFields.add("invited_member_email");
    openapiFields.add("invited_member_id");
    openapiFields.add("invited_on");
    openapiFields.add("organization_id");
    openapiFields.add("organization_name");
    openapiFields.add("roles");
    openapiFields.add("organization_is_enforcing_twofactor");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("invited_member_id");
    openapiRequiredFields.add("organization_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IamOrganizationInvite
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IamOrganizationInvite.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IamOrganizationInvite is not found in the empty JSON string", IamOrganizationInvite.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IamOrganizationInvite.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IamOrganizationInvite` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IamOrganizationInvite.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("invited_by") != null && !jsonObj.get("invited_by").isJsonNull()) && !jsonObj.get("invited_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invited_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invited_by").toString()));
      }
      if ((jsonObj.get("invited_member_email") != null && !jsonObj.get("invited_member_email").isJsonNull()) && !jsonObj.get("invited_member_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invited_member_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invited_member_email").toString()));
      }
      if ((jsonObj.get("invited_member_id") != null && !jsonObj.get("invited_member_id").isJsonNull()) && !jsonObj.get("invited_member_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invited_member_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invited_member_id").toString()));
      }
      if (!jsonObj.get("organization_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization_id").toString()));
      }
      if ((jsonObj.get("organization_name") != null && !jsonObj.get("organization_name").isJsonNull()) && !jsonObj.get("organization_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization_name").toString()));
      }
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonNull()) {
        JsonArray jsonArrayroles = jsonObj.getAsJsonArray("roles");
        if (jsonArrayroles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("roles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
          }

          // validate the optional field `roles` (array)
          for (int i = 0; i < jsonArrayroles.size(); i++) {
            IamSchemasRole.validateJsonElement(jsonArrayroles.get(i));
          };
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IamOrganizationInvite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IamOrganizationInvite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IamOrganizationInvite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IamOrganizationInvite.class));

       return (TypeAdapter<T>) new TypeAdapter<IamOrganizationInvite>() {
           @Override
           public void write(JsonWriter out, IamOrganizationInvite value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IamOrganizationInvite read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IamOrganizationInvite given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IamOrganizationInvite
  * @throws IOException if the JSON string is invalid with respect to IamOrganizationInvite
  */
  public static IamOrganizationInvite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IamOrganizationInvite.class);
  }

 /**
  * Convert an instance of IamOrganizationInvite to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

