package Lectures.Lecture_4;

import java.util.Scanner;

public class Fun_Prime {
    public static void main(String[] args) {

        boolean ans = isPrime();
        System.out.println(ans);

    }
    static boolean isPrime() {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
