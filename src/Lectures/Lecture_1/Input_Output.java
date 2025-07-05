package Lectures.Lecture_1;

import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args){

        /* INPUTS */
        Scanner input = new Scanner(System.in);

        int in_INT = input.nextInt();           // to take input of INTEGERS
        float in_FLOAT = input.nextFloat();     // to take input of FLOATS
        String in_CHAR = input.next();            // to take input of a CHARACTER / string (FIRST WORD ONLY)
        String in_STRING = input.nextLine();      // to take input of STRING

        /* OUTPUT */
//        System.out.println("Integer input is : " + in_INT);
//        System.out.println("Float input is : "+in_FLOAT);
//        System.out.println("Character input is : "+in_CHAR);
//        System.out.println("String input is : "+in_STRING);

        /* Taking inputs and printing it */
        /* FULL STRING */
//        Scanner input = new Scanner(System.in);
//        System.out.println("Input String : ");
//        String name = input.nextLine();
//        System.out.println(name);

        /* STRING (first word) */
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the first word : ");
//        String first = input.next();
//        System.out.println(first);

        /* INTEGER */
//        Scanner input = new Scanner(System.in);
//        System.out.println("Take input number ");
//        int roll = input.nextInt();
//        System.out.println("Student roll number is "+roll);

        /* FLOAT */
//        Scanner input = new Scanner(System.in);
//        System.out.println("Input float number :");
//        float marks = input.nextFloat();
//        System.out.println(marks);
    }
}
