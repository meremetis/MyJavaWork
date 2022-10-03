package gr.aueb.elearn.chapter13;

public class InstanceofDemo {
    private static final Point[] points;

    static {
        points = new Point[] { new Point(1), new Point2S(2,3), new Point3d(5,6,7)};
    }

    public static void main(String[] args) {

        for (Point point : points)
        {
            if (point instanceof Point)
            {
                System.out.println("point: " +point.getClass().getSimpleName());
            }

            if (point instanceof Point2S){
                System.out.println("point2d: " +point.getClass().getSimpleName());
            }

            if (point instanceof Point3d){
                System.out.println("point3d: " +point.getClass().getSimpleName());
            }
            System.out.println();
        }
    }

}
