package Kunal;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObjacts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i] =  in.next();
        }
        for(String s : str){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(str));
//      MODIFY
        str[1] = "Kunal";
        System.out.println(Arrays.toString(str));
    }
}
