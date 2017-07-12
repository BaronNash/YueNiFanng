package com.example.huang.yuenifanng.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.example.huang.yuenifanng.R;
import com.example.huang.yuenifanng.adapter.Main2_VpAdapter;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    private ViewPager main3_vp;
    private ArrayList<View> view_list;
    private Button but;
    private Button main3_but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initView();
        view_list = new ArrayList<View>();
        View one_item = LayoutInflater.from(this).inflate(R.layout.one_item, null);
        View two_item = LayoutInflater.from(this).inflate(R.layout.two_item, null);
        View free_item = LayoutInflater.from(this).inflate(R.layout.free_item, null);
        View four_item = LayoutInflater.from(this).inflate(R.layout.four_item, null);
        View fives_item = LayoutInflater.from(this).inflate(R.layout.fives_item, null);
        main3_but = (Button) fives_item.findViewById(R.id.main3_but);
        view_list.add(one_item);
        view_list.add(two_item);
        view_list.add(free_item);
        view_list.add(four_item);
        view_list.add(fives_item);
        Main2_VpAdapter adapter=new Main2_VpAdapter(view_list);
        main3_vp.setAdapter(adapter);
        main3_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        main3_vp = (ViewPager) findViewById(R.id.main3_vp);
    }
}
