package gr.aueb.elearn.chapter17.NodeMeObjectDenDuleveiEpitides;

public class Main {
    public static void main(String[] args) {
        Node head = new Node();
        head.setItem("hello");
        int data = (int) head.getItem();

        System.out.println(data);
    }
}
