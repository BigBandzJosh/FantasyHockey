import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    public String name;
    public int goals;
    public int assists;


    public void playerInfo( ArrayList<String> teams, ArrayList<String> players) {
        int playerCount;
        Scanner input = new Scanner(System.in);
        System.out.println("How many players would you like to add?");
        playerCount = input.nextInt();
        input.nextLine();
        try {
            for (int i = 0; i < playerCount; i++) {
                System.out.println("Player name: ");
                String name = input.nextLine();
                players.add(name);
                System.out.println("Goals: ");
                int goals = input.nextInt();
                System.out.println("Assists: ");
                int assists = input.nextInt();
                input.nextLine();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}



