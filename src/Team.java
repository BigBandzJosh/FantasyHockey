import java.util.ArrayList;
import java.util.Scanner;
public class Team {
    public String teamName;
    public int budget;
    public String[] players;

    public Team() {
        this.teamName = teamName;
        this.budget = budget;
        this.players = players;
    }
    public void teamInfo() {
        Scanner input = new Scanner(System.in);
        try {

                    System.out.println("Enter the name of the team: ");
                    teamName = input.nextLine();
                while (teamName.length() < 3) {
                        System.out.println("Error: Name must be more than 3 characters. Please enter a valid name.");
                        System.out.println("Enter the name of the team: ");
                        teamName = input.nextLine();
                    }
                    System.out.println("Team: " + teamName);


        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
