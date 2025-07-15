package Lectures.Lecture_5;

public class Array_Syntax_Own {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};

        int size = arr.length;

        for(int i=0;i<size;i++){
            System.out.println((i+1)+" Element is : "+arr[i]+" ");
        }
    }
}
