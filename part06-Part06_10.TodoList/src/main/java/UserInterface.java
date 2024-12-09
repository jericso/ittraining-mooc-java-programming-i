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

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    private void addTask() {
        System.out.println("To add: ");
        String addTask = this.scanner.nextLine();
        this.todoList.add(addTask);
    }

    private void removeTask() {
        System.out.println("Which one is removed? ");
        int removeTask = Integer.parseInt(this.scanner.nextLine());
        this.todoList.remove(removeTask);
    }

    public void start() {
        System.out.println("Command:");
        String command = this.scanner.nextLine();
        while (!command.equals("stop")) {
            if (command.equals("add")) {
                addTask();
            } else if (command.equals("list")) {
                this.todoList.print();
            } else if (command.equals("remove")) {
                removeTask();
            } else {
                System.out.println("Unknown command");
            }

            System.out.println("Command:");
            command = this.scanner.nextLine();
        }
    }
}
