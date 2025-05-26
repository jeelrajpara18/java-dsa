package Basics;

import java.util.Scanner;

public class Palindrom {
    static void palindrom(int num){
        int duplicate = num;
        int reverse = 0;
        while (num != 0 )  {
            reverse = reverse * 10 + num % 10;
            num = num/10;
        }
        if (reverse == duplicate){
            System.out.println("Input is palindrome: " + duplicate);
        }
        else{
            System.out.println("Input is not a palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input : ");
        int n = sc.nextInt();
        sc.close();
        palindrom(n);
    }
}
