package gr.aueb.elearn.chapter11;

public class StudentDriver {
    public static void main(String[] args) {
        Student alice = new Student();
        Student bob = new Student(2, "Bob", "Marley");

        alice.setId(1);
        alice.setFirstname("alice");
        alice.setLastname("wonderland");

        System.out.println("ID: "+alice.getId());
        System.out.println("First Name: "+alice.getFirstname());
        System.out.println("Last Name: "+alice.getLastname());

        System.out.println("ID: "+bob.getId());
        System.out.println("First bob: "+alice.getFirstname());
        System.out.println("Last bob: "+alice.getLastname());

        System.out.println(Student.getStudentCount());
    }
}
