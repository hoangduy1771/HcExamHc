import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static List<Object> players = new ArrayList<>();
    public static void main(String[] args) {
        createPlayer();
        displayPlayers(players);
    }

    public static Object createPlayer() {
        Scanner scanner = new Scanner(System.in);
        String continueOption;
        int playerCreatedNum = 0;

        do{
            System.out.println("Creating player...");

            System.out.println("Enter player's name: ");
            String namePlayer = scanner.nextLine();

            System.out.println("Enter player's age: ");
            int agePlayer = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter player's position (GK, DF, MF, FW): ");
            Player.Position position = Player.Position.valueOf(scanner.nextLine());
            Player player = new Player(namePlayer, agePlayer, position);

            System.out.println("Player created successfully!");
//            System.out.println(player);

            System.out.println("Do you want to continue? (Y/N)");
            continueOption = scanner.nextLine();
            playerCreatedNum++;
            players.add(player);
            System.out.println("======================================");
        } while (continueOption.equals("Y"));
        System.out.println("Number of player created: " + playerCreatedNum);
        return players;
    }

    public static void displayPlayers(List<Object> players) {

//        players.stream().map(Object::toString).forEach(System.out::println);

        int player = 1;
        for (Object i : players) {
            System.out.println("Player " + player + ":");
            System.out.println(i);
            player++;
        }


    }


}
