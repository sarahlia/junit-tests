import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testCreateStudent() {
        Student laura = new Student("laura", 22L);
        assertNotNull(laura);
        Student michael = null;
        assertNull(michael);
    }

    @Test
    public void testIfHasFields() {
        Student joanne = new Student("joanne", 23L);
        assertEquals("joanne", joanne.getName() );
        assertEquals(23L, joanne.getId() );
        assertEquals(0, joanne.getGrades().size() );
    }

    @Test
    public void testAddGradeMethod() {
        Student jordan = new Student("jordan", 24L);
        jordan.addGrade(85);
        assertSame(85, jordan.getGrades().get(0) );
    }

    @Test
    public void testGetGradeAverageMethod() {
        Student charles = new Student("charles", 25L);
        charles.addGrade(92);
        charles.addGrade(90);
        charles.addGrade(100);
        assertEquals(94, charles.getGradeAverage(), 0 );
    }


}
