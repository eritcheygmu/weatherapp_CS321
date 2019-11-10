package com.example.weatherapp_cs321;

public enum ModelObject {

    //TODO: the following three are temp. need to replace w. recommendations
    //This might be where suggestion function's return is accepted

    RED(R.string.hi_world, R.layout.view_red),
    BLUE(R.string.hi_world, R.layout.view_blue),
    GREEN(R.string.hi_world, R.layout.view_green);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getmTitleResId(){
        return mTitleResId;
    }

    public int getmLayoutResId(){
        return mLayoutResId;
    }
}
