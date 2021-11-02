import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException; 


class date_format{
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY HH:mm:s a");
        System.out.println(df.format(new Date()));

         String s = "10/18/1998";
         df = new SimpleDateFormat("MM/dd/yyyy");
         Date date = df.parse(s);
         df = new SimpleDateFormat("E MM f");

         System.out.println(df.format(date));


    }
}