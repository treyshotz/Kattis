import java.util.*;

class Taisformula {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        
        double sum = 0;
        double preSec = 0;
        double preVal = 0;
        for(int i = 0; i < count; i++) {
            double sec = s.nextDouble();
            double val = s.nextDouble();

            if(i == 0) {
                preSec = sec;
                preVal = val;
            }
            else {
                sum += ((preVal + val) / 2) * ((sec-preSec) /1000);
                double sumVal = (preVal + val)/2;
                //System.out.println("Val " + val + " preVal " + preVal);
                //System.out.println(sumVal);
                preSec = sec;
                preVal = val;
            }
        }
        System.out.println(sum);
    }
}