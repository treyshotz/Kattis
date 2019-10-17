import java.util.*;



//This project is not finished
public class Phd {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        
        int count = s.nextInt();
        System.out.println(count);

        for(int i = 0; i < count; i++) {
            int num1 = s.next();
            System.out.println("Num1 " + num1);

            String sign = s.next();
            int num2 = s.nextInt();
            System.out.println("Sign " + sign);
            System.out.println("Num2 " + num2);
        }
    }
}