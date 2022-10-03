package gr.aueb.elearn.chapter2;

/**
 * ektipwnei ta panw kai kaw oria twn tipwn
 * akerewn, int, long, short, byte.
 * @author meremetis
 */
public class IintLimitsDemo {
    public static void main(String[] args) {
        System.out.printf("type: %s, size: %,d bits, min: %,d, max: %,d \n",Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE );
        System.out.printf("type: %s, size: %,d bits, min: %,d, max: %,d \n",Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE );
        System.out.printf("type: %s, size: %,d bits, min: %,d, max: %,d \n",Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE );
        System.out.printf("type: %s, size: %,d bits, min: %,d, max: %,d \n",Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE );

    }
}
