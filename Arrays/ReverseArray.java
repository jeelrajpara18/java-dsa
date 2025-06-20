package Arrays;

import java.util.Scanner;

public class ReverseArray {
    static void reverse(int arr[], int size) {
        // for (int i = size - 1; i >= 0; i--) {
        // System.out.print(arr[i] + " ");
        // }

        // Two pointer technique
        int i = 0, j = size - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.print("Reversed array: ");
        for (int k = 0; k < size; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr, n);
        sc.close();
    }
}
