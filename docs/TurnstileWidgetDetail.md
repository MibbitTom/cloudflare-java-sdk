

# TurnstileWidgetDetail

A Turnstile widget's detailed configuration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**botFightMode** | **Boolean** | If bot_fight_mode is set to &#x60;true&#x60;, Cloudflare issues computationally expensive challenges in response to malicious bots (ENT only).  |  |
|**clearanceLevel** | **TurnstileClearanceLevel** |  |  |
|**createdOn** | **OffsetDateTime** | When the widget was created. |  [readonly] |
|**domains** | **List&lt;String&gt;** |  |  |
|**mode** | **TurnstileMode** |  |  |
|**modifiedOn** | **OffsetDateTime** | When the widget was modified. |  [readonly] |
|**name** | **String** | Human readable widget name. Not unique. Cloudflare suggests that you set this to a meaningful string to make it easier to identify your widget, and where it is used.  |  |
|**offlabel** | **Boolean** | Do not show any Cloudflare branding on the widget (ENT only).  |  |
|**region** | **TurnstileRegion** |  |  |
|**secret** | **String** | Secret key for this widget. |  |
|**sitekey** | **String** | Widget item identifier tag. |  |



