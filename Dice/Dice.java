import java.util.*;

public class Dice {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < 4; i++) {
            int number1 = s.nextInt();
            sum1 += number1;
        }
        for(int j = 0; j < 4; j++) {
            int number2 = s.nextInt();
            sum2 += number2;
        }

        if(sum1 > sum2) {
            System.out.println("Gunnar");
        }
        else if(sum2 > sum1) {
            System.out.println("Emma");
        }
        else{
            System.out.println("Tie");
        }
    }
}