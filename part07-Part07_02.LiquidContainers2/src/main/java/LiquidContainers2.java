
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] inputParts = input.split(" ");
                String command = inputParts[0];
                int inputQuantity = Integer.parseInt(inputParts[1]);
                if (command.equals("add")) {
                    firstContainer.add(inputQuantity);
                } else if (command.equals("move")) {
                    if (firstContainer.contains() < inputQuantity) {
                        inputQuantity = firstContainer.contains();
                    }
                    firstContainer.remove(inputQuantity);
                    secondContainer.add(inputQuantity);
                } else if (command.equals("remove")) {
                    secondContainer.remove(inputQuantity);
                }

                System.out.println();
            }
        }
    }
}
