package home_work_2;

public class HomeWorkApp4 {
    public static void main(String[] args) {
        String a = "Java";
        int b = 6;
        printString(a, b);

    }

    //Метод печатающий строку указанное количество раз.
    public static void printString(String w, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(w);
        }
    }
}
