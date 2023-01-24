import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    public void playerInfo(ArrayList<String> teams, ArrayList<String> players, ArrayList<Integer> goals, ArrayList<Integer> assists) {
        Scanner input = new Scanner(System.in);
        try {
            for (int i = 0; i < teams.size(); i++) {
                System.out.println("Team: " + teams.get(i));

                for (int j = 0; j < 3; j++) {
                    System.out.println("Enter the name of your player: ");
                    players.add(input.nextLine());
                    System.out.printf("Goals: for %s%n", players.get(j));
                    goals.add(input.nextInt());
                    System.out.printf("Assists: for %s%n", players.get(j));
                    assists.add(input.nextInt());
                    input.nextLine();
                    System.out.println("Players: " + players);
                    System.out.println("Goals: " + goals);
                    System.out.println("Assists: " + assists);

                }
            }




        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}



