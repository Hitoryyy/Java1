package home_work_3;

import java.util.Arrays;

public class FillingArray {
    public static void main(String[] args) {
        fillingArray();
    }

    public static void fillingArray() {
        int[] arr = new int[100]; //задаём пустой целочисленный массив длинной 100
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
            //System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
