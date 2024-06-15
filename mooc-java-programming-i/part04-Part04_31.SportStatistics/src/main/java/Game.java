public class Game {
    private String hometeam; // name of the home team
    private String opposingteam; // name of the away team
    private int homepoints; // score of the home team
    private int opposingpoints; // score of the away team

    // constructor
    public Game(String hometeam, String opposingteam, int homepoints, int opposingpoints) {
        this.hometeam = hometeam;
        this.opposingteam = opposingteam;
        this.homepoints = homepoints;
        this.opposingpoints = opposingpoints;
    }

    // getter for the home team name
    public String getHomeTeam() {
        return this.hometeam;
    }

    // getter for the away team name
    public String getOpponent() {
        return this.opposingteam;
    }

    // method for getting the winner. returns a boolean value
    // true: win, false: defeat or draw
    public boolean winnerIs(String team) {
        // when home team wins
        if(team.equals(this.hometeam) && this.homepoints > this.opposingpoints) {
            return true;
        }
        // when away team wins
        if(team.equals(this.opposingteam) && this.opposingpoints > this.homepoints) {
            return true;
        }

        return false;
    }

    // method for getting the looser. returns a boolean value
    // true: defeat, false: win or draw
    public boolean loserIs(String team) {
        // when home team wins
        if(team.equals(this.hometeam) && this.homepoints < this.opposingpoints) {
            return true;
        }
        // when away team wins
        if(team.equals(this.opposingteam) && this.opposingpoints < this.homepoints) {
            return true;
        }

        return false;
    }

    // so if there is a draw, both winnerIs() and loserIs() should be false
}
