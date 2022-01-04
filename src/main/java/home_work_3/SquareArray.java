package home_work_3;

import java.util.Arrays;

public class SquareArray {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
