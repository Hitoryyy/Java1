package lesson2;

public class CycleApp {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                continue;
            }
            if (i > 6) {
                break;
            }
            System.out.println(i);
        }
        System.out.println(getDividedByThree());


        /*for(int i=10; i>0; i--){
            System.out.println(i);
        }*/

        /*for(;;){ //Бесконечный цикл на for

        }*/

        for(int i = 0, j = 10; i < j; i++, j--){
            System.out.println("i=" + i + " j=" + j);
        }


    }


    public static int getDividedByThree() {
        for (int i = 2; i < 10; i = i + 2) {
            if (i % 3 == 0) {
                return i;
            }
        }
        return 0;
    }
}
