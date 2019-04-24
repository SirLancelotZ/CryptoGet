package com.example.cryptoget;

import com.google.gson.annotations.SerializedName;

public class CryptoCurrencies {

    @SerializedName("name")
    private String name;


    public CryptoCurrencies(String name) {
        this.name = name;

    }

    public String getCurrency() {
        return name;
    }

    public void setCurrency(String name) {
        this.name = name;
    }



}
