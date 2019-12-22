
package com.example.appnofrag.domain.overwatch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlatformInfo {

    @SerializedName("platformSlug")
    @Expose
    private String platformSlug;
    @SerializedName("platformUserId")
    @Expose
    private String platformUserId;
    @SerializedName("platformUserHandle")
    @Expose
    private String platformUserHandle;
    @SerializedName("platformUserIdentifier")
    @Expose
    private String platformUserIdentifier;
    @SerializedName("avatarUrl")
    @Expose
    private Object avatarUrl;
    @SerializedName("additionalParameters")
    @Expose
    private Object additionalParameters;

    public String getPlatformSlug() {
        return platformSlug;
    }

    public void setPlatformSlug(String platformSlug) {
        this.platformSlug = platformSlug;
    }

    public String getPlatformUserId() {
        return platformUserId;
    }

    public void setPlatformUserId(String platformUserId) {
        this.platformUserId = platformUserId;
    }

    public String getPlatformUserHandle() {
        return platformUserHandle;
    }

    public void setPlatformUserHandle(String platformUserHandle) {
        this.platformUserHandle = platformUserHandle;
    }

    public String getPlatformUserIdentifier() {
        return platformUserIdentifier;
    }

    public void setPlatformUserIdentifier(String platformUserIdentifier) {
        this.platformUserIdentifier = platformUserIdentifier;
    }

    public Object getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(Object avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Object getAdditionalParameters() {
        return additionalParameters;
    }

    public void setAdditionalParameters(Object additionalParameters) {
        this.additionalParameters = additionalParameters;
    }

}
