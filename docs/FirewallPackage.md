

# FirewallPackage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A summary of the purpose/function of the WAF package. |  [readonly] |
|**detectionMode** | **String** | When a WAF package uses anomaly detection, each rule is given a score when triggered. If the total score of all triggered rules exceeds the sensitivity defined on the WAF package, the action defined on the package will be taken. |  [readonly] |
|**id** | **String** | Identifier |  [readonly] |
|**name** | **String** | The name of the WAF package. |  [readonly] |
|**status** | **FirewallStatus** |  |  [optional] |
|**zoneId** | **String** | Identifier |  [readonly] |
|**actionMode** | **FirewallActionMode** |  |  |
|**sensitivity** | **FirewallSensitivity** |  |  |



