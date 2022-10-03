package gr.aueb.elearn.chapter8;

import java.io.IOException;

public class ExceptionsRead {
    public static void main(String[] args) throws IOException {
        char c = (char) System.in.read();
        System.out.println(c);
    }
}
