
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        input = scanner.nextLine();
        while (!input.equals("")) {
            String[] splitInput = input.split(" ");
            
            System.out.println(splitInput[0]);

            input = scanner.nextLine();
        }
    }
}
