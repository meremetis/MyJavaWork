package gr.aueb.elearn.chapter2;

/**
 * Prints intifers and text
 *
 * @author thanos
 * @version 0.1
 */
public class IntPrintDemo {
    public static void main(String[] args) {
        int i = 12;

        System.out.print(i + "\n");
        System.out.println(i);
        System.out.printf("%d ", i);

        System.out.print("h timh tou i einai : " + i);
        System.out.println("h timh tou i einai : " + i);
        System.out.printf("h timh tou i einai : %d " , i);

    }
}
