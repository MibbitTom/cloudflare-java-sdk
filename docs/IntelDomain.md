

# IntelDomain


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalInformation** | [**IntelAdditionalInformation**](IntelAdditionalInformation.md) |  |  [optional] |
|**application** | [**IntelApplication**](IntelApplication.md) |  |  [optional] |
|**contentCategories** | **Object** | Current content categories. |  [optional] |
|**domain** | **String** |  |  [optional] |
|**inheritedContentCategories** | [**List&lt;IntelCategoryWithSuperCategoryId&gt;**](IntelCategoryWithSuperCategoryId.md) |  |  [optional] |
|**inheritedFrom** | **String** | Domain from which &#x60;inherited_content_categories&#x60; and &#x60;inherited_risk_types&#x60; are inherited, if applicable. |  [optional] |
|**inheritedRiskTypes** | [**List&lt;IntelCategoryWithSuperCategoryId&gt;**](IntelCategoryWithSuperCategoryId.md) |  |  [optional] |
|**popularityRank** | **Integer** | Global Cloudflare 100k ranking for the last 30 days, if available for the hostname. The top ranked domain is 1, the lowest ranked domain is 100,000. |  [optional] |
|**resolvesToRefs** | [**List&lt;IntelResolvesToRef&gt;**](IntelResolvesToRef.md) | Specifies a list of references to one or more IP addresses or domain names that the domain name currently resolves to. |  [optional] |
|**riskScore** | **BigDecimal** | Hostname risk score, which is a value between 0 (lowest risk) to 1 (highest risk). |  [optional] |
|**riskTypes** | **Object** |  |  [optional] |



