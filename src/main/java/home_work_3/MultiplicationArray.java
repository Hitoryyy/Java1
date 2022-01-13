package home_work_3;

import java.util.Arrays;

public class MultiplicationArray {
    public static void main(String[] args) {
        multArray();
    }

    public static void multArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length; i++) {//Проходим циклом по массиву
            if (arr[i] < 6) {//Проверяем значения
                arr[i] = arr[i] * 2;//Если меньше 6 - умножаем на 2
            }
            //System.out.print(arr[i] + " ");//выводим результат в консоль
        }
        System.out.println(Arrays.toString(arr)); //распечатка результата в строку


    }
}
