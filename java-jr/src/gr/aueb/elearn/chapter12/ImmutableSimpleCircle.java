package gr.aueb.elearn.chapter12;

public class ImmutableSimpleCircle {
    private  final SimplePoint center;
    private final int radius;

    public ImmutableSimpleCircle() {
        center=null;
        radius=0;

    }



    public ImmutableSimpleCircle(SimplePoint center, int radius) {
        //this.center = center;
        //kanoume deepcopy
        this.center = new SimplePoint();
        this.center.setX(center.getX());
        this.center.setY(center.getY());


        this.radius = radius;
    }

    public SimplePoint getCenter() {
        return (new SimplePoint(center.getX(), center.getY()));
    }

    public int getRadius(){
        return radius;
    }
}
