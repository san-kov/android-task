
package com.example.appnofrag.domain.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Platform__ {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("image")
    @Expose
    private Object image;
    @SerializedName("year_end")
    @Expose
    private Object yearEnd;
    @SerializedName("year_start")
    @Expose
    private Object yearStart;
    @SerializedName("games_count")
    @Expose
    private Integer gamesCount;
    @SerializedName("image_background")
    @Expose
    private String imageBackground;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public Object getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(Object yearEnd) {
        this.yearEnd = yearEnd;
    }

    public Object getYearStart() {
        return yearStart;
    }

    public void setYearStart(Object yearStart) {
        this.yearStart = yearStart;
    }

    public Integer getGamesCount() {
        return gamesCount;
    }

    public void setGamesCount(Integer gamesCount) {
        this.gamesCount = gamesCount;
    }

    public String getImageBackground() {
        return imageBackground;
    }

    public void setImageBackground(String imageBackground) {
        this.imageBackground = imageBackground;
    }

}
