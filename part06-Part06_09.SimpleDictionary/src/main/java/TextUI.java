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

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    private void add() {
        String word = "", translation = "";

        System.out.println("Word:");
        word = this.scanner.nextLine();
        System.out.println("Translation:");
        translation = this.scanner.nextLine();

        this.dictionary.add(word, translation);
    }

    private void search() {
        String toTranslate = "", translated = "";

        System.out.println("To be translated:");
        toTranslate = this.scanner.nextLine();
        translated = this.dictionary.translate(toTranslate);

        if (translated == null) {
            System.out.println("Word " + toTranslate + " was not found");
        } else {
            System.out.println("Translation: " + translated);
        }
    }

    public void start() {
        System.out.println("Command:");
        String command = this.scanner.nextLine();
        while (!command.equals("end")) {
            if (command.equals("add")) {
                this.add();
            } else if (command.equals("search")) {
                this.search();
            } else {
                System.out.println("Unknown command");
            }

            System.out.println("Command:");
            command = this.scanner.nextLine();
        }

        System.out.println("Bye bye!");
    }
}
