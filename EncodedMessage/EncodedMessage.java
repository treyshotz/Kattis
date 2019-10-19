import java.util.*;

class EncodedMessage {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        String text = s.nextLine();

        for(int i = 0; i < count; i++) {
            ArrayList<Character> list = new ArrayList<>();
            for(char c : text.toCharArray()) {
                list.add(c);
            }
            System.out.println(list);
        }

    }
}