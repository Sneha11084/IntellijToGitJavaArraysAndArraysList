package Kunal;

import java.util.Arrays;
import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // for each loop
        for (int num : arr){ //for every element in the array print the array
            System.out.print(num + " "); //num represents the element of the array
        }
    }
}
