package com.example.retrofitresponse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.retrofitresponse.retrofit.PtcApi;
import com.example.retrofitresponse.retrofit.PtcClient;
import com.example.retrofitresponse.retrofit.ptcpojo.PtcRoot;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView lText = findViewById(R.id.response_text);

        String lUserId = "293906";
        String lApiVersion = "3.09";
        String lToken = "XiqV8nFNlbaQoTuL3Kg@AgAAABQ";

        PtcApi lPtcApi = PtcClient.getPtcApi();
        Call<PtcRoot> lRootCall = lPtcApi.getPtcRoot(lUserId, lApiVersion, lToken);
        lRootCall.enqueue(new Callback<PtcRoot>() {
            @Override
            public void onResponse(Call<PtcRoot> call, Response<PtcRoot> response) {
                Log.w("MainActivity", "Respone Data: "+response.body());
                Toast.makeText(getApplicationContext(), "Response data: "+response.body().getNewsUrl(), Toast.LENGTH_SHORT).show();
                lText.setText(""+response.body().getApi_version()+" "+response.body().getAudiogurbani()
                +" "+response.body().getNewsUrl());
            }

            @Override
            public void onFailure(Call<PtcRoot> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Response Failed: "+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
