package Basics;

import java.util.Scanner;

public class ReverseInterger {
    static void reverse (int n){
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n = n /10;
        }
        System.out.println("Reversed integer is : " + reverse);
        System.out.println("integer is : " + n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input : ");
        int n = sc.nextInt();
        sc.close();
        reverse(n);
    }
}
