import java.util.Scanner;

class Speed {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int n = 0;
        for(int i = 0; i < t; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int tot = b - n;
            n = tot;
        }
    }
}