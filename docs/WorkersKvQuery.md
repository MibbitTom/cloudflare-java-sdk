

# WorkersKvQuery

For specifying result metrics.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dimensions** | **List&lt;String&gt;** | Can be used to break down the data by given attributes. |  [optional] |
|**filters** | **String** | Used to filter rows by one or more dimensions. Filters can be combined using OR and AND boolean logic. AND takes precedence over OR in all the expressions. The OR operator is defined using a comma (,) or OR keyword surrounded by whitespace. The AND operator is defined using a semicolon (;) or AND keyword surrounded by whitespace. Note that the semicolon is a reserved character in URLs (rfc1738) and needs to be percent-encoded as %3B. Comparison options are:  Operator                  | Name                            | URL Encoded --------------------------|---------------------------------|-------------------------- &#x3D;&#x3D;                        | Equals                          | %3D%3D !&#x3D;                        | Does not equals                 | !%3D &gt;                        | Greater Than                    | %3E &lt;                         | Less Than                       | %3C &gt;&#x3D;                       | Greater than or equal to        | %3E%3D &lt;&#x3D;                        | Less than or equal to           | %3C%3D     . |  [optional] |
|**limit** | **Integer** | Limit number of returned metrics. |  [optional] |
|**metrics** | **List&lt;String&gt;** | One or more metrics to compute. |  [optional] |
|**since** | **OffsetDateTime** | Start of time interval to query, defaults to 6 hours before request received. |  [optional] |
|**sort** | **List&lt;Object&gt;** | Array of dimensions or metrics to sort by, each dimension/metric may be prefixed by - (descending) or + (ascending). |  [optional] |
|**until** | **OffsetDateTime** | End of time interval to query, defaults to current time. |  [optional] |



