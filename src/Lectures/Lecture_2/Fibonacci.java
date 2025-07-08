package Lectures.Lecture_2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /* Using WHILE Loop */
//        int n = input.nextInt();
//        int a = 0;int b = 1;
//        int count = 2;              /* count is taken 2 as two numbers are taken already */
//        while(count <= n){          /* Fibonacci Series using while loop */
//            int temp = b;           /* temp is used */
//            b += a;
//            a = temp;
//            count++ ;
//        }
//        System.out.println("Fibonacci number at " + n + " is " + b);

        /* Using FOR Loop */
        int n = input.nextInt();
        int a = 0; int b = 1;
        for(int i=1;i<=n;i++){
            int temp = b;
            b += a;
            a = temp;
            System.out.print(a);
        }
    }
}
