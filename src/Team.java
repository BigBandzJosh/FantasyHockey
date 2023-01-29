import java.util.Random;
import java.util.Scanner;
public class Team {
    public String teamName;

    public double budget = 100000;
    Player[] players;
    public int totalPoints;
    public Team() {
        this.teamName = teamName;
        this.budget = budget;
        this.players = players;
    }
    //this method creates the team name
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
    public void displayTeamInfo() {
        System.out.println("Team: " + teamName);
    }

    public void budgetting(){
        Random rand = new Random();
        double randomBudget = rand.nextDouble(budget);
        System.out.println("Your team has a budget of: ");
        System.out.printf("%.2f \n", randomBudget);
    }
    }


