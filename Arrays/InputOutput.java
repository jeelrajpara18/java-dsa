package Arrays;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr [] = new int[n];
        
        // Taking input
        System.out.println("Enter array elements : ");
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }

        //Printing input 
        System.out.print("Elements are : ");
        for(int i = 0 ; i< n ; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
