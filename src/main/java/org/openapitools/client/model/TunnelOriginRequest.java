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
import java.util.Arrays;
import org.openapitools.client.model.TunnelOriginRequestAccess;

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
 * Configuration parameters of connection between cloudflared and origin server.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TunnelOriginRequest {
  public static final String SERIALIZED_NAME_ACCESS = "access";
  @SerializedName(SERIALIZED_NAME_ACCESS)
  private TunnelOriginRequestAccess access;

  public static final String SERIALIZED_NAME_CA_POOL = "caPool";
  @SerializedName(SERIALIZED_NAME_CA_POOL)
  private String caPool = "";

  public static final String SERIALIZED_NAME_CONNECT_TIMEOUT = "connectTimeout";
  @SerializedName(SERIALIZED_NAME_CONNECT_TIMEOUT)
  private Integer connectTimeout = 10;

  public static final String SERIALIZED_NAME_DISABLE_CHUNKED_ENCODING = "disableChunkedEncoding";
  @SerializedName(SERIALIZED_NAME_DISABLE_CHUNKED_ENCODING)
  private Boolean disableChunkedEncoding;

  public static final String SERIALIZED_NAME_HTTP2_ORIGIN = "http2Origin";
  @SerializedName(SERIALIZED_NAME_HTTP2_ORIGIN)
  private Boolean http2Origin;

  public static final String SERIALIZED_NAME_HTTP_HOST_HEADER = "httpHostHeader";
  @SerializedName(SERIALIZED_NAME_HTTP_HOST_HEADER)
  private String httpHostHeader;

  public static final String SERIALIZED_NAME_KEEP_ALIVE_CONNECTIONS = "keepAliveConnections";
  @SerializedName(SERIALIZED_NAME_KEEP_ALIVE_CONNECTIONS)
  private Integer keepAliveConnections = 100;

  public static final String SERIALIZED_NAME_KEEP_ALIVE_TIMEOUT = "keepAliveTimeout";
  @SerializedName(SERIALIZED_NAME_KEEP_ALIVE_TIMEOUT)
  private Integer keepAliveTimeout = 90;

  public static final String SERIALIZED_NAME_NO_HAPPY_EYEBALLS = "noHappyEyeballs";
  @SerializedName(SERIALIZED_NAME_NO_HAPPY_EYEBALLS)
  private Boolean noHappyEyeballs = false;

  public static final String SERIALIZED_NAME_NO_T_L_S_VERIFY = "noTLSVerify";
  @SerializedName(SERIALIZED_NAME_NO_T_L_S_VERIFY)
  private Boolean noTLSVerify = false;

  public static final String SERIALIZED_NAME_ORIGIN_SERVER_NAME = "originServerName";
  @SerializedName(SERIALIZED_NAME_ORIGIN_SERVER_NAME)
  private String originServerName = "";

  public static final String SERIALIZED_NAME_PROXY_TYPE = "proxyType";
  @SerializedName(SERIALIZED_NAME_PROXY_TYPE)
  private String proxyType = "";

  public static final String SERIALIZED_NAME_TCP_KEEP_ALIVE = "tcpKeepAlive";
  @SerializedName(SERIALIZED_NAME_TCP_KEEP_ALIVE)
  private Integer tcpKeepAlive = 30;

  public static final String SERIALIZED_NAME_TLS_TIMEOUT = "tlsTimeout";
  @SerializedName(SERIALIZED_NAME_TLS_TIMEOUT)
  private Integer tlsTimeout = 10;

  public TunnelOriginRequest() {
  }

  public TunnelOriginRequest access(TunnelOriginRequestAccess access) {
    this.access = access;
    return this;
  }

   /**
   * Get access
   * @return access
  **/
  @javax.annotation.Nullable
  public TunnelOriginRequestAccess getAccess() {
    return access;
  }

  public void setAccess(TunnelOriginRequestAccess access) {
    this.access = access;
  }


  public TunnelOriginRequest caPool(String caPool) {
    this.caPool = caPool;
    return this;
  }

   /**
   * Path to the certificate authority (CA) for the certificate of your origin. This option should be used only if your certificate is not signed by Cloudflare.
   * @return caPool
  **/
  @javax.annotation.Nullable
  public String getCaPool() {
    return caPool;
  }

  public void setCaPool(String caPool) {
    this.caPool = caPool;
  }


  public TunnelOriginRequest connectTimeout(Integer connectTimeout) {
    this.connectTimeout = connectTimeout;
    return this;
  }

   /**
   * Timeout for establishing a new TCP connection to your origin server. This excludes the time taken to establish TLS, which is controlled by tlsTimeout.
   * @return connectTimeout
  **/
  @javax.annotation.Nullable
  public Integer getConnectTimeout() {
    return connectTimeout;
  }

  public void setConnectTimeout(Integer connectTimeout) {
    this.connectTimeout = connectTimeout;
  }


  public TunnelOriginRequest disableChunkedEncoding(Boolean disableChunkedEncoding) {
    this.disableChunkedEncoding = disableChunkedEncoding;
    return this;
  }

   /**
   * Disables chunked transfer encoding. Useful if you are running a WSGI server.
   * @return disableChunkedEncoding
  **/
  @javax.annotation.Nullable
  public Boolean getDisableChunkedEncoding() {
    return disableChunkedEncoding;
  }

  public void setDisableChunkedEncoding(Boolean disableChunkedEncoding) {
    this.disableChunkedEncoding = disableChunkedEncoding;
  }


  public TunnelOriginRequest http2Origin(Boolean http2Origin) {
    this.http2Origin = http2Origin;
    return this;
  }

   /**
   * Attempt to connect to origin using HTTP2. Origin must be configured as https.
   * @return http2Origin
  **/
  @javax.annotation.Nullable
  public Boolean getHttp2Origin() {
    return http2Origin;
  }

  public void setHttp2Origin(Boolean http2Origin) {
    this.http2Origin = http2Origin;
  }


  public TunnelOriginRequest httpHostHeader(String httpHostHeader) {
    this.httpHostHeader = httpHostHeader;
    return this;
  }

   /**
   * Sets the HTTP Host header on requests sent to the local service.
   * @return httpHostHeader
  **/
  @javax.annotation.Nullable
  public String getHttpHostHeader() {
    return httpHostHeader;
  }

  public void setHttpHostHeader(String httpHostHeader) {
    this.httpHostHeader = httpHostHeader;
  }


  public TunnelOriginRequest keepAliveConnections(Integer keepAliveConnections) {
    this.keepAliveConnections = keepAliveConnections;
    return this;
  }

   /**
   * Maximum number of idle keepalive connections between Tunnel and your origin. This does not restrict the total number of concurrent connections.
   * @return keepAliveConnections
  **/
  @javax.annotation.Nullable
  public Integer getKeepAliveConnections() {
    return keepAliveConnections;
  }

  public void setKeepAliveConnections(Integer keepAliveConnections) {
    this.keepAliveConnections = keepAliveConnections;
  }


  public TunnelOriginRequest keepAliveTimeout(Integer keepAliveTimeout) {
    this.keepAliveTimeout = keepAliveTimeout;
    return this;
  }

   /**
   * Timeout after which an idle keepalive connection can be discarded.
   * @return keepAliveTimeout
  **/
  @javax.annotation.Nullable
  public Integer getKeepAliveTimeout() {
    return keepAliveTimeout;
  }

  public void setKeepAliveTimeout(Integer keepAliveTimeout) {
    this.keepAliveTimeout = keepAliveTimeout;
  }


  public TunnelOriginRequest noHappyEyeballs(Boolean noHappyEyeballs) {
    this.noHappyEyeballs = noHappyEyeballs;
    return this;
  }

   /**
   * Disable the “happy eyeballs” algorithm for IPv4/IPv6 fallback if your local network has misconfigured one of the protocols.
   * @return noHappyEyeballs
  **/
  @javax.annotation.Nullable
  public Boolean getNoHappyEyeballs() {
    return noHappyEyeballs;
  }

  public void setNoHappyEyeballs(Boolean noHappyEyeballs) {
    this.noHappyEyeballs = noHappyEyeballs;
  }


  public TunnelOriginRequest noTLSVerify(Boolean noTLSVerify) {
    this.noTLSVerify = noTLSVerify;
    return this;
  }

   /**
   * Disables TLS verification of the certificate presented by your origin. Will allow any certificate from the origin to be accepted.
   * @return noTLSVerify
  **/
  @javax.annotation.Nullable
  public Boolean getNoTLSVerify() {
    return noTLSVerify;
  }

  public void setNoTLSVerify(Boolean noTLSVerify) {
    this.noTLSVerify = noTLSVerify;
  }


  public TunnelOriginRequest originServerName(String originServerName) {
    this.originServerName = originServerName;
    return this;
  }

   /**
   * Hostname that cloudflared should expect from your origin server certificate.
   * @return originServerName
  **/
  @javax.annotation.Nullable
  public String getOriginServerName() {
    return originServerName;
  }

  public void setOriginServerName(String originServerName) {
    this.originServerName = originServerName;
  }


  public TunnelOriginRequest proxyType(String proxyType) {
    this.proxyType = proxyType;
    return this;
  }

   /**
   * cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures what type of proxy will be started. Valid options are: \&quot;\&quot; for the regular proxy and \&quot;socks\&quot; for a SOCKS5 proxy. 
   * @return proxyType
  **/
  @javax.annotation.Nullable
  public String getProxyType() {
    return proxyType;
  }

  public void setProxyType(String proxyType) {
    this.proxyType = proxyType;
  }


  public TunnelOriginRequest tcpKeepAlive(Integer tcpKeepAlive) {
    this.tcpKeepAlive = tcpKeepAlive;
    return this;
  }

   /**
   * The timeout after which a TCP keepalive packet is sent on a connection between Tunnel and the origin server.
   * @return tcpKeepAlive
  **/
  @javax.annotation.Nullable
  public Integer getTcpKeepAlive() {
    return tcpKeepAlive;
  }

  public void setTcpKeepAlive(Integer tcpKeepAlive) {
    this.tcpKeepAlive = tcpKeepAlive;
  }


  public TunnelOriginRequest tlsTimeout(Integer tlsTimeout) {
    this.tlsTimeout = tlsTimeout;
    return this;
  }

   /**
   * Timeout for completing a TLS handshake to your origin server, if you have chosen to connect Tunnel to an HTTPS server.
   * @return tlsTimeout
  **/
  @javax.annotation.Nullable
  public Integer getTlsTimeout() {
    return tlsTimeout;
  }

  public void setTlsTimeout(Integer tlsTimeout) {
    this.tlsTimeout = tlsTimeout;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TunnelOriginRequest tunnelOriginRequest = (TunnelOriginRequest) o;
    return Objects.equals(this.access, tunnelOriginRequest.access) &&
        Objects.equals(this.caPool, tunnelOriginRequest.caPool) &&
        Objects.equals(this.connectTimeout, tunnelOriginRequest.connectTimeout) &&
        Objects.equals(this.disableChunkedEncoding, tunnelOriginRequest.disableChunkedEncoding) &&
        Objects.equals(this.http2Origin, tunnelOriginRequest.http2Origin) &&
        Objects.equals(this.httpHostHeader, tunnelOriginRequest.httpHostHeader) &&
        Objects.equals(this.keepAliveConnections, tunnelOriginRequest.keepAliveConnections) &&
        Objects.equals(this.keepAliveTimeout, tunnelOriginRequest.keepAliveTimeout) &&
        Objects.equals(this.noHappyEyeballs, tunnelOriginRequest.noHappyEyeballs) &&
        Objects.equals(this.noTLSVerify, tunnelOriginRequest.noTLSVerify) &&
        Objects.equals(this.originServerName, tunnelOriginRequest.originServerName) &&
        Objects.equals(this.proxyType, tunnelOriginRequest.proxyType) &&
        Objects.equals(this.tcpKeepAlive, tunnelOriginRequest.tcpKeepAlive) &&
        Objects.equals(this.tlsTimeout, tunnelOriginRequest.tlsTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, caPool, connectTimeout, disableChunkedEncoding, http2Origin, httpHostHeader, keepAliveConnections, keepAliveTimeout, noHappyEyeballs, noTLSVerify, originServerName, proxyType, tcpKeepAlive, tlsTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TunnelOriginRequest {\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    caPool: ").append(toIndentedString(caPool)).append("\n");
    sb.append("    connectTimeout: ").append(toIndentedString(connectTimeout)).append("\n");
    sb.append("    disableChunkedEncoding: ").append(toIndentedString(disableChunkedEncoding)).append("\n");
    sb.append("    http2Origin: ").append(toIndentedString(http2Origin)).append("\n");
    sb.append("    httpHostHeader: ").append(toIndentedString(httpHostHeader)).append("\n");
    sb.append("    keepAliveConnections: ").append(toIndentedString(keepAliveConnections)).append("\n");
    sb.append("    keepAliveTimeout: ").append(toIndentedString(keepAliveTimeout)).append("\n");
    sb.append("    noHappyEyeballs: ").append(toIndentedString(noHappyEyeballs)).append("\n");
    sb.append("    noTLSVerify: ").append(toIndentedString(noTLSVerify)).append("\n");
    sb.append("    originServerName: ").append(toIndentedString(originServerName)).append("\n");
    sb.append("    proxyType: ").append(toIndentedString(proxyType)).append("\n");
    sb.append("    tcpKeepAlive: ").append(toIndentedString(tcpKeepAlive)).append("\n");
    sb.append("    tlsTimeout: ").append(toIndentedString(tlsTimeout)).append("\n");
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
    openapiFields.add("access");
    openapiFields.add("caPool");
    openapiFields.add("connectTimeout");
    openapiFields.add("disableChunkedEncoding");
    openapiFields.add("http2Origin");
    openapiFields.add("httpHostHeader");
    openapiFields.add("keepAliveConnections");
    openapiFields.add("keepAliveTimeout");
    openapiFields.add("noHappyEyeballs");
    openapiFields.add("noTLSVerify");
    openapiFields.add("originServerName");
    openapiFields.add("proxyType");
    openapiFields.add("tcpKeepAlive");
    openapiFields.add("tlsTimeout");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TunnelOriginRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TunnelOriginRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TunnelOriginRequest is not found in the empty JSON string", TunnelOriginRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TunnelOriginRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TunnelOriginRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `access`
      if (jsonObj.get("access") != null && !jsonObj.get("access").isJsonNull()) {
        TunnelOriginRequestAccess.validateJsonElement(jsonObj.get("access"));
      }
      if ((jsonObj.get("caPool") != null && !jsonObj.get("caPool").isJsonNull()) && !jsonObj.get("caPool").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caPool` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caPool").toString()));
      }
      if ((jsonObj.get("httpHostHeader") != null && !jsonObj.get("httpHostHeader").isJsonNull()) && !jsonObj.get("httpHostHeader").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `httpHostHeader` to be a primitive type in the JSON string but got `%s`", jsonObj.get("httpHostHeader").toString()));
      }
      if ((jsonObj.get("originServerName") != null && !jsonObj.get("originServerName").isJsonNull()) && !jsonObj.get("originServerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originServerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originServerName").toString()));
      }
      if ((jsonObj.get("proxyType") != null && !jsonObj.get("proxyType").isJsonNull()) && !jsonObj.get("proxyType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proxyType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proxyType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TunnelOriginRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TunnelOriginRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TunnelOriginRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TunnelOriginRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TunnelOriginRequest>() {
           @Override
           public void write(JsonWriter out, TunnelOriginRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TunnelOriginRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TunnelOriginRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TunnelOriginRequest
  * @throws IOException if the JSON string is invalid with respect to TunnelOriginRequest
  */
  public static TunnelOriginRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TunnelOriginRequest.class);
  }

 /**
  * Convert an instance of TunnelOriginRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

