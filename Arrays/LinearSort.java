package Arrays;

import java.util.Scanner;

public class LinearSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the number of elements in array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        boolean sorted = IsSorted(arr, n);
        System.out.println("Array is sorted : " + sorted);
        sc.close();
    }
    public static boolean IsSorted(int arr[] , int n){
        for(int i = 1 ; i < n ; i++){
            // for(int j = i+ 1 ; j< n ;){
            //     if(arr[i] > arr[j]){
            //         return false;
            //     }
            //     return true;
            // }
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
