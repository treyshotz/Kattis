import java.util.*;

class Fizzbuzz {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int n = s.nextInt();

        for(int i = 1; i < n+1; i++) {

            if(i % x == 0) {
                if(i % x == 0 && i % y == 0) {
                    System.out.println("FizzBuzz");
                }
                else {
                    System.out.println("Fizz");
                }
            } 
            else if(i % y == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }

    }
}