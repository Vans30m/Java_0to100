package Assignments.Assignment_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class KeepPrintingUntilX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num;
        do{
            System.out.print("Take input of integer : ");
            int x = in.nextInt();
            System.out.println(x);
            System.out.println("If you want to exit type X else Yes : ");
            num = in.nextLine();
        }
        while(num != "X");
    }
}
