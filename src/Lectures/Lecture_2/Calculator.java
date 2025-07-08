package Lectures.Lecture_2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        /* Calculator Program */
        /* Taking many inputs */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the operator : ");        /* Taking operator */
        char x = input.next().trim().charAt(0);

        float output = 1.0f;

        System.out.print("Number of inputs of numbers : "); /* Total number of inputs */
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            if (x == '+') {
                output += a;
            } else if (x == '-') {
                output -= a;
            } else if (x == '*') {
                output *= a;
            } else {
                output /= a;
            }
        }
        System.out.println(output);

        /* Taking two imputs */
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the operator : ");
//        char op = input.next().trim().charAt(0);
//
//        System.out.print("Enter the first number : ");
//        float n1 = input.nextFloat();
//        System.out.print("Enter the second number : ");
//        float n2 = input.nextFloat();
//
//        if (op == '+') {
//            float sum = n1 + n2;
//            System.out.println("Sum of the two numbers is : " + sum);
//        } else if (op == '-') {
//            float diff = n1 - n2;
//            System.out.print("Difference of the two numbers : " + diff);
//        } else if (op == '*') {
//            float mul = n1 * n2;
//            System.out.print("Product of the two numbers is : " + mul);
//        } else {
//            float div = n1 / n2;
//            System.out.print("Division of the two numbers is : " + div);
//        }
    }
}
