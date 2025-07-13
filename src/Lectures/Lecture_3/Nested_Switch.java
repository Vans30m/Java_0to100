/* NOT RUNNING */

package Lectures.Lecture_3;

import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input employee ID : ");
        int id = in.nextInt();

        System.out.print("Input the department : ");
        String dep = in.next();


        switch (id) {
            case 1:
                System.out.println("Vansh Thakur");
                break;
            case 2:
                System.out.println("Tanishq Thakur");
                break;
            case 3:
                switch (dep) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Finance":
                        System.out.println("Finance department");
                        break;
                    default:
                        System.out.println("Incorrect Department");
                }
                break;
            default:
                System.out.println("Incorrect ID");
        }
    }
}
