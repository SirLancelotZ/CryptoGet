package com.example.cryptoget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MyAdapter myAdapter;
    private RecyclerView myRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetData service = RetrofitClient.getRetrofitInstance().create(GetData.class);
        Call<List<CryptoExchange>> call = service.getAllCryptoExchanges();
        call.enqueue(new Callback<List<CryptoExchange>>() {

            @Override
            public void onResponse(Call<List<CryptoExchange>> call, Response<List<CryptoExchange>> response) {
                loadDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<CryptoExchange>> call, Throwable throwable) {
                Toast.makeText(MainActivity.this, "Unable to load data", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loadDataList(List<CryptoExchange> cryptoList) {

        myRecyclerView = findViewById(R.id.myRecyclerView);
        myAdapter = new MyAdapter(cryptoList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        myRecyclerView.setLayoutManager(layoutManager);
        myRecyclerView.setAdapter(myAdapter);
    }

}
