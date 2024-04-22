

# AaaFilters

Optional filters that allow you to be alerted only on a subset of events for that alert type based on some criteria. This is only available for select alert types. See alert type documentation for more details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actions** | **List&lt;String&gt;** | Usage depends on specific alert type |  [optional] |
|**affectedAsns** | **List&lt;String&gt;** | Used for configuring radar_notification |  [optional] |
|**affectedComponents** | **List&lt;String&gt;** | Used for configuring incident_alert. A list of identifiers for each component to monitor. |  [optional] |
|**affectedLocations** | **List&lt;String&gt;** | Used for configuring radar_notification |  [optional] |
|**airportCode** | **List&lt;String&gt;** | Used for configuring maintenance_event_notification |  [optional] |
|**alertTriggerPreferences** | **List&lt;String&gt;** | Usage depends on specific alert type |  [optional] |
|**alertTriggerPreferencesValue** | [**List&lt;AlertTriggerPreferencesValueEnum&gt;**](#List&lt;AlertTriggerPreferencesValueEnum&gt;) | Used for configuring magic_tunnel_health_check_event |  [optional] |
|**enabled** | **List&lt;String&gt;** | Used for configuring load_balancing_pool_enablement_alert |  [optional] |
|**environment** | **List&lt;String&gt;** | Used for configuring pages_event_alert |  [optional] |
|**event** | **List&lt;String&gt;** | Used for configuring pages_event_alert |  [optional] |
|**eventSource** | **List&lt;String&gt;** | Used for configuring load_balancing_health_alert |  [optional] |
|**eventType** | **List&lt;String&gt;** | Usage depends on specific alert type |  [optional] |
|**groupBy** | **List&lt;String&gt;** | Usage depends on specific alert type |  [optional] |
|**healthCheckId** | **List&lt;String&gt;** | Used for configuring health_check_status_notification |  [optional] |
|**incidentImpact** | [**List&lt;IncidentImpactEnum&gt;**](#List&lt;IncidentImpactEnum&gt;) | Used for configuring incident_alert |  [optional] |
|**inputId** | **List&lt;String&gt;** | Used for configuring stream_live_notifications |  [optional] |
|**limit** | **List&lt;String&gt;** | Used for configuring billing_usage_alert |  [optional] |
|**logoTag** | **List&lt;String&gt;** | Used for configuring logo_match_alert |  [optional] |
|**megabitsPerSecond** | **List&lt;String&gt;** | Used for configuring advanced_ddos_attack_l4_alert |  [optional] |
|**newHealth** | **List&lt;String&gt;** | Used for configuring load_balancing_health_alert |  [optional] |
|**newStatus** | **List&lt;String&gt;** | Used for configuring tunnel_health_event |  [optional] |
|**packetsPerSecond** | **List&lt;String&gt;** | Used for configuring advanced_ddos_attack_l4_alert |  [optional] |
|**poolId** | **List&lt;String&gt;** | Usage depends on specific alert type |  [optional] |
|**product** | **List&lt;String&gt;** | Used for configuring billing_usage_alert |  [optional] |
|**projectId** | **List&lt;String&gt;** | Used for configuring pages_event_alert |  [optional] |
|**protocol** | **List&lt;String&gt;** | Used for configuring advanced_ddos_attack_l4_alert |  [optional] |
|**queryTag** | **List&lt;String&gt;** | Usage depends on specific alert type |  [optional] |
|**requestsPerSecond** | **List&lt;String&gt;** | Used for configuring advanced_ddos_attack_l7_alert |  [optional] |
|**selectors** | **List&lt;String&gt;** | Usage depends on specific alert type |  [optional] |
|**services** | **List&lt;String&gt;** | Used for configuring clickhouse_alert_fw_ent_anomaly |  [optional] |
|**slo** | **List&lt;String&gt;** | Usage depends on specific alert type |  [optional] |
|**status** | **List&lt;String&gt;** | Used for configuring health_check_status_notification |  [optional] |
|**targetHostname** | **List&lt;String&gt;** | Used for configuring advanced_ddos_attack_l7_alert |  [optional] |
|**targetIp** | **List&lt;String&gt;** | Used for configuring advanced_ddos_attack_l4_alert |  [optional] |
|**targetZoneName** | **List&lt;String&gt;** | Used for configuring advanced_ddos_attack_l7_alert |  [optional] |
|**trafficExclusions** | [**List&lt;TrafficExclusionsEnum&gt;**](#List&lt;TrafficExclusionsEnum&gt;) | Used for configuring traffic_anomalies_alert |  [optional] |
|**tunnelId** | **List&lt;String&gt;** | Used for configuring tunnel_health_event |  [optional] |
|**tunnelName** | **List&lt;String&gt;** | Used for configuring magic_tunnel_health_check_event |  [optional] |
|**where** | **List&lt;String&gt;** | Usage depends on specific alert type |  [optional] |
|**zones** | **List&lt;String&gt;** | Usage depends on specific alert type |  [optional] |



## Enum: List&lt;AlertTriggerPreferencesValueEnum&gt;

| Name | Value |
|---- | -----|
| _99_0 | &quot;99.0&quot; |
| _98_0 | &quot;98.0&quot; |
| _97_0 | &quot;97.0&quot; |



## Enum: List&lt;IncidentImpactEnum&gt;

| Name | Value |
|---- | -----|
| NONE | &quot;INCIDENT_IMPACT_NONE&quot; |
| MINOR | &quot;INCIDENT_IMPACT_MINOR&quot; |
| MAJOR | &quot;INCIDENT_IMPACT_MAJOR&quot; |
| CRITICAL | &quot;INCIDENT_IMPACT_CRITICAL&quot; |



## Enum: List&lt;TrafficExclusionsEnum&gt;

| Name | Value |
|---- | -----|
| SECURITY_EVENTS | &quot;security_events&quot; |



