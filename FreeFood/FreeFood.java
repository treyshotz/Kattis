import java.util.*;

class FreeFood{
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < count; i++) {
            int lowest = s.nextInt();
            int highest = s.nextInt();
            while(lowest <= highest) {
                if(list.contains(lowest)) {

                }
                else {
                    list.add(lowest);
                }
                lowest += 1;
            }
        }
        System.out.println(list.size());
    }
}