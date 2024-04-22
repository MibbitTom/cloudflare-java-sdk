

# NamespaceWorkerPutScriptContentRequestMetadata

JSON encoded metadata about the uploaded parts and Worker configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bodyPart** | **String** | Name of the part in the multipart request that contains the script (e.g. the file adding a listener to the &#x60;fetch&#x60; event). Indicates a &#x60;service worker syntax&#x60; Worker. |  [optional] |
|**mainModule** | **String** | Name of the part in the multipart request that contains the main module (e.g. the file exporting a &#x60;fetch&#x60; handler). Indicates a &#x60;module syntax&#x60; Worker. |  [optional] |



