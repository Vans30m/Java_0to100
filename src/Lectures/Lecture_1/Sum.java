package Lectures.Lecture_1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){

        /* Sum in Java */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value :");
        float a = input.nextFloat();
        System.out.println("Enter second value :");
        float b = input.nextFloat();
        float x = a+b;
        System.out.println("Sum of a and b is : "+ x);
    }
}
