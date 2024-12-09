
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        ArrayList<Game> records = readRecordsFromFile(file);
        int gameCounter = 0;
        int gamesWon = 0;
        for (Game game : records) {
            // System.out.println(game);
            
            if (team.equals(game.getHomeTeam()) || team.equals(game.getVisitingTeam())) {
                if (team.equals(game.getHomeTeam())) {
                    if (game.getHomeTeamScore() > game.getVisitingTeamScore()) {
                        gamesWon++;
                    }
                } else {
                    if (game.getVisitingTeamScore() > game.getHomeTeamScore()) {
                        gamesWon++;
                    }
                }

                gameCounter++;
            }
        }

        System.out.println("Games: " + gameCounter);
        System.out.println("Wins: " + gamesWon);
        System.out.println("Losses: " + (gameCounter - gamesWon));
    }

    public static ArrayList<Game> readRecordsFromFile(String file) {
        ArrayList<Game> games = new ArrayList<Game>();

        String record = "";
        String[] fields = new String[4];
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                record = fileScanner.nextLine();
                if (record.isEmpty()) {
                    continue;
                }
                fields = record.split(",");

                games.add(new Game(fields[0], fields[1], Integer.valueOf(fields[2]), Integer.valueOf(fields[3])));
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        return games;
    }
}
