import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class StudentTest {
    //TODO: Test Check - The Student class should have a constructor that
    // sets both the name and id property, it initializes the grades property
    // as an empty ArrayList.

    //setup for instance constructor
    Student newStudent;
    Student studentWithManyGrades;

    @Before
    public void setUp(){
        newStudent = new Student(1, "student1");
        newStudent.addGrade(90);

        studentWithManyGrades = new Student(2,"students2");
        studentWithManyGrades.addGrade(60);
        studentWithManyGrades.addGrade(80);
        studentWithManyGrades.addGrade(100);
    }

    @Test
    public void testIfUserObjectCanBeCreated() {
        assertEquals("student1", newStudent.getName());
        assertEquals(1, newStudent.getId());
    }


    //TODO: Test Check - The Student class should have the following methods:
        //    // returns the student's id
        //    public long getId(){...}
        //
        //    // returns the student's name
        //    public String getName(){...}
        //
        //    // adds the given grade to the grades list
        //    public void addGrade(int grade){...}
        //
        //    // returns the list of grades
        //    public ArrayList<Integer> getGrades(){...}
        //
        //    // returns the average of the students grades
        //    public double getGradeAverage(){...}


    @Test
    public void testStudentFields() {
        assertSame(1L, newStudent.getId());
        assertSame("student1", newStudent.getName());
        assertSame(1, newStudent.getGrades().size());
    }

    @Test
    public void testIfAddGradeWorks(){
        assertSame(90, newStudent.getGrades().get(0));
    }

    @Test
    public void testIfAverageIsCorrect(){
        assertEquals(90, newStudent.getGradeAverage(), 0);
        assertEquals(80, studentWithManyGrades.getGradeAverage(), 0);
    }
}
