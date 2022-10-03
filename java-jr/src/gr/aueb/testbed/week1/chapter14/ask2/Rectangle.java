package gr.aueb.testbed.week1.chapter14.ask2;

public class Rectangle extends AbstractShape implements IRectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
