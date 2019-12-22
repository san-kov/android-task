
package com.example.appnofrag.domain.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Clip {

    @SerializedName("clip")
    @Expose
    private String clip;
    @SerializedName("clips")
    @Expose
    private Clips clips;
    @SerializedName("video")
    @Expose
    private String video;
    @SerializedName("preview")
    @Expose
    private String preview;

    public String getClip() {
        return clip;
    }

    public void setClip(String clip) {
        this.clip = clip;
    }

    public Clips getClips() {
        return clips;
    }

    public void setClips(Clips clips) {
        this.clips = clips;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

}
