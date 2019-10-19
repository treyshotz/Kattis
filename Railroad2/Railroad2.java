import java.util.*;

class Railroad2 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int sum = (x*4) + (y*3);
        if(sum %2 == 0) {
            System.out.println("possible");
        }
        else {
            System.out.println("impossible");
        }
    }
}