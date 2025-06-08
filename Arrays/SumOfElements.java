package Arrays;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements : ");
        int sum = 0;
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of all elements is : " +sum);
        sc.close();
    }
}
