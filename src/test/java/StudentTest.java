import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

//    @Test
//    public void testCreateStudent() {
//        Student laura = new Student("laura", 22L);
//        assertNotNull(laura);
//        Student michael = null;
//        assertNull(michael);
//    }

    @Test
    public void testIfHasFields() {
        Student joanne = new Student("joanne", 23L);
        assertEquals("joanne", joanne.getName() );
        assertEquals(23L, joanne.getId() );
        assertEquals(0, joanne.getGrades().size() );
    }



}
