
package com.example.appnofrag.domain.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ParentPlatform {

    @SerializedName("platform")
    @Expose
    private Platform platform;

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

}
