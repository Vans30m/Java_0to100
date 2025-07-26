package Assignments.Assignment_2;

public class Armstrong {
    public static void main(String[] args) {
        int n =123;
        int length = 0;
        while(n!=0) {
            n/=10;
            length ++;
        }
        int sum=0;
        for (int i = 1; i <= length; i++) {
            int rem = n%10;
            sum += Math.pow(rem,length);
            n/=10;
        }
        System.out.println(sum);
    }
}
