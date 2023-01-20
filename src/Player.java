import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Player {
    public String name;
    public int goals;
    public int assists;


    public void playerInfo() {
        ArrayList<String> players = new ArrayList<String>(3);
        int playerCount;


        Scanner input = new Scanner(System.in);
        System.out.println("How many players would you like to add?");
        playerCount = input.nextInt();
        input.nextLine();
        for (int i = 0; i < playerCount; i++) {
            System.out.println("Player name: ");
            String name = input.nextLine();
            players.add(name);
    }
        System.out.println("Player name: " + players);
    }
}



