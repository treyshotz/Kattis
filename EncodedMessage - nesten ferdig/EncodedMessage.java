import java.util.*;
import java.lang.Math;

//ikke ferdigs
class EncodedMessage {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        s.nextLine();

        for(int i = 0; i < count; i++) {
            String text = s.nextLine();
            ArrayList<Character> complete = new ArrayList<>();
            ArrayList<Character> list = new ArrayList<>();
            for(char c : text.toCharArray()) {
                list.add(c);
            }
            //System.out.println(list);

            double size1 = Math.sqrt(list.size());
            int size2 = (int) Math.round(size1);
            int t = 1;
            //System.out.println(size2);

            for(int j = 0; j < size1; j++) {
                for(int k = 0; k < size2; k++) {
                    complete.add(list.get(((t*size2)*(k+1))));
                    System.out.println(complete);
                    t++;
                }
                size2--;
            }
            System.out.println(complete);
        }

    }
}