

# PageRulesEditAPageRuleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actions** | [**List&lt;ZonesActionsInner&gt;**](ZonesActionsInner.md) | The set of actions to perform if the targets of this rule match the request. Actions can redirect to another URL or override settings, but not both. |  [optional] |
|**priority** | **Integer** | The priority of the rule, used to define which Page Rule is processed over another. A higher number indicates a higher priority. For example, if you have a catch-all Page Rule (rule A: &#x60;/images/_*&#x60;) but want a more specific Page Rule to take precedence (rule B: &#x60;/images/special/_*&#x60;), specify a higher priority for rule B so it overrides rule A. |  [optional] |
|**status** | **ZonesStatus** |  |  [optional] |
|**targets** | [**List&lt;ZonesTarget&gt;**](ZonesTarget.md) | The rule targets to evaluate on each request. |  [optional] |



