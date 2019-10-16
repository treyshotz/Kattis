import java.util.Scanner;
import java.util.Calendar;

public class Datum {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int date = s.nextInt();
        int month = s.nextInt();


        String input_date="01/08";
        SimpleDateFormat format1=new SimpleDateFormat("d/M");
        Date dt1=format1.parse(input_date);
        DateFormat format2=new SimpleDateFormat("EEEE"); 
        String finalDay=format2.format(dt1);
        System.out.println(finalDay);
    }
}