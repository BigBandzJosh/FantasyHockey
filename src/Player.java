import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    public void playerInfo( ArrayList<String> teams, ArrayList<String> players, ArrayList<String> goals, ArrayList<String> assists) {
        Scanner input = new Scanner(System.in);
        try {


                    System.out.println("Enter the name of your player: ");
                    players.add(input.nextLine());
                    System.out.println("Goals: ");
                    goals.add(input.nextLine());
                    System.out.println("Assists: ");
                    assists.add(input.nextLine());






        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}



