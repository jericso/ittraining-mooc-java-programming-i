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

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : this.exercises) {
            list.add(exercise.getName());
        }

        return list;
    }

    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted(String exercise) {
        for (int i = 0; i < this.exercises.size(); i++) {
            if (this.exercises.get(i).getName().equals(exercise)) {
                this.exercises.get(i).setCompleted(true);
            }
        }

        /* alternate
        for (Exercise listExercise : this.exercises) {
            if (listExercise.getName().equals(exercise)) {
                listExercise.setCompleted(true);
            }
        }*/
    }

    public boolean isCompleted(String exercise) {
        for (int i = 0; i < this.exercises.size(); i++) {
            if (this.exercises.get(i).getName().equals(exercise)) {
                return this.exercises.get(i).isCompleted();
            }
        }

        /* alternate
        for (Exercise listExercise : this.exercises) {
            if (listExercise.getName().equals(exercise)) {
                return listExercise.isCompleted();
            }
        }*/
        return false;
    }
}
