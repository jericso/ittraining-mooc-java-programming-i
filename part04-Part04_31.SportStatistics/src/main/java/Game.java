/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jason
 */
public class Game {

    private String homeTeam;
    private String visitingTeam;
    private int homeTeamScore;
    private int visitingTeamScore;

    public Game(String homeTeam, String visitingTeam, int homeTeamScore, int visitingTeamScore) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamScore = homeTeamScore;
        this.visitingTeamScore = visitingTeamScore;
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getVisitingTeam() {
        return this.visitingTeam;
    }

    public int getHomeTeamScore() {
        return this.homeTeamScore;
    }

    public int getVisitingTeamScore() {
        return this.visitingTeamScore;
    }

    @Override
    public String toString() {
        if (this.homeTeamScore > this.visitingTeamScore) {
            return this.homeTeam + " defeated " + this.visitingTeam + " " + this.homeTeamScore + " - " + this.visitingTeamScore;
        } else {
            return this.visitingTeam + " defeated " + this.homeTeam + " " + this.visitingTeamScore + " - " + this.homeTeamScore;
        }
    }
}
