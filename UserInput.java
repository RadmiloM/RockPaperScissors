import java.util.Scanner;

public class UserInput {
        private static Scanner scanner;
    public static Scanner getUserInput(){
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}
