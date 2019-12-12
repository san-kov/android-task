
package com.example.appnofrag.domain.apex;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("platformInfo")
    @Expose
    private PlatformInfo platformInfo;
    @SerializedName("userInfo")
    @Expose
    private UserInfo userInfo;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("segments")
    @Expose
    private List<Segment> segments = null;
    @SerializedName("availableSegments")
    @Expose
    private List<AvailableSegment> availableSegments = null;
    @SerializedName("expiryDate")
    @Expose
    private String expiryDate;

    public PlatformInfo getPlatformInfo() {
        return platformInfo;
    }

    public void setPlatformInfo(PlatformInfo platformInfo) {
        this.platformInfo = platformInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public List<AvailableSegment> getAvailableSegments() {
        return availableSegments;
    }

    public void setAvailableSegments(List<AvailableSegment> availableSegments) {
        this.availableSegments = availableSegments;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

}
