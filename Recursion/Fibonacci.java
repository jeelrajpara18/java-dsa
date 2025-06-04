package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int PrintFibonacci(int n) {
        if ( n<=1 ) return n;
        return PrintFibonacci(n-1) + PrintFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input : ");

        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.print(PrintFibonacci(i) + " ");
        }
    }
}
