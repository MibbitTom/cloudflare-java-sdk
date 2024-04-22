

# FirewallFilters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**configurationTarget** | [**ConfigurationTargetEnum**](#ConfigurationTargetEnum) | The target to search in existing rules. |  [optional] |
|**configurationValue** | **String** | The target value to search for in existing rules: an IP address, an IP address range, or a country code, depending on the provided &#x60;configuration.target&#x60;. Notes: You can search for a single IPv4 address, an IP address range with a subnet of &#39;/16&#39; or &#39;/24&#39;, or a two-letter ISO-3166-1 alpha-2 country code. |  [optional] |
|**match** | [**MatchEnum**](#MatchEnum) | When set to &#x60;all&#x60;, all the search requirements must match. When set to &#x60;any&#x60;, only one of the search requirements has to match. |  [optional] |
|**mode** | **FirewallSchemasMode** |  |  [optional] |
|**notes** | **String** | The string to search for in the notes of existing IP Access rules. Notes: For example, the string &#39;attack&#39; would match IP Access rules with notes &#39;Attack 26/02&#39; and &#39;Attack 27/02&#39;. The search is case insensitive. |  [optional] |



## Enum: ConfigurationTargetEnum

| Name | Value |
|---- | -----|
| IP | &quot;ip&quot; |
| IP_RANGE | &quot;ip_range&quot; |
| ASN | &quot;asn&quot; |
| COUNTRY | &quot;country&quot; |



## Enum: MatchEnum

| Name | Value |
|---- | -----|
| ANY | &quot;any&quot; |
| ALL | &quot;all&quot; |



