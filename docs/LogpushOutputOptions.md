

# LogpushOutputOptions

The structured replacement for `logpull_options`. When including this field, the `logpull_option` field will be ignored.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**CVE_2021_4428** | **Boolean** | If set to true, will cause all occurrences of &#x60;${&#x60; in the generated files to be replaced with &#x60;x{&#x60;. |  [optional] |
|**batchPrefix** | **String** | String to be prepended before each batch. |  [optional] |
|**batchSuffix** | **String** | String to be appended after each batch. |  [optional] |
|**fieldDelimiter** | **String** | String to join fields. This field be ignored when &#x60;record_template&#x60; is set. |  [optional] |
|**fieldNames** | **List&lt;String&gt;** | List of field names to be included in the Logpush output. For the moment, there is no option to add all fields at once, so you must specify all the fields names you are interested in. |  [optional] |
|**outputType** | [**OutputTypeEnum**](#OutputTypeEnum) | Specifies the output type, such as &#x60;ndjson&#x60; or &#x60;csv&#x60;. This sets default values for the rest of the settings, depending on the chosen output type. Some formatting rules, like string quoting, are different between output types. |  [optional] |
|**recordDelimiter** | **String** | String to be inserted in-between the records as separator. |  [optional] |
|**recordPrefix** | **String** | String to be prepended before each record. |  [optional] |
|**recordSuffix** | **String** | String to be appended after each record. |  [optional] |
|**recordTemplate** | **String** | String to use as template for each record instead of the default comma-separated list. All fields used in the template must be present in &#x60;field_names&#x60; as well, otherwise they will end up as null. Format as a Go &#x60;text/template&#x60; without any standard functions, like conditionals, loops, sub-templates, etc. |  [optional] |
|**sampleRate** | **Float** | Floating number to specify sampling rate. Sampling is applied on top of filtering, and regardless of the current &#x60;sample_interval&#x60; of the data. |  [optional] |
|**timestampFormat** | [**TimestampFormatEnum**](#TimestampFormatEnum) | String to specify the format for timestamps, such as &#x60;unixnano&#x60;, &#x60;unix&#x60;, or &#x60;rfc3339&#x60;. |  [optional] |



## Enum: OutputTypeEnum

| Name | Value |
|---- | -----|
| NDJSON | &quot;ndjson&quot; |
| CSV | &quot;csv&quot; |



## Enum: TimestampFormatEnum

| Name | Value |
|---- | -----|
| UNIXNANO | &quot;unixnano&quot; |
| UNIX | &quot;unix&quot; |
| RFC3339 | &quot;rfc3339&quot; |



