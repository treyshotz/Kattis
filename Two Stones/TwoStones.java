import java.util.Scanner;

public class TwoStones {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);

        int number = s.nextInt();

        if(number % 2 == 0) {
            System.out.println("Bob");
        }
        else {
            System.out.println("Alice");
        }
    }
}