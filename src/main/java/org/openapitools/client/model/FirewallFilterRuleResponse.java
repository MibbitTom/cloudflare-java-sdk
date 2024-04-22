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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.FirewallFilterRuleResponseAllOfFilter;
import org.openapitools.client.model.FirewallSchemasAction;

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

import org.openapitools.client.JSON;

/**
 * FirewallFilterRuleResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class FirewallFilterRuleResponse {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private FirewallSchemasAction action;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PAUSED = "paused";
  @SerializedName(SERIALIZED_NAME_PAUSED)
  private Boolean paused;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private BigDecimal priority;

  /**
   * A list of products to bypass for a request when using the &#x60;bypass&#x60; action.
   */
  @JsonAdapter(ProductsEnum.Adapter.class)
  public enum ProductsEnum {
    ZONELOCKDOWN("zoneLockdown"),
    
    UABLOCK("uaBlock"),
    
    BIC("bic"),
    
    HOT("hot"),
    
    SECURITYLEVEL("securityLevel"),
    
    RATELIMIT("rateLimit"),
    
    WAF("waf");

    private String value;

    ProductsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProductsEnum fromValue(String value) {
      for (ProductsEnum b : ProductsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProductsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProductsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProductsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProductsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ProductsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<ProductsEnum> products = new ArrayList<>();

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private FirewallFilterRuleResponseAllOfFilter filter;

  public FirewallFilterRuleResponse() {
  }

  public FirewallFilterRuleResponse(
     String id
  ) {
    this();
    this.id = id;
  }

  public FirewallFilterRuleResponse action(FirewallSchemasAction action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  public FirewallSchemasAction getAction() {
    return action;
  }

  public void setAction(FirewallSchemasAction action) {
    this.action = action;
  }


  public FirewallFilterRuleResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An informative summary of the firewall rule.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * The unique identifier of the firewall rule.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public FirewallFilterRuleResponse paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * When true, indicates that the firewall rule is currently paused.
   * @return paused
  **/
  @javax.annotation.Nullable
  public Boolean getPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }


  public FirewallFilterRuleResponse priority(BigDecimal priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The priority of the rule. Optional value used to define the processing order. A lower number indicates a higher priority. If not provided, rules with a defined priority will be processed before rules without a priority.
   * minimum: 0
   * maximum: 2147483647
   * @return priority
  **/
  @javax.annotation.Nullable
  public BigDecimal getPriority() {
    return priority;
  }

  public void setPriority(BigDecimal priority) {
    this.priority = priority;
  }


  public FirewallFilterRuleResponse products(List<ProductsEnum> products) {
    this.products = products;
    return this;
  }

  public FirewallFilterRuleResponse addProductsItem(ProductsEnum productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @javax.annotation.Nullable
  public List<ProductsEnum> getProducts() {
    return products;
  }

  public void setProducts(List<ProductsEnum> products) {
    this.products = products;
  }


  public FirewallFilterRuleResponse ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * A short reference tag. Allows you to select related firewall rules.
   * @return ref
  **/
  @javax.annotation.Nullable
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }


  public FirewallFilterRuleResponse filter(FirewallFilterRuleResponseAllOfFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  public FirewallFilterRuleResponseAllOfFilter getFilter() {
    return filter;
  }

  public void setFilter(FirewallFilterRuleResponseAllOfFilter filter) {
    this.filter = filter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirewallFilterRuleResponse firewallFilterRuleResponse = (FirewallFilterRuleResponse) o;
    return Objects.equals(this.action, firewallFilterRuleResponse.action) &&
        Objects.equals(this.description, firewallFilterRuleResponse.description) &&
        Objects.equals(this.id, firewallFilterRuleResponse.id) &&
        Objects.equals(this.paused, firewallFilterRuleResponse.paused) &&
        Objects.equals(this.priority, firewallFilterRuleResponse.priority) &&
        Objects.equals(this.products, firewallFilterRuleResponse.products) &&
        Objects.equals(this.ref, firewallFilterRuleResponse.ref) &&
        Objects.equals(this.filter, firewallFilterRuleResponse.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, description, id, paused, priority, products, ref, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirewallFilterRuleResponse {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("paused");
    openapiFields.add("priority");
    openapiFields.add("products");
    openapiFields.add("ref");
    openapiFields.add("filter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FirewallFilterRuleResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FirewallFilterRuleResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FirewallFilterRuleResponse is not found in the empty JSON string", FirewallFilterRuleResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FirewallFilterRuleResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FirewallFilterRuleResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `action`
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) {
        FirewallSchemasAction.validateJsonElement(jsonObj.get("action"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("products") != null && !jsonObj.get("products").isJsonNull() && !jsonObj.get("products").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `products` to be an array in the JSON string but got `%s`", jsonObj.get("products").toString()));
      }
      if ((jsonObj.get("ref") != null && !jsonObj.get("ref").isJsonNull()) && !jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
      // validate the optional field `filter`
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) {
        FirewallFilterRuleResponseAllOfFilter.validateJsonElement(jsonObj.get("filter"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FirewallFilterRuleResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FirewallFilterRuleResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FirewallFilterRuleResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FirewallFilterRuleResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<FirewallFilterRuleResponse>() {
           @Override
           public void write(JsonWriter out, FirewallFilterRuleResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FirewallFilterRuleResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FirewallFilterRuleResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FirewallFilterRuleResponse
  * @throws IOException if the JSON string is invalid with respect to FirewallFilterRuleResponse
  */
  public static FirewallFilterRuleResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FirewallFilterRuleResponse.class);
  }

 /**
  * Convert an instance of FirewallFilterRuleResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

