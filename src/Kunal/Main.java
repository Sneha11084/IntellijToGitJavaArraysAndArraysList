package Kunal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr1 = {1,2,3,4,5};
        int[] arr3; //declaration of array ; arr3 is getting defined in the stack memory
        arr3 = new int[5];//initialization; actual array object is being created here in the heap memory
        arr3[0] = 3;
    }
}