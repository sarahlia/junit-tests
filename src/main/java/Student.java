import java.util.ArrayList;

public class Student {

    private String name;
    private long id;
    private ArrayList<Integer> grades;


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

    public double getGradeAverage() {
        if (this.grades.size() == 0) {
            return 0;
        }

        int total = 0;
        for(int grade:grades) {
            total = total + grade;
        }
        return (double) total/grades.size();
    }

}
