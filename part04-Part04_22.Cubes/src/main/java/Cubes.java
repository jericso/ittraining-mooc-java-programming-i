
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputInteger = 0;
        String inputString = scanner.nextLine();
        while (!inputString.equals("end")) {
            inputInteger = Integer.valueOf(inputString);
            System.out.println(inputInteger * inputInteger * inputInteger);

            inputString = scanner.nextLine();
        }
    }
}
