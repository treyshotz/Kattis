import java.util.Scanner;

class Rocket {

    public static Scanner s = new Scanner(System.in);

    public static void main(String [] args ) {
        int count = s.nextInt();
        

        int loopcount = 0;
        int smallest = 99999;
        int scount = 0;
        for(int i = 0; i < count; i++) {

            int newnumber = s.nextInt();
            //System.out.println("Tall: " + newnumber);
            if(newnumber < smallest) {
                smallest = newnumber;
                scount = i;
                //System.out.println("Det er mindre??");
            }
            else {

            }
        }
        System.out.println(scount);
    }
}