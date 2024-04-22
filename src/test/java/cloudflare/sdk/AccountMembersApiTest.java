/*
 * Cloudflare API
 * To get started using Cloudflare's products and services via the API, refer to [how to interact with Cloudflare](https://developers.cloudflare.com/fundamentals/basic-tasks/interact-with-cloudflare/), which covers using tools like [Terraform](https://developers.cloudflare.com/terraform/#cloudflare-terraform) and the [official SDKs](https://developers.cloudflare.com/fundamentals/api/reference/sdks/) to maintain your Cloudflare resources.  Using the Cloudflare API requires authentication so that Cloudflare knows who is making requests and what permissions you have. Create an API token to grant access to the API to perform actions.  To create an API token, from the Cloudflare dashboard, go to My Profile > API Tokens and select Create Token. For more information on how to create and troubleshoot API tokens, refer to our [API fundamentals](https://developers.cloudflare.com/fundamentals/api/).  Totally new to Cloudflare? [Start here](https://developers.cloudflare.com/fundamentals/get-started/).
 *
 * The version of the OpenAPI document: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package cloudflare.sdk;

import cloudflare.ApiException;
import cloudflare.sdk.models.AccountMembersRemoveMember4XXResponse;
import cloudflare.sdk.models.AccountsAccountDetails4XXResponse;
import cloudflare.sdk.models.AccountsListAccounts4XXResponse;
import java.math.BigDecimal;
import cloudflare.sdk.models.IamApiResponseSingleId;
import cloudflare.sdk.models.IamCollectionMemberResponse;
import cloudflare.sdk.models.IamCreate;
import cloudflare.sdk.models.IamSchemasMember;
import cloudflare.sdk.models.IamSingleMemberResponse;
import cloudflare.sdk.models.IamSingleMemberResponseWithCode;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountMembersApi
 */
@Disabled
public class AccountMembersApiTest {

    private final AccountMembersApi api = new AccountMembersApi();

    /**
     * Add Member
     *
     * Add a user to the list of members for this account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accountMembersAddMemberTest() throws ApiException {
        Object accountId = null;
        IamCreate iamCreate = null;
        IamSingleMemberResponseWithCode response = api.accountMembersAddMember(accountId, iamCreate);
        // TODO: test validations
    }

    /**
     * List Members
     *
     * List all members of an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accountMembersListMembersTest() throws ApiException {
        Object accountId = null;
        String order = null;
        String status = null;
        BigDecimal page = null;
        BigDecimal perPage = null;
        String direction = null;
        IamCollectionMemberResponse response = api.accountMembersListMembers(accountId, order, status, page, perPage, direction);
        // TODO: test validations
    }

    /**
     * Member Details
     *
     * Get information about a specific member of an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accountMembersMemberDetailsTest() throws ApiException {
        String memberId = null;
        Object accountId = null;
        IamSingleMemberResponse response = api.accountMembersMemberDetails(memberId, accountId);
        // TODO: test validations
    }

    /**
     * Remove Member
     *
     * Remove a member from an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accountMembersRemoveMemberTest() throws ApiException {
        String memberId = null;
        Object accountId = null;
        IamApiResponseSingleId response = api.accountMembersRemoveMember(memberId, accountId);
        // TODO: test validations
    }

    /**
     * Update Member
     *
     * Modify an account member.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accountMembersUpdateMemberTest() throws ApiException {
        String memberId = null;
        Object accountId = null;
        IamSchemasMember iamSchemasMember = null;
        IamSingleMemberResponse response = api.accountMembersUpdateMember(memberId, accountId, iamSchemasMember);
        // TODO: test validations
    }

}
