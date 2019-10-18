import java.util.*;

class Chicken {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int ate = s.nextInt();
        int tot = s.nextInt();

        if(ate < tot) {
            if((tot-ate) == 1) {
                System.out.println("Dr. Chaz will have " + (tot-ate) + " piece of chicken left over!");
            }
            else {
                System.out.println("Dr. Chaz will have " + (tot-ate) + " pieces of chicken left over!");
            }
        }

        if(ate > tot) {
            if((ate-tot) == 1) {
                System.out.println("Dr. Chaz needs " + (ate-tot) + " more piece of chicken!");
            }
            else {
                System.out.println("Dr. Chaz needs " + (ate-tot) + " more pieces of chicken!");
            }
        }


    }
}