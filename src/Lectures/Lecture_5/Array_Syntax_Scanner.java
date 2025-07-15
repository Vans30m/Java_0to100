package Lectures.Lecture_5;

import java.util.Scanner;

public class Array_Syntax_Scanner {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }

        for(int i=0;i<5;i++){
            System.out.print((arr[i]+" "));
        }
    }
}