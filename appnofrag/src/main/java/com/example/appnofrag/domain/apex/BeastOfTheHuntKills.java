
package com.example.appnofrag.domain.apex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BeastOfTheHuntKills {

    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("percentile")
    @Expose
    private Double percentile;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("displayCategory")
    @Expose
    private String displayCategory;
    @SerializedName("category")
    @Expose
    private Object category;
    @SerializedName("metadata")
    @Expose
    private Metadata________________ metadata;
    @SerializedName("value")
    @Expose
    private Double value;
    @SerializedName("displayValue")
    @Expose
    private String displayValue;
    @SerializedName("displayType")
    @Expose
    private String displayType;

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Double getPercentile() {
        return percentile;
    }

    public void setPercentile(Double percentile) {
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

    public Object getCategory() {
        return category;
    }

    public void setCategory(Object category) {
        this.category = category;
    }

    public Metadata________________ getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata________________ metadata) {
        this.metadata = metadata;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
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
