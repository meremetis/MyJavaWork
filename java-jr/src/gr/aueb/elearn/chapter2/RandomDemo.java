package gr.aueb.elearn.chapter2;

/**
 * xrhsimopoiei thn Math.rabdom(); pou paragei tuxeous
 * dekadikous arithmous metaksi 0 - 0.9,
 * dhladh, 0 <= randomNum < 1, gia na mad dwsei
 * tuxaies times metaksi 1-6, opos ena zari
 */
public class RandomDemo {
    public static void main(String[] args) {
        int die =  (int) (Math.random() *6)+1;
        System.out.println(die);
    }
}
