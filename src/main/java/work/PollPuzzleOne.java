package work;

public class PollPuzzleOne {
    public static void main(String[] args) {
        int x = 0;
        while (x < 4) {
            System.out.print("a ");
            if (x < 1) {
                System.out.print(" ");
            }
            x++;
            if (x > 0){
                System.out.print("noise");
                x = x + 1;
            }
            if (x == 1){

            }
        }
    }
}
