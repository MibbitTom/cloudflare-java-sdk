

# TlsCertificatesAndHostnamesValue

The tls setting value.

## oneOf schemas
* [BigDecimal](BigDecimal.md)
* [List<String>](List<String>.md)
* [String](String.md)

## Example
```java
// Import classes:
import cloudflare.sdk.models.TlsCertificatesAndHostnamesValue;
import cloudflare.sdk.models.BigDecimal;
import cloudflare.sdk.models.List<String>;
import cloudflare.sdk.models.String;

public class Example {
    public static void main(String[] args) {
        TlsCertificatesAndHostnamesValue exampleTlsCertificatesAndHostnamesValue = new TlsCertificatesAndHostnamesValue();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set TlsCertificatesAndHostnamesValue to BigDecimal
        exampleTlsCertificatesAndHostnamesValue.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleTlsCertificatesAndHostnamesValue.getActualInstance();

        // create a new List<String>
        List<String> exampleList<String> = new List<String>();
        // set TlsCertificatesAndHostnamesValue to List<String>
        exampleTlsCertificatesAndHostnamesValue.setActualInstance(exampleList<String>);
        // to get back the List<String> set earlier
        List<String> testList<String> = (List<String>) exampleTlsCertificatesAndHostnamesValue.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set TlsCertificatesAndHostnamesValue to String
        exampleTlsCertificatesAndHostnamesValue.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleTlsCertificatesAndHostnamesValue.getActualInstance();
    }
}
```


