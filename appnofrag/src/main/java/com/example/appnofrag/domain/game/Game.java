
package com.example.appnofrag.domain.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Game {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("name_original")
    @Expose
    private String nameOriginal;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("metacritic")
    @Expose
    private Integer metacritic;
    @SerializedName("released")
    @Expose
    private String released;
    @SerializedName("tba")
    @Expose
    private Boolean tba;
    @SerializedName("updated")
    @Expose
    private String updated;
    @SerializedName("background_image")
    @Expose
    private String backgroundImage;
    @SerializedName("background_image_additional")
    @Expose
    private String backgroundImageAdditional;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("rating")
    @Expose
    private Double rating;
    @SerializedName("rating_top")
    @Expose
    private Integer ratingTop;
    @SerializedName("ratings")
    @Expose
    private List<Rating> ratings = null;
    @SerializedName("reactions")
    @Expose
    private Reactions reactions;
    @SerializedName("added")
    @Expose
    private Integer added;
    @SerializedName("added_by_status")
    @Expose
    private AddedByStatus addedByStatus;
    @SerializedName("playtime")
    @Expose
    private Integer playtime;
    @SerializedName("screenshots_count")
    @Expose
    private Integer screenshotsCount;
    @SerializedName("movies_count")
    @Expose
    private Integer moviesCount;
    @SerializedName("creators_count")
    @Expose
    private Integer creatorsCount;
    @SerializedName("achievements_count")
    @Expose
    private Integer achievementsCount;
    @SerializedName("parent_achievements_count")
    @Expose
    private Integer parentAchievementsCount;
    @SerializedName("reddit_url")
    @Expose
    private String redditUrl;
    @SerializedName("reddit_name")
    @Expose
    private String redditName;
    @SerializedName("reddit_description")
    @Expose
    private String redditDescription;
    @SerializedName("reddit_logo")
    @Expose
    private String redditLogo;
    @SerializedName("reddit_count")
    @Expose
    private Integer redditCount;
    @SerializedName("twitch_count")
    @Expose
    private Integer twitchCount;
    @SerializedName("youtube_count")
    @Expose
    private Integer youtubeCount;
    @SerializedName("reviews_text_count")
    @Expose
    private Integer reviewsTextCount;
    @SerializedName("ratings_count")
    @Expose
    private Integer ratingsCount;
    @SerializedName("suggestions_count")
    @Expose
    private Integer suggestionsCount;
    @SerializedName("alternative_names")
    @Expose
    private List<String> alternativeNames = null;
    @SerializedName("metacritic_url")
    @Expose
    private String metacriticUrl;
    @SerializedName("parents_count")
    @Expose
    private Integer parentsCount;
    @SerializedName("additions_count")
    @Expose
    private Integer additionsCount;
    @SerializedName("game_series_count")
    @Expose
    private Integer gameSeriesCount;
    @SerializedName("user_game")
    @Expose
    private Object userGame;
    @SerializedName("reviews_count")
    @Expose
    private Integer reviewsCount;
    @SerializedName("saturated_color")
    @Expose
    private String saturatedColor;
    @SerializedName("dominant_color")
    @Expose
    private String dominantColor;
    @SerializedName("parent_platforms")
    @Expose
    private List<ParentPlatform> parentPlatforms = null;
    @SerializedName("platforms")
    @Expose
    private List<Platform_> platforms = null;
    @SerializedName("stores")
    @Expose
    private List<Store> stores = null;
    @SerializedName("developers")
    @Expose
    private List<Developer> developers = null;
    @SerializedName("genres")
    @Expose
    private List<Genre> genres = null;
    @SerializedName("tags")
    @Expose
    private List<Tag> tags = null;
    @SerializedName("publishers")
    @Expose
    private List<Publisher> publishers = null;
    @SerializedName("esrb_rating")
    @Expose
    private EsrbRating esrbRating;
    @SerializedName("clip")
    @Expose
    private Clip clip;
    @SerializedName("description_raw")
    @Expose
    private String descriptionRaw;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOriginal() {
        return nameOriginal;
    }

    public void setNameOriginal(String nameOriginal) {
        this.nameOriginal = nameOriginal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMetacritic() {
        return metacritic;
    }

    public void setMetacritic(Integer metacritic) {
        this.metacritic = metacritic;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public Boolean getTba() {
        return tba;
    }

    public void setTba(Boolean tba) {
        this.tba = tba;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public String getBackgroundImageAdditional() {
        return backgroundImageAdditional;
    }

    public void setBackgroundImageAdditional(String backgroundImageAdditional) {
        this.backgroundImageAdditional = backgroundImageAdditional;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getRatingTop() {
        return ratingTop;
    }

    public void setRatingTop(Integer ratingTop) {
        this.ratingTop = ratingTop;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public Reactions getReactions() {
        return reactions;
    }

    public void setReactions(Reactions reactions) {
        this.reactions = reactions;
    }

    public Integer getAdded() {
        return added;
    }

    public void setAdded(Integer added) {
        this.added = added;
    }

    public AddedByStatus getAddedByStatus() {
        return addedByStatus;
    }

    public void setAddedByStatus(AddedByStatus addedByStatus) {
        this.addedByStatus = addedByStatus;
    }

    public Integer getPlaytime() {
        return playtime;
    }

    public void setPlaytime(Integer playtime) {
        this.playtime = playtime;
    }

    public Integer getScreenshotsCount() {
        return screenshotsCount;
    }

    public void setScreenshotsCount(Integer screenshotsCount) {
        this.screenshotsCount = screenshotsCount;
    }

    public Integer getMoviesCount() {
        return moviesCount;
    }

    public void setMoviesCount(Integer moviesCount) {
        this.moviesCount = moviesCount;
    }

    public Integer getCreatorsCount() {
        return creatorsCount;
    }

    public void setCreatorsCount(Integer creatorsCount) {
        this.creatorsCount = creatorsCount;
    }

    public Integer getAchievementsCount() {
        return achievementsCount;
    }

    public void setAchievementsCount(Integer achievementsCount) {
        this.achievementsCount = achievementsCount;
    }

    public Integer getParentAchievementsCount() {
        return parentAchievementsCount;
    }

    public void setParentAchievementsCount(Integer parentAchievementsCount) {
        this.parentAchievementsCount = parentAchievementsCount;
    }

    public String getRedditUrl() {
        return redditUrl;
    }

    public void setRedditUrl(String redditUrl) {
        this.redditUrl = redditUrl;
    }

    public String getRedditName() {
        return redditName;
    }

    public void setRedditName(String redditName) {
        this.redditName = redditName;
    }

    public String getRedditDescription() {
        return redditDescription;
    }

    public void setRedditDescription(String redditDescription) {
        this.redditDescription = redditDescription;
    }

    public String getRedditLogo() {
        return redditLogo;
    }

    public void setRedditLogo(String redditLogo) {
        this.redditLogo = redditLogo;
    }

    public Integer getRedditCount() {
        return redditCount;
    }

    public void setRedditCount(Integer redditCount) {
        this.redditCount = redditCount;
    }

    public Integer getTwitchCount() {
        return twitchCount;
    }

    public void setTwitchCount(Integer twitchCount) {
        this.twitchCount = twitchCount;
    }

    public Integer getYoutubeCount() {
        return youtubeCount;
    }

    public void setYoutubeCount(Integer youtubeCount) {
        this.youtubeCount = youtubeCount;
    }

    public Integer getReviewsTextCount() {
        return reviewsTextCount;
    }

    public void setReviewsTextCount(Integer reviewsTextCount) {
        this.reviewsTextCount = reviewsTextCount;
    }

    public Integer getRatingsCount() {
        return ratingsCount;
    }

    public void setRatingsCount(Integer ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    public Integer getSuggestionsCount() {
        return suggestionsCount;
    }

    public void setSuggestionsCount(Integer suggestionsCount) {
        this.suggestionsCount = suggestionsCount;
    }

    public List<String> getAlternativeNames() {
        return alternativeNames;
    }

    public void setAlternativeNames(List<String> alternativeNames) {
        this.alternativeNames = alternativeNames;
    }

    public String getMetacriticUrl() {
        return metacriticUrl;
    }

    public void setMetacriticUrl(String metacriticUrl) {
        this.metacriticUrl = metacriticUrl;
    }

    public Integer getParentsCount() {
        return parentsCount;
    }

    public void setParentsCount(Integer parentsCount) {
        this.parentsCount = parentsCount;
    }

    public Integer getAdditionsCount() {
        return additionsCount;
    }

    public void setAdditionsCount(Integer additionsCount) {
        this.additionsCount = additionsCount;
    }

    public Integer getGameSeriesCount() {
        return gameSeriesCount;
    }

    public void setGameSeriesCount(Integer gameSeriesCount) {
        this.gameSeriesCount = gameSeriesCount;
    }

    public Object getUserGame() {
        return userGame;
    }

    public void setUserGame(Object userGame) {
        this.userGame = userGame;
    }

    public Integer getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(Integer reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public String getSaturatedColor() {
        return saturatedColor;
    }

    public void setSaturatedColor(String saturatedColor) {
        this.saturatedColor = saturatedColor;
    }

    public String getDominantColor() {
        return dominantColor;
    }

    public void setDominantColor(String dominantColor) {
        this.dominantColor = dominantColor;
    }

    public List<ParentPlatform> getParentPlatforms() {
        return parentPlatforms;
    }

    public void setParentPlatforms(List<ParentPlatform> parentPlatforms) {
        this.parentPlatforms = parentPlatforms;
    }

    public List<Platform_> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Platform_> platforms) {
        this.platforms = platforms;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Publisher> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<Publisher> publishers) {
        this.publishers = publishers;
    }

    public EsrbRating getEsrbRating() {
        return esrbRating;
    }

    public void setEsrbRating(EsrbRating esrbRating) {
        this.esrbRating = esrbRating;
    }

    public Clip getClip() {
        return clip;
    }

    public void setClip(Clip clip) {
        this.clip = clip;
    }

    public String getDescriptionRaw() {
        return descriptionRaw;
    }

    public void setDescriptionRaw(String descriptionRaw) {
        this.descriptionRaw = descriptionRaw;
    }

}
