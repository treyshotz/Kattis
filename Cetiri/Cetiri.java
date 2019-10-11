import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class Cetiri {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        boolean similar = true;
        while(true) {
            int n = s.nextInt();
            list.add(n);
            System.out.println("list: " + list);
            int length = list.size();
            System.out.println("length: " + length);
            if(length > 2) {
                Collections.sort(list);
                int different = list.get(1) - list.get(0);
                int different1 = list.get(1) - list.get(2);
                System.out.println("Differanse1: " + different + " Differanse 2: " + different1);
                if(different < different1) {
                    similar = false;
                }
                else if(different1 < different) {
                    different = different1;
                    similar = false;
                }
                int first = list.get(0);
                list2.add(first);
                System.out.println("Differansen : " + different);

                if(similar =! true) {
                    for(int l = 0; l < 3; l++){
                        
                    }
                }
                else {
                    for(int i = 0; i < 3; i++) {
                        int next = first + different;
                        first = next;
                        list2.add(next);
                        System.out.println("list2: " + list2);
                    }
                }
                System.out.println("hei");
                if(list2.get(3) == 0) {
                    int minus = list2.get(0);
                    //System.out.println(minus - different);
                    break;
                }
              
                else {
                list2.removeAll(list);
                int output = list2.get(0);
                //String finale = new String(list2.get(0));
                System.out.println(output);
                break;
                }
            }

        }
    }
}