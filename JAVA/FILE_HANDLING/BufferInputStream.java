package JAVA.FILE_HANDLING;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInputStream {
    public static void main(String[] args) {
        try{
           FileInputStream fi =new FileInputStream(new File("JAVA/FILE_HANDLING/file_output_stream.txt"));
           BufferedInputStream file = new BufferedInputStream(fi);
           long start = System.nanoTime();
           int i;
           while((i = file.read())!= -1){
             System.out.print((char)i);
           }
           long end = System.nanoTime();
           System.out.println(end-start);

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
