package home_work_2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        int a = -1;
        positiveOrNegativeNumb(a);
    }

    //Метод, печатающий в консоль тип числа (положительное или отрицательное)
    public static void positiveOrNegativeNumb(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}
