package com.primefocus.mobile.contentlive.networking;

import com.primefocus.mobile.contentlive.interfaces.ApiCallbackTTC;
import com.primefocus.mobile.contentlive.interfaces.TTRequestBuilder;

import java.util.Map;

public class CLNetworking <T extends CLNetworking> implements TTRequestBuilder {

    public CLNetworking() {
        super();
    }

    @Override
    public TTRequestBuilder forApi(int apiType) {
        return null;
    }

    @Override
    public TTRequestBuilder addParams(Map<String, String> params) {
        return null;
    }

    @Override
    public TTRequestBuilder setTag(Object tag) {
        return null;
    }

    @Override
    public TTRequestBuilder setCallback(ApiCallbackTTC apiCallbackTTC) {
        return null;
    }

    @Override
    public void start() {

    }
}
