package Lectures.Lecture_4;

import java.util.Scanner;

public class Fibbo_Function {
    public static void main(String[] args) {
        Fibbo();
    }
    static void Fibbo(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0, b = 1;int count = 2;

        while(count<=n){

            int temp = b;
            b += a;
            a = temp;

            System.out.println(b);

            count ++;
        }
    }
}
