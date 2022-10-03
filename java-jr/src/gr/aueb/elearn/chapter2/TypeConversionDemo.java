package gr.aueb.elearn.chapter2;

/**
 * metatrepei metaksei diaforetikwn
 * tupwn akerewn (typecast)
 * @meremetis
 */
public class TypeConversionDemo {

    public static void main(String[] args) {
        long myLong = 200_000_000_000L;
        int myInt1 = 5;
        long myLong2;
        int myInt2 = 30;
        myLong2 = myInt2;//automato typecast apo mikrotero se megaliteros apo 32 se 64 bit

        myInt1 = (int) myLong; //type cast rito apo long se int apo 64 se 32

        System.out.println(myLong2);
        System.out.println(myInt1);
    }
}
