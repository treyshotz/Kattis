import java.util.*;

//2
//6 5.0000
//2 3.1222


class Heartrate {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        
        for(int i = 0; i < count; i++) {
            int b = s.nextInt();
            double t = s.nextDouble();
            double min = (60*(b/t))-(60/t);
            double avg = (60*(b/t));
            double max = (60*(b/t))+(60/t);
            System.out.println(min + " " + avg + " " + max);
        }

    }
}
