package com.example.currencyProject.controllers;

import com.example.currencyProject.model.Currency;
import com.example.currencyProject.model.CurrencyResponse;
import com.example.currencyProject.service.ConvertorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/currency")
public class ConvertorController {

    @Autowired
    private ConvertorService convertorService;

    @PostMapping("/convert")
    public CurrencyResponse currencyRespone(@RequestBody Currency currency) {
      return convertorService.convert(currency);
    }
}
