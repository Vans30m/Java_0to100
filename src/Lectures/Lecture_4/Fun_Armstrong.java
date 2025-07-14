package Lectures.Lecture_4;

import java.util.Scanner;

public class Fun_Armstrong {
    public static void main(String[] args) {

        boolean x = Arms();
        System.out.println(x);

    }

    static boolean Arms(){

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int temp = a;       // copying a into temp, you can safely break down temp digit by digit without losing the original value in a

        int sum = 0;
        while(temp > 0){
            int rem = temp % 10;
            temp /= 10;
            sum += rem * rem * rem;
        }
        return sum == a;        /* Means that if sum is equal to a then, it will print true else, false */
    }
}
