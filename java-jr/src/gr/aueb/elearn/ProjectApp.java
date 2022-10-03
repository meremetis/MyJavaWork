package gr.aueb.elearn;

import gr.aueb.elearn.model.Point;
import static java.lang.Math.*;

public class ProjectApp {

    public static void main(String[] args) {


       Point p1 = new Point();
       Point p2 = new Point(12,800);
       Point p3 = new Point(48,120);



        p1.setX(10);
        p1.setY(100);

        System.out.println(p1.pointToString());
        System.out.println(p2.pointToString());
        System.out.println(p3.pointToString());

    }
}
