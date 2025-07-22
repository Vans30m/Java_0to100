package Lectures.Lecture_5;

import java.util.Arrays;

public class Max_Array {
    public static void main(String[] args) {
        int[] arr = {12,32,54,68,94,78,51};
        maxArrayElement(arr);
    }
    static void maxArrayElement(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) max = arr[i];
        }
        System.out.println(max);
    }
}
