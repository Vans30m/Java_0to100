package Lectures.Lecture_5;

import java.util.Arrays;

import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
    /*
        1 2 3
        4 5 6
        7 8 9
   */
        Scanner in = new Scanner(System.in);
        int r = 3;
        int c = 2;

        int[][] arr2d = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Input element at position "+i+" "+j+" is :");
                arr2d[i][j] = in.nextInt();
            }
        }

        /* printing using FOR loop */
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                System.out.print(arr2d[i][j]+" ");
//            }
//            System.out.println();
//        }

        /* printing using Arrays to String */
        for(int i=0;i<r;i++){
            System.out.println(Arrays.toString(arr2d[i]));
        }


    }
}
