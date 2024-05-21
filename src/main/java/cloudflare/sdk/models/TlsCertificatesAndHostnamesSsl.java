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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesCertificateAuthority;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesSslOneOf;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesSslOneOfValidationErrorsInner;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesSslsettings;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesValidationRecord;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import cloudflare.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-21T10:12:24.693742223+01:00[Europe/London]", comments = "Generator version: 7.5.0")
@JsonDeserialize(using = TlsCertificatesAndHostnamesSsl.TlsCertificatesAndHostnamesSslDeserializer.class)
@JsonSerialize(using = TlsCertificatesAndHostnamesSsl.TlsCertificatesAndHostnamesSslSerializer.class)
public class TlsCertificatesAndHostnamesSsl extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(TlsCertificatesAndHostnamesSsl.class.getName());

    public static class TlsCertificatesAndHostnamesSslSerializer extends StdSerializer<TlsCertificatesAndHostnamesSsl> {
        public TlsCertificatesAndHostnamesSslSerializer(Class<TlsCertificatesAndHostnamesSsl> t) {
            super(t);
        }

        public TlsCertificatesAndHostnamesSslSerializer() {
            this(null);
        }

        @Override
        public void serialize(TlsCertificatesAndHostnamesSsl value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class TlsCertificatesAndHostnamesSslDeserializer extends StdDeserializer<TlsCertificatesAndHostnamesSsl> {
        public TlsCertificatesAndHostnamesSslDeserializer() {
            this(TlsCertificatesAndHostnamesSsl.class);
        }

        public TlsCertificatesAndHostnamesSslDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public TlsCertificatesAndHostnamesSsl deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize TlsCertificatesAndHostnamesSslOneOf
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TlsCertificatesAndHostnamesSslOneOf.class.equals(Integer.class) || TlsCertificatesAndHostnamesSslOneOf.class.equals(Long.class) || TlsCertificatesAndHostnamesSslOneOf.class.equals(Float.class) || TlsCertificatesAndHostnamesSslOneOf.class.equals(Double.class) || TlsCertificatesAndHostnamesSslOneOf.class.equals(Boolean.class) || TlsCertificatesAndHostnamesSslOneOf.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TlsCertificatesAndHostnamesSslOneOf.class.equals(Integer.class) || TlsCertificatesAndHostnamesSslOneOf.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TlsCertificatesAndHostnamesSslOneOf.class.equals(Float.class) || TlsCertificatesAndHostnamesSslOneOf.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (TlsCertificatesAndHostnamesSslOneOf.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TlsCertificatesAndHostnamesSslOneOf.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(TlsCertificatesAndHostnamesSslOneOf.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'TlsCertificatesAndHostnamesSslOneOf'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TlsCertificatesAndHostnamesSslOneOf'", e);
            }

            if (match == 1) {
                TlsCertificatesAndHostnamesSsl ret = new TlsCertificatesAndHostnamesSsl();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for TlsCertificatesAndHostnamesSsl: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public TlsCertificatesAndHostnamesSsl getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "TlsCertificatesAndHostnamesSsl cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public TlsCertificatesAndHostnamesSsl() {
        super("oneOf", Boolean.FALSE);
    }

    public TlsCertificatesAndHostnamesSsl(TlsCertificatesAndHostnamesSslOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TlsCertificatesAndHostnamesSslOneOf", TlsCertificatesAndHostnamesSslOneOf.class);
        JSON.registerDescendants(TlsCertificatesAndHostnamesSsl.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return TlsCertificatesAndHostnamesSsl.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * TlsCertificatesAndHostnamesSslOneOf
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(TlsCertificatesAndHostnamesSslOneOf.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be TlsCertificatesAndHostnamesSslOneOf");
    }

    /**
     * Get the actual instance, which can be the following:
     * TlsCertificatesAndHostnamesSslOneOf
     *
     * @return The actual instance (TlsCertificatesAndHostnamesSslOneOf)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TlsCertificatesAndHostnamesSslOneOf`. If the actual instance is not `TlsCertificatesAndHostnamesSslOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TlsCertificatesAndHostnamesSslOneOf`
     * @throws ClassCastException if the instance is not `TlsCertificatesAndHostnamesSslOneOf`
     */
    public TlsCertificatesAndHostnamesSslOneOf getTlsCertificatesAndHostnamesSslOneOf() throws ClassCastException {
        return (TlsCertificatesAndHostnamesSslOneOf)super.getActualInstance();
    }



  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    if (getActualInstance() instanceof TlsCertificatesAndHostnamesSslOneOf) {
        if (getActualInstance() != null) {
          joiner.add(((TlsCertificatesAndHostnamesSslOneOf)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

