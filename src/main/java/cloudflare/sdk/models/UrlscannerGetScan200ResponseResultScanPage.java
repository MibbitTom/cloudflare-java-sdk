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
import cloudflare.sdk.models.UrlscannerGetScan200ResponseResultScanPageConsoleInner;
import cloudflare.sdk.models.UrlscannerGetScan200ResponseResultScanPageCookiesInner;
import cloudflare.sdk.models.UrlscannerGetScan200ResponseResultScanPageHeadersInner;
import cloudflare.sdk.models.UrlscannerGetScan200ResponseResultScanPageJs;
import cloudflare.sdk.models.UrlscannerGetScan200ResponseResultScanPageSecurityViolationsInner;
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
 * UrlscannerGetScan200ResponseResultScanPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class UrlscannerGetScan200ResponseResultScanPage {
  public static final String SERIALIZED_NAME_ASN = "asn";
  @SerializedName(SERIALIZED_NAME_ASN)
  private String asn;

  public static final String SERIALIZED_NAME_ASN_LOCATION_ALPHA2 = "asnLocationAlpha2";
  @SerializedName(SERIALIZED_NAME_ASN_LOCATION_ALPHA2)
  private String asnLocationAlpha2;

  public static final String SERIALIZED_NAME_ASNNAME = "asnname";
  @SerializedName(SERIALIZED_NAME_ASNNAME)
  private String asnname;

  public static final String SERIALIZED_NAME_CONSOLE = "console";
  @SerializedName(SERIALIZED_NAME_CONSOLE)
  private List<UrlscannerGetScan200ResponseResultScanPageConsoleInner> console = new ArrayList<>();

  public static final String SERIALIZED_NAME_COOKIES = "cookies";
  @SerializedName(SERIALIZED_NAME_COOKIES)
  private List<UrlscannerGetScan200ResponseResultScanPageCookiesInner> cookies = new ArrayList<>();

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_LOCATION_ALPHA2 = "countryLocationAlpha2";
  @SerializedName(SERIALIZED_NAME_COUNTRY_LOCATION_ALPHA2)
  private String countryLocationAlpha2;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<UrlscannerGetScan200ResponseResultScanPageHeadersInner> headers = new ArrayList<>();

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_JS = "js";
  @SerializedName(SERIALIZED_NAME_JS)
  private UrlscannerGetScan200ResponseResultScanPageJs js;

  public static final String SERIALIZED_NAME_SECURITY_VIOLATIONS = "securityViolations";
  @SerializedName(SERIALIZED_NAME_SECURITY_VIOLATIONS)
  private List<UrlscannerGetScan200ResponseResultScanPageSecurityViolationsInner> securityViolations = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BigDecimal status;

  public static final String SERIALIZED_NAME_SUBDIVISION1_NAME = "subdivision1Name";
  @SerializedName(SERIALIZED_NAME_SUBDIVISION1_NAME)
  private String subdivision1Name;

  public static final String SERIALIZED_NAME_SUBDIVISION2NAME = "subdivision2name";
  @SerializedName(SERIALIZED_NAME_SUBDIVISION2NAME)
  private String subdivision2name;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public UrlscannerGetScan200ResponseResultScanPage() {
  }

  public UrlscannerGetScan200ResponseResultScanPage asn(String asn) {
    this.asn = asn;
    return this;
  }

   /**
   * Get asn
   * @return asn
  **/
  @javax.annotation.Nonnull
  public String getAsn() {
    return asn;
  }

  public void setAsn(String asn) {
    this.asn = asn;
  }


  public UrlscannerGetScan200ResponseResultScanPage asnLocationAlpha2(String asnLocationAlpha2) {
    this.asnLocationAlpha2 = asnLocationAlpha2;
    return this;
  }

   /**
   * Get asnLocationAlpha2
   * @return asnLocationAlpha2
  **/
  @javax.annotation.Nonnull
  public String getAsnLocationAlpha2() {
    return asnLocationAlpha2;
  }

  public void setAsnLocationAlpha2(String asnLocationAlpha2) {
    this.asnLocationAlpha2 = asnLocationAlpha2;
  }


  public UrlscannerGetScan200ResponseResultScanPage asnname(String asnname) {
    this.asnname = asnname;
    return this;
  }

   /**
   * Get asnname
   * @return asnname
  **/
  @javax.annotation.Nonnull
  public String getAsnname() {
    return asnname;
  }

  public void setAsnname(String asnname) {
    this.asnname = asnname;
  }


  public UrlscannerGetScan200ResponseResultScanPage console(List<UrlscannerGetScan200ResponseResultScanPageConsoleInner> console) {
    this.console = console;
    return this;
  }

  public UrlscannerGetScan200ResponseResultScanPage addConsoleItem(UrlscannerGetScan200ResponseResultScanPageConsoleInner consoleItem) {
    if (this.console == null) {
      this.console = new ArrayList<>();
    }
    this.console.add(consoleItem);
    return this;
  }

   /**
   * Get console
   * @return console
  **/
  @javax.annotation.Nonnull
  public List<UrlscannerGetScan200ResponseResultScanPageConsoleInner> getConsole() {
    return console;
  }

  public void setConsole(List<UrlscannerGetScan200ResponseResultScanPageConsoleInner> console) {
    this.console = console;
  }


  public UrlscannerGetScan200ResponseResultScanPage cookies(List<UrlscannerGetScan200ResponseResultScanPageCookiesInner> cookies) {
    this.cookies = cookies;
    return this;
  }

  public UrlscannerGetScan200ResponseResultScanPage addCookiesItem(UrlscannerGetScan200ResponseResultScanPageCookiesInner cookiesItem) {
    if (this.cookies == null) {
      this.cookies = new ArrayList<>();
    }
    this.cookies.add(cookiesItem);
    return this;
  }

   /**
   * Get cookies
   * @return cookies
  **/
  @javax.annotation.Nonnull
  public List<UrlscannerGetScan200ResponseResultScanPageCookiesInner> getCookies() {
    return cookies;
  }

  public void setCookies(List<UrlscannerGetScan200ResponseResultScanPageCookiesInner> cookies) {
    this.cookies = cookies;
  }


  public UrlscannerGetScan200ResponseResultScanPage country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nonnull
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public UrlscannerGetScan200ResponseResultScanPage countryLocationAlpha2(String countryLocationAlpha2) {
    this.countryLocationAlpha2 = countryLocationAlpha2;
    return this;
  }

   /**
   * Get countryLocationAlpha2
   * @return countryLocationAlpha2
  **/
  @javax.annotation.Nonnull
  public String getCountryLocationAlpha2() {
    return countryLocationAlpha2;
  }

  public void setCountryLocationAlpha2(String countryLocationAlpha2) {
    this.countryLocationAlpha2 = countryLocationAlpha2;
  }


  public UrlscannerGetScan200ResponseResultScanPage domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @javax.annotation.Nonnull
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public UrlscannerGetScan200ResponseResultScanPage headers(List<UrlscannerGetScan200ResponseResultScanPageHeadersInner> headers) {
    this.headers = headers;
    return this;
  }

  public UrlscannerGetScan200ResponseResultScanPage addHeadersItem(UrlscannerGetScan200ResponseResultScanPageHeadersInner headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nonnull
  public List<UrlscannerGetScan200ResponseResultScanPageHeadersInner> getHeaders() {
    return headers;
  }

  public void setHeaders(List<UrlscannerGetScan200ResponseResultScanPageHeadersInner> headers) {
    this.headers = headers;
  }


  public UrlscannerGetScan200ResponseResultScanPage ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @javax.annotation.Nonnull
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public UrlscannerGetScan200ResponseResultScanPage js(UrlscannerGetScan200ResponseResultScanPageJs js) {
    this.js = js;
    return this;
  }

   /**
   * Get js
   * @return js
  **/
  @javax.annotation.Nonnull
  public UrlscannerGetScan200ResponseResultScanPageJs getJs() {
    return js;
  }

  public void setJs(UrlscannerGetScan200ResponseResultScanPageJs js) {
    this.js = js;
  }


  public UrlscannerGetScan200ResponseResultScanPage securityViolations(List<UrlscannerGetScan200ResponseResultScanPageSecurityViolationsInner> securityViolations) {
    this.securityViolations = securityViolations;
    return this;
  }

  public UrlscannerGetScan200ResponseResultScanPage addSecurityViolationsItem(UrlscannerGetScan200ResponseResultScanPageSecurityViolationsInner securityViolationsItem) {
    if (this.securityViolations == null) {
      this.securityViolations = new ArrayList<>();
    }
    this.securityViolations.add(securityViolationsItem);
    return this;
  }

   /**
   * Get securityViolations
   * @return securityViolations
  **/
  @javax.annotation.Nonnull
  public List<UrlscannerGetScan200ResponseResultScanPageSecurityViolationsInner> getSecurityViolations() {
    return securityViolations;
  }

  public void setSecurityViolations(List<UrlscannerGetScan200ResponseResultScanPageSecurityViolationsInner> securityViolations) {
    this.securityViolations = securityViolations;
  }


  public UrlscannerGetScan200ResponseResultScanPage status(BigDecimal status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
  }


  public UrlscannerGetScan200ResponseResultScanPage subdivision1Name(String subdivision1Name) {
    this.subdivision1Name = subdivision1Name;
    return this;
  }

   /**
   * Get subdivision1Name
   * @return subdivision1Name
  **/
  @javax.annotation.Nonnull
  public String getSubdivision1Name() {
    return subdivision1Name;
  }

  public void setSubdivision1Name(String subdivision1Name) {
    this.subdivision1Name = subdivision1Name;
  }


  public UrlscannerGetScan200ResponseResultScanPage subdivision2name(String subdivision2name) {
    this.subdivision2name = subdivision2name;
    return this;
  }

   /**
   * Get subdivision2name
   * @return subdivision2name
  **/
  @javax.annotation.Nonnull
  public String getSubdivision2name() {
    return subdivision2name;
  }

  public void setSubdivision2name(String subdivision2name) {
    this.subdivision2name = subdivision2name;
  }


  public UrlscannerGetScan200ResponseResultScanPage url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlscannerGetScan200ResponseResultScanPage urlscannerGetScan200ResponseResultScanPage = (UrlscannerGetScan200ResponseResultScanPage) o;
    return Objects.equals(this.asn, urlscannerGetScan200ResponseResultScanPage.asn) &&
        Objects.equals(this.asnLocationAlpha2, urlscannerGetScan200ResponseResultScanPage.asnLocationAlpha2) &&
        Objects.equals(this.asnname, urlscannerGetScan200ResponseResultScanPage.asnname) &&
        Objects.equals(this.console, urlscannerGetScan200ResponseResultScanPage.console) &&
        Objects.equals(this.cookies, urlscannerGetScan200ResponseResultScanPage.cookies) &&
        Objects.equals(this.country, urlscannerGetScan200ResponseResultScanPage.country) &&
        Objects.equals(this.countryLocationAlpha2, urlscannerGetScan200ResponseResultScanPage.countryLocationAlpha2) &&
        Objects.equals(this.domain, urlscannerGetScan200ResponseResultScanPage.domain) &&
        Objects.equals(this.headers, urlscannerGetScan200ResponseResultScanPage.headers) &&
        Objects.equals(this.ip, urlscannerGetScan200ResponseResultScanPage.ip) &&
        Objects.equals(this.js, urlscannerGetScan200ResponseResultScanPage.js) &&
        Objects.equals(this.securityViolations, urlscannerGetScan200ResponseResultScanPage.securityViolations) &&
        Objects.equals(this.status, urlscannerGetScan200ResponseResultScanPage.status) &&
        Objects.equals(this.subdivision1Name, urlscannerGetScan200ResponseResultScanPage.subdivision1Name) &&
        Objects.equals(this.subdivision2name, urlscannerGetScan200ResponseResultScanPage.subdivision2name) &&
        Objects.equals(this.url, urlscannerGetScan200ResponseResultScanPage.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asn, asnLocationAlpha2, asnname, console, cookies, country, countryLocationAlpha2, domain, headers, ip, js, securityViolations, status, subdivision1Name, subdivision2name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlscannerGetScan200ResponseResultScanPage {\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    asnLocationAlpha2: ").append(toIndentedString(asnLocationAlpha2)).append("\n");
    sb.append("    asnname: ").append(toIndentedString(asnname)).append("\n");
    sb.append("    console: ").append(toIndentedString(console)).append("\n");
    sb.append("    cookies: ").append(toIndentedString(cookies)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryLocationAlpha2: ").append(toIndentedString(countryLocationAlpha2)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    js: ").append(toIndentedString(js)).append("\n");
    sb.append("    securityViolations: ").append(toIndentedString(securityViolations)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subdivision1Name: ").append(toIndentedString(subdivision1Name)).append("\n");
    sb.append("    subdivision2name: ").append(toIndentedString(subdivision2name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("asn");
    openapiFields.add("asnLocationAlpha2");
    openapiFields.add("asnname");
    openapiFields.add("console");
    openapiFields.add("cookies");
    openapiFields.add("country");
    openapiFields.add("countryLocationAlpha2");
    openapiFields.add("domain");
    openapiFields.add("headers");
    openapiFields.add("ip");
    openapiFields.add("js");
    openapiFields.add("securityViolations");
    openapiFields.add("status");
    openapiFields.add("subdivision1Name");
    openapiFields.add("subdivision2name");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("asn");
    openapiRequiredFields.add("asnLocationAlpha2");
    openapiRequiredFields.add("asnname");
    openapiRequiredFields.add("console");
    openapiRequiredFields.add("cookies");
    openapiRequiredFields.add("country");
    openapiRequiredFields.add("countryLocationAlpha2");
    openapiRequiredFields.add("domain");
    openapiRequiredFields.add("headers");
    openapiRequiredFields.add("ip");
    openapiRequiredFields.add("js");
    openapiRequiredFields.add("securityViolations");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("subdivision1Name");
    openapiRequiredFields.add("subdivision2name");
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UrlscannerGetScan200ResponseResultScanPage
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UrlscannerGetScan200ResponseResultScanPage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlscannerGetScan200ResponseResultScanPage is not found in the empty JSON string", UrlscannerGetScan200ResponseResultScanPage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UrlscannerGetScan200ResponseResultScanPage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UrlscannerGetScan200ResponseResultScanPage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UrlscannerGetScan200ResponseResultScanPage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("asn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asn").toString()));
      }
      if (!jsonObj.get("asnLocationAlpha2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asnLocationAlpha2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asnLocationAlpha2").toString()));
      }
      if (!jsonObj.get("asnname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asnname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asnname").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("console").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `console` to be an array in the JSON string but got `%s`", jsonObj.get("console").toString()));
      }

      JsonArray jsonArrayconsole = jsonObj.getAsJsonArray("console");
      // validate the required field `console` (array)
      for (int i = 0; i < jsonArrayconsole.size(); i++) {
        UrlscannerGetScan200ResponseResultScanPageConsoleInner.validateJsonElement(jsonArrayconsole.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("cookies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cookies` to be an array in the JSON string but got `%s`", jsonObj.get("cookies").toString()));
      }

      JsonArray jsonArraycookies = jsonObj.getAsJsonArray("cookies");
      // validate the required field `cookies` (array)
      for (int i = 0; i < jsonArraycookies.size(); i++) {
        UrlscannerGetScan200ResponseResultScanPageCookiesInner.validateJsonElement(jsonArraycookies.get(i));
      };
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (!jsonObj.get("countryLocationAlpha2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryLocationAlpha2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryLocationAlpha2").toString()));
      }
      if (!jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("headers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `headers` to be an array in the JSON string but got `%s`", jsonObj.get("headers").toString()));
      }

      JsonArray jsonArrayheaders = jsonObj.getAsJsonArray("headers");
      // validate the required field `headers` (array)
      for (int i = 0; i < jsonArrayheaders.size(); i++) {
        UrlscannerGetScan200ResponseResultScanPageHeadersInner.validateJsonElement(jsonArrayheaders.get(i));
      };
      if (!jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
      }
      // validate the required field `js`
      UrlscannerGetScan200ResponseResultScanPageJs.validateJsonElement(jsonObj.get("js"));
      // ensure the json data is an array
      if (!jsonObj.get("securityViolations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `securityViolations` to be an array in the JSON string but got `%s`", jsonObj.get("securityViolations").toString()));
      }

      JsonArray jsonArraysecurityViolations = jsonObj.getAsJsonArray("securityViolations");
      // validate the required field `securityViolations` (array)
      for (int i = 0; i < jsonArraysecurityViolations.size(); i++) {
        UrlscannerGetScan200ResponseResultScanPageSecurityViolationsInner.validateJsonElement(jsonArraysecurityViolations.get(i));
      };
      if (!jsonObj.get("subdivision1Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subdivision1Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subdivision1Name").toString()));
      }
      if (!jsonObj.get("subdivision2name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subdivision2name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subdivision2name").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlscannerGetScan200ResponseResultScanPage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlscannerGetScan200ResponseResultScanPage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlscannerGetScan200ResponseResultScanPage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlscannerGetScan200ResponseResultScanPage.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlscannerGetScan200ResponseResultScanPage>() {
           @Override
           public void write(JsonWriter out, UrlscannerGetScan200ResponseResultScanPage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UrlscannerGetScan200ResponseResultScanPage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UrlscannerGetScan200ResponseResultScanPage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UrlscannerGetScan200ResponseResultScanPage
  * @throws IOException if the JSON string is invalid with respect to UrlscannerGetScan200ResponseResultScanPage
  */
  public static UrlscannerGetScan200ResponseResultScanPage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlscannerGetScan200ResponseResultScanPage.class);
  }

 /**
  * Convert an instance of UrlscannerGetScan200ResponseResultScanPage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

