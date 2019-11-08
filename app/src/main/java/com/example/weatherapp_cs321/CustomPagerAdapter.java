package com.example.weatherapp_cs321;

import android.content.Context;
import android.graphics.ColorSpace;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class CustomPagerAdapter extends PagerAdapter {
    private Context mContext;

    public CustomPagerAdapter(android.content.Context context){
        mContext = context;
    }

    public Object instantiateItem(ViewGroup collection, int position){
        ModelObject modelObject = ModelObject.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getmLayoutResId(), collection, false);
        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view){
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return ModelObject.values().length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position){
        ModelObject customPagerEnum = ModelObject.values()[position];
        return mContext.getString(customPagerEnum.getmTitleResId());
    }
}
