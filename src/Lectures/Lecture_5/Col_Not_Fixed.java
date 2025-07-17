package Lectures.Lecture_5;

import java.util.Arrays;

public class Col_Not_Fixed {
    public static void main(String[] args) {
        int[][] arr2d = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        /* using FOR loop */
        for(int i=0;i<arr2d.length;i++){
            for(int j=0;j<arr2d[i].length;j++){
                System.out.print(arr2d[i][j]);
            }
            System.out.println();
        }

        /* we can not print using this as the length of column is variable */
//        for(int i=0;i<arr2d.length;i++){
//            System.out.println(Arrays.toString(arr2d[][]));
//        }

    }
}
