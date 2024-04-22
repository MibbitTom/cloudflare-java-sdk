

# ZarazZarazConfigBodyAllOfTools


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
|**neoEvents** | [**List&lt;ZarazBaseMcAllOfActions&gt;**](ZarazBaseMcAllOfActions.md) | DEPRECATED - List of actions configured on a tool. Either this or actions field is required. If both are present, actions field will take precedence. |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**actions** | [**Map&lt;String, ZarazBaseMcAllOfActions&gt;**](ZarazBaseMcAllOfActions.md) | Actions configured on a tool. Either this or neoEvents field is required. |  [optional] |
|**component** | **String** | Tool&#39;s internal name |  |
|**permissions** | **List&lt;String&gt;** | List of permissions granted to the component |  |
|**settings** | [**Map&lt;String, ZarazBaseMcAllOfSettings&gt;**](ZarazBaseMcAllOfSettings.md) | Tool&#39;s settings |  |
|**worker** | [**ZarazCustomManagedComponentAllOfWorker**](ZarazCustomManagedComponentAllOfWorker.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIBRARY | &quot;library&quot; |
| COMPONENT | &quot;component&quot; |
| CUSTOM_MC | &quot;custom-mc&quot; |



