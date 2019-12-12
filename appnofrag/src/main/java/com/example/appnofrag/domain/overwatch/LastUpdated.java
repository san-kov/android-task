
package com.example.appnofrag.domain.overwatch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LastUpdated {

    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("displayValue")
    @Expose
    private String displayValue;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

}
