
package com.example.appnofrag.domain.overwatch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MostHealingDone {

    @SerializedName("rank")
    @Expose
    private Object rank;
    @SerializedName("percentile")
    @Expose
    private Object percentile;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("displayCategory")
    @Expose
    private String displayCategory;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("metadata")
    @Expose
    private Metadata_____________________________ metadata;
    @SerializedName("value")
    @Expose
    private Integer value;
    @SerializedName("displayValue")
    @Expose
    private String displayValue;
    @SerializedName("displayType")
    @Expose
    private String displayType;

    public Object getRank() {
        return rank;
    }

    public void setRank(Object rank) {
        this.rank = rank;
    }

    public Object getPercentile() {
        return percentile;
    }

    public void setPercentile(Object percentile) {
        this.percentile = percentile;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayCategory() {
        return displayCategory;
    }

    public void setDisplayCategory(String displayCategory) {
        this.displayCategory = displayCategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Metadata_____________________________ getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata_____________________________ metadata) {
        this.metadata = metadata;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

}
