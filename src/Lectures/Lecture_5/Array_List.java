package Lectures.Lecture_5;

import java.util.Scanner;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

//         Infinite number of inputs can be added

        /* using add => to add objects */
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println("Using add => "+list);

        /* using set => (index, object) , used to replace object by using the index */
//        list.set(2,45);
//        System.out.println("Using set => "+list);

        /* using remove => (index) , used to delete object using index */
//        list.remove(2);
//        System.out.println("Using remove => "+list);




        /* taking input urself with using add and get */
        for (int i = 0; i < n ; i++) {
            list.add(in.nextInt());
        }
        for(int i=0;i<n;i++){
            System.out.println("Using get =>"+" index at "+i+" is : "+list.get(i));
        }
    }
}
