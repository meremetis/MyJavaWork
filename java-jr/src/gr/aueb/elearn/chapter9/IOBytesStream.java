package gr.aueb.elearn.chapter9;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * to programa euto adigrafei ena arxeio eikonas
 * kai tautoxrona ipologizei to megethos tou arxeiou
 * pou adegrapse
 */
public class IOBytesStream {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("c:/temp/image1.jpg");
             FileOutputStream out = new FileOutputStream("c:/temp/image2.jpg");)
        {
                int b;
                int count = 0;
                while ((b = in.read()) != -1)
                {
                    out.write(b);
                    count++;
                }
            System.out.printf("to arxio me megethos %d kbytes (5d bytes) antigrafike",count/1024, count);
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
