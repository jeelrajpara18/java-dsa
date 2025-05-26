package Basics;

import java.util.Scanner;

public class Gcd {
    public static void findGCD(int num1, int num2) {
        // Brute force approach
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
    }

    public static int findGCDUsingEucledian(int num1 , int num2){
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2){
                num1 = num1 % num2;
            }
            else{
                num2 = num2 % num1;
            }
        }
        if (num1 == 0){
            return num2;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 and num2 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int gcd = findGCDUsingEucledian(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);

        sc.close();
        // findGCD(num1, num2);
    }
}
