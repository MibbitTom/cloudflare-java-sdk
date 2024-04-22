

# AccessIdentityProviderScimConfig

The configuration settings for enabling a System for Cross-Domain Identity Management (SCIM) with the identity provider.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | A flag to enable or disable SCIM for the identity provider. |  [optional] |
|**groupMemberDeprovision** | **Boolean** | A flag to revoke a user&#39;s session in Access and force a reauthentication on the user&#39;s Gateway session when they have been added or removed from a group in the Identity Provider. |  [optional] |
|**seatDeprovision** | **Boolean** | A flag to remove a user&#39;s seat in Zero Trust when they have been deprovisioned in the Identity Provider.  This cannot be enabled unless user_deprovision is also enabled. |  [optional] |
|**secret** | **String** | A read-only token generated when the SCIM integration is enabled for the first time.  It is redacted on subsequent requests.  If you lose this you will need to refresh it token at /access/identity_providers/:idpID/refresh_scim_secret. |  [optional] |
|**userDeprovision** | **Boolean** | A flag to enable revoking a user&#39;s session in Access and Gateway when they have been deprovisioned in the Identity Provider. |  [optional] |



