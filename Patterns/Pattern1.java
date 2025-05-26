package Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String [] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns : ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 0 ; i<n ; i++){
            for (int j = 0 ; j< n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/* printing 
 * * *
 * * *
 Based on number of input  
 */