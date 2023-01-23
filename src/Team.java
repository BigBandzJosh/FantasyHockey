import java.util.ArrayList;
import java.util.Scanner;
public class Team {

    public String name;
    public void TeamInfo( ArrayList<String> teams, ArrayList<String> players) {
        Scanner input = new Scanner(System.in);
        int teamCount = 3;
        try {
        for (int i = 0; i < teamCount; i++) {
            System.out.println("Enter the name of your team: ");
            String teamName = input.nextLine();
            teams.add(teamName);
            System.out.println("Team name: " + teamName);
        }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }


    }
}
