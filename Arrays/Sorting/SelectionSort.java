package Arrays.Sorting;

import java.util.Scanner;

public class SelectionSort {
    void SelectionSorting(int arr[], int n) {
        int minIndex = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
        SelectionSort ob = new SelectionSort();

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

        ob.SelectionSorting(arr, n);
        sc.close();
    }
}
