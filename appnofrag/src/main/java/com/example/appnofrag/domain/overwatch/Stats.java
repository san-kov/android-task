
package com.example.appnofrag.domain.overwatch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("timePlayed")
    @Expose
    private TimePlayed timePlayed;
    @SerializedName("wins")
    @Expose
    private Wins wins;
    @SerializedName("matchesPlayed")
    @Expose
    private MatchesPlayed matchesPlayed;
    @SerializedName("timeSpentOnFire")
    @Expose
    private TimeSpentOnFire timeSpentOnFire;
    @SerializedName("cards")
    @Expose
    private Cards cards;
    @SerializedName("wlPercentage")
    @Expose
    private WlPercentage wlPercentage;
    @SerializedName("medals")
    @Expose
    private Medals medals;
    @SerializedName("goldMedals")
    @Expose
    private GoldMedals goldMedals;
    @SerializedName("silverMedals")
    @Expose
    private SilverMedals silverMedals;
    @SerializedName("bronzeMedals")
    @Expose
    private BronzeMedals bronzeMedals;
    @SerializedName("multiKills")
    @Expose
    private MultiKills multiKills;
    @SerializedName("soloKills")
    @Expose
    private SoloKills soloKills;
    @SerializedName("objectiveKills")
    @Expose
    private ObjectiveKills objectiveKills;
    @SerializedName("environmentalKills")
    @Expose
    private EnvironmentalKills environmentalKills;
    @SerializedName("finalBlows")
    @Expose
    private FinalBlows finalBlows;
    @SerializedName("damageDone")
    @Expose
    private DamageDone damageDone;
    @SerializedName("healingDone")
    @Expose
    private HealingDone healingDone;
    @SerializedName("eliminations")
    @Expose
    private Eliminations eliminations;
    @SerializedName("deaths")
    @Expose
    private Deaths deaths;
    @SerializedName("kd")
    @Expose
    private Kd kd;
    @SerializedName("kg")
    @Expose
    private Kg kg;
    @SerializedName("objectiveTime")
    @Expose
    private ObjectiveTime objectiveTime;
    @SerializedName("defensiveAssists")
    @Expose
    private DefensiveAssists defensiveAssists;
    @SerializedName("offensiveAssists")
    @Expose
    private OffensiveAssists offensiveAssists;
    @SerializedName("mostEliminations")
    @Expose
    private MostEliminations mostEliminations;
    @SerializedName("mostFinalBlows")
    @Expose
    private MostFinalBlows mostFinalBlows;
    @SerializedName("mostDamageDone")
    @Expose
    private MostDamageDone mostDamageDone;
    @SerializedName("mostHealingDone")
    @Expose
    private MostHealingDone mostHealingDone;
    @SerializedName("mostDefensiveAssists")
    @Expose
    private MostDefensiveAssists mostDefensiveAssists;
    @SerializedName("mostOffensiveAssists")
    @Expose
    private MostOffensiveAssists mostOffensiveAssists;
    @SerializedName("mostObjectiveKills")
    @Expose
    private MostObjectiveKills mostObjectiveKills;
    @SerializedName("mostObjectiveTime")
    @Expose
    private MostObjectiveTime mostObjectiveTime;
    @SerializedName("mostSoloKills")
    @Expose
    private MostSoloKills mostSoloKills;
    @SerializedName("mostTimeSpentOnFire")
    @Expose
    private MostTimeSpentOnFire mostTimeSpentOnFire;

    public TimePlayed getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(TimePlayed timePlayed) {
        this.timePlayed = timePlayed;
    }

    public Wins getWins() {
        return wins;
    }

    public void setWins(Wins wins) {
        this.wins = wins;
    }

    public MatchesPlayed getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(MatchesPlayed matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public TimeSpentOnFire getTimeSpentOnFire() {
        return timeSpentOnFire;
    }

    public void setTimeSpentOnFire(TimeSpentOnFire timeSpentOnFire) {
        this.timeSpentOnFire = timeSpentOnFire;
    }

    public Cards getCards() {
        return cards;
    }

    public void setCards(Cards cards) {
        this.cards = cards;
    }

    public WlPercentage getWlPercentage() {
        return wlPercentage;
    }

    public void setWlPercentage(WlPercentage wlPercentage) {
        this.wlPercentage = wlPercentage;
    }

    public Medals getMedals() {
        return medals;
    }

    public void setMedals(Medals medals) {
        this.medals = medals;
    }

    public GoldMedals getGoldMedals() {
        return goldMedals;
    }

    public void setGoldMedals(GoldMedals goldMedals) {
        this.goldMedals = goldMedals;
    }

    public SilverMedals getSilverMedals() {
        return silverMedals;
    }

    public void setSilverMedals(SilverMedals silverMedals) {
        this.silverMedals = silverMedals;
    }

    public BronzeMedals getBronzeMedals() {
        return bronzeMedals;
    }

    public void setBronzeMedals(BronzeMedals bronzeMedals) {
        this.bronzeMedals = bronzeMedals;
    }

    public MultiKills getMultiKills() {
        return multiKills;
    }

    public void setMultiKills(MultiKills multiKills) {
        this.multiKills = multiKills;
    }

    public SoloKills getSoloKills() {
        return soloKills;
    }

    public void setSoloKills(SoloKills soloKills) {
        this.soloKills = soloKills;
    }

    public ObjectiveKills getObjectiveKills() {
        return objectiveKills;
    }

    public void setObjectiveKills(ObjectiveKills objectiveKills) {
        this.objectiveKills = objectiveKills;
    }

    public EnvironmentalKills getEnvironmentalKills() {
        return environmentalKills;
    }

    public void setEnvironmentalKills(EnvironmentalKills environmentalKills) {
        this.environmentalKills = environmentalKills;
    }

    public FinalBlows getFinalBlows() {
        return finalBlows;
    }

    public void setFinalBlows(FinalBlows finalBlows) {
        this.finalBlows = finalBlows;
    }

    public DamageDone getDamageDone() {
        return damageDone;
    }

    public void setDamageDone(DamageDone damageDone) {
        this.damageDone = damageDone;
    }

    public HealingDone getHealingDone() {
        return healingDone;
    }

    public void setHealingDone(HealingDone healingDone) {
        this.healingDone = healingDone;
    }

    public Eliminations getEliminations() {
        return eliminations;
    }

    public void setEliminations(Eliminations eliminations) {
        this.eliminations = eliminations;
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

    public Kg getKg() {
        return kg;
    }

    public void setKg(Kg kg) {
        this.kg = kg;
    }

    public ObjectiveTime getObjectiveTime() {
        return objectiveTime;
    }

    public void setObjectiveTime(ObjectiveTime objectiveTime) {
        this.objectiveTime = objectiveTime;
    }

    public DefensiveAssists getDefensiveAssists() {
        return defensiveAssists;
    }

    public void setDefensiveAssists(DefensiveAssists defensiveAssists) {
        this.defensiveAssists = defensiveAssists;
    }

    public OffensiveAssists getOffensiveAssists() {
        return offensiveAssists;
    }

    public void setOffensiveAssists(OffensiveAssists offensiveAssists) {
        this.offensiveAssists = offensiveAssists;
    }

    public MostEliminations getMostEliminations() {
        return mostEliminations;
    }

    public void setMostEliminations(MostEliminations mostEliminations) {
        this.mostEliminations = mostEliminations;
    }

    public MostFinalBlows getMostFinalBlows() {
        return mostFinalBlows;
    }

    public void setMostFinalBlows(MostFinalBlows mostFinalBlows) {
        this.mostFinalBlows = mostFinalBlows;
    }

    public MostDamageDone getMostDamageDone() {
        return mostDamageDone;
    }

    public void setMostDamageDone(MostDamageDone mostDamageDone) {
        this.mostDamageDone = mostDamageDone;
    }

    public MostHealingDone getMostHealingDone() {
        return mostHealingDone;
    }

    public void setMostHealingDone(MostHealingDone mostHealingDone) {
        this.mostHealingDone = mostHealingDone;
    }

    public MostDefensiveAssists getMostDefensiveAssists() {
        return mostDefensiveAssists;
    }

    public void setMostDefensiveAssists(MostDefensiveAssists mostDefensiveAssists) {
        this.mostDefensiveAssists = mostDefensiveAssists;
    }

    public MostOffensiveAssists getMostOffensiveAssists() {
        return mostOffensiveAssists;
    }

    public void setMostOffensiveAssists(MostOffensiveAssists mostOffensiveAssists) {
        this.mostOffensiveAssists = mostOffensiveAssists;
    }

    public MostObjectiveKills getMostObjectiveKills() {
        return mostObjectiveKills;
    }

    public void setMostObjectiveKills(MostObjectiveKills mostObjectiveKills) {
        this.mostObjectiveKills = mostObjectiveKills;
    }

    public MostObjectiveTime getMostObjectiveTime() {
        return mostObjectiveTime;
    }

    public void setMostObjectiveTime(MostObjectiveTime mostObjectiveTime) {
        this.mostObjectiveTime = mostObjectiveTime;
    }

    public MostSoloKills getMostSoloKills() {
        return mostSoloKills;
    }

    public void setMostSoloKills(MostSoloKills mostSoloKills) {
        this.mostSoloKills = mostSoloKills;
    }

    public MostTimeSpentOnFire getMostTimeSpentOnFire() {
        return mostTimeSpentOnFire;
    }

    public void setMostTimeSpentOnFire(MostTimeSpentOnFire mostTimeSpentOnFire) {
        this.mostTimeSpentOnFire = mostTimeSpentOnFire;
    }

}
