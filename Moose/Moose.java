import java.util.*;

public class Moose {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int second = s.nextInt();
        int biggest = 0;
        if(first < second) {
            biggest = second;
        }
        else {
            biggest = first;
        }
        if( biggest == 0) {
            System.out.println("Not a moose");
        }
        else if(biggest*2 == (first + second)) {
            System.out.println("Even " + (first+second));
        }
        else {
            System.out.println("Odd " + (biggest+biggest));
        }
    }
}