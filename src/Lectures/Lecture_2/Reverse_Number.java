package Lectures.Lecture_2;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rem , sum = 0;
        while(n > 0){
            rem = n % 10 ;
            sum = sum*10 + rem;
            n /= 10 ;
        }
        System.out.println(sum);
    }
}
