package com.wmalick.webdoc_library.Dashboard.modelclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WebdocSdkFeedbackResult {

    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("ResponseCode")
    @Expose
    private String responseCode;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

}
