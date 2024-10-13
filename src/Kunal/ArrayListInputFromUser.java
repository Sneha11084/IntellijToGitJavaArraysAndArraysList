package Kunal;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInputFromUser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // Output
        for(Integer a : list){
            System.out.print(a + " ");
        }
        System.out.println();
        //Output
        System.out.println(list);

        //Output
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
