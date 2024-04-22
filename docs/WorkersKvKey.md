

# WorkersKvKey

A name for a value. A value stored under a given key may be retrieved via the same key.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expiration** | **BigDecimal** | The time, measured in number of seconds since the UNIX epoch, at which the key will expire. This property is omitted for keys that will not expire. |  [optional] |
|**metadata** | **Object** | Arbitrary JSON that is associated with a key. |  [optional] |
|**name** | **String** | A key&#39;s name. The name may be at most 512 bytes. All printable, non-whitespace characters are valid. Use percent-encoding to define key names as part of a URL. |  |



