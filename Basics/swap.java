package Basics;

import java.util.Scanner;

public class swap {
    public static void SwapNumbers (int a , int b){
         int temp = a;
         a = b;
         b = temp;

         System.out.println("After swapping Value of a is : " + a + " and Value of b is : " +b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping Value of a is : " + a + " and Value of b is : " +b);
        SwapNumbers(a, b);
        sc.close();
    }
}
