package gr.aueb.elearn.chapter9;

import java.io.*;

public class IOVideoCopy3 {
    public static void main(String[] args) throws java.io.IOException {
        int b;
        int count = 0;
        byte[] buf = new byte[8192];



        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("c:/temp/video1.mp4") );
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("c:/temp/video2.mp4")))
        {
            long start = System.nanoTime();
            //antigrafh arxiou
            while ((b = in.read(buf, 0, buf.length)) != -1)
            {
                out.write(buf, 0, b);
                count+= b;
            }
            long end = System.nanoTime();
            long elapsed = end - start;

            System.out.printf("to arxio me megethos %d kbytes (5d bytes) antigrafike",count/1024, count);
            System.out.printf("Time: %.2f", elapsed / 1_000_000_000.0);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
