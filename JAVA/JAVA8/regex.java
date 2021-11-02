package JAVA.JAVA8;

import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[a-zA-Z].*");
        System.out.println(p.matcher("a1222").matches());


        Pattern p1 = Pattern.compile("(0|91)?[6-9][0-9]{9}");

        System.out.println(p1.matcher("8353028095").matches());


    }
}
