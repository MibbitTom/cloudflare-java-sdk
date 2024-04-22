

# TeamsDevicesFileInputRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exists** | **Boolean** | Whether or not file exists |  [optional] |
|**operatingSystem** | [**OperatingSystemEnum**](#OperatingSystemEnum) | Operating system |  |
|**path** | **String** | File path. |  |
|**sha256** | **String** | SHA-256. |  [optional] |
|**thumbprint** | **String** | Signing certificate thumbprint. |  [optional] |



## Enum: OperatingSystemEnum

| Name | Value |
|---- | -----|
| WINDOWS | &quot;windows&quot; |
| LINUX | &quot;linux&quot; |
| MAC | &quot;mac&quot; |



