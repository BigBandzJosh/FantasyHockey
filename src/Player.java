import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    public String name;
    public int goals;
    public int assists;
    public Player () {
        this.name = name;
        this.goals = goals;
        this.assists = assists;
    }
    public void playerInfo() {
        Scanner input = new Scanner(System.in);
        try {
                System.out.println("Enter the name of player: ");
                name = input.nextLine();
                while (name.length() < 3) {
                    System.out.println("Error: Name must be more than 3 characters. Please enter a valid name.");
                    System.out.println("Enter the name of player: ");
                    name = input.nextLine();
                }
                try {
                    System.out.println("Enter the number of goals scored by " + name + ": ");
                    goals = input.nextInt();
                    System.out.println("Enter the number of assists by " + name + ": ");
                    assists = input.nextInt();
                    input.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Error: " + e + "\n" + "Please enter a valid number.");
                }
            System.out.println("Player: " + name + " Goals: " + goals + " Assists: " + assists);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }
    public void displayPlayerInfo() {
        System.out.println("Player: " + name + " Goals: " + goals + " Assists: " + assists);
    }
    }





