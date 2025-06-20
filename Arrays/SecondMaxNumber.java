package Arrays;

import java.util.Scanner;

public class SecondMaxNumber {
    public static void SecondMax(int arr[] , int n){
        int max = arr[0];
        for(int i = 0 ; i < n ; i ++){
            if(arr[i] > max) max = arr[i];
        }
        int secondMax = arr[0];
        for(int j = 0 ; j < n ; j++){
            if(arr[j] > secondMax && arr[j] != max){
                secondMax = arr[j];
            }
        }
        System.out.println("Second Max number is : " +secondMax);
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
        SecondMax(arr, n);
        sc.close();
    }
}
