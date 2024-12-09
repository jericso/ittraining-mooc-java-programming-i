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

public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public int totalWeight() {
        int returnWeight = 0;
        if (this.items.isEmpty()) {
            return returnWeight;
        }

        for (Item item : this.items) {
            returnWeight += item.getWeight();
        }

        return returnWeight;
    }

    public void addItem(Item item) {
        if ((this.totalWeight() + item.getWeight()) <= this.maximumWeight) {
            this.items.add(item);
        }
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }

        String itemString;
        if (this.items.size() == 1) {
            itemString = "item";
        } else {
            itemString = "items";
        }

        return this.items.size() + " " + itemString + " (" + this.totalWeight() + " kg)";
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item returnItem = this.items.get(0);
        for (Item item : this.items) {
            if (item.getWeight() > returnItem.getWeight()) {
                returnItem = item;
            }
        }

        return returnItem;
    }
}
