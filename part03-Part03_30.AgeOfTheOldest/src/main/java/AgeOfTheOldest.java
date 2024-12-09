
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        int oldest = 0;
        input = scanner.nextLine();
        while (!input.equals("")) {
            String[] splitInput = input.split(",");

            if (Integer.valueOf(splitInput[1]) > oldest) {
                oldest = Integer.valueOf(splitInput[1]);
            }

            input = scanner.nextLine();
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
