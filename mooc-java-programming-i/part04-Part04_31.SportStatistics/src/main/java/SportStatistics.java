
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String fileName = scan.nextLine();
        // ArrayList for storing match history in Game objects
        ArrayList<Game> games = readFromFile(fileName);

        // asks for the specific team for its stats
        System.out.println("Team:");
        String team = scan.nextLine();

        //count only the matches of the specified team
        ArrayList<Game> gamesOfATeam = new ArrayList<>();
        for(Game element: games) {
            // add to the ArrayList if the team in query is either the home team or the away team
            if(team.equals(element.getHomeTeam()) || team.equals(element.getOpponent())) {
                gamesOfATeam.add(element);
            }
        }

        // print the number of games of the specific team
        System.out.println("Games: " + gamesOfATeam.size());

        // count the number of wins, defeats, and draws
        int wins = 0, defeats = 0, draws = 0;
        for(Game element: gamesOfATeam) {
            if(element.winnerIs(team)) {
                wins++;
            } else if(element.loserIs(team)) {
                defeats++;
            } else {
                draws++;
            }
        }

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + defeats);

        scan.close();
    }

    // method for storing each match history into the ArrayList in the main method
    public static ArrayList<Game> readFromFile(String fileName) {
        // ArrayList for storing games by reading line by line
        ArrayList<Game> games = new ArrayList<>();
        // reading lines from the CSV file
        try(Scanner lineScan = new Scanner(Paths.get(fileName))) {
            while(lineScan.hasNextLine()) {
                String line = lineScan.nextLine();
                // even if there is an empty line, skip it and continue
                if(line.isEmpty()) {
                    continue;
                }

                // separate parts of information by commas
                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String opposingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int opposingPoints = Integer.valueOf(parts[3]);

                // adds Game objests to the ArrayList
                games.add(new Game(homeTeam, opposingTeam, homePoints, opposingPoints));
            }
        } catch (Exception e) {
            System.out.println("Failed to read the file " + fileName);
        }

        return games;
    }

    // method for extracting the number of games played for each team
    public static int gamesPlayed(String teamName, ArrayList<String> list) {
        int gamesPlayed = 0; // variable for the number of games played for the team in query
        for(String element: list) {
            // separates data by commas
            String[] parts = element.split(",");
            // first and second elements are team names,
            // so search if the team in query falls into either a home team or an away team
            if(parts[0].contains(teamName) || parts[1].contains(teamName)) {
                gamesPlayed++;
            }
        }

        return gamesPlayed;
    }

    // method for extracting the number of games won for the team in query
    public static int gamesWon(String teamName, ArrayList<String> list) {
        int gamesWon = 0; // variable for the number of games won for the team in query
        for(String element: list) {
            // separates data by commas
            String[] parts = element.split(",");
            // if the team in query is the home team
            if(parts[0].contains(teamName)) {
                // third part: home team score, fourth part: away team score
                // check if the home team score is larger than the away team score
                if(Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                    gamesWon++;
                }
            }

            // if the team in query is the away team
            if(parts[1].contains(teamName)) {
                if(Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])) {
                    gamesWon++;
                }
            }
        }

        return gamesWon;
    }

    // extracting the number of games lost for the team in query
    public static int gamesLost(String teamName, ArrayList<String> list) {
        int gamesLost = 0; // variable for the number of games won for the team in query
        for(String element: list) {
            // separates data by commas
            String[] parts = element.split(",");
            // if the team in query is the home team
            if(parts[0].contains(teamName)) {
                // third part: home team score, fourth part: away team score
                // check if the home team score is smaller than the away team score
                if(Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])) {
                    gamesLost++;
                }
            }

            // if the team in query is the away team
            if(parts[1].contains(teamName)) {
                if(Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                    gamesLost++;
                }
            }
        }

        return gamesLost;
    }

}
