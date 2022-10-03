package gr.aueb.elearn.chapter16.clonable;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        City athens = new City("Athens");
        City clonedAthens = athens.clone();

        Trainee alice = new Trainee("Alice", athens);
        Trainee clonedAlice = alice.clone();
        clonedAlice.setCity(new City("volos"));

        clonedAthens.setDescription("Athens2");

        System.out.println(alice);
        System.out.println(clonedAlice);
    }
}
