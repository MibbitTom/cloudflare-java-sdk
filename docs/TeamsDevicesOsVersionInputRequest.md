

# TeamsDevicesOsVersionInputRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operatingSystem** | [**OperatingSystemEnum**](#OperatingSystemEnum) | Operating System |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) | Operator |  |
|**osDistroName** | **String** | Operating System Distribution Name (linux only) |  [optional] |
|**osDistroRevision** | **String** | Version of OS Distribution (linux only) |  [optional] |
|**osVersionExtra** | **String** | Additional version data. For Mac or iOS, the Product Verison Extra. For Linux, the kernel release version. (Mac, iOS, and Linux only) |  [optional] |
|**version** | **String** | Version of OS |  |



## Enum: OperatingSystemEnum

| Name | Value |
|---- | -----|
| WINDOWS | &quot;windows&quot; |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| LESS_THAN | &quot;&lt;&quot; |
| LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot; |
| GREATER_THAN | &quot;&gt;&quot; |
| GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot; |
| u | &quot;&#x3D;&#x3D;&quot; |



