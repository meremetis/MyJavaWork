package gr.aueb.elearn.chapter11;

/**
 * Student POJO class , Java Bean
 */
public class Student {
    private static int studentCount = 0 ;

    private int id;
    private String firstname;
    private String lastname;

    public Student() {
        studentCount++;
    }

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(String firstname) {
        this.firstname = firstname;
    }


    public static int getStudentCount() {
        return studentCount;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
