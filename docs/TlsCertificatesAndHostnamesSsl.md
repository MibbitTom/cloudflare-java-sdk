

# TlsCertificatesAndHostnamesSsl

SSL properties for the custom hostname.

## oneOf schemas
* [TlsCertificatesAndHostnamesSslOneOf](TlsCertificatesAndHostnamesSslOneOf.md)

## Example
```java
// Import classes:
import cloudflare.sdk.models.TlsCertificatesAndHostnamesSsl;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesSslOneOf;

public class Example {
    public static void main(String[] args) {
        TlsCertificatesAndHostnamesSsl exampleTlsCertificatesAndHostnamesSsl = new TlsCertificatesAndHostnamesSsl();

        // create a new TlsCertificatesAndHostnamesSslOneOf
        TlsCertificatesAndHostnamesSslOneOf exampleTlsCertificatesAndHostnamesSslOneOf = new TlsCertificatesAndHostnamesSslOneOf();
        // set TlsCertificatesAndHostnamesSsl to TlsCertificatesAndHostnamesSslOneOf
        exampleTlsCertificatesAndHostnamesSsl.setActualInstance(exampleTlsCertificatesAndHostnamesSslOneOf);
        // to get back the TlsCertificatesAndHostnamesSslOneOf set earlier
        TlsCertificatesAndHostnamesSslOneOf testTlsCertificatesAndHostnamesSslOneOf = (TlsCertificatesAndHostnamesSslOneOf) exampleTlsCertificatesAndHostnamesSsl.getActualInstance();
    }
}
```


