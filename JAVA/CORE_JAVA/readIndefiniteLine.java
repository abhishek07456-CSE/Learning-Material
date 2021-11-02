import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readIndefiniteLine{
    public static void main(String[] args) {
        // Scanner read = new Scanner(System.in); // from input
        String k;
        //has next check input is available or not
        File f = new File("./inputStream.txt");
        try {
            Scanner read = new Scanner(f); // from input
            while(read.hasNextLine()){
                k = read.nextLine();
                System.out.println(k);
            }
        } catch (FileNotFoundException ex) {
            System.out.print("file not found");
        }
    }
}