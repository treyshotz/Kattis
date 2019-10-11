import java.util.Scanner;

class Autori {

    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()) {
            String str = s.nextLine();
            System.out.println(firstLetter(str));
        }
        
    }
    
    static String firstLetter(String str) {
        String result = "";

        boolean v = true;
        for(int i = 0; i < str.length(); i++ ) {
            if(str.charAt(i) == '-') {
                v = true;
            }
            else if(str.charAt(i) != '-' && v == true) {
                result += (str.charAt(i));
                v = false;
            }
        }
        return result;
    }
}