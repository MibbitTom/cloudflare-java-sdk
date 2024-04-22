

# AccessSchemasAzureADAllOfConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Your OAuth Client ID |  [optional] |
|**clientSecret** | **String** | Your OAuth Client Secret |  [optional] |
|**conditionalAccessEnabled** | **Boolean** | Should Cloudflare try to load authentication contexts from your account |  [optional] |
|**directoryId** | **String** | Your Azure directory uuid |  [optional] |
|**prompt** | [**PromptEnum**](#PromptEnum) | Indicates the type of user interaction that is required. prompt&#x3D;login forces the user to enter their credentials on that request, negating single-sign on. prompt&#x3D;none is the opposite. It ensures that the user isn&#39;t presented with any interactive prompt. If the request can&#39;t be completed silently by using single-sign on, the Microsoft identity platform returns an interaction_required error. prompt&#x3D;select_account interrupts single sign-on providing account selection experience listing all the accounts either in session or any remembered account or an option to choose to use a different account altogether. |  [optional] |
|**supportGroups** | **Boolean** | Should Cloudflare try to load groups from your account |  [optional] |



## Enum: PromptEnum

| Name | Value |
|---- | -----|
| LOGIN | &quot;login&quot; |
| SELECT_ACCOUNT | &quot;select_account&quot; |
| NONE | &quot;none&quot; |



