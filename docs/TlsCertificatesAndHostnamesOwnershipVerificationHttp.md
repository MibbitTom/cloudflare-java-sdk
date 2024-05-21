

# TlsCertificatesAndHostnamesOwnershipVerificationHttp

This presents the token to be served by the given http url to activate a hostname.

## oneOf schemas
* [TlsCertificatesAndHostnamesOwnershipVerificationHttpOneOf](TlsCertificatesAndHostnamesOwnershipVerificationHttpOneOf.md)

## Example
```java
// Import classes:
import cloudflare.sdk.models.TlsCertificatesAndHostnamesOwnershipVerificationHttp;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesOwnershipVerificationHttpOneOf;

public class Example {
    public static void main(String[] args) {
        TlsCertificatesAndHostnamesOwnershipVerificationHttp exampleTlsCertificatesAndHostnamesOwnershipVerificationHttp = new TlsCertificatesAndHostnamesOwnershipVerificationHttp();

        // create a new TlsCertificatesAndHostnamesOwnershipVerificationHttpOneOf
        TlsCertificatesAndHostnamesOwnershipVerificationHttpOneOf exampleTlsCertificatesAndHostnamesOwnershipVerificationHttpOneOf = new TlsCertificatesAndHostnamesOwnershipVerificationHttpOneOf();
        // set TlsCertificatesAndHostnamesOwnershipVerificationHttp to TlsCertificatesAndHostnamesOwnershipVerificationHttpOneOf
        exampleTlsCertificatesAndHostnamesOwnershipVerificationHttp.setActualInstance(exampleTlsCertificatesAndHostnamesOwnershipVerificationHttpOneOf);
        // to get back the TlsCertificatesAndHostnamesOwnershipVerificationHttpOneOf set earlier
        TlsCertificatesAndHostnamesOwnershipVerificationHttpOneOf testTlsCertificatesAndHostnamesOwnershipVerificationHttpOneOf = (TlsCertificatesAndHostnamesOwnershipVerificationHttpOneOf) exampleTlsCertificatesAndHostnamesOwnershipVerificationHttp.getActualInstance();
    }
}
```


