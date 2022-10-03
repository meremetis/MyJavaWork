package gr.aueb.elearn.chapter12;

import java.util.Random;

/**
 * The Flyweight class is an instance - controled class, that
 * allows only two instances of specific points to be created .
 * a ZEro-point instance and random-point instace (thus the value of the random instance is always the same)
 *Is is also implements the Flyweight pattern since two zero points p1,p2
 * are equal if and only id p1==p2
 */
public class FlyweightPoint {
    private int x;
    private int y;

    private static final FlyweightPoint ZERO = new FlyweightPoint();

    private static final FlyweightPoint RDM = new FlyweightPoint(System.currentTimeMillis());

    private FlyweightPoint(){};
    private FlyweightPoint(long seed){
        Random r = new Random(seed);
        this.x= r.nextInt();
        this.y= r.nextInt();
    };

    public static FlyweightPoint getZeroPoint(){
        return ZERO;
    }

    public static FlyweightPoint getRandomPoint(){
        return RDM;
    }

    public String pointToString(){
        return "(" + x + "," + y + ")";
    }

}
