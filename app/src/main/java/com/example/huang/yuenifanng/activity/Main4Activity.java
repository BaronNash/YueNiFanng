package com.example.huang.yuenifanng.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

import com.example.huang.yuenifanng.R;
import com.example.huang.yuenifanng.adapter.Main4_VpAdapter;
import com.example.huang.yuenifanng.fragment.Fl_Fragment;
import com.example.huang.yuenifanng.fragment.Grzx_Fragment;
import com.example.huang.yuenifanng.fragment.Gwc_Fragment;
import com.example.huang.yuenifanng.fragment.Sy_Fragment;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager main4_vp;
    private RadioButton main4_but1;
    private RadioButton main4_but2;
    private RadioButton main4_but3;
    private RadioButton main4_but4;
    private ArrayList<Fragment> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        initView();
        initAdd();
        spf();
    }

    private void initAdd() {
        Sy_Fragment sy = new Sy_Fragment();
        Fl_Fragment fl = new Fl_Fragment();
        Gwc_Fragment gwc = new Gwc_Fragment();
        Grzx_Fragment grzx = new Grzx_Fragment();
        list.add(sy);
        list.add(fl);
        list.add(gwc);
        list.add(grzx);
        Main4_VpAdapter adapter = new Main4_VpAdapter(getSupportFragmentManager(), list);
        main4_vp.setAdapter(adapter);
    }

    private void spf() {
        SharedPreferences spf = getSharedPreferences("user", MODE_PRIVATE);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("age", "huang");
        editor.commit();
    }

    private void initView() {
        main4_vp = (ViewPager) findViewById(R.id.main4_vp);
        main4_but1 = (RadioButton) findViewById(R.id.main4_but1);
        main4_but2 = (RadioButton) findViewById(R.id.main4_but2);
        main4_but3 = (RadioButton) findViewById(R.id.main4_but3);
        main4_but4 = (RadioButton) findViewById(R.id.main4_but4);
        main4_but1.setOnClickListener(this);
        main4_but2.setOnClickListener(this);
        main4_but3.setOnClickListener(this);
        main4_but4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main4_but1:
                main4_vp.setCurrentItem(0);
                break;
            case R.id.main4_but2:
                main4_vp.setCurrentItem(1);
                break;
            case R.id.main4_but3:
                main4_vp.setCurrentItem(2);
                break;
            case R.id.main4_but4:
                main4_vp.setCurrentItem(3);
                break;
        }

    }
}
