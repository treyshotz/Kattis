import java.util.Scanner;

class Hacks {

    public static Scanner s = new Scanner(System.in);

    public static void main(String [] args) {
        int count = s.nextInt();

        for(int i = 0; i < count; i++) {
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(worthIt(a, b, c));
        }
    }

    static String worthIt(int a, int b, int c) {
        int profit = b - c;
        //System.out.println("Profit: " + profit);
        if(a < profit) {
            return "advertise";
        }
        else if(a == profit) {
            return "does not matter";
        }
        else return "do not advertise";
    }
}