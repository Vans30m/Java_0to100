package Lectures.Lecture_4;

public class Shadowing {

    static int x = 90;      // this will be shadowed at line 8

    public static void main(String[] args) {

        System.out.println(x);      // 90

        int x = 40;
        System.out.println(x);      // 40

        fun();         // 90 as function is declared outside this function(main), but x = 90 is initialized inside the fun() function
    }

    static void fun(){
        System.out.println(x);
    }
}
