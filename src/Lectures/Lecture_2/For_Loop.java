package Lectures.Lecture_2;

import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args){

        /* For loop */
        Scanner input = new Scanner (System.in);
        System.out.print("Input the number : ");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(n);
        }
    }
}
