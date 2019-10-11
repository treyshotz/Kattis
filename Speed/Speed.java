import java.util.Scanner;

class Speed {
    public static Scanner s = new Scanner(System.in);
    public static void main(String [] args) {
        while(true) {
        int t = s.nextInt();
        if(t<0) {
            System.exit(0);
        }
        else {System.out.println(result(t) + " miles");
    }
    }
    }

        static int result(int t) {
            int n = 0;
            int total = 0;
            for(int i = 0; i < t; i++){
                int a = s.nextInt();
                int b = s.nextInt();
                int tot = b - n;
                n = b;
                total += (a * tot); 
                /*System.out.println("a: "+ a);
                System.out.println("b: " + b);
                System.out.println("tot: " +tot);
                System.out.println("Total: "+total);
                System.out.println("i: " + i);
                System.out.println("t: " + t);*/
            }
        return total;
        }
}

