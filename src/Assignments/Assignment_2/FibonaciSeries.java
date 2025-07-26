package Assignments.Assignment_2;

import java.util.Scanner;

public class FibonaciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int a = 0,b = 1;
        if(n==1) System.out.println("0");

        System.out.print("Fibonacci Series upto "+n+" is : "+"0");
        for (int i = 2; i <= n; i++) {
            int temp = a;
            a += b;
            b = temp;
            System.out.print(" "+a);
        }
    }
}
