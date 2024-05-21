# openapi-java-client

Cloudflare API

- API version: 4.0.0

- Build date: 2024-05-21T11:53:03.004303930+01:00[Europe/London]

- Generator version: 7.5.0

To get started using Cloudflare's products and services via the API, refer to [how to interact with Cloudflare](https://developers.cloudflare.com/fundamentals/basic-tasks/interact-with-cloudflare/), which covers using tools like [Terraform](https://developers.cloudflare.com/terraform/#cloudflare-terraform) and the [official SDKs](https://developers.cloudflare.com/fundamentals/api/reference/sdks/) to maintain your Cloudflare resources.

Using the Cloudflare API requires authentication so that Cloudflare knows who is making requests and what permissions you have. Create an API token to grant access to the API to perform actions.

To create an API token, from the Cloudflare dashboard, go to My Profile > API Tokens and select Create Token. For more information on how to create and troubleshoot API tokens, refer to
our [API fundamentals](https://developers.cloudflare.com/fundamentals/api/).

Totally new to Cloudflare? [Start here](https://developers.cloudflare.com/fundamentals/get-started/).


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 11+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>4.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:4.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/openapi-java-client-4.0.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import cloudflare.*;
import cloudflare.sdk.models.*;
import cloudflare.sdk.CustomHostnameForAZoneApi;

public class CustomHostnameForAZoneApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure clients using the `defaultClient` object, such as
        // overriding the host and port, timeout, etc.
        CustomHostnameForAZoneApi apiInstance = new CustomHostnameForAZoneApi(defaultClient);
        String zoneId = "zoneId_example"; // String | 
        CreateCustomHostnameRequest createCustomHostnameRequest = new CreateCustomHostnameRequest(); // CreateCustomHostnameRequest | 
        try {
            TlsCertificatesAndHostnamesCustomHostnameResponseSingle result = apiInstance.createCustomHostname(zoneId, createCustomHostnameRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomHostnameForAZoneApi#createCustomHostname");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.cloudflare.com/client/v4*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CustomHostnameForAZoneApi* | [**createCustomHostname**](docs/CustomHostnameForAZoneApi.md#createCustomHostname) | **POST** /zones/{zone_id}/custom_hostnames | Create Custom Hostname
*CustomHostnameForAZoneApi* | [**createCustomHostnameWithHttpInfo**](docs/CustomHostnameForAZoneApi.md#createCustomHostnameWithHttpInfo) | **POST** /zones/{zone_id}/custom_hostnames | Create Custom Hostname
*CustomHostnameForAZoneApi* | [**customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates**](docs/CustomHostnameForAZoneApi.md#customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates) | **DELETE** /zones/{zone_id}/custom_hostnames/{custom_hostname_id} | Delete Custom Hostname (and any issued SSL certificates)
*CustomHostnameForAZoneApi* | [**customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificatesWithHttpInfo**](docs/CustomHostnameForAZoneApi.md#customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificatesWithHttpInfo) | **DELETE** /zones/{zone_id}/custom_hostnames/{custom_hostname_id} | Delete Custom Hostname (and any issued SSL certificates)
*CustomHostnameForAZoneApi* | [**listCustomHostnames**](docs/CustomHostnameForAZoneApi.md#listCustomHostnames) | **GET** /zones/{zone_id}/custom_hostnames | List Custom Hostnames
*CustomHostnameForAZoneApi* | [**listCustomHostnamesWithHttpInfo**](docs/CustomHostnameForAZoneApi.md#listCustomHostnamesWithHttpInfo) | **GET** /zones/{zone_id}/custom_hostnames | List Custom Hostnames


## Documentation for Models

 - [CreateCustomHostname4XXResponse](docs/CreateCustomHostname4XXResponse.md)
 - [CreateCustomHostnameRequest](docs/CreateCustomHostnameRequest.md)
 - [CustomHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates200Response](docs/CustomHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates200Response.md)
 - [CustomHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates4XXResponse](docs/CustomHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates4XXResponse.md)
 - [ListCustomHostnames4XXResponse](docs/ListCustomHostnames4XXResponse.md)
 - [TlsCertificatesAndHostnamesAdvancedCertificatePackResponseSingle](docs/TlsCertificatesAndHostnamesAdvancedCertificatePackResponseSingle.md)
 - [TlsCertificatesAndHostnamesAdvancedCertificatePackResponseSingleAllOfResult](docs/TlsCertificatesAndHostnamesAdvancedCertificatePackResponseSingleAllOfResult.md)
 - [TlsCertificatesAndHostnamesAdvancedType](docs/TlsCertificatesAndHostnamesAdvancedType.md)
 - [TlsCertificatesAndHostnamesApiResponseCollection](docs/TlsCertificatesAndHostnamesApiResponseCollection.md)
 - [TlsCertificatesAndHostnamesApiResponseCommon](docs/TlsCertificatesAndHostnamesApiResponseCommon.md)
 - [TlsCertificatesAndHostnamesApiResponseCommonFailure](docs/TlsCertificatesAndHostnamesApiResponseCommonFailure.md)
 - [TlsCertificatesAndHostnamesApiResponseSingle](docs/TlsCertificatesAndHostnamesApiResponseSingle.md)
 - [TlsCertificatesAndHostnamesApiResponseSingleAllOfResult](docs/TlsCertificatesAndHostnamesApiResponseSingleAllOfResult.md)
 - [TlsCertificatesAndHostnamesAssociationObject](docs/TlsCertificatesAndHostnamesAssociationObject.md)
 - [TlsCertificatesAndHostnamesAssociationResponseCollection](docs/TlsCertificatesAndHostnamesAssociationResponseCollection.md)
 - [TlsCertificatesAndHostnamesBase](docs/TlsCertificatesAndHostnamesBase.md)
 - [TlsCertificatesAndHostnamesBundleMethod](docs/TlsCertificatesAndHostnamesBundleMethod.md)
 - [TlsCertificatesAndHostnamesCertificateAnalyzeResponse](docs/TlsCertificatesAndHostnamesCertificateAnalyzeResponse.md)
 - [TlsCertificatesAndHostnamesCertificateAuthority](docs/TlsCertificatesAndHostnamesCertificateAuthority.md)
 - [TlsCertificatesAndHostnamesCertificateObject](docs/TlsCertificatesAndHostnamesCertificateObject.md)
 - [TlsCertificatesAndHostnamesCertificateObjectPost](docs/TlsCertificatesAndHostnamesCertificateObjectPost.md)
 - [TlsCertificatesAndHostnamesCertificatePackQuotaResponse](docs/TlsCertificatesAndHostnamesCertificatePackQuotaResponse.md)
 - [TlsCertificatesAndHostnamesCertificatePackQuotaResponseAllOfResult](docs/TlsCertificatesAndHostnamesCertificatePackQuotaResponseAllOfResult.md)
 - [TlsCertificatesAndHostnamesCertificatePackResponseCollection](docs/TlsCertificatesAndHostnamesCertificatePackResponseCollection.md)
 - [TlsCertificatesAndHostnamesCertificatePackResponseSingle](docs/TlsCertificatesAndHostnamesCertificatePackResponseSingle.md)
 - [TlsCertificatesAndHostnamesCertificatePacksComponentsSchemasStatus](docs/TlsCertificatesAndHostnamesCertificatePacksComponentsSchemasStatus.md)
 - [TlsCertificatesAndHostnamesCertificateResponseCollection](docs/TlsCertificatesAndHostnamesCertificateResponseCollection.md)
 - [TlsCertificatesAndHostnamesCertificateResponseIdOnly](docs/TlsCertificatesAndHostnamesCertificateResponseIdOnly.md)
 - [TlsCertificatesAndHostnamesCertificateResponseSingle](docs/TlsCertificatesAndHostnamesCertificateResponseSingle.md)
 - [TlsCertificatesAndHostnamesCertificateResponseSingleId](docs/TlsCertificatesAndHostnamesCertificateResponseSingleId.md)
 - [TlsCertificatesAndHostnamesCertificateResponseSingleIdAllOfResult](docs/TlsCertificatesAndHostnamesCertificateResponseSingleIdAllOfResult.md)
 - [TlsCertificatesAndHostnamesCertificateResponseSinglePost](docs/TlsCertificatesAndHostnamesCertificateResponseSinglePost.md)
 - [TlsCertificatesAndHostnamesCertificateStatus](docs/TlsCertificatesAndHostnamesCertificateStatus.md)
 - [TlsCertificatesAndHostnamesCertificates](docs/TlsCertificatesAndHostnamesCertificates.md)
 - [TlsCertificatesAndHostnamesClientCertificate](docs/TlsCertificatesAndHostnamesClientCertificate.md)
 - [TlsCertificatesAndHostnamesClientCertificateResponseCollection](docs/TlsCertificatesAndHostnamesClientCertificateResponseCollection.md)
 - [TlsCertificatesAndHostnamesClientCertificateResponseSingle](docs/TlsCertificatesAndHostnamesClientCertificateResponseSingle.md)
 - [TlsCertificatesAndHostnamesClientCertificatesComponentsSchemasCertificateAuthority](docs/TlsCertificatesAndHostnamesClientCertificatesComponentsSchemasCertificateAuthority.md)
 - [TlsCertificatesAndHostnamesClientCertificatesComponentsSchemasStatus](docs/TlsCertificatesAndHostnamesClientCertificatesComponentsSchemasStatus.md)
 - [TlsCertificatesAndHostnamesComponentsSchemasCertificateAuthority](docs/TlsCertificatesAndHostnamesComponentsSchemasCertificateAuthority.md)
 - [TlsCertificatesAndHostnamesComponentsSchemasCertificateObject](docs/TlsCertificatesAndHostnamesComponentsSchemasCertificateObject.md)
 - [TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseCollection](docs/TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseCollection.md)
 - [TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseSingle](docs/TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseSingle.md)
 - [TlsCertificatesAndHostnamesComponentsSchemasStatus](docs/TlsCertificatesAndHostnamesComponentsSchemasStatus.md)
 - [TlsCertificatesAndHostnamesComponentsSchemasValidationMethod](docs/TlsCertificatesAndHostnamesComponentsSchemasValidationMethod.md)
 - [TlsCertificatesAndHostnamesCustomCertificate](docs/TlsCertificatesAndHostnamesCustomCertificate.md)
 - [TlsCertificatesAndHostnamesCustomHostname](docs/TlsCertificatesAndHostnamesCustomHostname.md)
 - [TlsCertificatesAndHostnamesCustomHostnameResponseCollection](docs/TlsCertificatesAndHostnamesCustomHostnameResponseCollection.md)
 - [TlsCertificatesAndHostnamesCustomHostnameResponseSingle](docs/TlsCertificatesAndHostnamesCustomHostnameResponseSingle.md)
 - [TlsCertificatesAndHostnamesCustomMetadata](docs/TlsCertificatesAndHostnamesCustomMetadata.md)
 - [TlsCertificatesAndHostnamesCustomhostname](docs/TlsCertificatesAndHostnamesCustomhostname.md)
 - [TlsCertificatesAndHostnamesDcvDelegationResponse](docs/TlsCertificatesAndHostnamesDcvDelegationResponse.md)
 - [TlsCertificatesAndHostnamesDeleteAdvancedCertificatePackResponseSingle](docs/TlsCertificatesAndHostnamesDeleteAdvancedCertificatePackResponseSingle.md)
 - [TlsCertificatesAndHostnamesEnabledResponse](docs/TlsCertificatesAndHostnamesEnabledResponse.md)
 - [TlsCertificatesAndHostnamesEnabledResponseAllOfResult](docs/TlsCertificatesAndHostnamesEnabledResponseAllOfResult.md)
 - [TlsCertificatesAndHostnamesFallbackOriginResponse](docs/TlsCertificatesAndHostnamesFallbackOriginResponse.md)
 - [TlsCertificatesAndHostnamesGeoRestrictions](docs/TlsCertificatesAndHostnamesGeoRestrictions.md)
 - [TlsCertificatesAndHostnamesHostnameAopResponseCollection](docs/TlsCertificatesAndHostnamesHostnameAopResponseCollection.md)
 - [TlsCertificatesAndHostnamesHostnameAopSingleResponse](docs/TlsCertificatesAndHostnamesHostnameAopSingleResponse.md)
 - [TlsCertificatesAndHostnamesHostnameAssociation](docs/TlsCertificatesAndHostnamesHostnameAssociation.md)
 - [TlsCertificatesAndHostnamesHostnameAssociationsResponse](docs/TlsCertificatesAndHostnamesHostnameAssociationsResponse.md)
 - [TlsCertificatesAndHostnamesHostnameAssociationsResponseAllOfResult](docs/TlsCertificatesAndHostnamesHostnameAssociationsResponseAllOfResult.md)
 - [TlsCertificatesAndHostnamesHostnameAuthenticatedOriginPull](docs/TlsCertificatesAndHostnamesHostnameAuthenticatedOriginPull.md)
 - [TlsCertificatesAndHostnamesHostnameAuthenticatedOriginPullComponentsSchemasCertificateResponseCollection](docs/TlsCertificatesAndHostnamesHostnameAuthenticatedOriginPullComponentsSchemasCertificateResponseCollection.md)
 - [TlsCertificatesAndHostnamesHostnameAuthenticatedOriginPullComponentsSchemasStatus](docs/TlsCertificatesAndHostnamesHostnameAuthenticatedOriginPullComponentsSchemasStatus.md)
 - [TlsCertificatesAndHostnamesHostnameCertidInput](docs/TlsCertificatesAndHostnamesHostnameCertidInput.md)
 - [TlsCertificatesAndHostnamesHostnameCertidObject](docs/TlsCertificatesAndHostnamesHostnameCertidObject.md)
 - [TlsCertificatesAndHostnamesKeylessCertificate](docs/TlsCertificatesAndHostnamesKeylessCertificate.md)
 - [TlsCertificatesAndHostnamesKeylessResponseCollection](docs/TlsCertificatesAndHostnamesKeylessResponseCollection.md)
 - [TlsCertificatesAndHostnamesKeylessResponseSingle](docs/TlsCertificatesAndHostnamesKeylessResponseSingle.md)
 - [TlsCertificatesAndHostnamesKeylessResponseSingleId](docs/TlsCertificatesAndHostnamesKeylessResponseSingleId.md)
 - [TlsCertificatesAndHostnamesKeylessTunnel](docs/TlsCertificatesAndHostnamesKeylessTunnel.md)
 - [TlsCertificatesAndHostnamesMessagesInner](docs/TlsCertificatesAndHostnamesMessagesInner.md)
 - [TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseCollection](docs/TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseCollection.md)
 - [TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseCollectionAllOfResultInfo](docs/TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseCollectionAllOfResultInfo.md)
 - [TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseSingle](docs/TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseSingle.md)
 - [TlsCertificatesAndHostnamesOwnershipVerification](docs/TlsCertificatesAndHostnamesOwnershipVerification.md)
 - [TlsCertificatesAndHostnamesOwnershipVerificationHttp](docs/TlsCertificatesAndHostnamesOwnershipVerificationHttp.md)
 - [TlsCertificatesAndHostnamesOwnershipVerificationHttpOneOf](docs/TlsCertificatesAndHostnamesOwnershipVerificationHttpOneOf.md)
 - [TlsCertificatesAndHostnamesOwnershipVerificationOneOf](docs/TlsCertificatesAndHostnamesOwnershipVerificationOneOf.md)
 - [TlsCertificatesAndHostnamesPerHostnameSettingsResponse](docs/TlsCertificatesAndHostnamesPerHostnameSettingsResponse.md)
 - [TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollection](docs/TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollection.md)
 - [TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollectionAllOfResult](docs/TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollectionAllOfResult.md)
 - [TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollectionAllOfResultInfo](docs/TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollectionAllOfResultInfo.md)
 - [TlsCertificatesAndHostnamesPerHostnameSettingsResponseDelete](docs/TlsCertificatesAndHostnamesPerHostnameSettingsResponseDelete.md)
 - [TlsCertificatesAndHostnamesQuota](docs/TlsCertificatesAndHostnamesQuota.md)
 - [TlsCertificatesAndHostnamesRequestType](docs/TlsCertificatesAndHostnamesRequestType.md)
 - [TlsCertificatesAndHostnamesRequestedValidity](docs/TlsCertificatesAndHostnamesRequestedValidity.md)
 - [TlsCertificatesAndHostnamesResultInfo](docs/TlsCertificatesAndHostnamesResultInfo.md)
 - [TlsCertificatesAndHostnamesSchemasCertificateAuthority](docs/TlsCertificatesAndHostnamesSchemasCertificateAuthority.md)
 - [TlsCertificatesAndHostnamesSchemasCertificateObject](docs/TlsCertificatesAndHostnamesSchemasCertificateObject.md)
 - [TlsCertificatesAndHostnamesSchemasCertificateResponseCollection](docs/TlsCertificatesAndHostnamesSchemasCertificateResponseCollection.md)
 - [TlsCertificatesAndHostnamesSchemasCertificateResponseSingle](docs/TlsCertificatesAndHostnamesSchemasCertificateResponseSingle.md)
 - [TlsCertificatesAndHostnamesSchemasSignature](docs/TlsCertificatesAndHostnamesSchemasSignature.md)
 - [TlsCertificatesAndHostnamesSchemasStatus](docs/TlsCertificatesAndHostnamesSchemasStatus.md)
 - [TlsCertificatesAndHostnamesSchemasValidationMethod](docs/TlsCertificatesAndHostnamesSchemasValidationMethod.md)
 - [TlsCertificatesAndHostnamesSchemasValidityDays](docs/TlsCertificatesAndHostnamesSchemasValidityDays.md)
 - [TlsCertificatesAndHostnamesSettingId](docs/TlsCertificatesAndHostnamesSettingId.md)
 - [TlsCertificatesAndHostnamesSettingObject](docs/TlsCertificatesAndHostnamesSettingObject.md)
 - [TlsCertificatesAndHostnamesSettingObjectDelete](docs/TlsCertificatesAndHostnamesSettingObjectDelete.md)
 - [TlsCertificatesAndHostnamesSsl](docs/TlsCertificatesAndHostnamesSsl.md)
 - [TlsCertificatesAndHostnamesSslOneOf](docs/TlsCertificatesAndHostnamesSslOneOf.md)
 - [TlsCertificatesAndHostnamesSslOneOfValidationErrorsInner](docs/TlsCertificatesAndHostnamesSslOneOfValidationErrorsInner.md)
 - [TlsCertificatesAndHostnamesSslUniversalSettingsResponse](docs/TlsCertificatesAndHostnamesSslUniversalSettingsResponse.md)
 - [TlsCertificatesAndHostnamesSslValidationMethodResponseCollection](docs/TlsCertificatesAndHostnamesSslValidationMethodResponseCollection.md)
 - [TlsCertificatesAndHostnamesSslValidationMethodResponseCollectionAllOfResult](docs/TlsCertificatesAndHostnamesSslValidationMethodResponseCollectionAllOfResult.md)
 - [TlsCertificatesAndHostnamesSslVerificationResponseCollection](docs/TlsCertificatesAndHostnamesSslVerificationResponseCollection.md)
 - [TlsCertificatesAndHostnamesSslpost](docs/TlsCertificatesAndHostnamesSslpost.md)
 - [TlsCertificatesAndHostnamesSslpostOneOf](docs/TlsCertificatesAndHostnamesSslpostOneOf.md)
 - [TlsCertificatesAndHostnamesSslsettings](docs/TlsCertificatesAndHostnamesSslsettings.md)
 - [TlsCertificatesAndHostnamesStatus](docs/TlsCertificatesAndHostnamesStatus.md)
 - [TlsCertificatesAndHostnamesTotalTlsSettingsResponse](docs/TlsCertificatesAndHostnamesTotalTlsSettingsResponse.md)
 - [TlsCertificatesAndHostnamesTotalTlsSettingsResponseAllOfResult](docs/TlsCertificatesAndHostnamesTotalTlsSettingsResponseAllOfResult.md)
 - [TlsCertificatesAndHostnamesType](docs/TlsCertificatesAndHostnamesType.md)
 - [TlsCertificatesAndHostnamesUniversal](docs/TlsCertificatesAndHostnamesUniversal.md)
 - [TlsCertificatesAndHostnamesUuidObject](docs/TlsCertificatesAndHostnamesUuidObject.md)
 - [TlsCertificatesAndHostnamesValidationMethod](docs/TlsCertificatesAndHostnamesValidationMethod.md)
 - [TlsCertificatesAndHostnamesValidationMethodDefinition](docs/TlsCertificatesAndHostnamesValidationMethodDefinition.md)
 - [TlsCertificatesAndHostnamesValidationRecord](docs/TlsCertificatesAndHostnamesValidationRecord.md)
 - [TlsCertificatesAndHostnamesValidityDays](docs/TlsCertificatesAndHostnamesValidityDays.md)
 - [TlsCertificatesAndHostnamesVerification](docs/TlsCertificatesAndHostnamesVerification.md)
 - [TlsCertificatesAndHostnamesVerificationInfo](docs/TlsCertificatesAndHostnamesVerificationInfo.md)
 - [TlsCertificatesAndHostnamesVerificationType](docs/TlsCertificatesAndHostnamesVerificationType.md)
 - [TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull](docs/TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.md)
 - [TlsCertificatesAndHostnamesZoneAuthenticatedOriginPullComponentsSchemasStatus](docs/TlsCertificatesAndHostnamesZoneAuthenticatedOriginPullComponentsSchemasStatus.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="api_email"></a>
### api_email


- **Type**: API key
- **API key parameter name**: X-Auth-Email
- **Location**: HTTP header

<a id="api_key"></a>
### api_key


- **Type**: API key
- **API key parameter name**: X-Auth-Key
- **Location**: HTTP header

<a id="api_token"></a>
### api_token


- **Type**: HTTP Bearer Token authentication

<a id="user_service_key"></a>
### user_service_key


- **Type**: API key
- **API key parameter name**: X-Auth-User-Service-Key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
However, the instances of the api clients created from the `ApiClient` are thread-safe and can be re-used.

## Author



