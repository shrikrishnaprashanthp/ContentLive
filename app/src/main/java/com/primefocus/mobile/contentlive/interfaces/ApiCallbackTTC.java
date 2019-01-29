package com.primefocus.mobile.contentlive.interfaces;

public interface ApiCallbackTTC {

    /**
     * @param teleTangoCoreApi TeleTangoCoreApi type for which response returned
     * @param response Response object
     */
    void apiCallbackSuccess(int teleTangoCoreApi, Object response);

    /**
     * @param teleTangoCoreApi TeleTangoCoreApi type for which response returned
     * @param response Response string
     */
    void apiCallbackFailure(int teleTangoCoreApi, String response);

    /**
     * @param teleTangoCoreApi TeleTangoCoreApi type for which response returned
     * @param bytesUploaded bytes Uploaded/Downloaded
     * @param totalSize total file size
     */
    void apiCallbackProgress(int teleTangoCoreApi, long bytesUploaded, long totalSize);
}
