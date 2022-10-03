package gr.aueb.testbed.week1.chapter12;



import java.util.Random;

public class PointXYZ {
    private int x;
    private int y;

    private int z;


    public PointXYZ() {
    }


    public PointXYZ(int x, int y,int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Gets x-coordinate
     * @return
     *      the values of x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Sets x-coordinate
     * @param x
     *      the x-coordinate.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets y-coordinate
     * @return
     *      the values of y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Sets y-coordinate
     * @param y
     *      the y-coordinate.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Returns the state of this point.
     * @return
     *      the x and y coordinates transformed into String (x,y)
     */
    public String pointToString()
    {
        return "Point x: " + x + "\t" + " Point y: " + y + "\t";
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    /**
     * Static factory method
     *
     * @return a new Point (0,0) instance.
     */
    public static PointXYZ getInstance(){
        return new PointXYZ();
    }

    /**
     * Static factory method
     *
     * @return a new Point (0,0) instance.
     */
    public static PointXYZ getRandomPoint(){
        Random r = new Random();
        return new PointXYZ(r.nextInt(100- -100) + -100, r.nextInt(100- -100) + -100, r.nextInt(100- -100) + -100);
    }

    public  String convertToString(){
        return "(" + x + " ," + y +" , "+z+" )";
    }
}
