import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
//
//    @Test
//    public void testCreateStudent() {
//        Student laura = new Student("laura", 22L);
//        assertNotNull(laura);
//        Student michael = null;
//        assertNull(michael);
//    }

    Student joanne;

    @Before
    public void setUp() {
        joanne = new Student("joanne", 23L);
    }

    @Test
    public void testIfIdWorks() {
//        Student joanne = new Student("joanne", 23L);
        assertEquals(23L, joanne.getId() );
    }

    @Test
    public void testIfNameWorks() {
//        Student joanne = new Student("joanne", 23L);
        assertEquals("joanne", joanne.getName() );

    }

    @Test
    public void testIfGradesWorks(){
        assertEquals(0, joanne.getGrades().size());
    }

    @Test
    public void testAddGradeMethod() {
        joanne.addGrade(85);
        assertTrue(85 == joanne.getGrades().get(0));
        joanne.addGrade(80);
        assertSame(80, joanne.getGrades().get(1) );


    }

    @Test
    public void testGetGradeAverageMethod() {
        Student charles = new Student("charles", 25L);
        charles.addGrade(92);
        charles.addGrade(90);
        charles.addGrade(100);
        assertEquals(94, charles.getGradeAverage(), 0.1 );
        charles.addGrade(99);
        assertEquals(95, charles.getGradeAverage(), 0.25 );
    }


}
