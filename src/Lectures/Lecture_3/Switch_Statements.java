package Lectures.Lecture_3;

import java.util.Scanner;

public class Switch_Statements {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input fruit name : ");
        String fruit = in.next();

        switch (fruit){
            case "Mango" :
                System.out.print("King of fruits !!");
                break;
            case "Apple" :
                System.out.print("Keeps doctor away !!");
                break;
            case "Grapes" :
                System.out.print("Two types green and black !!");
                break;
            default :
                System.out.print("Not a fruit !!");
        }
    }
}
