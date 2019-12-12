
package com.example.appnofrag.domain.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Platform_ {

    @SerializedName("platform")
    @Expose
    private Platform__ platform;
    @SerializedName("released_at")
    @Expose
    private String releasedAt;
    @SerializedName("requirements")
    @Expose
    private Object requirements;

    public Platform__ getPlatform() {
        return platform;
    }

    public void setPlatform(Platform__ platform) {
        this.platform = platform;
    }

    public String getReleasedAt() {
        return releasedAt;
    }

    public void setReleasedAt(String releasedAt) {
        this.releasedAt = releasedAt;
    }

    public Object getRequirements() {
        return requirements;
    }

    public void setRequirements(Object requirements) {
        this.requirements = requirements;
    }

}
