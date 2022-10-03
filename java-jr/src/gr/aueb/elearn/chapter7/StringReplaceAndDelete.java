package gr.aueb.elearn.chapter7;

public class StringReplaceAndDelete {
    public static void main(String[] args) {
        String s = "Java - AUEB";

        s = s.replace("-", "*");
        System.out.println(s);

        s = s.replace("*","");
        System.out.println(s);
    }
}
