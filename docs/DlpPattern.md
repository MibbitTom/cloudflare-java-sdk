

# DlpPattern

A pattern that matches an entry

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**regex** | **String** | The regex pattern. |  |
|**validation** | [**ValidationEnum**](#ValidationEnum) | Validation algorithm for the pattern. This algorithm will get run on potential matches, and if it returns false, the entry will not be matched. |  [optional] |



## Enum: ValidationEnum

| Name | Value |
|---- | -----|
| LUHN | &quot;luhn&quot; |



