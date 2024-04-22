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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.OneOf;
import org.openapitools.client.model.WorkersAiPostRunCfBaaiBgeBaseEnV15400Response;
import org.openapitools.client.model.WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkersAiTextGenerationApi
 */
@Disabled
public class WorkersAiTextGenerationApiTest {

    private final WorkersAiTextGenerationApi api = new WorkersAiTextGenerationApi();

    /**
     * Execute @cf/deepseek-ai/deepseek-math-7b-instruct model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfDeepseekAiDeepseekMath7bInstructTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfDeepseekAiDeepseekMath7bInstruct(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/defog/sqlcoder-7b-2 model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfDefogSqlcoder7b2Test() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfDefogSqlcoder7b2(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/google/gemma-2b-it-lora model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfGoogleGemma2bItLoraTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfGoogleGemma2bItLora(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/google/gemma-7b-it-lora model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfGoogleGemma7bItLoraTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfGoogleGemma7bItLora(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/meta/llama-2-7b-chat-fp16 model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfMetaLlama27bChatFp16Test() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfMetaLlama27bChatFp16(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/meta/llama-2-7b-chat-int8 model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfMetaLlama27bChatInt8Test() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfMetaLlama27bChatInt8(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/meta/llama-3-8b-instruct model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfMetaLlama38bInstructTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfMetaLlama38bInstruct(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/meta-llama/llama-2-7b-chat-hf-lora model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfMetaLlamaLlama27bChatHfLoraTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfMetaLlamaLlama27bChatHfLora(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/microsoft/phi-2 model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfMicrosoftPhi2Test() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfMicrosoftPhi2(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/mistral/mistral-7b-instruct-v0.1 model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfMistralMistral7bInstructV01Test() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfMistralMistral7bInstructV01(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/mistral/mistral-7b-instruct-v0.1-vllm model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfMistralMistral7bInstructV01VllmTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfMistralMistral7bInstructV01Vllm(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/mistral/mistral-7b-instruct-v0.2-lora model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfMistralMistral7bInstructV02LoraTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfMistralMistral7bInstructV02Lora(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/mistral/mixtral-8x7b-instruct-v0.1-awq model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfMistralMixtral8x7bInstructV01AwqTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfMistralMixtral8x7bInstructV01Awq(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/openchat/openchat-3.5-0106 model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfOpenchatOpenchat350106Test() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfOpenchatOpenchat350106(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/qwen/qwen1.5-0.5b-chat model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfQwenQwen1505bChatTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfQwenQwen1505bChat(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/qwen/qwen1.5-14b-chat-awq model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfQwenQwen1514bChatAwqTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfQwenQwen1514bChatAwq(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/qwen/qwen1.5-1.8b-chat model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfQwenQwen1518bChatTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfQwenQwen1518bChat(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/qwen/qwen1.5-7b-chat-awq model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfQwenQwen157bChatAwqTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfQwenQwen157bChatAwq(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/sven/test model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfSvenTestTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfSvenTest(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/thebloke/discolm-german-7b-v1-awq model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfTheblokeDiscolmGerman7bV1AwqTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfTheblokeDiscolmGerman7bV1Awq(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/tiiuae/falcon-7b-instruct model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfTiiuaeFalcon7bInstructTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfTiiuaeFalcon7bInstruct(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @cf/tinyllama/tinyllama-1.1b-chat-v1.0 model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunCfTinyllamaTinyllama11bChatV10Test() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunCfTinyllamaTinyllama11bChatV10(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @hf/google/gemma-7b-it model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunHfGoogleGemma7bItTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunHfGoogleGemma7bIt(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @hf/mistral/mistral-7b-instruct-v0.2 model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunHfMistralMistral7bInstructV02Test() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunHfMistralMistral7bInstructV02(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @hf/nexusflow/starling-lm-7b-beta model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunHfNexusflowStarlingLm7bBetaTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunHfNexusflowStarlingLm7bBeta(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @hf/nousresearch/hermes-2-pro-mistral-7b model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunHfNousresearchHermes2ProMistral7bTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunHfNousresearchHermes2ProMistral7b(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @hf/thebloke/codellama-7b-instruct-awq model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunHfTheblokeCodellama7bInstructAwqTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunHfTheblokeCodellama7bInstructAwq(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @hf/thebloke/deepseek-coder-6.7b-base-awq model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunHfTheblokeDeepseekCoder67bBaseAwqTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunHfTheblokeDeepseekCoder67bBaseAwq(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @hf/thebloke/deepseek-coder-6.7b-instruct-awq model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunHfTheblokeDeepseekCoder67bInstructAwqTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunHfTheblokeDeepseekCoder67bInstructAwq(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @hf/thebloke/llama-2-13b-chat-awq model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunHfTheblokeLlama213bChatAwqTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunHfTheblokeLlama213bChatAwq(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @hf/thebloke/llamaguard-7b-awq model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunHfTheblokeLlamaguard7bAwqTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunHfTheblokeLlamaguard7bAwq(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @hf/thebloke/mistral-7b-instruct-v0.1-awq model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunHfTheblokeMistral7bInstructV01AwqTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunHfTheblokeMistral7bInstructV01Awq(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @hf/thebloke/neural-chat-7b-v3-1-awq model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunHfTheblokeNeuralChat7bV31AwqTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunHfTheblokeNeuralChat7bV31Awq(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @hf/thebloke/openchat_3.5-awq model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunHfTheblokeOpenchat35AwqTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunHfTheblokeOpenchat35Awq(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @hf/thebloke/openhermes-2.5-mistral-7b-awq model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunHfTheblokeOpenhermes25Mistral7bAwqTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunHfTheblokeOpenhermes25Mistral7bAwq(accountId, body);
        // TODO: test validations
    }

    /**
     * Execute @hf/thebloke/zephyr-7b-beta-awq model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiPostRunHfTheblokeZephyr7bBetaAwqTest() throws ApiException {
        String accountId = null;
        OneOf body = null;
        WorkersAiPostRunCfDeepseekAiDeepseekMath7bInstruct200Response response = api.workersAiPostRunHfTheblokeZephyr7bBetaAwq(accountId, body);
        // TODO: test validations
    }

}