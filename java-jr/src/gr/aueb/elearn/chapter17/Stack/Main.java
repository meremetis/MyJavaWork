package gr.aueb.elearn.chapter17.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();

        myStack.stackPush(1);
        myStack.stackPush(2);
        myStack.stackPush(3);

        int num = myStack.stackPop();

        System.out.println(num);

        myStack.forEach(System.out::println);

    }
}
