
package com.example.appnofrag.domain.apex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SocialAccount {

    @SerializedName("platformSlug")
    @Expose
    private String platformSlug;
    @SerializedName("platformUserHandle")
    @Expose
    private String platformUserHandle;
    @SerializedName("platformUserIdentifier")
    @Expose
    private String platformUserIdentifier;

    public String getPlatformSlug() {
        return platformSlug;
    }

    public void setPlatformSlug(String platformSlug) {
        this.platformSlug = platformSlug;
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

}
