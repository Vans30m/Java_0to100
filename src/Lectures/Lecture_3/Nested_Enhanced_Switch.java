/* NOT RUNNING */
package Lectures.Lecture_3;

import java.util.Scanner;

public class Nested_Enhanced_Switch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = in.nextInt();
        in.nextLine(); // consume leftover newline

        String dep = ""; // declare outside for access below

        if(id == 3) {
            System.out.print("Enter Department (IT or Finance): ");
            dep = in.nextLine();
        }

        switch (id) {
        case 1 -> System.out.println("Vansh Thakur");
        case 2 -> System.out.println("Tanishq Thakur");
        case 3 -> {
            switch (dep) {
                case "IT" -> System.out.println("IT department");
                case "Finance" -> System.out.println("Finance department");
                default -> System.out.println("Incorrect Department");
            }
        }
        default -> System.out.println("Incorrect ID");
    }
}
}
