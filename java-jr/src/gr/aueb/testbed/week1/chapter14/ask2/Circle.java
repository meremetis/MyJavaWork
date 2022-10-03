package gr.aueb.testbed.week1.chapter14.ask2;

public class Circle extends AbstractShape implements ICircle{
    private double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }


    @Override
    public double getDiameter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public long getCircumference() {
        return 0;
    }
}
