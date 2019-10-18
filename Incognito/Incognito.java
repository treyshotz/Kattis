import java.util.*;

class Incognito {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int tests = s.nextInt();
        
        for(int i = 0; i < tests; i++ ) {
            int sum = 1;
            ArrayList<String> list = new ArrayList<>();
            ArrayList<String> unike = new ArrayList<>();

            int inputs = s.nextInt();
            s.nextLine();
            for(int j = 0; j < inputs; j++) {
                String line = s.nextLine();
                String newStr = line.substring(line.indexOf(" ")).trim();
                //System.out.println(newStr);
                list.add(newStr);
                if(unike.contains(newStr)) {
                }
                else{
                    unike.add(newStr);
                }
                //System.out.println("list " + list);
                //System.out.println("unike " + unike);

            }
            for(int k = 0; k < unike.size(); k++) {
                int occ = Collections.frequency(list, unike.get(k));
                //System.out.println("Occ "+occ);
                sum *= (occ + 1);
                //System.out.println("Sum" + sum);
            }
            System.out.println(sum -1);
        }
    }
}