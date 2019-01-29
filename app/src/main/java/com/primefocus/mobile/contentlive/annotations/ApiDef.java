package com.primefocus.mobile.contentlive.annotations;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ApiDef {

    @IntDef({CLApi.API_GET_TALENT })

    @Retention(RetentionPolicy.SOURCE)

    public @interface CLApi {

        int API_GET_TALENT = 0;

    }
}
