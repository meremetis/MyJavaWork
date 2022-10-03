package gr.aueb.elearn.chapter14.shape;

public class Circle extends Shape{

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius;
    }
}
