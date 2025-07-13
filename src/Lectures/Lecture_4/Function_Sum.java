package Lectures.Lecture_4;

import java.util.Scanner;

public class Function_Sum {
    public static void main(String[] args){
        sum1();


//        int x = sum2();
//        System.out.println("Sum is : "+x);
    }

    static void sum1(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a+b;
        System.out.println("Sum of "+a+" and "+b+" is : "+sum);
    }

//    static int sum2(){
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int sum = a+b;
//        return sum;
//    }
}
