package Arrays.Easy;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the number of elements in array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = removeDuplicate(arr, n);
        System.err.println("Array after removing duplicate array ");
        for(int k = 0 ; k < i ; k++){
            System.out.print
            (arr[k] + " ");
        }
        sc.close();
    }
    static int removeDuplicate (int arr[] , int n){
        int i = 1;
        for(int j = 0 ; j < n ; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
