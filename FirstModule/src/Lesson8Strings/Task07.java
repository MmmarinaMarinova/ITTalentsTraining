package Lesson8Strings;

import java.util.Arrays;

/**
 * Created by Marina on 22.6.2017 г..
 */
public class Task07 {
    public static void main(String[] args){
        double[] nums={5.67342, 2.18234, 3.141574398, 6.09023, 12.3243};

        for (int i = 0; i < nums.length; i++) {
            nums[i]=Double.parseDouble(String.format("%.2f",nums[i]).replaceAll(",", "."));
        }

        System.out.printf(Arrays.toString(nums));
    }
}
