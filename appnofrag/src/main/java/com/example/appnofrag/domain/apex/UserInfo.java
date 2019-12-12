
package com.example.appnofrag.domain.apex;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInfo {

    @SerializedName("isPremium")
    @Expose
    private Boolean isPremium;
    @SerializedName("isVerified")
    @Expose
    private Boolean isVerified;
    @SerializedName("isInfluencer")
    @Expose
    private Boolean isInfluencer;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;
    @SerializedName("customAvatarUrl")
    @Expose
    private Object customAvatarUrl;
    @SerializedName("socialAccounts")
    @Expose
    private List<SocialAccount> socialAccounts = null;

    public Boolean getIsPremium() {
        return isPremium;
    }

    public void setIsPremium(Boolean isPremium) {
        this.isPremium = isPremium;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public Boolean getIsInfluencer() {
        return isInfluencer;
    }

    public void setIsInfluencer(Boolean isInfluencer) {
        this.isInfluencer = isInfluencer;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Object getCustomAvatarUrl() {
        return customAvatarUrl;
    }

    public void setCustomAvatarUrl(Object customAvatarUrl) {
        this.customAvatarUrl = customAvatarUrl;
    }

    public List<SocialAccount> getSocialAccounts() {
        return socialAccounts;
    }

    public void setSocialAccounts(List<SocialAccount> socialAccounts) {
        this.socialAccounts = socialAccounts;
    }

}
