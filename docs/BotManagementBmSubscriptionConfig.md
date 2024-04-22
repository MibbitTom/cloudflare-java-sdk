

# BotManagementBmSubscriptionConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enableJs** | **Boolean** | Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/). |  [optional] |
|**usingLatestModel** | **Boolean** | A read-only field that indicates whether the zone currently is running the latest ML model.  |  [optional] [readonly] |
|**autoUpdateModel** | **Boolean** | Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes) |  [optional] |
|**suppressSessionScore** | **Boolean** | Whether to disable tracking the highest bot score for a session in the Bot Management cookie. |  [optional] |



