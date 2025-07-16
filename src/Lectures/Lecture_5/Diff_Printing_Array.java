package Lectures.Lecture_5;

import java.util.Scanner;

import java.util.Arrays;

public class Diff_Printing_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        /* Printing using FOR loop */
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        /* Printing using Arrays to String */
        System.out.println(Arrays.toString(arr));
    }
}
