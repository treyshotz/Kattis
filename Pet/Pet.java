import java.util.Scanner;

public class Pet {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        
        int best = 0;
        int bestsum = 0;

        for(int i = 1; i <6; i++) {
            int daysum = 0;
            for(int j = 0; j < 4; j++) {
                int num = s.nextInt();
                daysum += num;

            }
            //System.out.println("Daysum " + i + " " + daysum);
            if(daysum > bestsum) {
                best = i;
                bestsum = daysum;
            }
        }
        System.out.println(best + " " + bestsum);
    }
}