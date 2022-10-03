package gr.aueb.elearn.chapter13;

public class Main {
    public static void main(String[] args) {
//        Point p1 = new Point(1);
//        Point2S p2 = new Point2S(2,3);
//        Point3d p3 = new Point3d(4,5,6);
        Point p1 = new Point2S(1,6);
        Point p2 = new Point2S(2,3);
        Point p3 = new Point3d(4,5,6);

        p1.reset();
        p2.reset();
        p3.reset();

        ( (Point2S) p1).move(1,2);//checkk here downcast
//        p1.move(2D);
//        p2.move(9, 12);
//        p3.move(5,7,2);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        makeReset(p1);

        makeReset(p2);

        makeReset(p3);

        printPoint(p1);
        printPoint(p2);
        printPoint(p3 );
    }
    //polimorfikh methodos borei na parei points apo oles tis ierarxies
    public static void makeReset(Point point)
    {
        point.reset();
    }

    public static void printPoint(Point point)
    {
        System.out.println(point.toString());
        //System.out.println(point);
    }



}
