

# WorkersKvBulkWriteInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**base64** | **Boolean** | Whether or not the server should base64 decode the value before storing it. Useful for writing values that wouldn&#39;t otherwise be valid JSON strings, such as images. |  [optional] |
|**expiration** | **BigDecimal** | The time, measured in number of seconds since the UNIX epoch, at which the key should expire. |  [optional] |
|**expirationTtl** | **BigDecimal** | The number of seconds for which the key should be visible before it expires. At least 60. |  [optional] |
|**key** | **String** | A key&#39;s name. The name may be at most 512 bytes. All printable, non-whitespace characters are valid. |  [optional] |
|**metadata** | **Object** | Arbitrary JSON that is associated with a key. |  [optional] |
|**value** | **String** | A UTF-8 encoded string to be stored, up to 25 MiB in length. |  [optional] |



