package com.azhar.lottery.bean.game;

import java.util.ArrayList;

/**
 * Created by azhar on 17/6/29.
 */
public class GameInfo {


    private String gameTime;   //比赛时间
    private String gameType = "0";   // 比赛类型   0-联赛  1-杯赛   2-友谊赛   默认 0 ;
//    private String westernLotteryCorporationsID;         // 西方博彩公司ID
//    private String asiaLotteryCorporationsID;            //亚洲博彩公司
    private ArrayList<WesternGameLines> westernGameLines;       // 西方胜负赔率;
    private ArrayList<AsiaGameLines> asiaGameLines ;               // 亚盘盘口赔率
    private String userID;              //用户ID;
    private String handicap;             // 让球盘；
    private String homeTeam;                // 主队；
    private String visitingTeam;            //客队；
    private String corner;                  // 角球
    private String totalGoals;               //总进球
    private String halfTimeScore;           // 半场比分
    private String overall;                 //全场比分
    private long id;                        //  比赛ID；
    private String description;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<AsiaGameLines> getAsiaGameLines() {
        return asiaGameLines;
    }

    public void setAsiaGameLines(ArrayList<AsiaGameLines> asiaGameLines) {
        this.asiaGameLines = asiaGameLines;
    }

//    public String getAsiaLotteryCorporationsID() {
//        return asiaLotteryCorporationsID;
//    }
//
//    public void setAsiaLotteryCorporationsID(String asiaLotteryCorporationsID) {
//        this.asiaLotteryCorporationsID = asiaLotteryCorporationsID;
//    }

    public String getGameTime() {
        return gameTime;
    }

    public void setGameTime(String gameTime) {
        this.gameTime = gameTime;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

//    public String getWesternLotteryCorporationsID() {
//        return westernLotteryCorporationsID;
//    }
//
//    public void setWesternLotteryCorporationsID(String westernLotteryCorporationsID) {
//        this.westernLotteryCorporationsID = westernLotteryCorporationsID;
//    }

    public ArrayList<WesternGameLines> getWesternGameLines() {
        return westernGameLines;
    }

    public void setWesternGameLines(ArrayList<WesternGameLines> westernGameLines) {
        this.westernGameLines = westernGameLines;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getHandicap() {
        return handicap;
    }

    public void setHandicap(String handicap) {
        this.handicap = handicap;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public void setVisitingTeam(String visitingTeam) {
        this.visitingTeam = visitingTeam;
    }

    public String getCorner() {
        return corner;
    }

    public void setCorner(String corner) {
        this.corner = corner;
    }

    public String getTotalGoals() {
        return totalGoals;
    }

    public void setTotalGoals(String totalGoals) {
        this.totalGoals = totalGoals;
    }

    public String getHalfTimeScore() {
        return halfTimeScore;
    }

    public void setHalfTimeScore(String halfTimeScore) {
        this.halfTimeScore = halfTimeScore;
    }

    public String getOverall() {
        return overall;
    }

    public void setOverall(String overall) {
        this.overall = overall;
    }
}
