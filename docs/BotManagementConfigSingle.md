

# BotManagementConfigSingle


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enableJs** | **Boolean** | Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/). |  [optional] |
|**usingLatestModel** | **Boolean** | A read-only field that indicates whether the zone currently is running the latest ML model.  |  [optional] [readonly] |
|**fightMode** | **Boolean** | Whether to enable Bot Fight Mode. |  [optional] |
|**optimizeWordpress** | **Boolean** | Whether to optimize Super Bot Fight Mode protections for Wordpress. |  [optional] |
|**sbfmDefinitelyAutomated** | **BotManagementSbfmDefinitelyAutomated** |  |  [optional] |
|**sbfmStaticResourceProtection** | **Boolean** | Super Bot Fight Mode (SBFM) to enable static resource protection. Enable if static resources on your application need bot protection. Note: Static resource protection can also result in legitimate traffic being blocked.  |  [optional] |
|**sbfmVerifiedBots** | **BotManagementSbfmVerifiedBots** |  |  [optional] |
|**sbfmLikelyAutomated** | **BotManagementSbfmLikelyAutomated** |  |  [optional] |
|**autoUpdateModel** | **Boolean** | Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes) |  [optional] |
|**suppressSessionScore** | **Boolean** | Whether to disable tracking the highest bot score for a session in the Bot Management cookie. |  [optional] |



