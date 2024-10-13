package Kunal;

import java.util.ArrayList;

public class ArrayListEg {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //or
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list.add(10);
        list.add(34);
        list.add(43);
        list.add(156);
        list.add(66);
        list.add(560);

        // to update value at some index
//        list.set(0, 99);
//        System.out.println(list);

        // remove some element ; pass index
        list.remove(2);
        System.out.println(list);

        // check if some element is present or not
//        System.out.println(list.contains(43)); //give true
//        System.out.println(list); // it internally calls .toStrings attached
    }
}
