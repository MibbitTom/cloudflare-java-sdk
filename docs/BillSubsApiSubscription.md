

# BillSubsApiSubscription


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**app** | [**BillSubsApiSubscriptionV2App**](BillSubsApiSubscriptionV2App.md) |  |  [optional] |
|**componentValues** | [**List&lt;BillSubsApiComponentValue&gt;**](BillSubsApiComponentValue.md) | The list of add-ons subscribed to. |  [optional] |
|**currency** | **String** | The monetary unit in which pricing information is displayed. |  [optional] [readonly] |
|**currentPeriodEnd** | **OffsetDateTime** | The end of the current period and also when the next billing is due. |  [optional] [readonly] |
|**currentPeriodStart** | **OffsetDateTime** | When the current billing period started. May match initial_period_start if this is the first period. |  [optional] [readonly] |
|**frequency** | **BillSubsApiFrequency** |  |  [optional] |
|**id** | **String** | Subscription identifier tag. |  [optional] [readonly] |
|**price** | **BigDecimal** | The price of the subscription that will be billed, in US dollars. |  [optional] [readonly] |
|**ratePlan** | [**BillSubsApiRatePlan**](BillSubsApiRatePlan.md) |  |  [optional] |
|**state** | **BillSubsApiState** |  |  [optional] |
|**zone** | [**BillSubsApiZone**](BillSubsApiZone.md) |  |  [optional] |



