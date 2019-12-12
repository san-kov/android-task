
package com.example.fragmentnew.domain.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddedByStatus {

    @SerializedName("yet")
    @Expose
    private Integer yet;
    @SerializedName("owned")
    @Expose
    private Integer owned;
    @SerializedName("beaten")
    @Expose
    private Integer beaten;
    @SerializedName("toplay")
    @Expose
    private Integer toplay;
    @SerializedName("dropped")
    @Expose
    private Integer dropped;
    @SerializedName("playing")
    @Expose
    private Integer playing;

    public Integer getYet() {
        return yet;
    }

    public void setYet(Integer yet) {
        this.yet = yet;
    }

    public Integer getOwned() {
        return owned;
    }

    public void setOwned(Integer owned) {
        this.owned = owned;
    }

    public Integer getBeaten() {
        return beaten;
    }

    public void setBeaten(Integer beaten) {
        this.beaten = beaten;
    }

    public Integer getToplay() {
        return toplay;
    }

    public void setToplay(Integer toplay) {
        this.toplay = toplay;
    }

    public Integer getDropped() {
        return dropped;
    }

    public void setDropped(Integer dropped) {
        this.dropped = dropped;
    }

    public Integer getPlaying() {
        return playing;
    }

    public void setPlaying(Integer playing) {
        this.playing = playing;
    }

}
