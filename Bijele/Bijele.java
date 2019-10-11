import java.util.Scanner;

class Bijele {

    static Scanner s = new Scanner(System.in);

    public static void main(String [] args ) {

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        int f = s.nextInt();
        System.out.println(checker(a, b, c, d, e, f));

    }

    static String checker(int a, int b, int c, int d, int e, int f) {
        int resA = 1 - a;
        int resB = 1 - b;
        int resC = 2 - c;
        int resD = 2 - d;
        int resE = 2 - e;
        int resF = 8 - f;
        return resA +" "+ resB +" "+ resC +" "+ resD +" "+ resE +" "+ resF;
    }
}