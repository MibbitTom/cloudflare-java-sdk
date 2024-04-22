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
 * ObservatoryTrend
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ObservatoryTrend {
  public static final String SERIALIZED_NAME_CLS = "cls";
  @SerializedName(SERIALIZED_NAME_CLS)
  private List<BigDecimal> cls = new ArrayList<>();

  public static final String SERIALIZED_NAME_FCP = "fcp";
  @SerializedName(SERIALIZED_NAME_FCP)
  private List<BigDecimal> fcp = new ArrayList<>();

  public static final String SERIALIZED_NAME_LCP = "lcp";
  @SerializedName(SERIALIZED_NAME_LCP)
  private List<BigDecimal> lcp = new ArrayList<>();

  public static final String SERIALIZED_NAME_PERFORMANCE_SCORE = "performanceScore";
  @SerializedName(SERIALIZED_NAME_PERFORMANCE_SCORE)
  private List<BigDecimal> performanceScore = new ArrayList<>();

  public static final String SERIALIZED_NAME_SI = "si";
  @SerializedName(SERIALIZED_NAME_SI)
  private List<BigDecimal> si = new ArrayList<>();

  public static final String SERIALIZED_NAME_TBT = "tbt";
  @SerializedName(SERIALIZED_NAME_TBT)
  private List<BigDecimal> tbt = new ArrayList<>();

  public static final String SERIALIZED_NAME_TTFB = "ttfb";
  @SerializedName(SERIALIZED_NAME_TTFB)
  private List<BigDecimal> ttfb = new ArrayList<>();

  public static final String SERIALIZED_NAME_TTI = "tti";
  @SerializedName(SERIALIZED_NAME_TTI)
  private List<BigDecimal> tti = new ArrayList<>();

  public ObservatoryTrend() {
  }

  public ObservatoryTrend cls(List<BigDecimal> cls) {
    this.cls = cls;
    return this;
  }

  public ObservatoryTrend addClsItem(BigDecimal clsItem) {
    if (this.cls == null) {
      this.cls = new ArrayList<>();
    }
    this.cls.add(clsItem);
    return this;
  }

   /**
   * Cumulative Layout Shift trend.
   * @return cls
  **/
  @javax.annotation.Nullable
  public List<BigDecimal> getCls() {
    return cls;
  }

  public void setCls(List<BigDecimal> cls) {
    this.cls = cls;
  }


  public ObservatoryTrend fcp(List<BigDecimal> fcp) {
    this.fcp = fcp;
    return this;
  }

  public ObservatoryTrend addFcpItem(BigDecimal fcpItem) {
    if (this.fcp == null) {
      this.fcp = new ArrayList<>();
    }
    this.fcp.add(fcpItem);
    return this;
  }

   /**
   * First Contentful Paint trend.
   * @return fcp
  **/
  @javax.annotation.Nullable
  public List<BigDecimal> getFcp() {
    return fcp;
  }

  public void setFcp(List<BigDecimal> fcp) {
    this.fcp = fcp;
  }


  public ObservatoryTrend lcp(List<BigDecimal> lcp) {
    this.lcp = lcp;
    return this;
  }

  public ObservatoryTrend addLcpItem(BigDecimal lcpItem) {
    if (this.lcp == null) {
      this.lcp = new ArrayList<>();
    }
    this.lcp.add(lcpItem);
    return this;
  }

   /**
   * Largest Contentful Paint trend.
   * @return lcp
  **/
  @javax.annotation.Nullable
  public List<BigDecimal> getLcp() {
    return lcp;
  }

  public void setLcp(List<BigDecimal> lcp) {
    this.lcp = lcp;
  }


  public ObservatoryTrend performanceScore(List<BigDecimal> performanceScore) {
    this.performanceScore = performanceScore;
    return this;
  }

  public ObservatoryTrend addPerformanceScoreItem(BigDecimal performanceScoreItem) {
    if (this.performanceScore == null) {
      this.performanceScore = new ArrayList<>();
    }
    this.performanceScore.add(performanceScoreItem);
    return this;
  }

   /**
   * The Lighthouse score trend.
   * @return performanceScore
  **/
  @javax.annotation.Nullable
  public List<BigDecimal> getPerformanceScore() {
    return performanceScore;
  }

  public void setPerformanceScore(List<BigDecimal> performanceScore) {
    this.performanceScore = performanceScore;
  }


  public ObservatoryTrend si(List<BigDecimal> si) {
    this.si = si;
    return this;
  }

  public ObservatoryTrend addSiItem(BigDecimal siItem) {
    if (this.si == null) {
      this.si = new ArrayList<>();
    }
    this.si.add(siItem);
    return this;
  }

   /**
   * Speed Index trend.
   * @return si
  **/
  @javax.annotation.Nullable
  public List<BigDecimal> getSi() {
    return si;
  }

  public void setSi(List<BigDecimal> si) {
    this.si = si;
  }


  public ObservatoryTrend tbt(List<BigDecimal> tbt) {
    this.tbt = tbt;
    return this;
  }

  public ObservatoryTrend addTbtItem(BigDecimal tbtItem) {
    if (this.tbt == null) {
      this.tbt = new ArrayList<>();
    }
    this.tbt.add(tbtItem);
    return this;
  }

   /**
   * Total Blocking Time trend.
   * @return tbt
  **/
  @javax.annotation.Nullable
  public List<BigDecimal> getTbt() {
    return tbt;
  }

  public void setTbt(List<BigDecimal> tbt) {
    this.tbt = tbt;
  }


  public ObservatoryTrend ttfb(List<BigDecimal> ttfb) {
    this.ttfb = ttfb;
    return this;
  }

  public ObservatoryTrend addTtfbItem(BigDecimal ttfbItem) {
    if (this.ttfb == null) {
      this.ttfb = new ArrayList<>();
    }
    this.ttfb.add(ttfbItem);
    return this;
  }

   /**
   * Time To First Byte trend.
   * @return ttfb
  **/
  @javax.annotation.Nullable
  public List<BigDecimal> getTtfb() {
    return ttfb;
  }

  public void setTtfb(List<BigDecimal> ttfb) {
    this.ttfb = ttfb;
  }


  public ObservatoryTrend tti(List<BigDecimal> tti) {
    this.tti = tti;
    return this;
  }

  public ObservatoryTrend addTtiItem(BigDecimal ttiItem) {
    if (this.tti == null) {
      this.tti = new ArrayList<>();
    }
    this.tti.add(ttiItem);
    return this;
  }

   /**
   * Time To Interactive trend.
   * @return tti
  **/
  @javax.annotation.Nullable
  public List<BigDecimal> getTti() {
    return tti;
  }

  public void setTti(List<BigDecimal> tti) {
    this.tti = tti;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservatoryTrend observatoryTrend = (ObservatoryTrend) o;
    return Objects.equals(this.cls, observatoryTrend.cls) &&
        Objects.equals(this.fcp, observatoryTrend.fcp) &&
        Objects.equals(this.lcp, observatoryTrend.lcp) &&
        Objects.equals(this.performanceScore, observatoryTrend.performanceScore) &&
        Objects.equals(this.si, observatoryTrend.si) &&
        Objects.equals(this.tbt, observatoryTrend.tbt) &&
        Objects.equals(this.ttfb, observatoryTrend.ttfb) &&
        Objects.equals(this.tti, observatoryTrend.tti);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cls, fcp, lcp, performanceScore, si, tbt, ttfb, tti);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservatoryTrend {\n");
    sb.append("    cls: ").append(toIndentedString(cls)).append("\n");
    sb.append("    fcp: ").append(toIndentedString(fcp)).append("\n");
    sb.append("    lcp: ").append(toIndentedString(lcp)).append("\n");
    sb.append("    performanceScore: ").append(toIndentedString(performanceScore)).append("\n");
    sb.append("    si: ").append(toIndentedString(si)).append("\n");
    sb.append("    tbt: ").append(toIndentedString(tbt)).append("\n");
    sb.append("    ttfb: ").append(toIndentedString(ttfb)).append("\n");
    sb.append("    tti: ").append(toIndentedString(tti)).append("\n");
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
    openapiFields.add("cls");
    openapiFields.add("fcp");
    openapiFields.add("lcp");
    openapiFields.add("performanceScore");
    openapiFields.add("si");
    openapiFields.add("tbt");
    openapiFields.add("ttfb");
    openapiFields.add("tti");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ObservatoryTrend
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ObservatoryTrend.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ObservatoryTrend is not found in the empty JSON string", ObservatoryTrend.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ObservatoryTrend.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ObservatoryTrend` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("cls") != null && !jsonObj.get("cls").isJsonNull() && !jsonObj.get("cls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cls` to be an array in the JSON string but got `%s`", jsonObj.get("cls").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("fcp") != null && !jsonObj.get("fcp").isJsonNull() && !jsonObj.get("fcp").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fcp` to be an array in the JSON string but got `%s`", jsonObj.get("fcp").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("lcp") != null && !jsonObj.get("lcp").isJsonNull() && !jsonObj.get("lcp").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `lcp` to be an array in the JSON string but got `%s`", jsonObj.get("lcp").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("performanceScore") != null && !jsonObj.get("performanceScore").isJsonNull() && !jsonObj.get("performanceScore").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `performanceScore` to be an array in the JSON string but got `%s`", jsonObj.get("performanceScore").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("si") != null && !jsonObj.get("si").isJsonNull() && !jsonObj.get("si").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `si` to be an array in the JSON string but got `%s`", jsonObj.get("si").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tbt") != null && !jsonObj.get("tbt").isJsonNull() && !jsonObj.get("tbt").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tbt` to be an array in the JSON string but got `%s`", jsonObj.get("tbt").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ttfb") != null && !jsonObj.get("ttfb").isJsonNull() && !jsonObj.get("ttfb").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ttfb` to be an array in the JSON string but got `%s`", jsonObj.get("ttfb").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tti") != null && !jsonObj.get("tti").isJsonNull() && !jsonObj.get("tti").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tti` to be an array in the JSON string but got `%s`", jsonObj.get("tti").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ObservatoryTrend.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ObservatoryTrend' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ObservatoryTrend> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ObservatoryTrend.class));

       return (TypeAdapter<T>) new TypeAdapter<ObservatoryTrend>() {
           @Override
           public void write(JsonWriter out, ObservatoryTrend value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ObservatoryTrend read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ObservatoryTrend given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ObservatoryTrend
  * @throws IOException if the JSON string is invalid with respect to ObservatoryTrend
  */
  public static ObservatoryTrend fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ObservatoryTrend.class);
  }

 /**
  * Convert an instance of ObservatoryTrend to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
