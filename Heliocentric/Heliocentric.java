import java.util.*;

class Heliocentric {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;

        for(int i = 0; i < 10; i++) {
            int earth = s.nextInt();
            int mars = s.nextInt();

            int newEarth = 365;
            int newMars = 687;
            if((earth - newEarth) == (mars - newMars)) {
                System.out.println("Case "+ i + ": "+ (newEarth-earth));
            }
            else if(earth == 0 && mars == 0) {
                System.out.println("Case "+ i +": " + (earth));
            }
            else {
                for(int j = 0; j < 999999999; j++) {
                    earth +=1;
                    mars +=1;
                    if(earth == 365) {
                        earth = 0;
                    }
                    if(mars == 687) {
                        mars = 0;
                    }
                    //System.out.println("Earth " + earth + " Mars " + mars);
                    //System.out.println(newEarth-earth);
                    //System.out.println(mars);
                    if((earth == 0 && mars == 0)) {
                        //System.out.println("Syre");
                        System.out.println("Case " + i + ": " + (j+1));
                        break;
                    }
                }
            }
        }
    }
}