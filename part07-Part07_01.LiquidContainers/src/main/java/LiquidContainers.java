
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] inputParts = input.split(" ");
                String command = inputParts[0];
                int inputQuantity = Integer.parseInt(inputParts[1]);
                if (inputQuantity > 0) {
                    if (command.equals("add")) {
                        if ((firstContainer + inputQuantity) > 100) {
                            firstContainer = 100;
                        } else {
                            firstContainer += inputQuantity;
                        }
                    } else if (command.equals("move")) {
                        if (inputQuantity > firstContainer) {
                            secondContainer += firstContainer;
                            firstContainer = 0;
                        } else {
                            secondContainer += inputQuantity;
                            firstContainer -= inputQuantity;
                        }

                        if (secondContainer > 100) {
                            secondContainer = 100;
                        }
                    } else if (command.equals("remove")) {
                        if (secondContainer < inputQuantity) {
                            secondContainer = 0;
                        } else {
                            secondContainer -= inputQuantity;
                        }
                    }
                }

                System.out.println();
            }
        }
    }
}
