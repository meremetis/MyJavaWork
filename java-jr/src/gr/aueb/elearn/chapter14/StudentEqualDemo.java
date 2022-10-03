package gr.aueb.elearn.chapter14;

public class StudentEqualDemo {
    private final static Student[] students = new Student[]{
            new Student(1,"alice","wonderland"),
            new Student(2,"bob","Dylan"),
            new Student(3,"Bob","marley"),
            new Student(4,"Cathrin","D")

    };

    public static void main(String[] args) {
//

        printStudent(students, (student) -> student.getId() == 2);
    }

    public static void printStudent(Student[] students, IDEqualChecker idEqualChecker)
    {
        for (Student studentt : students){
            if (idEqualChecker.checkEqualId(studentt)){
                System.out.println(studentt);
            }
        }
    }
}
