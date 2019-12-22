
package com.example.appnofrag.domain.apex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("currentSeason")
    @Expose
    private Integer currentSeason;
    @SerializedName("activeLegend")
    @Expose
    private String activeLegend;
    @SerializedName("activeLegendName")
    @Expose
    private String activeLegendName;

    public Integer getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Integer currentSeason) {
        this.currentSeason = currentSeason;
    }

    public String getActiveLegend() {
        return activeLegend;
    }

    public void setActiveLegend(String activeLegend) {
        this.activeLegend = activeLegend;
    }

    public String getActiveLegendName() {
        return activeLegendName;
    }

    public void setActiveLegendName(String activeLegendName) {
        this.activeLegendName = activeLegendName;
    }

}
