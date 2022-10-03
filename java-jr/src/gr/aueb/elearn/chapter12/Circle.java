package gr.aueb.elearn.chapter12;

public class Circle {
    private SimplePoint center;
    private int radius;

    public Circle(){};

    public Circle(SimplePoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public SimplePoint getCenter(){
        return center;
    }

    public void setCenter(SimplePoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String convertToString()
    {
        return "center: "+center.pointToString()+" radius" + radius;
    }
}
