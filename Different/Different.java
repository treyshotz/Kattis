import java.util.Scanner;

public class Different {
    
    public static Scanner s = new Scanner(System.in); 
    public static void main(String[] args) {
        while(s.hasNextLong()) {
            long a = s.nextLong();
            long b = s.nextLong();
            System.out.println(Math.abs(a-b));
        }
    }
    
}