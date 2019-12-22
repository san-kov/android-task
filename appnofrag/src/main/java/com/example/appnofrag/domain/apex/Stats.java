
package com.example.appnofrag.domain.apex;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("level")
    @Expose
    private Level level;
    @SerializedName("kills")
    @Expose
    private Kills kills;
    @SerializedName("killsPerMatch")
    @Expose
    private KillsPerMatch killsPerMatch;
    @SerializedName("winningKills")
    @Expose
    private WinningKills winningKills;
    @SerializedName("killsAsKillLeader")
    @Expose
    private KillsAsKillLeader killsAsKillLeader;
    @SerializedName("damage")
    @Expose
    private Damage damage;
    @SerializedName("matchesPlayed")
    @Expose
    private MatchesPlayed matchesPlayed;
    @SerializedName("revives")
    @Expose
    private Revives revives;
    @SerializedName("sniperKills")
    @Expose
    private SniperKills sniperKills;
    @SerializedName("seasonWins")
    @Expose
    private SeasonWins seasonWins;
    @SerializedName("seasonDamage")
    @Expose
    private SeasonDamage seasonDamage;
    @SerializedName("seasonKills")
    @Expose
    private SeasonKills seasonKills;
    @SerializedName("rankScore")
    @Expose
    private RankScore rankScore;
    @SerializedName("grappleTravelDistance")
    @Expose
    private GrappleTravelDistance grappleTravelDistance;
    @SerializedName("beastOfTheHuntKills")
    @Expose
    private BeastOfTheHuntKills beastOfTheHuntKills;
    @SerializedName("voicesWarningsHeard")
    @Expose
    private VoicesWarningsHeard voicesWarningsHeard;

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Kills getKills() {
        return kills;
    }

    public void setKills(Kills kills) {
        this.kills = kills;
    }

    public KillsPerMatch getKillsPerMatch() {
        return killsPerMatch;
    }

    public void setKillsPerMatch(KillsPerMatch killsPerMatch) {
        this.killsPerMatch = killsPerMatch;
    }

    public WinningKills getWinningKills() {
        return winningKills;
    }

    public void setWinningKills(WinningKills winningKills) {
        this.winningKills = winningKills;
    }

    public KillsAsKillLeader getKillsAsKillLeader() {
        return killsAsKillLeader;
    }

    public void setKillsAsKillLeader(KillsAsKillLeader killsAsKillLeader) {
        this.killsAsKillLeader = killsAsKillLeader;
    }

    public Damage getDamage() {
        return damage;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public MatchesPlayed getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(MatchesPlayed matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public Revives getRevives() {
        return revives;
    }

    public void setRevives(Revives revives) {
        this.revives = revives;
    }

    public SniperKills getSniperKills() {
        return sniperKills;
    }

    public void setSniperKills(SniperKills sniperKills) {
        this.sniperKills = sniperKills;
    }

    public SeasonWins getSeasonWins() {
        return seasonWins;
    }

    public void setSeasonWins(SeasonWins seasonWins) {
        this.seasonWins = seasonWins;
    }

    public SeasonDamage getSeasonDamage() {
        return seasonDamage;
    }

    public void setSeasonDamage(SeasonDamage seasonDamage) {
        this.seasonDamage = seasonDamage;
    }

    public SeasonKills getSeasonKills() {
        return seasonKills;
    }

    public void setSeasonKills(SeasonKills seasonKills) {
        this.seasonKills = seasonKills;
    }

    public RankScore getRankScore() {
        return rankScore;
    }

    public void setRankScore(RankScore rankScore) {
        this.rankScore = rankScore;
    }

    public GrappleTravelDistance getGrappleTravelDistance() {
        return grappleTravelDistance;
    }

    public void setGrappleTravelDistance(GrappleTravelDistance grappleTravelDistance) {
        this.grappleTravelDistance = grappleTravelDistance;
    }

    public BeastOfTheHuntKills getBeastOfTheHuntKills() {
        return beastOfTheHuntKills;
    }

    public void setBeastOfTheHuntKills(BeastOfTheHuntKills beastOfTheHuntKills) {
        this.beastOfTheHuntKills = beastOfTheHuntKills;
    }

    public VoicesWarningsHeard getVoicesWarningsHeard() {
        return voicesWarningsHeard;
    }

    public void setVoicesWarningsHeard(VoicesWarningsHeard voicesWarningsHeard) {
        this.voicesWarningsHeard = voicesWarningsHeard;
    }

}
