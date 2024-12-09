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

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    private int totalWeight() {
        int returnWeight = 0;
        if (this.suitcases.isEmpty()) {
            return returnWeight;
        }

        for (Suitcase suitcase : this.suitcases) {
            returnWeight += suitcase.totalWeight();
        }

        return returnWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((this.totalWeight() + suitcase.totalWeight()) <= this.maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        
        String suitcasesString;
        if (this.suitcases.size() == 1) {
            suitcasesString = "suitcase";
        } else {
            suitcasesString = "suitcases";
        }

        return this.suitcases.size() + " " + suitcasesString + " (" + this.totalWeight() + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
}
