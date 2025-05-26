package Basics;

import java.util.Scanner;

public class Prime {
    public static boolean checkPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2 ; i <= Math.sqrt(num) ; i++){  // Start from 2, go up to sqrt(num)
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sc.close();

        if(checkPrime(num)){
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
