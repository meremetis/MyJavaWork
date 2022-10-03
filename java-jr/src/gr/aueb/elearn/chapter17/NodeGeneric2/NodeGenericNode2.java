package gr.aueb.elearn.chapter17.NodeGeneric2;

public class NodeGenericNode2 {
    public static void main(String[] args) {
        NodeGeneric2<Integer, String> node = new NodeGeneric2<>();

        node.setNode(12);
        node.setNode2("str");

        int data = node.getNode();
        String data2 = node.getNode2();

//        System.out.println(data);
//        System.out.println(data2);

        print(node.getNode());
        print(node.getNode2());

        print2(node);
    }

    public static<T> void print(T t)
    {
        System.out.println(t);
    }

    public static void print2(NodeGeneric2<?, ?> t)
    {
        System.out.println(t.getNode());
        System.out.println(t.getNode2());
    }
}
