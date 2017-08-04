package com.example.android.miwok;

/**
 * Created by 12112 on 2017/8/1.
 */

public class Word {
    private String mMiworkTranslation;
    private String mDefaultTranslation;

    public Word(String miworkTranslation,String defaultTranslation) {
        mMiworkTranslation=miworkTranslation;
        mDefaultTranslation=defaultTranslation;
    }

    public String getmMiworkTranslation() {
        return mMiworkTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
}
