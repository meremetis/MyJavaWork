package gr.aueb.elearn.chapter12;

import java.util.Random;

/**
 * The Point class represents <i>points</i> in a two-dimension space, were
 * <b>x</b> and <b>y</b>
 * coordinates are considered intigers.All points,
 * suc as (0, 0) or (5, 74) could be implemented as
 * instances of this class
 */
public class Point {
    private int x;
    private int y;


    public Point() {
    }


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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


    /**
     * Static factory method
     *
     * @return a new Point (0,0) instance.
     */
    public static Point getInstance(){
        return new Point();
    }

    /**
     * Static factory method
     *
     * @return a new Point (0,0) instance.
     */
    public static Point getRandomPoint(){
        Random r = new Random();
        return new Point(r.nextInt(), r.nextInt());
    }
}
