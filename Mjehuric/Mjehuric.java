import java.util.*;

class Mjehuric {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> sorted = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            int num = s.nextInt();
            list.add(num);
        }
        sorted.add(1);
        sorted.add(2);
        sorted.add(3);
        sorted.add(4);
        sorted.add(5);


        Collections.sort(sorted);

        while(true) {
            if( list.equals(sorted)) {
                break;
            }
            if(list.get(0)  > list.get(1)) {
                Collections.swap(list, 0, 1);
            }
            else if(list.get(1) > list.get(2)) {
                Collections.swap(list, 1 , 2);
            }
            else if(list.get(2) > list.get(3)) {
                Collections.swap(list, 2, 3);

            }
            else if(list.get(3) > list.get(4)) {
                Collections.swap(list, 3, 4);
            }
            if(list.equals(sorted)) {
                System.out.println(list.toString().replace("[","").replace("]","").replace(",",""));

                break;
            }
            else {
                System.out.println(list.toString().replace("[","").replace("]","").replace(",",""));

            }
        }
    }
}