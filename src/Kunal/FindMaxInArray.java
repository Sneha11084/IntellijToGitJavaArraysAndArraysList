package Kunal;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }

        if(arr == null){
            return -1;
        }

        int maximum = arr[0];
        for(int a : arr){
            if(a > maximum){
                maximum = a;
            }
        }
        return maximum;
    }
}
