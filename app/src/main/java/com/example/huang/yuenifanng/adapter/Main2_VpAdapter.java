package com.example.huang.yuenifanng.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by huang on 2017/4/20.
 */

public class Main2_VpAdapter extends PagerAdapter {
    ArrayList<View> view_list;

    public Main2_VpAdapter(ArrayList<View> view_list) {
        this.view_list = view_list;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(view_list.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(view_list.get(position));
        return view_list.get(position);
    }

    @Override
    public int getCount() {
        return view_list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}
