

# ImagesImage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filename** | **String** | Image file name. |  [optional] [readonly] |
|**id** | **String** | Image unique identifier. |  [optional] [readonly] |
|**meta** | **Object** | User modifiable key-value store. Can be used for keeping references to another system of record for managing images. Metadata must not exceed 1024 bytes. |  [optional] |
|**requireSignedURLs** | **Boolean** | Indicates whether the image can be a accessed only using it&#39;s UID. If set to true, a signed token needs to be generated with a signing key to view the image. |  [optional] |
|**uploaded** | **OffsetDateTime** | When the media item was uploaded. |  [optional] [readonly] |
|**variants** | [**List&lt;ImagesImageVariantsInner&gt;**](ImagesImageVariantsInner.md) | Object specifying available variants for an image. |  [optional] [readonly] |



