

# WaitingroomEventDetailsResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdOn** | **OffsetDateTime** |  |  [optional] [readonly] |
|**customPageHtml** | **String** |  |  [optional] |
|**description** | **String** | A note that you can use to add more details about the event. |  [optional] |
|**disableSessionRenewal** | **Boolean** |  |  [optional] |
|**eventEndTime** | **String** | An ISO 8601 timestamp that marks the end of the event. |  [optional] |
|**eventStartTime** | **String** | An ISO 8601 timestamp that marks the start of the event. At this time, queued users will be processed with the event&#39;s configuration. The start time must be at least one minute before &#x60;event_end_time&#x60;. |  [optional] |
|**id** | **String** |  |  [optional] |
|**modifiedOn** | **OffsetDateTime** |  |  [optional] [readonly] |
|**name** | **String** | A unique name to identify the event. Only alphanumeric characters, hyphens and underscores are allowed. |  [optional] |
|**newUsersPerMinute** | **Integer** |  |  [optional] |
|**prequeueStartTime** | **String** | An ISO 8601 timestamp that marks when to begin queueing all users before the event starts. The prequeue must start at least five minutes before &#x60;event_start_time&#x60;. |  [optional] |
|**queueingMethod** | **String** |  |  [optional] |
|**sessionDuration** | **Integer** |  |  [optional] |
|**shuffleAtEventStart** | **Boolean** | If enabled, users in the prequeue will be shuffled randomly at the &#x60;event_start_time&#x60;. Requires that &#x60;prequeue_start_time&#x60; is not null. This is useful for situations when many users will join the event prequeue at the same time and you want to shuffle them to ensure fairness. Naturally, it makes the most sense to enable this feature when the &#x60;queueing_method&#x60; during the event respects ordering such as **fifo**, or else the shuffling may be unnecessary. |  [optional] |
|**suspended** | **Boolean** | Suspends or allows an event. If set to &#x60;true&#x60;, the event is ignored and traffic will be handled based on the waiting room configuration. |  [optional] |
|**totalActiveUsers** | **Integer** |  |  [optional] |


