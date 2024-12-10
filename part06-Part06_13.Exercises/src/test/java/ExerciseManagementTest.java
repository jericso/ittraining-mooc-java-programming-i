/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author jason
 */
public class ExerciseManagementTest {

    private ExerciseManagement management;

    @Before
    public void initialize() {
        this.management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, this.management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        this.management.add("Write a test");
        assertEquals(1, this.management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        this.management.add("Write a test");
        assertTrue(this.management.exerciseList().contains("Write a test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        this.management.add("New exercise");
        this.management.markAsCompleted("New exercise");
        assertTrue(this.management.isCompleted("New exercise"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        this.management.add("New exercise");
        this.management.markAsCompleted("New exercise");
        assertFalse(this.management.isCompleted("Some exercise"));
    }
}
