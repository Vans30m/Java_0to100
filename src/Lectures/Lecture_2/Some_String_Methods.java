package Lectures.Lecture_2;

import java.util.Scanner;

public class Some_String_Methods {
        public static void main(String[] args){

    /* Using trim() => To remove spaces */
        Scanner input = new Scanner (System.in);
//        String ch = input.nextLine().trim();
//        System.out.println("String without spaces is : "+ ch);

    /* Using charAt() => Positon of the character */
//        char ch = input.nextLine().trim().charAt(1);
//        System.out.println("Character is : " + ch);

    /* CASE CHECK */
        char ch = input.next().trim().charAt(1);
        if(ch >='a' && ch <='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
