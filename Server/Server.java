import java.util.Scanner;

class Server {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int tasks = s.nextInt();
        int time = s.nextInt();
        int sum = 0;
        int i;

        for(i = 0; i < tasks; i++) {
            int task1 = s.nextInt();
            if(sum+task1 > time) {
                break;
            }
            else {
                sum += task1;
            }
        }
        System.out.println(i);
    }
}