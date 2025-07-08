package Lectures.Lecture_2;

import java.util.Scanner;

public class Sum_Number {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int sum = 0;
            while(n>0){
                int rem = n % 10 ;      /* last digit */
                sum += rem ;            /* sum starts from last digit */
                n /= 10 ;               /* remove last digit and make 2nd last digit come at last */
            }
            System.out.println(sum);
        }
}
