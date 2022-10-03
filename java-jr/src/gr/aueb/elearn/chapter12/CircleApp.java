package gr.aueb.elearn.chapter12;

public class CircleApp {

    public static void main(String[] args) {
        SimplePoint center = new SimplePoint(1,1);
        Circle circle = new Circle(center, 10);

        System.out.println(circle.convertToString());
    }
}
