package org.tool.converter;


public class WorldCupMatchRecord {
    String year;
    String datetime;
    String stage;
    String stadium;
    String city;
    String homeTeamName;
    String homeTeamGoals;
    String awayTeamGoals;
    String awayTeamName;
    String winConditions;
    String attendance;
    String halfTimeHomeGoals;
    String halfTimeAwayGoals;
    String referee;
    String assistant1;
    String assistant2;
    String roundID;
    String matchID;
    String homeTeamInitials;
    String awayTeamInitials;

    public WorldCupMatchRecord() {
    }

    public WorldCupMatchRecord(String year, String datetime, String stage, String stadium, String city, String homeTeamName, String homeTeamGoals, String awayTeamGoals, String awayTeamName, String winConditions, String attendance, String halfTimeHomeGoals, String halfTimeAwayGoals, String referee, String assistant1, String assistant2, String roundID, String matchID, String homeTeamInitials, String awayTeamInitials) {
        this.year = year;
        this.datetime = datetime;
        this.stage = stage;
        this.stadium = stadium;
        this.city = city;
        this.homeTeamName = homeTeamName;
        this.homeTeamGoals = homeTeamGoals;
        this.awayTeamGoals = awayTeamGoals;
        this.awayTeamName = awayTeamName;
        this.winConditions = winConditions;
        this.attendance = attendance;
        this.halfTimeHomeGoals = halfTimeHomeGoals;
        this.halfTimeAwayGoals = halfTimeAwayGoals;
        this.referee = referee;
        this.assistant1 = assistant1;
        this.assistant2 = assistant2;
        this.roundID = roundID;
        this.matchID = matchID;
        this.homeTeamInitials = homeTeamInitials;
        this.awayTeamInitials = awayTeamInitials;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getHomeTeamGoals() {
        return homeTeamGoals;
    }

    public void setHomeTeamGoals(String homeTeamGoals) {
        this.homeTeamGoals = homeTeamGoals;
    }

    public String getAwayTeamGoals() {
        return awayTeamGoals;
    }

    public void setAwayTeamGoals(String awayTeamGoals) {
        this.awayTeamGoals = awayTeamGoals;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public String getWinConditions() {
        return winConditions;
    }

    public void setWinConditions(String winConditions) {
        this.winConditions = winConditions;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public String getHalfTimeHomeGoals() {
        return halfTimeHomeGoals;
    }

    public void setHalfTimeHomeGoals(String halfTimeHomeGoals) {
        this.halfTimeHomeGoals = halfTimeHomeGoals;
    }

    public String getHalfTimeAwayGoals() {
        return halfTimeAwayGoals;
    }

    public void setHalfTimeAwayGoals(String halfTimeAwayGoals) {
        this.halfTimeAwayGoals = halfTimeAwayGoals;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public String getAssistant1() {
        return assistant1;
    }

    public void setAssistant1(String assistant1) {
        this.assistant1 = assistant1;
    }

    public String getAssistant2() {
        return assistant2;
    }

    public void setAssistant2(String assistant2) {
        this.assistant2 = assistant2;
    }

    public String getRoundID() {
        return roundID;
    }

    public void setRoundID(String roundID) {
        this.roundID = roundID;
    }

    public String getMatchID() {
        return matchID;
    }

    public void setMatchID(String matchID) {
        this.matchID = matchID;
    }

    public String getHomeTeamInitials() {
        return homeTeamInitials;
    }

    public void setHomeTeamInitials(String homeTeamInitials) {
        this.homeTeamInitials = homeTeamInitials;
    }

    public String getAwayTeamInitials() {
        return awayTeamInitials;
    }

    public void setAwayTeamInitials(String awayTeamInitials) {
        this.awayTeamInitials = awayTeamInitials;
    }

    @Override
    public String toString() {
        return "WorldCupMatchRecord{" +
                "year='" + year + '\'' +
                ", datetime='" + datetime + '\'' +
                ", stage='" + stage + '\'' +
                ", stadium='" + stadium + '\'' +
                ", city='" + city + '\'' +
                ", homeTeamName='" + homeTeamName + '\'' +
                ", homeTeamGoals='" + homeTeamGoals + '\'' +
                ", awayTeamGoals='" + awayTeamGoals + '\'' +
                ", awayTeamName='" + awayTeamName + '\'' +
                ", winConditions='" + winConditions + '\'' +
                ", attendance='" + attendance + '\'' +
                ", halfTimeHomeGoals='" + halfTimeHomeGoals + '\'' +
                ", halfTimeAwayGoals='" + halfTimeAwayGoals + '\'' +
                ", referee='" + referee + '\'' +
                ", assistant1='" + assistant1 + '\'' +
                ", assistant2='" + assistant2 + '\'' +
                ", roundID='" + roundID + '\'' +
                ", matchID='" + matchID + '\'' +
                ", homeTeamInitials='" + homeTeamInitials + '\'' +
                ", awayTeamInitials='" + awayTeamInitials + '\'' +
                '}';
    }
}
