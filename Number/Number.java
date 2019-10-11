import java.util.Scanner;


class Number{
    public static Scanner s = new Scanner(System.in);
    
    public static void main(String []args) {
        int count = s.nextInt();
        double a = 0;  
        double b = 0;
        double c = 0;

        //System.out.println("Count " + count);
        for(int i = 0; i < count; i++) {
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        //System.out.println("a: " + a + "b: " + b + "c: " + c);
        System.out.println(calculate(a, b, c));
        }
    }

    static String calculate(double a, double b, double c){
        String result = "Impossible";

        if((a + b) == c ){
            //System.out.println("Pluss");
            return "Possible";
        }
        else if((a - b) == c || (b - a) == c) {
            //System.out.println("Minus");
            return "Possible";
        }
        else if((a * b) == c) {
            //System.out.println("Gange");
            return "Possible";
        }
        else if((a / b) == c || (b / a) == c) {
            //System.out.println("Dele");
            return "Possible";
        }
        else return result;
    }
}