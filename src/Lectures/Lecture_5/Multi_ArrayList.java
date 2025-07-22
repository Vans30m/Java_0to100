package Lectures.Lecture_5;

import java.util.Scanner;

import java.util.ArrayList;

public class Multi_ArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>(5);

        // initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // adding elements
        for (int i = 0; i < 3; i++) {
            for(int j=0; j< 3; j++) {
                list.get(j).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
