package com.example.cryptoget;

import com.google.gson.annotations.SerializedName;

public class CryptoExchange {

    @SerializedName("name")
    private String name;


    public CryptoExchange(String name, int active_pairs, double volume_usd, String country) {
        this.name = name;
        this.active_pairs = active_pairs;
        this.volume_usd=volume_usd;
        this.country=country;
    }

    public String getCurrency() {
        return name;
    }

    public void setCurrency(String name) {
        this.name = name;
    }


    public String getActive_pairs() {
        return "Active pairs: " +active_pairs;
    }

    public void setActive_pairs(int active_pairs) {
        this.active_pairs = active_pairs;
    }

    @SerializedName("active_pairs")
    private int active_pairs;

    public String getVolume_usd() {
        return "Volume(USD): "+volume_usd;
    }

    public void setVolume_usd(double volume_usd) {
        this.volume_usd = volume_usd;
    }

    @SerializedName("volume_usd")
    private double volume_usd;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @SerializedName("country")
    private String country;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @SerializedName("url")
    private String url;
}
