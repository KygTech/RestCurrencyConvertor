package com.example.currencyProject.service;

import com.example.currencyProject.config.ConvertorConfiguration;
import com.example.currencyProject.model.Currency;
import com.example.currencyProject.model.CurrencyResponse;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConvertorService {

    @Autowired
    private ConvertorConfiguration configuration;

    @Autowired
    private RestTemplate restTemplate;

    public CurrencyResponse convert(Currency currency) {

        ResponseEntity<String> response = restTemplate.getForEntity(configuration.getBaseUrl() + currency.getFrom(), String.class);

        JsonObject responseJson = new Gson().fromJson(response.getBody(), JsonObject.class);
        JsonElement rate = responseJson.get("rates").getAsJsonObject().get(currency.getTo());

        double convertedResult = Double.parseDouble(rate.toString()) * currency.getAmount();

        return new CurrencyResponse(convertedResult);
    }




}