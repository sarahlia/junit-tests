import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CohortTest {

    @Test
    public void testIfAddStudentWorks() {
        Cohort apex = new Cohort();
        Student fer = new Student(1L, "Fer M");
        apex.addStudent(fer);
        assertEquals(1L, apex.getStudents().get(0).getId());

        Student doug = new Student(2L, "Doug");
        apex.addStudent(doug);
        assertEquals(2L, apex.getStudents().get(1).getId());
        assertEquals("Doug", apex.getStudents().get(1).getName());
    }

    @Test
    public void testIfGetStudentsWorks() {
        Cohort apex = new Cohort();
        assertEquals(0, apex.getStudents().size());

        Student jim = new Student(21L, "Jim");
        apex.addStudent(jim);
        assertEquals(1, apex.getStudents().size());
    }

    @Test
    public void testIfAvgWorks() {
        Cohort apex = new Cohort();
        Student jim = new Student(21L, "Jim");
        jim.addGrade(100);
        jim.addGrade(100);

        Student fer = new Student(1L, "Fer M");
        fer.addGrade(80);
        fer.addGrade(100);
        apex.addStudent(jim);
        apex.addStudent(fer);
        assertEquals(95, apex.getCohortAverage(), 0);

    }

}