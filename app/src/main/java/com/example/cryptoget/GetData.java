package com.example.cryptoget;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetData {
    @GET("/api/exchanges")
    Call<List<CryptoExchange>> getAllCryptoExchanges();
}
