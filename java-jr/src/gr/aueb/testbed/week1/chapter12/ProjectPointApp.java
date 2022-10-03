package gr.aueb.testbed.week1.chapter12;

import gr.aueb.elearn.chapter12.Point;

public class ProjectPointApp {
    public static void main(String[] args) {
        PointXYZ p1 = new PointXYZ();
        PointXYZ p2 = new PointXYZ(4,6,7);
        PointXYZ p3 = PointXYZ.getRandomPoint();


        System.out.println(p1.convertToString());
        System.out.println(p2.convertToString());
        System.out.println(p3.convertToString());





    }
}
