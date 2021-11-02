package JAVA.FILE_HANDLING;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyFile {
     public static void main(String[] args) {
         try{
            File source = new File("JAVA/FILE_HANDLING/file_output_stream.txt");
            File destination = new File("JAVA/FILE_HANDLING/file_output_stream_copy.txt");
            if(destination.createNewFile()){
                System.out.println("File Created At Destination path");
            }
            FileUsingChannel(source,destination);
         } catch(IOException e){
            System.out.println("exception1");
         }
     }
     public static void FileUsingChannel(File source, File destination){
        FileChannel fi = null;
        FileChannel fo = null;
        try{
            fi = new FileInputStream(source).getChannel();
            fo = new FileOutputStream(destination).getChannel();
            fo.transferFrom(fi, 0, fi.size());
            System.out.println(fo.position());

        }catch(IOException e){
           System.out.println("exception2");
        }
     }

    public static void fileCopyStream(File source, File destination) {
         FileInputStream fi = null;
         FileOutputStream fo = null;
         try{
             fi = new FileInputStream(source);
             fo = new FileOutputStream(destination);
             int length;
             byte b[] = new byte[1024];
            while((length = fi.read(b)) > 0){
                fo.write(b,0,length);
            }
         }catch(IOException e){
            System.out.println("exception2");
         }
    }

}
