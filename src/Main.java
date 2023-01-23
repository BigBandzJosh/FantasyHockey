import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<String>(3);
        ArrayList<String> teams = new ArrayList<String>(3);
        Team team = new Team();
        Player player = new Player();
        team.TeamInfo(teams, players);
        player.playerInfo(teams, players);




    }
}