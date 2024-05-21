

# TlsCertificatesAndHostnamesOwnershipVerification

This is a record which can be placed to activate a hostname.

## oneOf schemas
* [TlsCertificatesAndHostnamesOwnershipVerificationOneOf](TlsCertificatesAndHostnamesOwnershipVerificationOneOf.md)

## Example
```java
// Import classes:
import cloudflare.sdk.models.TlsCertificatesAndHostnamesOwnershipVerification;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesOwnershipVerificationOneOf;

public class Example {
    public static void main(String[] args) {
        TlsCertificatesAndHostnamesOwnershipVerification exampleTlsCertificatesAndHostnamesOwnershipVerification = new TlsCertificatesAndHostnamesOwnershipVerification();

        // create a new TlsCertificatesAndHostnamesOwnershipVerificationOneOf
        TlsCertificatesAndHostnamesOwnershipVerificationOneOf exampleTlsCertificatesAndHostnamesOwnershipVerificationOneOf = new TlsCertificatesAndHostnamesOwnershipVerificationOneOf();
        // set TlsCertificatesAndHostnamesOwnershipVerification to TlsCertificatesAndHostnamesOwnershipVerificationOneOf
        exampleTlsCertificatesAndHostnamesOwnershipVerification.setActualInstance(exampleTlsCertificatesAndHostnamesOwnershipVerificationOneOf);
        // to get back the TlsCertificatesAndHostnamesOwnershipVerificationOneOf set earlier
        TlsCertificatesAndHostnamesOwnershipVerificationOneOf testTlsCertificatesAndHostnamesOwnershipVerificationOneOf = (TlsCertificatesAndHostnamesOwnershipVerificationOneOf) exampleTlsCertificatesAndHostnamesOwnershipVerification.getActualInstance();
    }
}
```


