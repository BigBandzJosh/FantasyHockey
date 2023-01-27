import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Team[] team = new Team[3];
        // this for loop creates the teams and the players
        for (int i = 0; i < 3; i++) {
            System.out.println("Team: " + (i + 1));
            // creates a new team object
            team[i] = new Team();
            team[i].teamInfo();
            // creates a new player object
            Player[] player = new Player[3];
            team[i].players = player;
            team[i].totalPoints = 0;
            // this for loop creates the players
            for (int j = 0; j < 3; j++) {
                System.out.println("Player: " + (j + 1));
                player[j] = new Player();
                player[j].playerInfo();
                team[i].totalPoints += player[j].goals + player[j].assists;
            }
        }
        // this for loop prints out the team name, the players and their stats
        for (int i = 0; i < team.length; i++) {
            System.out.println("Team: " + team[i].teamName);
            for (int j = 0; j < team[i].players.length; j++) {
                System.out.println("Player: " + team[i].players[j].name + " Goals: " + team[i].players[j].goals + " Assists: " + team[i].players[j].assists);
            }
        }
        // this for loop prints out the team with the most points
        for (int i = 0; i < team.length; i++) {
            if (team[i].totalPoints > 20) {
                System.out.println("Team: " + team[i].teamName + " Total Points: " + team[i].totalPoints);
                System.out.println("Team Rating: "+ "***");
                team[i].budgetting();
            } else if (team[i].totalPoints >= 10) {
                System.out.println("Team: " + team[i].teamName + " Total Points: " + team[i].totalPoints);
                System.out.println("Team Rating: "+ "**");
                team[i].budgetting();
            } else if (team[i].totalPoints > 0) {
                System.out.println("Team: " + team[i].teamName + " Total Points: " + team[i].totalPoints);
                System.out.println("Team Rating: "+ "*");
                team[i].budgetting();
            } else if (team[i].totalPoints == 0) {
                System.out.println("Team: " + team[i].teamName + " Total Points: " + team[i].totalPoints);
                System.out.println("Team Rating: "+ "you suck!");
                team[i].budgetting();
            }
        }
    }

}





