import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



class Cetiri2 {

    static Scanner s = new Scanner(System.in);
    static int pos1 = 0;
    static int pos2 = 0;

    public static void main(String [] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        boolean similar = true;

        while(true) {
            int n = s.nextInt();
            list1.add(n);
            int length1 = list1.size();
            if(length1 > 2 ) {
                Collections.sort(list1);

                for(int i = 0; i < 3 ; i++) {
                    int number = list1.get(i);
                    list2.add(number);
                }


                int different = lengthChecker(list1);
                //System.out.println("Different: " + different);
                //System.out.println("List1: "+list1 + " List2: " +list2);

                if(differentChecker(list1, different) != true) {
                    list1.add(pos2, list1.get(pos2 -1) + different);
                    System.out.println(missing(list1, list2));
                    break;
                }
                else {
                    int lastNumber = list1.get(2) + different;
                    System.out.println(lastNumber);
                    break;
                }

            }

        }
    }

    static int lengthChecker(ArrayList<Integer> list1){
        /*int different1 = 0;
        int different2 = 0;
        int lowestDifferent = 0;*/

        int best = Math.min(list1.get(1) - list1.get(0), list1.get(2) - list1.get(1));


        /*for(int i = 0; i < list1.size()-1; i++) {
            different1 = (list1.get(i+1) - list1.get(i));
            if(i>0) {
                if(different2 != different1) {
                    System.out.println("They are not the same");
                    System.out.println("Between " + i + " and " + (i+1));
                    if(different2 < different1) {
                        lowestDifferent = different2;
                        return lowestDifferent;
                    }
                    else if(different1 < different2) {
                        lowestDifferent = different1;
                        return lowestDifferent;
                    }
                }
            }
            different2 = different1;
        }*/
        return best;
    }

    static boolean differentChecker(ArrayList<Integer> list1, int different) {
        if(( list1.get(1) - list1.get(0)) != different) {
            //System.out.println("HEr");
            pos1 = 0;
            pos2 = 1;
            return false;
        }
        else if( (list1.get(2) - list1.get(1)) != different) {
            //System.out.println("I meant her");
            pos1 = 1;
            pos2 = 2;
            return false;
        }
        else {
            return true;
        }
        
    }

    static int missing(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.removeAll(list2);
        int output = list1.get(0);

        return output;
    }


}