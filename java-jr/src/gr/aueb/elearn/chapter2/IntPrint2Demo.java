package gr.aueb.elearn.chapter2;

/**
 * calculates and prints the sum of i , j
 *
 * @author meremetis
 */
public class IntPrint2Demo {
    public static void main(String[] args) {
        int i = 10;
        int j = 5;
        int sum = 0;

        sum = i + j;

        System.out.println("to athrisma twn " + i + "kai" + j + " eiani: " + sum + ".");
        System.out.printf("to athrisma twn %d kai %d einai: %d.%n", i, j, sum);//%n gia alagh gramhs se ola ta sistimata // gia alagh gramhs sto stanr input /n

    }
}
