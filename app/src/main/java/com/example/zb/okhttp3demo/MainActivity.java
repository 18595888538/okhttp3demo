package com.example.zb.okhttp3demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.IOException;
import java.util.HashMap;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData(){
        HashMap<String, String> param=new HashMap<>();
        param.put("code","admin");
        param.put("password","bolesoft");
       String url="http://192.168.200.211:8081/BLPDAService.asmx/GetUserInfo";
        HttpUtils.doPost(url, param, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                MyLog.i("成功-------------",response.body().string());

            }
        });

    }
}
