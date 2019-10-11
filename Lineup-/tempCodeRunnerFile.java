import java.util.Scanner;
import java.lang.*;

public class Lineup {

    static Scanner s = new Scanner(System.in);

    public static void main(String [] args) {
        int count = s.nextInt();
        int last = 0;
        int increasing = 0;
        int decreasing = 0;
        if(count == 0) {
            System.exit(0);
        }
        //System.out.println("Count: " + count);
        
        for(int i = 0; i < count; i++) {
            String first = s.next().toLowerCase();
            int intFirst = first.charAt(0);
            //System.out.println("First val: " + intFirst);
            if(last == 0) {

            }
            else {
                if(last < intFirst) {
                    increasing += 1;
                }
                else if(intFirst < last) {
                    decreasing += 1;
                }
               
            }
            last = intFirst;
        }
        //System.out.println("Increasing: " + increasing);
        //System.out.println("Decreasing: " + decreasing);


        if(increasing == 0 && decreasing > 0) {
            System.out.println("DECREASING");
        }
        else if(decreasing == 0 && increasing > 0) {
            System.out.println("INCREASING");
        }
        else {
            System.out.println("NEITHER");
        }
    }
}