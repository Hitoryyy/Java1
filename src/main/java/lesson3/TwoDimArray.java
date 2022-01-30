package lesson3;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(array));


        int[][] newArray = new int[5][];

        newArray[0] = new int []{1,2,3};

        System.out.print(Arrays.toString(newArray));
    }
}
