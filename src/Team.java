import java.util.ArrayList;
import java.util.Scanner;
public class Team {
    public void TeamInfo(ArrayList<String> teams) {
        Scanner input = new Scanner(System.in);

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter the name of your team: ");
                teams.add(input.nextLine());
                System.out.println("Teams: " + teams.get(i));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void collectiveTeamInfo(ArrayList<String> teams, ArrayList<String> players, ArrayList<Integer> goals, ArrayList<Integer> assists) {
        for (int i = 0; i < teams.size(); i++) {
            System.out.println("Team: " + teams.get(i));
            for (int j = 0; j < players.size(); j++) {
                int totalgAndAgoals= goals.get(j) + assists.get(j);
                System.out.print("Player: " + players.get(j) + "\n");
                System.out.print("Goals: " + goals.get(j) + "\n");
                System.out.print("Assists: " + assists.get(j) + "\n");
                System.out.print("Total goals and assists: " + totalgAndAgoals + "\n");
            }



        }
    }
}
