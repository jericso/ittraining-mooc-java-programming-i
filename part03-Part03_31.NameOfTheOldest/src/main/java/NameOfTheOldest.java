
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        int oldestAge = 0;
        String oldestName = "";
        
        input = scanner.nextLine();
        while (!input.equals("")) {
            String[] splitInput = input.split(",");

            if (Integer.valueOf(splitInput[1]) > oldestAge) {
                oldestAge = Integer.valueOf(splitInput[1]);
                oldestName = splitInput[0];
            }

            input = scanner.nextLine();
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
