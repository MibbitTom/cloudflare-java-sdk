

# AaaAuditLogs


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**AaaAuditLogsAction**](AaaAuditLogsAction.md) |  |  [optional] |
|**actor** | [**AaaAuditLogsActor**](AaaAuditLogsActor.md) |  |  [optional] |
|**id** | **String** | A string that uniquely identifies the audit log. |  [optional] |
|**_interface** | **String** | The source of the event. |  [optional] |
|**metadata** | **Object** | An object which can lend more context to the action being logged. This is a flexible value and varies between different actions. |  [optional] |
|**newValue** | **String** | The new value of the resource that was modified. |  [optional] |
|**oldValue** | **String** | The value of the resource before it was modified. |  [optional] |
|**owner** | [**AaaAuditLogsOwner**](AaaAuditLogsOwner.md) |  |  [optional] |
|**resource** | [**AaaAuditLogsResource**](AaaAuditLogsResource.md) |  |  [optional] |
|**when** | **OffsetDateTime** | A UTC RFC3339 timestamp that specifies when the action being logged occured. |  [optional] |



