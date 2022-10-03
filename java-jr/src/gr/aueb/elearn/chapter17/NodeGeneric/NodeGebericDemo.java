package gr.aueb.elearn.chapter17.NodeGeneric;

public class NodeGebericDemo {


    public static void main(String[] args) {
        NodeGeneric<Integer> item = new NodeGeneric<>();
        NodeGeneric<String> item2 = new NodeGeneric<>();

        item.setItem(1);
        item2.setItem("lol");

        int data = item.getItem();
        String data2 = item2.getItem();

        print(data);
        print(data2);
        System.out.println(data);
        System.out.println(data2);
    }


    //generic metgod
    public static<T> void print(T t)
    {
        System.out.println(t);
    }

}
