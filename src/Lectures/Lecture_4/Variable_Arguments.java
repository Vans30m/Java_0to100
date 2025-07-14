package Lectures.Lecture_4;

import java.util.Arrays;

public class Variable_Arguments {
    public static void main(String[] args){

        fun1(1,2,2,3,36,56,5,45,55);

//        fun1("RAM","Vansh","Me","You");
    }
    static void fun1(int ...a){
        System.out.println(Arrays.toString(a));
    }

//    static void fun1(String ...a){
//        System.out.println(Arrays.toString(a));
//    }
}
