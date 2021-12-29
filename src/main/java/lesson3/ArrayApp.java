package lesson3;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        int[] array = new int[5];
        //int[] array2 = array;
        array[2] = 199;

        for (int i = 0; i < array.length; i++) {
            array[i] = 100 + i * 100;
        }

        int[] arr = {1, 3, 5, 7, 8};

        printArray(arr);

        printArray(array);


        String[] strings = new String[10];

        Arrays.fill(strings, "a");

        //printArray(strings);
        System.out.println(Arrays.toString(strings));

        boolean[] booleans = {};
        System.out.println(Arrays.toString(booleans));


        int integer = 100;
        method1(integer);
        System.out.println("integer = " + integer);

        int[] integers = {1 , 2, 3, 5, 6, 7};
        method2(integers);
        System.out.println(Arrays.toString(integers));
    }


    public static void method1(int a){
        a = a + 10;
    }

    public static void method2(int[] a){
        a[2] = 10500;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "");
        }
        System.out.println();
    }


}
