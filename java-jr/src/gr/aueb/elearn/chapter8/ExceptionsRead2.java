package gr.aueb.elearn.chapter8;

import java.io.IOException;

public class ExceptionsRead2 {
    public static void main(String[] args) {
        try {
            char c = (char)System.in.read();
            System.out.println(c);
        }catch (IOException e){
            System.out.println(e.getMessage() );
        }
    }
}
