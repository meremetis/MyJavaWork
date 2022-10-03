package gr.aueb.elearn.chapter17.Stack;

import java.util.Deque;
import java.util.LinkedList;

public class MainQueue {
    public static void main(String[] args) {
        Queue<String> myQueue = new Queue<>();

        myQueue.enQueue("red car");
        myQueue.enQueue("green car");
        myQueue.enQueue("blue car");


        String car = myQueue.deQueue();

        System.out.println("First car in queue" + car);
        System.out.println("next income car" );

        myQueue.forEach(System.out::println);
    }
}
