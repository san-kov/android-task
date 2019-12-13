
package com.example.appnofrag.domain.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Clips {

    @SerializedName("320")
    @Expose
    private String _320;
    @SerializedName("640")
    @Expose
    private String _640;
    @SerializedName("full")
    @Expose
    private String full;

    public String get320() {
        return _320;
    }

    public void set320(String _320) {
        this._320 = _320;
    }

    public String get640() {
        return _640;
    }

    public void set640(String _640) {
        this._640 = _640;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

}
