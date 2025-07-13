package Lectures.Lecture_4;

import java.util.Arrays;

public class Function_ChangeValues {
    public static void main(String[] args) {
        int[] arr = {1,2,25,12,45};
        Change(arr);
    }
    static void Change(int[] nums){
        nums[2] = 29;       // If you make a change to the object via this
                            // reference variable, same object will be changed
        System.out.println(Arrays.toString(nums));
    }
}
