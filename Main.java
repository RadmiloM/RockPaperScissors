import java.util.*;

public class Main {
    private static int USER_POINTS = 0;
    private static int COMPUTER_POINTS = 0;


    public static void main(String[] args) {
        StartGame.start();
        List<String> choices = ListOfChoices.getListOfChoices();
        Scanner scanner = UserInput.getUserInput();
        System.out.println("User choose (paper),(rock),(scissors): ");
        String userChoice = scanner.nextLine();
        while (USER_POINTS < 3 && COMPUTER_POINTS < 3) {
            if (!choices.contains(userChoice.toLowerCase())) {
                System.out.println("Invalid input");
                return;
            }
            Random random = new Random();
            int randomIndex = random.nextInt(choices.size());
            String computerChoice = choices.get(randomIndex);
            String currentChoice = ListOfChoices.compareChoices(userChoice, computerChoice);
            if (currentChoice.equals("User")) {
                USER_POINTS++;
            } else if (currentChoice.equals("Computer")) {
                COMPUTER_POINTS++;
            } else {
                continue;
            }
            System.out.println("User choice is " + userChoice + " and his points are " + USER_POINTS);
            System.out.println("Computer choice is " + computerChoice + " and his points are " + COMPUTER_POINTS);
            userChoice = scanner.nextLine();
        }
        if (USER_POINTS == 3) {
            System.out.println("User wins the game");
        } else if (COMPUTER_POINTS == 3) {
            System.out.println("Computer wins the game");
        }
        EndGame.end();
    }
}
