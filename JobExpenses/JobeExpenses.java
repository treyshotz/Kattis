import java.util.Scanner;

public class JobeExpenses {

    static Scanner s = new Scanner(System.in);

    public static void main(String [] args) {
        int count = s.nextInt();
        int sum = 0;

        for(int i = 0; i < count; i++) {
            int input = s.nextInt();
            if(input < 0 ) {
                sum += Math.abs(input);
            }

        }
        System.out.println(sum);

    }
}