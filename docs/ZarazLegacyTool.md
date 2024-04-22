

# ZarazLegacyTool


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockingTriggers** | **List&lt;String&gt;** | List of blocking trigger IDs |  |
|**defaultFields** | [**Map&lt;String, ZarazBaseMcAllOfSettings&gt;**](ZarazBaseMcAllOfSettings.md) | Default fields for tool&#39;s actions |  |
|**defaultPurpose** | **String** | Default consent purpose ID |  [optional] |
|**enabled** | **Boolean** | Whether tool is enabled |  |
|**name** | **String** | Tool&#39;s name defined by the user |  |
|**vendorName** | **String** | Vendor name for TCF compliant consent modal, required for Custom Managed Components and Custom HTML tool with a defaultPurpose assigned |  [optional] |
|**vendorPolicyUrl** | **String** | Vendor&#39;s Privacy Policy URL for TCF compliant consent modal, required for Custom Managed Components and Custom HTML tool with a defaultPurpose assigned |  [optional] |
|**library** | **String** | Tool&#39;s internal name |  |
|**neoEvents** | [**List&lt;ZarazLegacyToolAllOfNeoEvents&gt;**](ZarazLegacyToolAllOfNeoEvents.md) | List of actions configured on a tool |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIBRARY | &quot;library&quot; |



