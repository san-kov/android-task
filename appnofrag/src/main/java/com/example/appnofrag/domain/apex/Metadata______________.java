
package com.example.appnofrag.domain.apex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata______________ {

    @SerializedName("iconUrl")
    @Expose
    private String iconUrl;

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

}
