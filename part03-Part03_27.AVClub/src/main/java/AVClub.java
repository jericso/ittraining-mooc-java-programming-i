
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        input = scanner.nextLine();
        while (!input.equals("")) {
            String[] splitInput = input.split(" ");
            for (int i = 0; i < splitInput.length; i++) {
                if (splitInput[i].contains("av")) {
                    System.out.println(splitInput[i]);
                }
            }

            input = scanner.nextLine();
        }
    }
}
