package com.example.huang.yuenifanng;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.huang.yuenifanng.activity.Main2Activity;

public class MainActivity extends AppCompatActivity {

    private ImageView main_iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        },3000);
    }

    private void initView() {
        main_iv = (ImageView) findViewById(R.id.main_iv);
    }
}
