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
import cloudflare.sdk.models.ArchiveSecurityCenterInsightRequest;
import cloudflare.sdk.models.GetSecurityCenterIssueTypes200Response;
import cloudflare.sdk.models.GetSecurityCenterIssues200Response;
import cloudflare.sdk.models.SecurityCenterApiResponseCommonFailure;
import cloudflare.sdk.models.SecurityCenterApiResponseSingle;
import cloudflare.sdk.models.SecurityCenterIssueType;
import cloudflare.sdk.models.SecurityCenterValueCountsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecurityCenterInsightsApi
 */
@Disabled
public class SecurityCenterInsightsApiTest {

    private final SecurityCenterInsightsApi api = new SecurityCenterInsightsApi();

    /**
     * Archive Security Center Insight
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void archiveSecurityCenterInsightTest() throws ApiException {
        String accountId = null;
        String issueId = null;
        ArchiveSecurityCenterInsightRequest archiveSecurityCenterInsightRequest = null;
        SecurityCenterApiResponseSingle response = api.archiveSecurityCenterInsight(accountId, issueId, archiveSecurityCenterInsightRequest);
        // TODO: test validations
    }

    /**
     * Get Security Center Issue Counts by Class
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSecurityCenterIssueCountsByClassTest() throws ApiException {
        String accountId = null;
        Boolean dismissed = null;
        List<String> issueClass = null;
        List<SecurityCenterIssueType> issueType = null;
        List<String> product = null;
        List<String> severity = null;
        List<String> subject = null;
        List<String> issueClassTildeNeq = null;
        List<SecurityCenterIssueType> issueTypeTildeNeq = null;
        List<String> productTildeNeq = null;
        List<String> severityTildeNeq = null;
        List<String> subjectTildeNeq = null;
        SecurityCenterValueCountsResponse response = api.getSecurityCenterIssueCountsByClass(accountId, dismissed, issueClass, issueType, product, severity, subject, issueClassTildeNeq, issueTypeTildeNeq, productTildeNeq, severityTildeNeq, subjectTildeNeq);
        // TODO: test validations
    }

    /**
     * Get Security Center Issue Counts by Severity
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSecurityCenterIssueCountsBySeverityTest() throws ApiException {
        String accountId = null;
        Boolean dismissed = null;
        List<String> issueClass = null;
        List<SecurityCenterIssueType> issueType = null;
        List<String> product = null;
        List<String> severity = null;
        List<String> subject = null;
        List<String> issueClassTildeNeq = null;
        List<SecurityCenterIssueType> issueTypeTildeNeq = null;
        List<String> productTildeNeq = null;
        List<String> severityTildeNeq = null;
        List<String> subjectTildeNeq = null;
        SecurityCenterValueCountsResponse response = api.getSecurityCenterIssueCountsBySeverity(accountId, dismissed, issueClass, issueType, product, severity, subject, issueClassTildeNeq, issueTypeTildeNeq, productTildeNeq, severityTildeNeq, subjectTildeNeq);
        // TODO: test validations
    }

    /**
     * Get Security Center Issue Counts by Type
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSecurityCenterIssueCountsByTypeTest() throws ApiException {
        String accountId = null;
        Boolean dismissed = null;
        List<String> issueClass = null;
        List<SecurityCenterIssueType> issueType = null;
        List<String> product = null;
        List<String> severity = null;
        List<String> subject = null;
        List<String> issueClassTildeNeq = null;
        List<SecurityCenterIssueType> issueTypeTildeNeq = null;
        List<String> productTildeNeq = null;
        List<String> severityTildeNeq = null;
        List<String> subjectTildeNeq = null;
        SecurityCenterValueCountsResponse response = api.getSecurityCenterIssueCountsByType(accountId, dismissed, issueClass, issueType, product, severity, subject, issueClassTildeNeq, issueTypeTildeNeq, productTildeNeq, severityTildeNeq, subjectTildeNeq);
        // TODO: test validations
    }

    /**
     * Get Security Center Issues Types
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSecurityCenterIssueTypesTest() throws ApiException {
        String accountId = null;
        GetSecurityCenterIssueTypes200Response response = api.getSecurityCenterIssueTypes(accountId);
        // TODO: test validations
    }

    /**
     * Get Security Center Issues
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSecurityCenterIssuesTest() throws ApiException {
        String accountId = null;
        Boolean dismissed = null;
        List<String> issueClass = null;
        List<SecurityCenterIssueType> issueType = null;
        List<String> product = null;
        List<String> severity = null;
        List<String> subject = null;
        List<String> issueClassTildeNeq = null;
        List<SecurityCenterIssueType> issueTypeTildeNeq = null;
        List<String> productTildeNeq = null;
        List<String> severityTildeNeq = null;
        List<String> subjectTildeNeq = null;
        Integer page = null;
        Integer perPage = null;
        GetSecurityCenterIssues200Response response = api.getSecurityCenterIssues(accountId, dismissed, issueClass, issueType, product, severity, subject, issueClassTildeNeq, issueTypeTildeNeq, productTildeNeq, severityTildeNeq, subjectTildeNeq, page, perPage);
        // TODO: test validations
    }

}
