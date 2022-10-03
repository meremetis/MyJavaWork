package gr.aueb.elearn.chapter13;

public class Point3d  extends Point2S{
    private double z;

    public Point3d(double z){
        this.z = z;
    }

    public Point3d(double y, double z) {
        super(y);
        this.z = z;
    }

    public Point3d(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" +getX() + " , " + getY() + " , "+z+")";
    }

//    @Override
//    public String pointToString() {
//        return "(" +getX() + " , " + getY() + " , "+z+")";
//    }

    @Override
    protected void reset() {
        super.reset();
        z = 0;
    }
    public void move(double x, double y, double z){
        super.move(x,y);
        this.z += z;
    }
}
