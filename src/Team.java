import java.util.ArrayList;
import java.util.Scanner;
public class Team {

    public String name;
    public void TeamInfo( ArrayList<String> teams, ArrayList<String> players) {
        Scanner input = new Scanner(System.in);

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter the name of your team: ");
                teams.add(input.nextLine());
                System.out.println("Teams: " + teams);
                for (int j = 0; j < 3; j++) {
                    System.out.println("Enter the name of your player: ");
                    players.add(input.nextLine());
                    System.out.println("Players: " + players);
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }


    }
}
