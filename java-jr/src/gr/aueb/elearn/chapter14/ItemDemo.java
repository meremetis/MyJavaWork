package gr.aueb.elearn.chapter14;

public class ItemDemo {

    public static void main(String[] args) {
        Iitem book = new book();
        Iitem cd = new CompactDisk();

        deliver(book);
        deliver(cd);
    }
    public static void deliver(Iitem item){
        if (item instanceof book){
            System.out.println(item);
            System.out.println("book");
        }else if (item instanceof CompactDisk){
            System.out.println(item);
            System.out.println("item");
        }
        else {
            throw new AssertionError(item);
        }
    }

}
