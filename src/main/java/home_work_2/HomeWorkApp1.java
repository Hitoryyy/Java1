package home_work_2;

public class HomeWorkApp1 {
    public static void main(String[] args) {
        int x1 = 13;
        int x2 = 1;
        System.out.println(logicSumm(x1, x2));
    }

    //Метод, возвращающий сумму целых чисел, после проверки (нахождение пределах от 10 до 20)
    public static boolean logicSumm(int a, int b) {
        int summ = a + b;
        if (summ >= 10 && summ <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
