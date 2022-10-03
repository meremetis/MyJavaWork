package gr.aueb.elearn.chapter13;
//private metavlith kai constructor den klironomite

//borei na alaksei thn ilopiish h extednds class me override

//supper dikths opos o this
//dixnei sto apo panw instance
public class Point2S extends Point{
    private double y;

    public Point2S(){};
    public Point2S(double y) {
        this.y = y;
    }

    public Point2S(double x, double y) {
//        super();
        //        super.setX();

        super(x);

        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

//    @Override
//    public String pointToString() {
//        return "(" + getX() + " " + y + ")";
//    }

    @Override
    public String toString() {
        return "(" + getX() + " " + y + ")";
    }

    @Override
    protected void reset() {
        super.reset();
        y = 0;
    }

    public void move(double x, double y){
        super.move(x);
        this.y += y;
    }
}
