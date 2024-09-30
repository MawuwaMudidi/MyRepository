import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        //f. Create main function and in the main function create 5-6 players. Then Test all of them.
        List<SoccerPlayer> players = new ArrayList<>();
        players.add(new SoccerPlayer("Lionel Messi", 36, "Inter Miami", 7));
        players.add(new SoccerPlayer("Cristiano Ronaldo", 39, "Al Nassr", 8));
        players.add(new SoccerPlayer("Neymar Jr", 31, "Al Hilal", 4));
        players.add(new SoccerPlayer("Kylian Mbappé", 25, "Paris Saint-Germain", 2));
        players.add(new SoccerPlayer("Kevin", 32, "Manchester City", 1));
        players.add(new SoccerPlayer("Harry Kane", 30, "Bayern Munich", 2));


        System.out.println("List of Soccer Players:");
        for (SoccerPlayer player : players) {
            System.out.println(player);
        }

        SoccerPlayer player1 = new SoccerPlayer("Lionel Messi", 36, "Inter Miami", 7);
        SoccerPlayer player2 = new SoccerPlayer("Cristiano Ronaldo", 39, "Al Nassr", 8);
        SoccerPlayer player3 = new SoccerPlayer("Lionel Messi", 36, "Inter Miami", 7);

        System.out.println("\nTesting equals method:");
        System.out.println("Player1 equals Player2: " + player1.equals(player2));
        System.out.println("Player1 equals Player3: " + player1.equals(player3)); 
    }
}
