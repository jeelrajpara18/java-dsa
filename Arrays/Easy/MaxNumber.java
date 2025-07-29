package Arrays.Easy;

import java.util.Scanner;

public class MaxNumber {
    public static void findMax(int arr[] , int n){
        int max = arr[0];
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("Maximum number in array is : " +max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the number of elements in array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        findMax(arr, n);
        sc.close();
    }
}
