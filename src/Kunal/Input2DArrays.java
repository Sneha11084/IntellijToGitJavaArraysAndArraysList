package Kunal;

import java.util.Arrays;
import java.util.Scanner;

public class Input2DArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        //Input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        //Output
//        for (int[] ints : arr) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

        //or output can be
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
