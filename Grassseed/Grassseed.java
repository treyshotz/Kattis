import java.util.*;

class Grassseed {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        double cost = s.nextDouble();
        double count = s.nextDouble();
        double sum = 0;
        for(int i = 0; i < count; i++) {
            double x = s.nextDouble();
            double y = s.nextDouble();
            sum += (x*y)*cost;
            
        }
        System.out.println(sum);
    }
}