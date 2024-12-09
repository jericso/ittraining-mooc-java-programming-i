
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        int longestNameLength = 0;
        String longestName = "";
        int birthYearTotal = 0;
        int counter = 0;

        input = scanner.nextLine();
        while (!input.equals("")) {
            String[] splitInput = input.split(",");

            if (splitInput[0].length() > longestNameLength) {
                longestNameLength = splitInput[0].length();
                longestName = splitInput[0];
            }

            birthYearTotal += Integer.valueOf(splitInput[1]);
            counter++;
            input = scanner.nextLine();
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + birthYearTotal * 1.0 / counter);
    }
}
