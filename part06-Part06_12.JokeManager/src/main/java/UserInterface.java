/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jason
 */
import java.util.Scanner;

public class UserInterface {

    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    private void printMenu() {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
    }

    private void addJoke() {
        System.out.println("Write the joke to be added:");
        String joke = this.scanner.nextLine();
        this.jokeManager.addJoke(joke);
    }

    private void drawJoke() {
        System.out.println("Drawing a joke.");
        System.out.println(this.jokeManager.drawJoke());
    }

    private void printJokes() {
        System.out.println("Printing the jokes.");
        this.jokeManager.printJokes();
    }

    public void start() {
        String command = "";

        System.out.println("What a joke!");
        this.printMenu();
        command = scanner.nextLine();
        while (!command.equals("X")) {
            if (command.equals("1")) {
                this.addJoke();
            } else if (command.equals("2")) {
                this.drawJoke();
            } else if (command.equals("3")) {
                this.printJokes();
            }

            this.printMenu();
            command = scanner.nextLine();
        }
    }
}
