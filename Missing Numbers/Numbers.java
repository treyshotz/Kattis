import java.util.*;

class Numbers {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        int highest = 0;

        for(int i = 0; i < count; i++) {
            int num = s.nextInt();
            if(num > highest) {
                highest = num;
            }
            list1.add(num);
        }

        for(int j = 1; j < highest+1; j++) {
            list2.add(j);
        }

        Collections.sort(list2);
        list2.removeAll(list1);
        if(list2.size() == 0) {
            System.out.println("good job");
        }
        System.out.println(list2.toString().replace("[","").replace("]","").replace(",", ""));

    }
}