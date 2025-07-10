package Arrays.Sorting;

import java.util.Scanner;

public class InsertionSort {
    void InsertionSorting(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("Array after sorting:");
        PrintArray(arr);
    }

    void PrintArray(int arr[]) {
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertionSort ob = new InsertionSort();

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("-------------");
        System.out.println("Array before sorting:");
        ob.PrintArray(arr);

        ob.InsertionSorting(arr, n);
        sc.close();
    }
}
