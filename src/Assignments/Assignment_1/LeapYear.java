package Assignments.Assignment_1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        if(year%400 == 0 || (year%4 == 0 && year%100 != 0)){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
