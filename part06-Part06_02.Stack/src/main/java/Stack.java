/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jason
 */
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    // Tells whether or not the stack is empty.
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    // Adds the value given as a parameter to the top of the stack.
    public void add(String value) {
        this.stack.add(value);
    }

    // Returns the topmost value (i.e., the last value added to the deque) and
    // removes it from the stack.
    public String take() {
        if (!this.stack.isEmpty()) {
            int lastIndex = this.stack.size() - 1;
            String lastValue = this.stack.get(lastIndex);
            this.stack.remove(lastIndex);
            return lastValue;
        } else {
            return "[Stack is empty]";
        }
    }

    // Returns the values ​​contained in the stack as a list.
    public ArrayList<String> values() {
        return this.stack;
    }
}
