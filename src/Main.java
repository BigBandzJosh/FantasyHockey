import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<String>();
        ArrayList<String> teams = new ArrayList<String>();
        ArrayList<Integer> goals = new ArrayList<Integer>();
        ArrayList<Integer> assists = new ArrayList<Integer>();
        Team team = new Team();
        Player player = new Player();
        boolean flag = true;
        //while (flag) {
            team.TeamInfo(teams);
            player.playerInfo(teams, players, goals, assists);
            team.collectiveTeamInfo(teams, players, goals, assists);

        //}



    }
}