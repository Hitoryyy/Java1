package home_work_2;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        System.out.println(logicPositiveOrNegativeNumb(-1));
    }

    //Метод, возвращающий true или false в зависимости от типа числа (положительное или отрицательное)
    public static boolean logicPositiveOrNegativeNumb(int x) {
        if (x >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
