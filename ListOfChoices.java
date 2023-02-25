import java.util.List;

public class ListOfChoices {

    private static int USER_POINTS;
    private static int COMPUTER_POINTS;

    private static final List<String> choices = List.of("rock", "paper", "scissors");

    public static List<String> getListOfChoices() {
        return choices;
    }

    public static boolean isValidChoice(String word) {
        if (!choices.contains(word.toLowerCase())) {
            return false;
        }
        return true;
    }

    public static String compareChoices(String user, String computer) {
        if (user.equals("paper") && computer.equals("scissors")) {
            return "Computer";
        } else if (user.equals("scissors") && computer.equals("paper")) {
            return "User";
        }else if(user.equals("paper") && computer.equals("paper")){
            return "Even";
        }
        else if (user.equals("rock") && computer.equals("paper")) {
            return "Computer";

        } else if (user.equals("paper") && computer.equals("rock")) {
            return "User";

        }else if(user.equals("rock") && computer.equals("rock")){
            return "Even";
        }
        else if (user.equals("rock") && computer.equals("scissors")) {
            return "User";
        } else if (user.equals("scissors") && computer.equals("rock")) {
            return "Computer";
        }
        else if(user.equals("scissors") && computer.equals("scissors")){
            return "Even";
        }
        return "";
    }

}
