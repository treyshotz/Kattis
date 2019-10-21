import java.util.Scanner;
import java.util.*;

public class ICPCAwards {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 12; i++) {
            String text = s.nextLine();
            list.add(text);
        }
        System.out.println(list);
    }
}