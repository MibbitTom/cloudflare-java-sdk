

# SkipRuleActionParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phases** | [**Set&lt;SkipRuleActionParametersPhases&gt;**](SkipRuleActionParametersPhases.md) | A list of phases to skip the execution of. This option is incompatible with the ruleset and rulesets options. |  [optional] |
|**products** | [**Set&lt;ProductsEnum&gt;**](#Set&lt;ProductsEnum&gt;) | A list of legacy security products to skip the execution of. |  [optional] |
|**rules** | **Map&lt;String, Set&lt;String&gt;&gt;** | A mapping of ruleset IDs to a list of rule IDs in that ruleset to skip the execution of. This option is incompatible with the ruleset option. |  [optional] |
|**ruleset** | [**RulesetEnum**](#RulesetEnum) | A ruleset to skip the execution of. This option is incompatible with the rulesets, rules and phases options. |  [optional] |
|**rulesets** | [**Set&lt;SkipRuleActionParametersRulesets&gt;**](SkipRuleActionParametersRulesets.md) | A list of ruleset IDs to skip the execution of. This option is incompatible with the ruleset and phases options. |  [optional] |



## Enum: Set&lt;ProductsEnum&gt;

| Name | Value |
|---- | -----|
| BIC | &quot;bic&quot; |
| HOT | &quot;hot&quot; |
| RATELIMIT | &quot;rateLimit&quot; |
| SECURITYLEVEL | &quot;securityLevel&quot; |
| UABLOCK | &quot;uaBlock&quot; |
| WAF | &quot;waf&quot; |
| ZONELOCKDOWN | &quot;zoneLockdown&quot; |



## Enum: RulesetEnum

| Name | Value |
|---- | -----|
| CURRENT | &quot;current&quot; |



