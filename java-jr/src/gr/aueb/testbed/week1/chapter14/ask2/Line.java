package gr.aueb.testbed.week1.chapter14.ask2;

public class Line extends AbstractShape implements ILine {
    private double length;

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public long getId() {
        return super.getId();
    }
}
