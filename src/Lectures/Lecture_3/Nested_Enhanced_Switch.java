/* NOT RUNNING */
package Lectures.Lecture_3;

import java.util.Scanner;

public class Nested_Enhanced_Switch {
    public static void msinn(String[] args){
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
