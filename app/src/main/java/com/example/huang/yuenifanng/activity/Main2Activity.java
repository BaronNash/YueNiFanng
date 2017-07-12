package com.example.huang.yuenifanng.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.huang.yuenifanng.R;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button main2_but;
    private Handler handler;
    private Runnable run;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        handler = new Handler();
        run =new Runnable() {
            @Override
            public void run() {
                if (str.equals("huang")) {
                    Intent in = new Intent(Main2Activity.this, Main4Activity.class);
                    startActivity(in);
                } else if (str.equals("")) {
                    Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                    startActivity(intent);
                }
            }
        };
        handler.postDelayed(run,3000);

    }

    private void initView() {
        main2_but = (Button) findViewById(R.id.main2_but);

        main2_but.setOnClickListener(this);
        SharedPreferences spf = getSharedPreferences("user", MODE_PRIVATE);
        str = spf.getString("age", "");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main2_but:
                handler.removeCallbacks(run);

                if (str.equals("huang")) {
                    Intent in = new Intent(Main2Activity.this, Main4Activity.class);
                    startActivity(in);
                } else if (str.equals("")) {
                    Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                    startActivity(intent);
                }
                break;
        }
    }
}
