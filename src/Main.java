import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Team[] team = new Team[3];
        Player[] player = new Player[3];
        for (int i = 0; i < 3; i++) {
            team[i] = new Team();
            team[i].teamInfo();
            for (int j = 0; j < 3; j++) {
                player[j] = new Player();
                System.out.println("Player " + (j + 1));
                player[j].playerInfo();
            }


        }
    }
}