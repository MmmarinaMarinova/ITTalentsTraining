package Tests;

import java.util.regex.Pattern;

/**
 * Created by Marina on 4.7.2017 г..
 */
public class Test52Task03 {
    public static void main(String[] args) {
        int[] arr={-10,-8,-3,-2,-1,5,7,8,9,10,13};
        int left=0;
        int right=arr.length-1;
        int negativesCount=findNegativeCount(arr, left, right);
        System.out.println(negativesCount);
    }

     static int findNegativeCount(int[] arr, int left, int right) {
        int mid=left+right/2;
        int lastNegativePosition=0;
         int count=0;

        if(arr[mid]>0){
            if(arr[mid-1]<0){
                lastNegativePosition=mid-1;
                count=mid;
            }else{
                return findNegativeCount(arr, 0,mid-1);
            }
        }else if(arr[mid]<0){
            if(arr[mid+1]>=0) {
                lastNegativePosition=mid;
                count=lastNegativePosition+1;
            }else{
                return findNegativeCount(arr, mid+1,right);
            }
        }
        return count;
    }
}
