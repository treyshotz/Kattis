import java.util.Scanner;

class Time {

    static Scanner s = new Scanner(System.in);

    public static void main(String [] args) {
        int count = s.nextInt();
        for(int i = 0; i < count; i++) {
            System.out.println((i+1) + " Abracadabra");
        }
    }
}