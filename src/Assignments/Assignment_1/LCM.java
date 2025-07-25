package Assignments.Assignment_1;

import java.math.*;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Take number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Take number 2 : ");
        int num2 = in.nextInt();

        int gcdValue = gcd(num1, num2);
        int lcmValue = lcm(num1, num2);

        System.out.println("HCF of "+num1+" and "+num2+" is: "+gcdValue);
        System.out.println("LCM of "+num1+" and "+num2+" is: "+lcmValue);
    }


    static int gcd(int num1,int num2) {
        if(num2==0) return Math.abs(num1);      /* using Math.abs to ensure that the result is positive */
        return gcd(num1,num1%num2);
    }

    
    static int lcm(int num1,int num2){
        return Math.abs(num1*num2) / gcd(num1,num2);
    }
}
