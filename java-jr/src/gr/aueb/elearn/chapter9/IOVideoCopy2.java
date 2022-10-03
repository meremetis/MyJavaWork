package gr.aueb.elearn.chapter9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * antigrafei ena arxio video
 * ypologizei to xrono antigrafhs
 * xrisimopiei FileInputStream
 * kai FileOutputStream diavazodas kai grafodas 8192
 * = 8kBytes thn fora
 */
public class IOVideoCopy2 {
    public static void main(String[] args) throws java.io.IOException {
        int b;
        int count = 0;
        byte[] buf = new byte[8192];



        try (FileInputStream in = new FileInputStream("c:/temp/video1.mp4");
             FileOutputStream out = new FileOutputStream("c:/temp/video2.mp4");)
        {
            long start = System.nanoTime();
            //antigrafh arxiou
            while ((b = in.read(buf)) != -1)
            {
                out.write(b);
                count++;
            }
            long end = System.nanoTime();
            long elapsed = end - start;

            System.out.printf("to arxio me megethos %d kbytes (5d bytes) antigrafike",count/1024, count);
            System.out.printf("Time: %.2f", elapsed / 1_000_000_000.0);
        }
    }
}
