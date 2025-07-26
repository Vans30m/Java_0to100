package Assignments.Assignment_2;

import java.util.Scanner;

public class Rupee_USD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Take input in Rupees : ");
        int r = in.nextInt();

        int usd = r*86;
        System.out.print("Conversion of "+r+" Rupees to "+usd+" USD");
    }
}
