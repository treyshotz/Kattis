import java.util.*;


class Parking {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;

        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        int first = s.nextInt();
        int second = s.nextInt();
        while(first < (second)) {
            list1.add(first);
            first ++;
        }

        int first2 = s.nextInt();
        int second2 = s.nextInt();
        while(first2 < (second2)) {
            list2.add(first2);
            first2++;
        }

        int first3 = s.nextInt();
        int second3 = s.nextInt();
        while(first3 < (second3)) {
            list3.add(first3);
            first3++;
        }

        //System.out.println("list1 :" + list1);
        //System.out.println("list2 :" + list2);
        //System.out.println("list3 :" + list3);

        for(int i = 1; i < 101; i++) {
            int count = 0;
            if(list1.contains(i)) {
                count +=1;
            }
            if(list2.contains(i)) {
                count += 1;
            }
            if(list3.contains(i)) {
                count += 1;
            }
            
            if(count == 1) {
                sum += count * A;
            }
            else if(count == 2) {
                sum += count * B;
            }
            else if(count == 3) {
                sum += count * C;
            }
            //System.out.println("Count " + count);
            //System.out.println("Sum " + sum);
        }
        System.out.println(sum);
    }
}