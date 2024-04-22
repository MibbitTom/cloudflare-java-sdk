

# WaitingroomQueryPreview


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customHtml** | **String** | Only available for the Waiting Room Advanced subscription. This is a template html file that will be rendered at the edge. If no custom_page_html is provided, the default waiting room will be used. The template is based on mustache ( https://mustache.github.io/ ). There are several variables that are evaluated by the Cloudflare edge: 1. {{&#x60;waitTimeKnown&#x60;}} Acts like a boolean value that indicates the behavior to take when wait time is not available, for instance when queue_all is **true**. 2. {{&#x60;waitTimeFormatted&#x60;}} Estimated wait time for the user. For example, five minutes. Alternatively, you can use: 3. {{&#x60;waitTime&#x60;}} Number of minutes of estimated wait for a user. 4. {{&#x60;waitTimeHours&#x60;}} Number of hours of estimated wait for a user (&#x60;Math.floor(waitTime/60)&#x60;). 5. {{&#x60;waitTimeHourMinutes&#x60;}} Number of minutes above the &#x60;waitTimeHours&#x60; value (&#x60;waitTime%60&#x60;). 6. {{&#x60;queueIsFull&#x60;}} Changes to **true** when no more people can be added to the queue.  To view the full list of variables, look at the &#x60;cfWaitingRoom&#x60; object described under the &#x60;json_response_enabled&#x60; property in other Waiting Room API calls. |  |



