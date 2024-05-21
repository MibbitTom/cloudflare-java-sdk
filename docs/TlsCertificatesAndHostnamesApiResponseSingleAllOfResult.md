

# TlsCertificatesAndHostnamesApiResponseSingleAllOfResult

## anyOf schemas
* [Object](Object.md)
* [String](String.md)

## Example
```java
// Import classes:
import cloudflare.sdk.models.TlsCertificatesAndHostnamesApiResponseSingleAllOfResult;
import cloudflare.sdk.models.Object;
import cloudflare.sdk.models.String;

public class Example {
    public static void main(String[] args) {
        TlsCertificatesAndHostnamesApiResponseSingleAllOfResult exampleTlsCertificatesAndHostnamesApiResponseSingleAllOfResult = new TlsCertificatesAndHostnamesApiResponseSingleAllOfResult();

        // create a new Object
        Object exampleObject = new Object();
        // set TlsCertificatesAndHostnamesApiResponseSingleAllOfResult to Object
        exampleTlsCertificatesAndHostnamesApiResponseSingleAllOfResult.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleTlsCertificatesAndHostnamesApiResponseSingleAllOfResult.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set TlsCertificatesAndHostnamesApiResponseSingleAllOfResult to String
        exampleTlsCertificatesAndHostnamesApiResponseSingleAllOfResult.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleTlsCertificatesAndHostnamesApiResponseSingleAllOfResult.getActualInstance();
    }
}
```


