package home_work_3;

import java.util.Arrays;

public class ChangeArray {
    public static void main(String[] args) {
        changeArray();
    }

    public static void changeArray(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0};// создаём массив, заполняя его в ручную
        System.out.println(Arrays.toString(arr));//распечатываем массив в первоначальном виде для наглядности
        int arrlength = arr.length; //определяем длину массива с помощью метода: "length"
        for (int i = 0; i < arrlength; i++) { //с помощью цикла for устанавливаем колиество итераций == длинне массива
            if (arr[i] == 1) { //задаём условие замены элемента массива
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr)); //ввыводим массив в изменённом виде
    }
}
