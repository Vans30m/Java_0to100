package Lectures.Lecture_3;

import java.util.Scanner;

public class DayRepresent_EnhancedSwitch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input the day number : ");
        int day_no = in.nextInt();

        switch (day_no){

            case 1 -> System.out.print("Monday");
            case 2 -> System.out.print("Tuesday");
            case 3 -> System.out.print("Wednesday");
            case 4 -> System.out.print("Thursday");
            case 5 -> System.out.print("Friday");
            case 6 -> System.out.print("Saturday");
            case 7 -> System.out.print("Sunday");

        }
    }
}
