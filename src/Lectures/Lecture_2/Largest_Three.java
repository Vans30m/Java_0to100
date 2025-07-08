package Lectures.Lecture_2;

import java.util.Scanner;

public class Largest_Three {
    public static void main(String[] args) {

        /* Largest of three numbers */
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number : ");int a = input.nextInt();
        System.out.print("Input second number : ");int b = input.nextInt();
        System.out.print("Input third number : ");int c = input.nextInt();

        /* Basic */
//        if(a>b && a>c){
//            System.out.println("Largest Number is : "+ a);
//        }
//        else if(b>a && b>c){
//            System.out.println("Largest Number is : "+ b);
//        }
//        else {
//            System.out.println("Largest Number is : "+ c);
//        }

        /* Using Max variable (Best way to do) */
        int max = 0;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("Largest number using MAX variable is): " + max);

        /* Math => only for 2 numbers */
//        System.out.println("Largest number by using MATHS is : "+ Math.max(584.1,584.2));

        /* Making for more numbers */
//        int max = Math.max(c, Math.max(a,b));
//        System.out.println("Largest number by using MATH(3 variables) is : "+ max);
//    }
    }
}
