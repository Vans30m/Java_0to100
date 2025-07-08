package Lectures.Lecture_2;

import java.util.Scanner;

public class Do_While_Loop {
    public static void main(String[] args){

        /* Do while loop */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i =1;
        do{
            System.out.println(n);
            i++;
        }while(i<=n);
    }
}
