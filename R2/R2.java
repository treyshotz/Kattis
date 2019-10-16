import java.util.Scanner;

public class R2 {
    public static void main(String [] args) {
        Scanner  s = new Scanner(System.in);

        int r = s.nextInt();
        int S = s.nextInt();
        int ans = (2*S) - r;
        System.out.println(ans);
    }
}