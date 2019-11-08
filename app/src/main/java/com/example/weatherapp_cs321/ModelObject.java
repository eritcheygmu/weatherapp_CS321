package com.example.weatherapp_cs321;

public enum ModelObject {

    //TODO: the following three are temp. need to replace w. recommendations
    RED(R.string.red, R.layout.view_red),
    BLUE(R.string.blue, R.layout.view_blue),
    GREEN(R.string.green, R.layout.view_green);

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
