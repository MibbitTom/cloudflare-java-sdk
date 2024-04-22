

# ZarazZarazConfigReturn


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**consent** | [**ZarazZarazConfigBaseConsent**](ZarazZarazConfigBaseConsent.md) |  |  [optional] |
|**dataLayer** | **Boolean** | Data layer compatibility mode enabled. |  |
|**debugKey** | **String** | The key for Zaraz debug mode. |  |
|**historyChange** | **Boolean** | Single Page Application support enabled. |  [optional] |
|**settings** | [**ZarazZarazConfigBaseSettings**](ZarazZarazConfigBaseSettings.md) |  |  |
|**triggers** | [**Map&lt;String, ZarazZarazConfigBaseTriggersValue&gt;**](ZarazZarazConfigBaseTriggersValue.md) | Triggers set up under Zaraz configuration, where key is the trigger alpha-numeric ID and value is the trigger configuration. |  |
|**variables** | [**Map&lt;String, ZarazZarazConfigBaseVariablesValue&gt;**](ZarazZarazConfigBaseVariablesValue.md) | Variables set up under Zaraz configuration, where key is the variable alpha-numeric ID and value is the variable configuration. Values of variables of type secret are not included. |  |
|**zarazVersion** | **Integer** | Zaraz internal version of the config. |  |
|**tools** | [**Map&lt;String, ZarazZarazConfigReturnAllOfTools&gt;**](ZarazZarazConfigReturnAllOfTools.md) | Tools set up under Zaraz configuration, where key is the alpha-numeric tool ID and value is the tool configuration object. |  |



