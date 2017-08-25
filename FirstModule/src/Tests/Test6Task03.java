package Tests;

/**
 * Created by Marina on 4.7.2017 г..
 */
public class Test6Task03 {
    public static void main(String[] args) {
        int[] nums={1,8,4,-8,9,11};
        int index=0;
        boolean allPositive=checkNums(nums,index);
        System.out.println(allPositive? "All numbers are positive": "Not all numbers are positive");
    }

     static boolean checkNums(int[] nums, int index) {
        if(index>nums.length-1){
            return true;
        }
        if(nums[index]<0){
            return false;
        }
        return checkNums(nums, index+1);
    }
}
