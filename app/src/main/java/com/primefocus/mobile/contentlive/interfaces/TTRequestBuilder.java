package com.primefocus.mobile.contentlive.interfaces;


import com.primefocus.mobile.contentlive.annotations.ApiDef;

import java.util.Map;

/**
 * Created by kaustuv on 21/11/17.
 */

public interface TTRequestBuilder {

    /**
     * This method is used to set request api
     *
     * @param apiType Any one of the api from TeleTangoCoreApi list
     */
    TTRequestBuilder forApi(@ApiDef.CLApi int apiType);

    /**
     * This method is used add request params
     * <b>Note:</b> It is mandatory to call this method for each request. If the request doesn't need any param, pass null
     *
     * @param params Pass HashMap&lt;String, String&gt; or null
     */
    TTRequestBuilder addParams(Map<String, String> params);

    /**
     * This method is used to tag an api. This tag may be used later to cancel a running call
     *
     * @param tag Tag for the the api request. This tag may be used to cancel a running api
     */
    TTRequestBuilder setTag(Object tag);

    /**
     * This method is used to set api callback to get response
     *
     * @param apiCallbackTTC Callback where the response of api will be returned
     */
    TTRequestBuilder setCallback(ApiCallbackTTC apiCallbackTTC);

    /**
     * This will call the api over network
     */
    void start();
}
