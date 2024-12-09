
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stringCount = 0;
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            stringCount++;
            input = scanner.nextLine();
        }

        System.out.println(stringCount);
    }
}
