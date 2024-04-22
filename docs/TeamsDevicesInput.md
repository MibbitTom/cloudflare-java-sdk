

# TeamsDevicesInput

The value to be checked against.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exists** | **Boolean** | Whether or not file exists |  [optional] |
|**operatingSystem** | [**OperatingSystemEnum**](#OperatingSystemEnum) | Operating system |  |
|**path** | **String** | Path for the application. |  |
|**sha256** | **String** | SHA-256. |  [optional] |
|**thumbprint** | **String** | Signing certificate thumbprint. |  [optional] |
|**id** | **String** | List ID. |  |
|**domain** | **String** | Domain |  [optional] |
|**operator** | [**OperatorEnum**](#OperatorEnum) | operator |  |
|**osDistroName** | **String** | Operating System Distribution Name (linux only) |  [optional] |
|**osDistroRevision** | **String** | Version of OS Distribution (linux only) |  [optional] |
|**osVersionExtra** | **String** | Additional version data. For Mac or iOS, the Product Verison Extra. For Linux, the kernel release version. (Mac, iOS, and Linux only) |  [optional] |
|**version** | **String** | Version |  |
|**enabled** | **Boolean** | Enabled |  |
|**checkDisks** | **List&lt;String&gt;** | List of volume names to be checked for encryption. |  [optional] |
|**requireAll** | **Boolean** | Whether to check all disks for encryption. |  [optional] |
|**certificateId** | **String** | UUID of Cloudflare managed certificate. |  |
|**cn** | **String** | Common Name that is protected by the certificate |  |
|**complianceStatus** | [**ComplianceStatusEnum**](#ComplianceStatusEnum) | Compliance Status |  |
|**connectionId** | **String** | Posture Integration ID. |  |
|**lastSeen** | **String** | For more details on last seen, please refer to the Crowdstrike documentation. |  [optional] |
|**os** | **String** | Os Version |  [optional] |
|**overall** | **String** | overall |  [optional] |
|**sensorConfig** | **String** | SensorConfig |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | For more details on state, please refer to the Crowdstrike documentation. |  [optional] |
|**versionOperator** | [**VersionOperatorEnum**](#VersionOperatorEnum) | Version Operator |  [optional] |
|**countOperator** | [**CountOperatorEnum**](#CountOperatorEnum) | Count Operator |  |
|**issueCount** | **String** | The Number of Issues. |  |
|**eidLastSeen** | **String** | For more details on eid last seen, refer to the Tanium documentation. |  [optional] |
|**riskLevel** | [**RiskLevelEnum**](#RiskLevelEnum) | For more details on risk level, refer to the Tanium documentation. |  [optional] |
|**scoreOperator** | [**ScoreOperatorEnum**](#ScoreOperatorEnum) | Score Operator |  [optional] |
|**totalScore** | **BigDecimal** | For more details on total score, refer to the Tanium documentation. |  [optional] |
|**activeThreats** | **BigDecimal** | The Number of active threats. |  [optional] |
|**infected** | **Boolean** | Whether device is infected. |  [optional] |
|**isActive** | **Boolean** | Whether device is active. |  [optional] |
|**networkStatus** | [**NetworkStatusEnum**](#NetworkStatusEnum) | Network status of device. |  [optional] |



## Enum: OperatingSystemEnum

| Name | Value |
|---- | -----|
| WINDOWS | &quot;windows&quot; |
| LINUX | &quot;linux&quot; |
| MAC | &quot;mac&quot; |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| LESS_THAN | &quot;&lt;&quot; |
| LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot; |
| GREATER_THAN | &quot;&gt;&quot; |
| GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot; |
| u | &quot;&#x3D;&#x3D;&quot; |



## Enum: ComplianceStatusEnum

| Name | Value |
|---- | -----|
| COMPLIANT | &quot;compliant&quot; |
| NONCOMPLIANT | &quot;noncompliant&quot; |
| UNKNOWN | &quot;unknown&quot; |
| NOTAPPLICABLE | &quot;notapplicable&quot; |
| INGRACEPERIOD | &quot;ingraceperiod&quot; |
| ERROR | &quot;error&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ONLINE | &quot;online&quot; |
| OFFLINE | &quot;offline&quot; |
| UNKNOWN | &quot;unknown&quot; |



## Enum: VersionOperatorEnum

| Name | Value |
|---- | -----|
| LESS_THAN | &quot;&lt;&quot; |
| LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot; |
| GREATER_THAN | &quot;&gt;&quot; |
| GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot; |
| u | &quot;&#x3D;&#x3D;&quot; |



## Enum: CountOperatorEnum

| Name | Value |
|---- | -----|
| LESS_THAN | &quot;&lt;&quot; |
| LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot; |
| GREATER_THAN | &quot;&gt;&quot; |
| GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot; |
| u | &quot;&#x3D;&#x3D;&quot; |



## Enum: RiskLevelEnum

| Name | Value |
|---- | -----|
| LOW | &quot;low&quot; |
| MEDIUM | &quot;medium&quot; |
| HIGH | &quot;high&quot; |
| CRITICAL | &quot;critical&quot; |



## Enum: ScoreOperatorEnum

| Name | Value |
|---- | -----|
| LESS_THAN | &quot;&lt;&quot; |
| LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot; |
| GREATER_THAN | &quot;&gt;&quot; |
| GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot; |
| u | &quot;&#x3D;&#x3D;&quot; |



## Enum: NetworkStatusEnum

| Name | Value |
|---- | -----|
| CONNECTED | &quot;connected&quot; |
| DISCONNECTED | &quot;disconnected&quot; |
| DISCONNECTING | &quot;disconnecting&quot; |
| CONNECTING | &quot;connecting&quot; |



