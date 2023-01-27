
public class Main {
    public static void main(String[] args) {
        Team[] team = new Team[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Team " + (i + 1));
            team[i] = new Team();
            team[i].teamInfo();
            Player[] player = new Player[3];
            team[i].players = player;
            for (int j = 0; j < 3; j++) {
                System.out.println("Player " + (j + 1));
                player[j] = new Player();
                player[j].playerInfo();
            }
        }
        for (int i = 0; i < team.length; i++) {
            System.out.println("Team: " + team[i].teamName);
            for (int k = 0; k < team.length; k++) {
                System.out.println("Player: " + team[i].players[k].name + " Goals: " + team[i].players[k].goals + " Assists: " + team[i].players[k].assists);
                System.out.println("Total Points: " + (team[i].players[k].goals + team[i].players[k].assists));
            }

        }
    }
}




