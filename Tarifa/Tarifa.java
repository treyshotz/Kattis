import java.util.Scanner;

public class Tarifa {

    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);

        int data = s.nextInt();
        int month = s.nextInt();
        int sum = 0;
        
        for(int i = 0; i < month; i++) {
            int subtract = s.nextInt();
            sum += data - subtract;
            //System.out.println("Sum" + sum);
        }
        sum += data;
        System.out.println(sum);
    }
}