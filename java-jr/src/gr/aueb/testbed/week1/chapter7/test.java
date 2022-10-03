package gr.aueb.testbed.week1.chapter7;
import java.lang.StringBuilder;
public class test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb.append("This ");
        sb.append("is ");
        sb.append("AUEB");
        for (int i = 0; i <sb.length() ; i++) {
            sb2.append((int)sb.charAt(i));
        }
        //sb2.trim();

        System.out.println(sb);
        System.out.println(sb2);

    }
}
