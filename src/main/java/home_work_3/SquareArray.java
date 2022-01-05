package home_work_3;

import java.util.Arrays;

public class SquareArray {
    public static void main(String[] args) {
        squareArr();//вызов метода печатающего наш массив
    }

    public static void squareArr(){ //создаём метод для вызова в основном методе программы
        int[][] arr = new int[5][5]; //инициализируем двумерный массив размером 5x5
        for (int i = 0; i < arr.length; i++) { //вызываем цикл for для заполнения строк
            for (int j = 0; j < arr.length; j++) {//с помощью вложенного цикла for заполняем значениями столбцы
                if (i == j) {//с помощью условия выясняем какие индексы равны (строка == столбец) - они же и есть наша первая диоганаль
                    arr[i][j]++;//заполняем единицами стока == столбец
                }
                System.out.print(arr[i][j] + " "); // вывод элементов массива в строку через пробел
            }
            System.out.println(); // после каждой итерации цикла осуществляем переход на новую строку
        }
    }
}