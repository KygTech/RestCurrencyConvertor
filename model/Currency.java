package com.example.currencyProject.model;

import lombok.Data;

@Data
public class Currency {

    private String from;
    private String to;
    private double amount;
}
