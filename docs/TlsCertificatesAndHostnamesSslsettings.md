

# TlsCertificatesAndHostnamesSslsettings

SSL specific settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ciphers** | **Set&lt;String&gt;** | An allowlist of ciphers for TLS termination. These ciphers must be in the BoringSSL format. |  [optional] |
|**earlyHints** | [**EarlyHintsEnum**](#EarlyHintsEnum) | Whether or not Early Hints is enabled. |  [optional] |
|**http2** | [**Http2Enum**](#Http2Enum) | Whether or not HTTP2 is enabled. |  [optional] |
|**minTlsVersion** | [**MinTlsVersionEnum**](#MinTlsVersionEnum) | The minimum TLS version supported. |  [optional] |
|**tls13** | [**Tls13Enum**](#Tls13Enum) | Whether or not TLS 1.3 is enabled. |  [optional] |



## Enum: EarlyHintsEnum

| Name | Value |
|---- | -----|
| ON | &quot;on&quot; |
| OFF | &quot;off&quot; |



## Enum: Http2Enum

| Name | Value |
|---- | -----|
| ON | &quot;on&quot; |
| OFF | &quot;off&quot; |



## Enum: MinTlsVersionEnum

| Name | Value |
|---- | -----|
| _0 | &quot;1.0&quot; |
| _1 | &quot;1.1&quot; |
| _2 | &quot;1.2&quot; |
| _3 | &quot;1.3&quot; |



## Enum: Tls13Enum

| Name | Value |
|---- | -----|
| ON | &quot;on&quot; |
| OFF | &quot;off&quot; |



