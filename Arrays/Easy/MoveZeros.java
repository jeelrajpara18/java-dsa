package Arrays.Easy;

import java.util.Scanner;

public class MoveZeros {
    public static int[] moveZeros(int a[] , int n){
        int j = -1;
        for(int i = 0 ; i<n ; i++){
            if(a[i] == 0){
                j = i;
                break;
            }
        }
        if(j==-1) return a;
        for(int i = j+1; i<n ; i++){
            if(a[i] != 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of elements : ");
        int arr[] = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array with zeros at end : ");
        int newArray [] = moveZeros(arr, n);
        for(int i = 0 ; i < n ; i++){
            System.out.print(newArray[i] + " ");
        }
        sc.close();
    }
}
