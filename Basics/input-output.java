package Basics;
/*Complete the function printNumber which takes an integer input from the user and prints it on the screen. */
import java.util.Scanner;

class Solution {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        System.out.println("Number is " + number);
        sc.close();
    }
}