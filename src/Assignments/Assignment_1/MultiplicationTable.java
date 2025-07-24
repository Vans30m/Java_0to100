package Assignments.Assignment_1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Take input till which number to get multiplication table : ");
        int num = in.nextInt();

        System.out.print("Take input of number : ");
        int x = in.nextInt();

        for (int i = 1; i <= num; i++) {
            int mul = x*i;
            System.out.println(x+" X "+i+" = "+mul);
        }
    }
}
