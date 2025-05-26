package Basics;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input : ");
        int input = sc.nextInt();

        // Gives the length of input
        int k = String.valueOf(input).length();
        System.out.println(k);
        int sum = 0;
        int temp = input;
        
        sc.close();
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, k);
            temp = temp / 10;
        }
        if (sum == input){
            System.out.println(input + " is an armstrong number");
        }
        else{
            System.out.println(input + " is not an armstrong number");

        }
    }
}
