

# TlsCertificatesAndHostnamesSslpost

SSL properties used when creating the custom hostname.

## oneOf schemas
* [TlsCertificatesAndHostnamesSslpostOneOf](TlsCertificatesAndHostnamesSslpostOneOf.md)

## Example
```java
// Import classes:
import cloudflare.sdk.models.TlsCertificatesAndHostnamesSslpost;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesSslpostOneOf;

public class Example {
    public static void main(String[] args) {
        TlsCertificatesAndHostnamesSslpost exampleTlsCertificatesAndHostnamesSslpost = new TlsCertificatesAndHostnamesSslpost();

        // create a new TlsCertificatesAndHostnamesSslpostOneOf
        TlsCertificatesAndHostnamesSslpostOneOf exampleTlsCertificatesAndHostnamesSslpostOneOf = new TlsCertificatesAndHostnamesSslpostOneOf();
        // set TlsCertificatesAndHostnamesSslpost to TlsCertificatesAndHostnamesSslpostOneOf
        exampleTlsCertificatesAndHostnamesSslpost.setActualInstance(exampleTlsCertificatesAndHostnamesSslpostOneOf);
        // to get back the TlsCertificatesAndHostnamesSslpostOneOf set earlier
        TlsCertificatesAndHostnamesSslpostOneOf testTlsCertificatesAndHostnamesSslpostOneOf = (TlsCertificatesAndHostnamesSslpostOneOf) exampleTlsCertificatesAndHostnamesSslpost.getActualInstance();
    }
}
```


