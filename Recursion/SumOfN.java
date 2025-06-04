package Recursion;

import java.util.Scanner;

public class SumOfN {
    public static void Sum(int n){
        int sumofNumber = 0;
        for(int i = 1 ; i<=n ; i++){
            sumofNumber += i;
        }
        System.out.println("The sum of first " + n + " number is: " + sumofNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input : ");
        int n = sc.nextInt();
        sc.close();
        Sum(n);
    }
}
