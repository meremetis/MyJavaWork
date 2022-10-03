package gr.aueb.elearn.chapter17.NodeGeneric2;

public class NodeGeneric2<T, K> {
    private T node;
    private K node2;

    public T getNode() {
        return this.node;
    }

    public void setNode(T t) {
        this.node = t;
    }

    public K getNode2()
    {
        return this.node2;
    }

    public void setNode2(K k){
         this.node2 = k;
    }

}
