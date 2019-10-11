import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Lineup2 {
    static Scanner s = new Scanner(System.in);

    public static void main(String [] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();
        int count = s.nextInt();
        for(int i = 0; i < count; i++) {
            String word = s.next();
            list.add(word);
            list2.add(word);
            list3.add(word);
        }

        //Collections.sort(list);
        //Collections.sort(list);
        Collections.sort(list2);
        Collections.sort(list3);
        Collections.reverse(list3);

        //System.out.println("list1 " + list);
        //System.out.println("list2 " + list2);
        //System.out.println("list3 " + list3);
        


        boolean increasing = list.equals(list2);
        boolean decreasing = list.equals(list3);
    
        //System.out.println("increasing " + increasing);
        //System.out.println("decreasing " + decreasing);

        if(increasing == true){
            System.out.println("INCREASING");
        }
        else if(decreasing == true) {
            System.out.println("DECREASING");
        }
        else {
            System.out.println("NEITHER");
        }

        /*if(List.equals(Decrease)) {
            System.out.println("DECREASE");
        }
        else if(List.equals(Increase)) {
            System.out.println("INCREASE");
        }
        else{
            System.out.println("NEITHER");
        }*/

    }
}