package Tests;

/**
 * Created by Marina on 4.7.2017 г..
 */
public class Test51Task03 {
    public static void main(String[] args) {
        int[] arr={4,8,2,13,7,4};
        int index=0;
        int min=arr[0];
        int max=arr[0];
        int difference=minMaxDifference(arr, index, min, max);
        System.out.println("The difference between the min and" +
                " max elements is: "+difference);
    }

     static int minMaxDifference(int[] arr, int index, int min, int max) {
        if(index>arr.length-1){
            return max-min;
        }
        if(min>arr[index]){
            min=arr[index];
        }
        if(max<arr[index]){
            max=arr[index];
        }
        return minMaxDifference(arr, index+1,min, max);
    }
}
