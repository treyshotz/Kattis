import java.util.*;

class A2048 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++) {
                int value = s.nextInt();
                if(i == 0) {
                    list1.add(value);
                }
                else if(i == 1) {
                    list2.add(value);
                }
                else if(i == 3) {
                    list3.add(value);
                }
                else {
                    list4.add(value);
                }
            }
        }
        int direction = s.nextInt();

        //LEFT
        if(direction == 0){ 
            System.out.println("left");
            for(int i = 0; i < 4; i++) {
                if(i == 0) {
                    for(int j = 0; j < 4; j++) {
                          if(list1.get(j) == 0) {
                                continue;
                            }
                        for(int k = (j+1); k < 4; k++) {
                            System.out.println(k);
                            if(list1.get(j) != list1.get(k)) {
                                continue;
                            }
                            else if(list1.get(j) == list1.get(k)) {
                                System.out.println(list1);
                                list1.add(j, (list1.get(j)+list1.get(k)));
                                list1.remove(j+1);
                                list1.repl
                                //list1.remove(1);                                
                            }
                        }
                    }
                }
            }
            System.out.println(list1);
        }


        //UP

        //RIGHT

        //DOWN

    } 
}