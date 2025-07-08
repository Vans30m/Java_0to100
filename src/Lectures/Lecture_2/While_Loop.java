package Lectures.Lecture_2;

import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args){

        /* While loop */
        Scanner input = new Scanner (System.in);
        System.out.print("Input number : ");
        int n = input.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }

}
