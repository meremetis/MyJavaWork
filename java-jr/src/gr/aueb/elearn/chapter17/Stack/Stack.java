package gr.aueb.elearn.chapter17.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;

public class Stack <T>{
    private final Deque<T> stack;

    public Stack()
    {
        stack = new ArrayDeque<>(); // ilopihsh me statikh domh -- pinaka//borw na to kanw kai LinkedList()
    }

    public Stack(Deque<T> stack) {
        this.stack = stack;
    }

    public Deque<T> getStack() {
        return new ArrayDeque<>(stack);//giati einai mutable
    }

    public boolean isEmpty()
    {
        return stack.size() == 0;
    }

    public void stackPush(T t)
    {
        if (t == null) return;
        stack.push(t);
    }

    public T stackPop()
    {
        if (!stack.isEmpty())
        {
            return stack.pop() ;
        }
        else return null;
    }

    public void forEach(Consumer<T> action)
    {
        stack.forEach(action);
    }
}
