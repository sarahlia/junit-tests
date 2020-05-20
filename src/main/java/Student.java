import java.util.ArrayList;

public class Student {

    public String name;
    public long id;
    public ArrayList<Integer> grades;


    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public void addGrade(int aGrade) {
        this.grades.add(aGrade);
    }

//    public static void setName(String aName) {
//        this.name = null;
//    }
}
