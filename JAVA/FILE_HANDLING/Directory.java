package JAVA.FILE_HANDLING;

import java.io.File;

public class Directory {
    public static void main(String[] args) {
        File file = new File("JAVA/FILE_HANDLING");
        FileUtils.
        if(file.isDirectory()){
            File list[] = file.listFiles();
            for(File f : list){
               System.out.println(f.getName());
            }
        }
    }
}
