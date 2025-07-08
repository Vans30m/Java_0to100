package Lectures.Lecture_2;

import java.util.Scanner;

public class CountGivenNumberInNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == 3){
                count ++ ;
            }
            n /= 10 ;
        }
        System.out.println(count);
    }
}
