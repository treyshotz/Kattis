import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Avion {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;

        for(int i = 1; i < 6; i++) {
            String line = s.nextLine();
            if(line.contains("FBI")) {
                //System.out.println("Ja");
                result.add(i);
                count++;
            }
        }
        if(count > 0) {
            String list = result.toString() .replace(",", "").replace("[", "").replace("]", "") ;
            System.out.println(list);
        }
        else{
            System.out.println("HE GOT AWAY!");
        }
    }
}