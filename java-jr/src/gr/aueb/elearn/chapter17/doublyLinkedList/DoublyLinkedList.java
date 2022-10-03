package gr.aueb.elearn.chapter17.doublyLinkedList;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public DoublyLinkedList()
    {
        head = tail = null;
    }


    /**
     * inserts a node in the list at front
     * time complexity
     * @param t
     */
    public void insertFront(T t)
    {
        Node<T> nodeToBeInserted = new Node<T>();
        nodeToBeInserted.setValue(t);
        nodeToBeInserted.setPrev(null);
        nodeToBeInserted.setNext(head);


//        if (head != null)
        if(!isEmpty())
        {
            nodeToBeInserted.getNext().setPrev(nodeToBeInserted);
        }else
        {
            tail = nodeToBeInserted;
        }

        head = nodeToBeInserted;
    }

    /**
     * inserts a node in the list at end
     * time complexity 0(1)
     * @param t
     */

    public void insertEnd(T t)
    {
        Node<T> nodeToBeInserted = new Node<T>();
        nodeToBeInserted.setValue(t);
        nodeToBeInserted.setNext(null);
        nodeToBeInserted.setPrev(tail);



//        if (nodeToBeInserted.getPrev() == null)

        if (isEmpty())
        {
            head = nodeToBeInserted;
        }else
        {
            nodeToBeInserted.getPrev().setPrev(nodeToBeInserted);
        }

        tail = nodeToBeInserted;
    }

    /**
     * deletes the first node in the list
     * Time Complecity is 0(1)
     */
    public void deleteFront()
    {
        if (isEmpty()) return;

        if(head.getNext() == null)
        {
            head = tail = null;
        }else
        {
            head = head.getNext();
            head.setPrev(null);
        }
    }


    /**
     * deletes the last node in list
     * time complexity is o(1)
     */
    public void deletEnd()
    {
        if (isEmpty()) return;

        if(head.getNext() == null)
        {
            head = tail = null;
        }
        else
        {
            tail = tail.getPrev();
            tail.setNext(null);
        }
    }

    /**
     * Searches for a node in the list with a for
     *
     * mas ta xalaei sthn anazitish
     *
     * time complexity is linear
     * @param t the node to search
     * @return a reference to the node if exists
     *           null otherwise
     */
    public Node<T> get(T t)
    {
        for (Node<T> n = head;n != null; n = n.getNext())
        {
            if (n.getValue().equals(t)) {
                return n;
            }
        }
        return null;
    }


    /**
     * diasxizei kai ektiponei
     *
     *
     */
    public void traverse()//time complexity 0n
    {
        for (Node<T> n = head; n !=null; n.getNext())
        {
            System.out.println(n);
        }
    }

    public boolean isEmpty()
        {
            return (head == null) && (tail == null);
        }
}
