
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");

            //read number entered
            int number = Integer.valueOf(scanner.nextLine());

            //exit loop if zero entered
            if (number == 0) {
                break;
            }

            //add number to sum
            sumOfNumbers = sumOfNumbers + number;
        }

        //print sum of numbers entered
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }
}
