
package com.example.appnofrag.domain.csgo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("timePlayed")
    @Expose
    private TimePlayed timePlayed;
    @SerializedName("score")
    @Expose
    private Score score;
    @SerializedName("kills")
    @Expose
    private Kills kills;
    @SerializedName("deaths")
    @Expose
    private Deaths deaths;
    @SerializedName("kd")
    @Expose
    private Kd kd;
    @SerializedName("damage")
    @Expose
    private Damage damage;
    @SerializedName("headshots")
    @Expose
    private Headshots headshots;
    @SerializedName("dominations")
    @Expose
    private Dominations dominations;
    @SerializedName("shotsFired")
    @Expose
    private ShotsFired shotsFired;
    @SerializedName("shotsHit")
    @Expose
    private ShotsHit shotsHit;
    @SerializedName("shotsAccuracy")
    @Expose
    private ShotsAccuracy shotsAccuracy;
    @SerializedName("snipersKilled")
    @Expose
    private SnipersKilled snipersKilled;
    @SerializedName("dominationOverkills")
    @Expose
    private DominationOverkills dominationOverkills;
    @SerializedName("dominationRevenges")
    @Expose
    private DominationRevenges dominationRevenges;
    @SerializedName("bombsPlanted")
    @Expose
    private BombsPlanted bombsPlanted;
    @SerializedName("bombsDefused")
    @Expose
    private BombsDefused bombsDefused;
    @SerializedName("moneyEarned")
    @Expose
    private MoneyEarned moneyEarned;
    @SerializedName("hostagesRescued")
    @Expose
    private HostagesRescued hostagesRescued;
    @SerializedName("mvp")
    @Expose
    private Mvp mvp;
    @SerializedName("wins")
    @Expose
    private Wins wins;
    @SerializedName("ties")
    @Expose
    private Ties ties;
    @SerializedName("matchesPlayed")
    @Expose
    private MatchesPlayed matchesPlayed;
    @SerializedName("losses")
    @Expose
    private Losses losses;
    @SerializedName("roundsPlayed")
    @Expose
    private RoundsPlayed roundsPlayed;
    @SerializedName("roundsWon")
    @Expose
    private RoundsWon roundsWon;
    @SerializedName("wlPercentage")
    @Expose
    private WlPercentage wlPercentage;
    @SerializedName("headshotPct")
    @Expose
    private HeadshotPct headshotPct;

    public TimePlayed getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(TimePlayed timePlayed) {
        this.timePlayed = timePlayed;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public Kills getKills() {
        return kills;
    }

    public void setKills(Kills kills) {
        this.kills = kills;
    }

    public Deaths getDeaths() {
        return deaths;
    }

    public void setDeaths(Deaths deaths) {
        this.deaths = deaths;
    }

    public Kd getKd() {
        return kd;
    }

    public void setKd(Kd kd) {
        this.kd = kd;
    }

    public Damage getDamage() {
        return damage;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public Headshots getHeadshots() {
        return headshots;
    }

    public void setHeadshots(Headshots headshots) {
        this.headshots = headshots;
    }

    public Dominations getDominations() {
        return dominations;
    }

    public void setDominations(Dominations dominations) {
        this.dominations = dominations;
    }

    public ShotsFired getShotsFired() {
        return shotsFired;
    }

    public void setShotsFired(ShotsFired shotsFired) {
        this.shotsFired = shotsFired;
    }

    public ShotsHit getShotsHit() {
        return shotsHit;
    }

    public void setShotsHit(ShotsHit shotsHit) {
        this.shotsHit = shotsHit;
    }

    public ShotsAccuracy getShotsAccuracy() {
        return shotsAccuracy;
    }

    public void setShotsAccuracy(ShotsAccuracy shotsAccuracy) {
        this.shotsAccuracy = shotsAccuracy;
    }

    public SnipersKilled getSnipersKilled() {
        return snipersKilled;
    }

    public void setSnipersKilled(SnipersKilled snipersKilled) {
        this.snipersKilled = snipersKilled;
    }

    public DominationOverkills getDominationOverkills() {
        return dominationOverkills;
    }

    public void setDominationOverkills(DominationOverkills dominationOverkills) {
        this.dominationOverkills = dominationOverkills;
    }

    public DominationRevenges getDominationRevenges() {
        return dominationRevenges;
    }

    public void setDominationRevenges(DominationRevenges dominationRevenges) {
        this.dominationRevenges = dominationRevenges;
    }

    public BombsPlanted getBombsPlanted() {
        return bombsPlanted;
    }

    public void setBombsPlanted(BombsPlanted bombsPlanted) {
        this.bombsPlanted = bombsPlanted;
    }

    public BombsDefused getBombsDefused() {
        return bombsDefused;
    }

    public void setBombsDefused(BombsDefused bombsDefused) {
        this.bombsDefused = bombsDefused;
    }

    public MoneyEarned getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(MoneyEarned moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public HostagesRescued getHostagesRescued() {
        return hostagesRescued;
    }

    public void setHostagesRescued(HostagesRescued hostagesRescued) {
        this.hostagesRescued = hostagesRescued;
    }

    public Mvp getMvp() {
        return mvp;
    }

    public void setMvp(Mvp mvp) {
        this.mvp = mvp;
    }

    public Wins getWins() {
        return wins;
    }

    public void setWins(Wins wins) {
        this.wins = wins;
    }

    public Ties getTies() {
        return ties;
    }

    public void setTies(Ties ties) {
        this.ties = ties;
    }

    public MatchesPlayed getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(MatchesPlayed matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public Losses getLosses() {
        return losses;
    }

    public void setLosses(Losses losses) {
        this.losses = losses;
    }

    public RoundsPlayed getRoundsPlayed() {
        return roundsPlayed;
    }

    public void setRoundsPlayed(RoundsPlayed roundsPlayed) {
        this.roundsPlayed = roundsPlayed;
    }

    public RoundsWon getRoundsWon() {
        return roundsWon;
    }

    public void setRoundsWon(RoundsWon roundsWon) {
        this.roundsWon = roundsWon;
    }

    public WlPercentage getWlPercentage() {
        return wlPercentage;
    }

    public void setWlPercentage(WlPercentage wlPercentage) {
        this.wlPercentage = wlPercentage;
    }

    public HeadshotPct getHeadshotPct() {
        return headshotPct;
    }

    public void setHeadshotPct(HeadshotPct headshotPct) {
        this.headshotPct = headshotPct;
    }

}
