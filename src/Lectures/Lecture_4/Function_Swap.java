package Lectures.Lecture_4;

import java.util.Scanner;

public class Function_Swap {
    public static void main(String[] args) {
        Swap();
    }
    static void Swap(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped values are : "+a+" and "+b);
    }
}
