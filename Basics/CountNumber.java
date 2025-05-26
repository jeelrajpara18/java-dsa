package Basics;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        int n = sc.nextInt();
        int count = 0;
        sc.close();

        if (n == 0) {
            count = 1; // Special case for 0
        } else {
            while (n > 0) {
                count++;
                n = n / 10;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
