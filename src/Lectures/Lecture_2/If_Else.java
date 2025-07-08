package Lectures.Lecture_2;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args){

        /* If / Else If / Else statements */
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if(salary > 45000){
            salary += 2000;
        }
        else if (salary < 45000 && salary > 25000){
            salary += 1000;
        }
        else {
            salary += 500;
        }
        System.out.println("Salary is "+ salary);
    }
}