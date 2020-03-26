
package lolmatch;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "participantId",
    "win",
    "item0",
    "item1",
    "item2",
    "item3",
    "item4",
    "item5",
    "item6",
    "kills",
    "deaths",
    "assists",
    "largestKillingSpree",
    "largestMultiKill",
    "killingSprees",
    "longestTimeSpentLiving",
    "doubleKills",
    "tripleKills",
    "quadraKills",
    "pentaKills",
    "unrealKills",
    "totalDamageDealt",
    "magicDamageDealt",
    "physicalDamageDealt",
    "trueDamageDealt",
    "largestCriticalStrike",
    "totalDamageDealtToChampions",
    "magicDamageDealtToChampions",
    "physicalDamageDealtToChampions",
    "trueDamageDealtToChampions",
    "totalHeal",
    "totalUnitsHealed",
    "damageSelfMitigated",
    "damageDealtToObjectives",
    "damageDealtToTurrets",
    "visionScore",
    "timeCCingOthers",
    "totalDamageTaken",
    "magicalDamageTaken",
    "physicalDamageTaken",
    "trueDamageTaken",
    "goldEarned",
    "goldSpent",
    "turretKills",
    "inhibitorKills",
    "totalMinionsKilled",
    "neutralMinionsKilled",
    "neutralMinionsKilledTeamJungle",
    "neutralMinionsKilledEnemyJungle",
    "totalTimeCrowdControlDealt",
    "champLevel",
    "visionWardsBoughtInGame",
    "sightWardsBoughtInGame",
    "wardsPlaced",
    "wardsKilled",
    "firstBloodKill",
    "firstBloodAssist",
    "firstTowerKill",
    "firstTowerAssist",
    "firstInhibitorKill",
    "firstInhibitorAssist",
    "combatPlayerScore",
    "objectivePlayerScore",
    "totalPlayerScore",
    "totalScoreRank",
    "playerScore0",
    "playerScore1",
    "playerScore2",
    "playerScore3",
    "playerScore4",
    "playerScore5",
    "playerScore6",
    "playerScore7",
    "playerScore8",
    "playerScore9",
    "perk0",
    "perk0Var1",
    "perk0Var2",
    "perk0Var3",
    "perk1",
    "perk1Var1",
    "perk1Var2",
    "perk1Var3",
    "perk2",
    "perk2Var1",
    "perk2Var2",
    "perk2Var3",
    "perk3",
    "perk3Var1",
    "perk3Var2",
    "perk3Var3",
    "perk4",
    "perk4Var1",
    "perk4Var2",
    "perk4Var3",
    "perk5",
    "perk5Var1",
    "perk5Var2",
    "perk5Var3",
    "perkPrimaryStyle",
    "perkSubStyle",
    "statPerk0",
    "statPerk1",
    "statPerk2"
})
public class Stats {

    @JsonProperty("participantId")
    private Integer participantId;
    @JsonProperty("win")
    private Boolean win;
    @JsonProperty("item0")
    private Integer item0;
    @JsonProperty("item1")
    private Integer item1;
    @JsonProperty("item2")
    private Integer item2;
    @JsonProperty("item3")
    private Integer item3;
    @JsonProperty("item4")
    private Integer item4;
    @JsonProperty("item5")
    private Integer item5;
    @JsonProperty("item6")
    private Integer item6;
    @JsonProperty("kills")
    private Integer kills;
    @JsonProperty("deaths")
    private Integer deaths;
    @JsonProperty("assists")
    private Integer assists;
    @JsonProperty("largestKillingSpree")
    private Integer largestKillingSpree;
    @JsonProperty("largestMultiKill")
    private Integer largestMultiKill;
    @JsonProperty("killingSprees")
    private Integer killingSprees;
    @JsonProperty("longestTimeSpentLiving")
    private Integer longestTimeSpentLiving;
    @JsonProperty("doubleKills")
    private Integer doubleKills;
    @JsonProperty("tripleKills")
    private Integer tripleKills;
    @JsonProperty("quadraKills")
    private Integer quadraKills;
    @JsonProperty("pentaKills")
    private Integer pentaKills;
    @JsonProperty("unrealKills")
    private Integer unrealKills;
    @JsonProperty("totalDamageDealt")
    private Integer totalDamageDealt;
    @JsonProperty("magicDamageDealt")
    private Integer magicDamageDealt;
    @JsonProperty("physicalDamageDealt")
    private Integer physicalDamageDealt;
    @JsonProperty("trueDamageDealt")
    private Integer trueDamageDealt;
    @JsonProperty("largestCriticalStrike")
    private Integer largestCriticalStrike;
    @JsonProperty("totalDamageDealtToChampions")
    private Integer totalDamageDealtToChampions;
    @JsonProperty("magicDamageDealtToChampions")
    private Integer magicDamageDealtToChampions;
    @JsonProperty("physicalDamageDealtToChampions")
    private Integer physicalDamageDealtToChampions;
    @JsonProperty("trueDamageDealtToChampions")
    private Integer trueDamageDealtToChampions;
    @JsonProperty("totalHeal")
    private Integer totalHeal;
    @JsonProperty("totalUnitsHealed")
    private Integer totalUnitsHealed;
    @JsonProperty("damageSelfMitigated")
    private Integer damageSelfMitigated;
    @JsonProperty("damageDealtToObjectives")
    private Integer damageDealtToObjectives;
    @JsonProperty("damageDealtToTurrets")
    private Integer damageDealtToTurrets;
    @JsonProperty("visionScore")
    private Integer visionScore;
    @JsonProperty("timeCCingOthers")
    private Integer timeCCingOthers;
    @JsonProperty("totalDamageTaken")
    private Integer totalDamageTaken;
    @JsonProperty("magicalDamageTaken")
    private Integer magicalDamageTaken;
    @JsonProperty("physicalDamageTaken")
    private Integer physicalDamageTaken;
    @JsonProperty("trueDamageTaken")
    private Integer trueDamageTaken;
    @JsonProperty("goldEarned")
    private Integer goldEarned;
    @JsonProperty("goldSpent")
    private Integer goldSpent;
    @JsonProperty("turretKills")
    private Integer turretKills;
    @JsonProperty("inhibitorKills")
    private Integer inhibitorKills;
    @JsonProperty("totalMinionsKilled")
    private Integer totalMinionsKilled;
    @JsonProperty("neutralMinionsKilled")
    private Integer neutralMinionsKilled;
    @JsonProperty("neutralMinionsKilledTeamJungle")
    private Integer neutralMinionsKilledTeamJungle;
    @JsonProperty("neutralMinionsKilledEnemyJungle")
    private Integer neutralMinionsKilledEnemyJungle;
    @JsonProperty("totalTimeCrowdControlDealt")
    private Integer totalTimeCrowdControlDealt;
    @JsonProperty("champLevel")
    private Integer champLevel;
    @JsonProperty("visionWardsBoughtInGame")
    private Integer visionWardsBoughtInGame;
    @JsonProperty("sightWardsBoughtInGame")
    private Integer sightWardsBoughtInGame;
    @JsonProperty("wardsPlaced")
    private Integer wardsPlaced;
    @JsonProperty("wardsKilled")
    private Integer wardsKilled;
    @JsonProperty("firstBloodKill")
    private Boolean firstBloodKill;
    @JsonProperty("firstBloodAssist")
    private Boolean firstBloodAssist;
    @JsonProperty("firstTowerKill")
    private Boolean firstTowerKill;
    @JsonProperty("firstTowerAssist")
    private Boolean firstTowerAssist;
    @JsonProperty("firstInhibitorKill")
    private Boolean firstInhibitorKill;
    @JsonProperty("firstInhibitorAssist")
    private Boolean firstInhibitorAssist;
    @JsonProperty("combatPlayerScore")
    private Integer combatPlayerScore;
    @JsonProperty("objectivePlayerScore")
    private Integer objectivePlayerScore;
    @JsonProperty("totalPlayerScore")
    private Integer totalPlayerScore;
    @JsonProperty("totalScoreRank")
    private Integer totalScoreRank;
    @JsonProperty("playerScore0")
    private Integer playerScore0;
    @JsonProperty("playerScore1")
    private Integer playerScore1;
    @JsonProperty("playerScore2")
    private Integer playerScore2;
    @JsonProperty("playerScore3")
    private Integer playerScore3;
    @JsonProperty("playerScore4")
    private Integer playerScore4;
    @JsonProperty("playerScore5")
    private Integer playerScore5;
    @JsonProperty("playerScore6")
    private Integer playerScore6;
    @JsonProperty("playerScore7")
    private Integer playerScore7;
    @JsonProperty("playerScore8")
    private Integer playerScore8;
    @JsonProperty("playerScore9")
    private Integer playerScore9;
    @JsonProperty("perk0")
    private Integer perk0;
    @JsonProperty("perk0Var1")
    private Integer perk0Var1;
    @JsonProperty("perk0Var2")
    private Integer perk0Var2;
    @JsonProperty("perk0Var3")
    private Integer perk0Var3;
    @JsonProperty("perk1")
    private Integer perk1;
    @JsonProperty("perk1Var1")
    private Integer perk1Var1;
    @JsonProperty("perk1Var2")
    private Integer perk1Var2;
    @JsonProperty("perk1Var3")
    private Integer perk1Var3;
    @JsonProperty("perk2")
    private Integer perk2;
    @JsonProperty("perk2Var1")
    private Integer perk2Var1;
    @JsonProperty("perk2Var2")
    private Integer perk2Var2;
    @JsonProperty("perk2Var3")
    private Integer perk2Var3;
    @JsonProperty("perk3")
    private Integer perk3;
    @JsonProperty("perk3Var1")
    private Integer perk3Var1;
    @JsonProperty("perk3Var2")
    private Integer perk3Var2;
    @JsonProperty("perk3Var3")
    private Integer perk3Var3;
    @JsonProperty("perk4")
    private Integer perk4;
    @JsonProperty("perk4Var1")
    private Integer perk4Var1;
    @JsonProperty("perk4Var2")
    private Integer perk4Var2;
    @JsonProperty("perk4Var3")
    private Integer perk4Var3;
    @JsonProperty("perk5")
    private Integer perk5;
    @JsonProperty("perk5Var1")
    private Integer perk5Var1;
    @JsonProperty("perk5Var2")
    private Integer perk5Var2;
    @JsonProperty("perk5Var3")
    private Integer perk5Var3;
    @JsonProperty("perkPrimaryStyle")
    private Integer perkPrimaryStyle;
    @JsonProperty("perkSubStyle")
    private Integer perkSubStyle;
    @JsonProperty("statPerk0")
    private Integer statPerk0;
    @JsonProperty("statPerk1")
    private Integer statPerk1;
    @JsonProperty("statPerk2")
    private Integer statPerk2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("participantId")
    public Integer getParticipantId() {
        return participantId;
    }

    @JsonProperty("participantId")
    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }

    @JsonProperty("win")
    public Boolean getWin() {
        return win;
    }

    @JsonProperty("win")
    public void setWin(Boolean win) {
        this.win = win;
    }

    @JsonProperty("item0")
    public Integer getItem0() {
        return item0;
    }

    @JsonProperty("item0")
    public void setItem0(Integer item0) {
        this.item0 = item0;
    }

    @JsonProperty("item1")
    public Integer getItem1() {
        return item1;
    }

    @JsonProperty("item1")
    public void setItem1(Integer item1) {
        this.item1 = item1;
    }

    @JsonProperty("item2")
    public Integer getItem2() {
        return item2;
    }

    @JsonProperty("item2")
    public void setItem2(Integer item2) {
        this.item2 = item2;
    }

    @JsonProperty("item3")
    public Integer getItem3() {
        return item3;
    }

    @JsonProperty("item3")
    public void setItem3(Integer item3) {
        this.item3 = item3;
    }

    @JsonProperty("item4")
    public Integer getItem4() {
        return item4;
    }

    @JsonProperty("item4")
    public void setItem4(Integer item4) {
        this.item4 = item4;
    }

    @JsonProperty("item5")
    public Integer getItem5() {
        return item5;
    }

    @JsonProperty("item5")
    public void setItem5(Integer item5) {
        this.item5 = item5;
    }

    @JsonProperty("item6")
    public Integer getItem6() {
        return item6;
    }

    @JsonProperty("item6")
    public void setItem6(Integer item6) {
        this.item6 = item6;
    }

    @JsonProperty("kills")
    public Integer getKills() {
        return kills;
    }

    @JsonProperty("kills")
    public void setKills(Integer kills) {
        this.kills = kills;
    }

    @JsonProperty("deaths")
    public Integer getDeaths() {
        return deaths;
    }

    @JsonProperty("deaths")
    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    @JsonProperty("assists")
    public Integer getAssists() {
        return assists;
    }

    @JsonProperty("assists")
    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    @JsonProperty("largestKillingSpree")
    public Integer getLargestKillingSpree() {
        return largestKillingSpree;
    }

    @JsonProperty("largestKillingSpree")
    public void setLargestKillingSpree(Integer largestKillingSpree) {
        this.largestKillingSpree = largestKillingSpree;
    }

    @JsonProperty("largestMultiKill")
    public Integer getLargestMultiKill() {
        return largestMultiKill;
    }

    @JsonProperty("largestMultiKill")
    public void setLargestMultiKill(Integer largestMultiKill) {
        this.largestMultiKill = largestMultiKill;
    }

    @JsonProperty("killingSprees")
    public Integer getKillingSprees() {
        return killingSprees;
    }

    @JsonProperty("killingSprees")
    public void setKillingSprees(Integer killingSprees) {
        this.killingSprees = killingSprees;
    }

    @JsonProperty("longestTimeSpentLiving")
    public Integer getLongestTimeSpentLiving() {
        return longestTimeSpentLiving;
    }

    @JsonProperty("longestTimeSpentLiving")
    public void setLongestTimeSpentLiving(Integer longestTimeSpentLiving) {
        this.longestTimeSpentLiving = longestTimeSpentLiving;
    }

    @JsonProperty("doubleKills")
    public Integer getDoubleKills() {
        return doubleKills;
    }

    @JsonProperty("doubleKills")
    public void setDoubleKills(Integer doubleKills) {
        this.doubleKills = doubleKills;
    }

    @JsonProperty("tripleKills")
    public Integer getTripleKills() {
        return tripleKills;
    }

    @JsonProperty("tripleKills")
    public void setTripleKills(Integer tripleKills) {
        this.tripleKills = tripleKills;
    }

    @JsonProperty("quadraKills")
    public Integer getQuadraKills() {
        return quadraKills;
    }

    @JsonProperty("quadraKills")
    public void setQuadraKills(Integer quadraKills) {
        this.quadraKills = quadraKills;
    }

    @JsonProperty("pentaKills")
    public Integer getPentaKills() {
        return pentaKills;
    }

    @JsonProperty("pentaKills")
    public void setPentaKills(Integer pentaKills) {
        this.pentaKills = pentaKills;
    }

    @JsonProperty("unrealKills")
    public Integer getUnrealKills() {
        return unrealKills;
    }

    @JsonProperty("unrealKills")
    public void setUnrealKills(Integer unrealKills) {
        this.unrealKills = unrealKills;
    }

    @JsonProperty("totalDamageDealt")
    public Integer getTotalDamageDealt() {
        return totalDamageDealt;
    }

    @JsonProperty("totalDamageDealt")
    public void setTotalDamageDealt(Integer totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
    }

    @JsonProperty("magicDamageDealt")
    public Integer getMagicDamageDealt() {
        return magicDamageDealt;
    }

    @JsonProperty("magicDamageDealt")
    public void setMagicDamageDealt(Integer magicDamageDealt) {
        this.magicDamageDealt = magicDamageDealt;
    }

    @JsonProperty("physicalDamageDealt")
    public Integer getPhysicalDamageDealt() {
        return physicalDamageDealt;
    }

    @JsonProperty("physicalDamageDealt")
    public void setPhysicalDamageDealt(Integer physicalDamageDealt) {
        this.physicalDamageDealt = physicalDamageDealt;
    }

    @JsonProperty("trueDamageDealt")
    public Integer getTrueDamageDealt() {
        return trueDamageDealt;
    }

    @JsonProperty("trueDamageDealt")
    public void setTrueDamageDealt(Integer trueDamageDealt) {
        this.trueDamageDealt = trueDamageDealt;
    }

    @JsonProperty("largestCriticalStrike")
    public Integer getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    @JsonProperty("largestCriticalStrike")
    public void setLargestCriticalStrike(Integer largestCriticalStrike) {
        this.largestCriticalStrike = largestCriticalStrike;
    }

    @JsonProperty("totalDamageDealtToChampions")
    public Integer getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    @JsonProperty("totalDamageDealtToChampions")
    public void setTotalDamageDealtToChampions(Integer totalDamageDealtToChampions) {
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
    }

    @JsonProperty("magicDamageDealtToChampions")
    public Integer getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    @JsonProperty("magicDamageDealtToChampions")
    public void setMagicDamageDealtToChampions(Integer magicDamageDealtToChampions) {
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
    }

    @JsonProperty("physicalDamageDealtToChampions")
    public Integer getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    @JsonProperty("physicalDamageDealtToChampions")
    public void setPhysicalDamageDealtToChampions(Integer physicalDamageDealtToChampions) {
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
    }

    @JsonProperty("trueDamageDealtToChampions")
    public Integer getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    @JsonProperty("trueDamageDealtToChampions")
    public void setTrueDamageDealtToChampions(Integer trueDamageDealtToChampions) {
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
    }

    @JsonProperty("totalHeal")
    public Integer getTotalHeal() {
        return totalHeal;
    }

    @JsonProperty("totalHeal")
    public void setTotalHeal(Integer totalHeal) {
        this.totalHeal = totalHeal;
    }

    @JsonProperty("totalUnitsHealed")
    public Integer getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    @JsonProperty("totalUnitsHealed")
    public void setTotalUnitsHealed(Integer totalUnitsHealed) {
        this.totalUnitsHealed = totalUnitsHealed;
    }

    @JsonProperty("damageSelfMitigated")
    public Integer getDamageSelfMitigated() {
        return damageSelfMitigated;
    }

    @JsonProperty("damageSelfMitigated")
    public void setDamageSelfMitigated(Integer damageSelfMitigated) {
        this.damageSelfMitigated = damageSelfMitigated;
    }

    @JsonProperty("damageDealtToObjectives")
    public Integer getDamageDealtToObjectives() {
        return damageDealtToObjectives;
    }

    @JsonProperty("damageDealtToObjectives")
    public void setDamageDealtToObjectives(Integer damageDealtToObjectives) {
        this.damageDealtToObjectives = damageDealtToObjectives;
    }

    @JsonProperty("damageDealtToTurrets")
    public Integer getDamageDealtToTurrets() {
        return damageDealtToTurrets;
    }

    @JsonProperty("damageDealtToTurrets")
    public void setDamageDealtToTurrets(Integer damageDealtToTurrets) {
        this.damageDealtToTurrets = damageDealtToTurrets;
    }

    @JsonProperty("visionScore")
    public Integer getVisionScore() {
        return visionScore;
    }

    @JsonProperty("visionScore")
    public void setVisionScore(Integer visionScore) {
        this.visionScore = visionScore;
    }

    @JsonProperty("timeCCingOthers")
    public Integer getTimeCCingOthers() {
        return timeCCingOthers;
    }

    @JsonProperty("timeCCingOthers")
    public void setTimeCCingOthers(Integer timeCCingOthers) {
        this.timeCCingOthers = timeCCingOthers;
    }

    @JsonProperty("totalDamageTaken")
    public Integer getTotalDamageTaken() {
        return totalDamageTaken;
    }

    @JsonProperty("totalDamageTaken")
    public void setTotalDamageTaken(Integer totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }

    @JsonProperty("magicalDamageTaken")
    public Integer getMagicalDamageTaken() {
        return magicalDamageTaken;
    }

    @JsonProperty("magicalDamageTaken")
    public void setMagicalDamageTaken(Integer magicalDamageTaken) {
        this.magicalDamageTaken = magicalDamageTaken;
    }

    @JsonProperty("physicalDamageTaken")
    public Integer getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    @JsonProperty("physicalDamageTaken")
    public void setPhysicalDamageTaken(Integer physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
    }

    @JsonProperty("trueDamageTaken")
    public Integer getTrueDamageTaken() {
        return trueDamageTaken;
    }

    @JsonProperty("trueDamageTaken")
    public void setTrueDamageTaken(Integer trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
    }

    @JsonProperty("goldEarned")
    public Integer getGoldEarned() {
        return goldEarned;
    }

    @JsonProperty("goldEarned")
    public void setGoldEarned(Integer goldEarned) {
        this.goldEarned = goldEarned;
    }

    @JsonProperty("goldSpent")
    public Integer getGoldSpent() {
        return goldSpent;
    }

    @JsonProperty("goldSpent")
    public void setGoldSpent(Integer goldSpent) {
        this.goldSpent = goldSpent;
    }

    @JsonProperty("turretKills")
    public Integer getTurretKills() {
        return turretKills;
    }

    @JsonProperty("turretKills")
    public void setTurretKills(Integer turretKills) {
        this.turretKills = turretKills;
    }

    @JsonProperty("inhibitorKills")
    public Integer getInhibitorKills() {
        return inhibitorKills;
    }

    @JsonProperty("inhibitorKills")
    public void setInhibitorKills(Integer inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    @JsonProperty("totalMinionsKilled")
    public Integer getTotalMinionsKilled() {
        return totalMinionsKilled;
    }

    @JsonProperty("totalMinionsKilled")
    public void setTotalMinionsKilled(Integer totalMinionsKilled) {
        this.totalMinionsKilled = totalMinionsKilled;
    }

    @JsonProperty("neutralMinionsKilled")
    public Integer getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    @JsonProperty("neutralMinionsKilled")
    public void setNeutralMinionsKilled(Integer neutralMinionsKilled) {
        this.neutralMinionsKilled = neutralMinionsKilled;
    }

    @JsonProperty("neutralMinionsKilledTeamJungle")
    public Integer getNeutralMinionsKilledTeamJungle() {
        return neutralMinionsKilledTeamJungle;
    }

    @JsonProperty("neutralMinionsKilledTeamJungle")
    public void setNeutralMinionsKilledTeamJungle(Integer neutralMinionsKilledTeamJungle) {
        this.neutralMinionsKilledTeamJungle = neutralMinionsKilledTeamJungle;
    }

    @JsonProperty("neutralMinionsKilledEnemyJungle")
    public Integer getNeutralMinionsKilledEnemyJungle() {
        return neutralMinionsKilledEnemyJungle;
    }

    @JsonProperty("neutralMinionsKilledEnemyJungle")
    public void setNeutralMinionsKilledEnemyJungle(Integer neutralMinionsKilledEnemyJungle) {
        this.neutralMinionsKilledEnemyJungle = neutralMinionsKilledEnemyJungle;
    }

    @JsonProperty("totalTimeCrowdControlDealt")
    public Integer getTotalTimeCrowdControlDealt() {
        return totalTimeCrowdControlDealt;
    }

    @JsonProperty("totalTimeCrowdControlDealt")
    public void setTotalTimeCrowdControlDealt(Integer totalTimeCrowdControlDealt) {
        this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
    }

    @JsonProperty("champLevel")
    public Integer getChampLevel() {
        return champLevel;
    }

    @JsonProperty("champLevel")
    public void setChampLevel(Integer champLevel) {
        this.champLevel = champLevel;
    }

    @JsonProperty("visionWardsBoughtInGame")
    public Integer getVisionWardsBoughtInGame() {
        return visionWardsBoughtInGame;
    }

    @JsonProperty("visionWardsBoughtInGame")
    public void setVisionWardsBoughtInGame(Integer visionWardsBoughtInGame) {
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
    }

    @JsonProperty("sightWardsBoughtInGame")
    public Integer getSightWardsBoughtInGame() {
        return sightWardsBoughtInGame;
    }

    @JsonProperty("sightWardsBoughtInGame")
    public void setSightWardsBoughtInGame(Integer sightWardsBoughtInGame) {
        this.sightWardsBoughtInGame = sightWardsBoughtInGame;
    }

    @JsonProperty("wardsPlaced")
    public Integer getWardsPlaced() {
        return wardsPlaced;
    }

    @JsonProperty("wardsPlaced")
    public void setWardsPlaced(Integer wardsPlaced) {
        this.wardsPlaced = wardsPlaced;
    }

    @JsonProperty("wardsKilled")
    public Integer getWardsKilled() {
        return wardsKilled;
    }

    @JsonProperty("wardsKilled")
    public void setWardsKilled(Integer wardsKilled) {
        this.wardsKilled = wardsKilled;
    }

    @JsonProperty("firstBloodKill")
    public Boolean getFirstBloodKill() {
        return firstBloodKill;
    }

    @JsonProperty("firstBloodKill")
    public void setFirstBloodKill(Boolean firstBloodKill) {
        this.firstBloodKill = firstBloodKill;
    }

    @JsonProperty("firstBloodAssist")
    public Boolean getFirstBloodAssist() {
        return firstBloodAssist;
    }

    @JsonProperty("firstBloodAssist")
    public void setFirstBloodAssist(Boolean firstBloodAssist) {
        this.firstBloodAssist = firstBloodAssist;
    }

    @JsonProperty("firstTowerKill")
    public Boolean getFirstTowerKill() {
        return firstTowerKill;
    }

    @JsonProperty("firstTowerKill")
    public void setFirstTowerKill(Boolean firstTowerKill) {
        this.firstTowerKill = firstTowerKill;
    }

    @JsonProperty("firstTowerAssist")
    public Boolean getFirstTowerAssist() {
        return firstTowerAssist;
    }

    @JsonProperty("firstTowerAssist")
    public void setFirstTowerAssist(Boolean firstTowerAssist) {
        this.firstTowerAssist = firstTowerAssist;
    }

    @JsonProperty("firstInhibitorKill")
    public Boolean getFirstInhibitorKill() {
        return firstInhibitorKill;
    }

    @JsonProperty("firstInhibitorKill")
    public void setFirstInhibitorKill(Boolean firstInhibitorKill) {
        this.firstInhibitorKill = firstInhibitorKill;
    }

    @JsonProperty("firstInhibitorAssist")
    public Boolean getFirstInhibitorAssist() {
        return firstInhibitorAssist;
    }

    @JsonProperty("firstInhibitorAssist")
    public void setFirstInhibitorAssist(Boolean firstInhibitorAssist) {
        this.firstInhibitorAssist = firstInhibitorAssist;
    }

    @JsonProperty("combatPlayerScore")
    public Integer getCombatPlayerScore() {
        return combatPlayerScore;
    }

    @JsonProperty("combatPlayerScore")
    public void setCombatPlayerScore(Integer combatPlayerScore) {
        this.combatPlayerScore = combatPlayerScore;
    }

    @JsonProperty("objectivePlayerScore")
    public Integer getObjectivePlayerScore() {
        return objectivePlayerScore;
    }

    @JsonProperty("objectivePlayerScore")
    public void setObjectivePlayerScore(Integer objectivePlayerScore) {
        this.objectivePlayerScore = objectivePlayerScore;
    }

    @JsonProperty("totalPlayerScore")
    public Integer getTotalPlayerScore() {
        return totalPlayerScore;
    }

    @JsonProperty("totalPlayerScore")
    public void setTotalPlayerScore(Integer totalPlayerScore) {
        this.totalPlayerScore = totalPlayerScore;
    }

    @JsonProperty("totalScoreRank")
    public Integer getTotalScoreRank() {
        return totalScoreRank;
    }

    @JsonProperty("totalScoreRank")
    public void setTotalScoreRank(Integer totalScoreRank) {
        this.totalScoreRank = totalScoreRank;
    }

    @JsonProperty("playerScore0")
    public Integer getPlayerScore0() {
        return playerScore0;
    }

    @JsonProperty("playerScore0")
    public void setPlayerScore0(Integer playerScore0) {
        this.playerScore0 = playerScore0;
    }

    @JsonProperty("playerScore1")
    public Integer getPlayerScore1() {
        return playerScore1;
    }

    @JsonProperty("playerScore1")
    public void setPlayerScore1(Integer playerScore1) {
        this.playerScore1 = playerScore1;
    }

    @JsonProperty("playerScore2")
    public Integer getPlayerScore2() {
        return playerScore2;
    }

    @JsonProperty("playerScore2")
    public void setPlayerScore2(Integer playerScore2) {
        this.playerScore2 = playerScore2;
    }

    @JsonProperty("playerScore3")
    public Integer getPlayerScore3() {
        return playerScore3;
    }

    @JsonProperty("playerScore3")
    public void setPlayerScore3(Integer playerScore3) {
        this.playerScore3 = playerScore3;
    }

    @JsonProperty("playerScore4")
    public Integer getPlayerScore4() {
        return playerScore4;
    }

    @JsonProperty("playerScore4")
    public void setPlayerScore4(Integer playerScore4) {
        this.playerScore4 = playerScore4;
    }

    @JsonProperty("playerScore5")
    public Integer getPlayerScore5() {
        return playerScore5;
    }

    @JsonProperty("playerScore5")
    public void setPlayerScore5(Integer playerScore5) {
        this.playerScore5 = playerScore5;
    }

    @JsonProperty("playerScore6")
    public Integer getPlayerScore6() {
        return playerScore6;
    }

    @JsonProperty("playerScore6")
    public void setPlayerScore6(Integer playerScore6) {
        this.playerScore6 = playerScore6;
    }

    @JsonProperty("playerScore7")
    public Integer getPlayerScore7() {
        return playerScore7;
    }

    @JsonProperty("playerScore7")
    public void setPlayerScore7(Integer playerScore7) {
        this.playerScore7 = playerScore7;
    }

    @JsonProperty("playerScore8")
    public Integer getPlayerScore8() {
        return playerScore8;
    }

    @JsonProperty("playerScore8")
    public void setPlayerScore8(Integer playerScore8) {
        this.playerScore8 = playerScore8;
    }

    @JsonProperty("playerScore9")
    public Integer getPlayerScore9() {
        return playerScore9;
    }

    @JsonProperty("playerScore9")
    public void setPlayerScore9(Integer playerScore9) {
        this.playerScore9 = playerScore9;
    }

    @JsonProperty("perk0")
    public Integer getPerk0() {
        return perk0;
    }

    @JsonProperty("perk0")
    public void setPerk0(Integer perk0) {
        this.perk0 = perk0;
    }

    @JsonProperty("perk0Var1")
    public Integer getPerk0Var1() {
        return perk0Var1;
    }

    @JsonProperty("perk0Var1")
    public void setPerk0Var1(Integer perk0Var1) {
        this.perk0Var1 = perk0Var1;
    }

    @JsonProperty("perk0Var2")
    public Integer getPerk0Var2() {
        return perk0Var2;
    }

    @JsonProperty("perk0Var2")
    public void setPerk0Var2(Integer perk0Var2) {
        this.perk0Var2 = perk0Var2;
    }

    @JsonProperty("perk0Var3")
    public Integer getPerk0Var3() {
        return perk0Var3;
    }

    @JsonProperty("perk0Var3")
    public void setPerk0Var3(Integer perk0Var3) {
        this.perk0Var3 = perk0Var3;
    }

    @JsonProperty("perk1")
    public Integer getPerk1() {
        return perk1;
    }

    @JsonProperty("perk1")
    public void setPerk1(Integer perk1) {
        this.perk1 = perk1;
    }

    @JsonProperty("perk1Var1")
    public Integer getPerk1Var1() {
        return perk1Var1;
    }

    @JsonProperty("perk1Var1")
    public void setPerk1Var1(Integer perk1Var1) {
        this.perk1Var1 = perk1Var1;
    }

    @JsonProperty("perk1Var2")
    public Integer getPerk1Var2() {
        return perk1Var2;
    }

    @JsonProperty("perk1Var2")
    public void setPerk1Var2(Integer perk1Var2) {
        this.perk1Var2 = perk1Var2;
    }

    @JsonProperty("perk1Var3")
    public Integer getPerk1Var3() {
        return perk1Var3;
    }

    @JsonProperty("perk1Var3")
    public void setPerk1Var3(Integer perk1Var3) {
        this.perk1Var3 = perk1Var3;
    }

    @JsonProperty("perk2")
    public Integer getPerk2() {
        return perk2;
    }

    @JsonProperty("perk2")
    public void setPerk2(Integer perk2) {
        this.perk2 = perk2;
    }

    @JsonProperty("perk2Var1")
    public Integer getPerk2Var1() {
        return perk2Var1;
    }

    @JsonProperty("perk2Var1")
    public void setPerk2Var1(Integer perk2Var1) {
        this.perk2Var1 = perk2Var1;
    }

    @JsonProperty("perk2Var2")
    public Integer getPerk2Var2() {
        return perk2Var2;
    }

    @JsonProperty("perk2Var2")
    public void setPerk2Var2(Integer perk2Var2) {
        this.perk2Var2 = perk2Var2;
    }

    @JsonProperty("perk2Var3")
    public Integer getPerk2Var3() {
        return perk2Var3;
    }

    @JsonProperty("perk2Var3")
    public void setPerk2Var3(Integer perk2Var3) {
        this.perk2Var3 = perk2Var3;
    }

    @JsonProperty("perk3")
    public Integer getPerk3() {
        return perk3;
    }

    @JsonProperty("perk3")
    public void setPerk3(Integer perk3) {
        this.perk3 = perk3;
    }

    @JsonProperty("perk3Var1")
    public Integer getPerk3Var1() {
        return perk3Var1;
    }

    @JsonProperty("perk3Var1")
    public void setPerk3Var1(Integer perk3Var1) {
        this.perk3Var1 = perk3Var1;
    }

    @JsonProperty("perk3Var2")
    public Integer getPerk3Var2() {
        return perk3Var2;
    }

    @JsonProperty("perk3Var2")
    public void setPerk3Var2(Integer perk3Var2) {
        this.perk3Var2 = perk3Var2;
    }

    @JsonProperty("perk3Var3")
    public Integer getPerk3Var3() {
        return perk3Var3;
    }

    @JsonProperty("perk3Var3")
    public void setPerk3Var3(Integer perk3Var3) {
        this.perk3Var3 = perk3Var3;
    }

    @JsonProperty("perk4")
    public Integer getPerk4() {
        return perk4;
    }

    @JsonProperty("perk4")
    public void setPerk4(Integer perk4) {
        this.perk4 = perk4;
    }

    @JsonProperty("perk4Var1")
    public Integer getPerk4Var1() {
        return perk4Var1;
    }

    @JsonProperty("perk4Var1")
    public void setPerk4Var1(Integer perk4Var1) {
        this.perk4Var1 = perk4Var1;
    }

    @JsonProperty("perk4Var2")
    public Integer getPerk4Var2() {
        return perk4Var2;
    }

    @JsonProperty("perk4Var2")
    public void setPerk4Var2(Integer perk4Var2) {
        this.perk4Var2 = perk4Var2;
    }

    @JsonProperty("perk4Var3")
    public Integer getPerk4Var3() {
        return perk4Var3;
    }

    @JsonProperty("perk4Var3")
    public void setPerk4Var3(Integer perk4Var3) {
        this.perk4Var3 = perk4Var3;
    }

    @JsonProperty("perk5")
    public Integer getPerk5() {
        return perk5;
    }

    @JsonProperty("perk5")
    public void setPerk5(Integer perk5) {
        this.perk5 = perk5;
    }

    @JsonProperty("perk5Var1")
    public Integer getPerk5Var1() {
        return perk5Var1;
    }

    @JsonProperty("perk5Var1")
    public void setPerk5Var1(Integer perk5Var1) {
        this.perk5Var1 = perk5Var1;
    }

    @JsonProperty("perk5Var2")
    public Integer getPerk5Var2() {
        return perk5Var2;
    }

    @JsonProperty("perk5Var2")
    public void setPerk5Var2(Integer perk5Var2) {
        this.perk5Var2 = perk5Var2;
    }

    @JsonProperty("perk5Var3")
    public Integer getPerk5Var3() {
        return perk5Var3;
    }

    @JsonProperty("perk5Var3")
    public void setPerk5Var3(Integer perk5Var3) {
        this.perk5Var3 = perk5Var3;
    }

    @JsonProperty("perkPrimaryStyle")
    public Integer getPerkPrimaryStyle() {
        return perkPrimaryStyle;
    }

    @JsonProperty("perkPrimaryStyle")
    public void setPerkPrimaryStyle(Integer perkPrimaryStyle) {
        this.perkPrimaryStyle = perkPrimaryStyle;
    }

    @JsonProperty("perkSubStyle")
    public Integer getPerkSubStyle() {
        return perkSubStyle;
    }

    @JsonProperty("perkSubStyle")
    public void setPerkSubStyle(Integer perkSubStyle) {
        this.perkSubStyle = perkSubStyle;
    }

    @JsonProperty("statPerk0")
    public Integer getStatPerk0() {
        return statPerk0;
    }

    @JsonProperty("statPerk0")
    public void setStatPerk0(Integer statPerk0) {
        this.statPerk0 = statPerk0;
    }

    @JsonProperty("statPerk1")
    public Integer getStatPerk1() {
        return statPerk1;
    }

    @JsonProperty("statPerk1")
    public void setStatPerk1(Integer statPerk1) {
        this.statPerk1 = statPerk1;
    }

    @JsonProperty("statPerk2")
    public Integer getStatPerk2() {
        return statPerk2;
    }

    @JsonProperty("statPerk2")
    public void setStatPerk2(Integer statPerk2) {
        this.statPerk2 = statPerk2;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
