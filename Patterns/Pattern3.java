package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input : ");
        int n = sc.nextInt();

        sc.close();
        for(int i = 1 ; i<= n ; i++){
            for(int j = 1 ; j<= i ; j++){
                System.out.print(j);
                /* for pattern 
                1
                12
                123 
                
                and for pattern
                1
                22 
                333
                System.out.print(i)
                */
            }
            System.out.println();
        }
    }
}
