package com.azhar.lottery.bean.game;

/**
 * Created by azhar on 17/6/29.
 */
public class AsiaGameLines {

    private String asisLotteryCorporationsID;
    private String asisHomeTeamLines;
    private String asisVisitingTeamLines;
    private String asisHandicap;
    private long gameID;
    private String compName;




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

    public String getAsisLotteryCorporationsID() {
        return asisLotteryCorporationsID;
    }

    public void setAsisLotteryCorporationsID(String asisLotteryCorporationsID) {
        this.asisLotteryCorporationsID = asisLotteryCorporationsID;
    }

    public String getAsisHomeTeamLines() {
        return asisHomeTeamLines;
    }

    public void setAsisHomeTeamLines(String asisHomeTeamLines) {
        this.asisHomeTeamLines = asisHomeTeamLines;
    }

    public String getAsisVisitingTeamLines() {
        return asisVisitingTeamLines;
    }

    public void setAsisVisitingTeamLines(String asisVisitingTeamLines) {
        this.asisVisitingTeamLines = asisVisitingTeamLines;
    }

    public String getAsisHandicap() {
        return asisHandicap;
    }

    public void setAsisHandicap(String asisHandicap) {
        this.asisHandicap = asisHandicap;
    }
}
