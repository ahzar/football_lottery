package com.azhar.lottery.bean.game;

/**
 * Created by azhar on 17/6/29.
 */
public class WesternGameLines {

    private String lotteryCorporationsID;
    private String homeTeamLines;
    private String visitingTeamLines;
    private String drawLines;
    private long gameID;              // 比赛ID；
    private String compName;             // 公司名称；


    public long getGameID() {
        return gameID;
    }

    public void setGameID(long gameID) {
        this.gameID = gameID;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getLotteryCorporationsID() {
        return lotteryCorporationsID;
    }

    public void setLotteryCorporationsID(String lotteryCorporationsID) {
        this.lotteryCorporationsID = lotteryCorporationsID;
    }

    public String getHomeTeamLines() {
        return homeTeamLines;
    }

    public void setHomeTeamLines(String homeTeamLines) {
        this.homeTeamLines = homeTeamLines;
    }

    public String getVisitingTeamLines() {
        return visitingTeamLines;
    }

    public void setVisitingTeamLines(String visitingTeamLines) {
        this.visitingTeamLines = visitingTeamLines;
    }

    public String getDrawLines() {
        return drawLines;
    }

    public void setDrawLines(String drawLines) {
        this.drawLines = drawLines;
    }
}
