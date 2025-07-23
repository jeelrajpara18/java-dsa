package Arrays.Sorting;

import java.util.Scanner;

public class QuickSort {
    static int partition(int arr[], int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for (int j = low; j <= high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void QuickSorting(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            QuickSorting(arr, low, pi - 1);
            QuickSorting(arr, pi + 1, high);
        }
    }

    static void PrintArray(int arr[]) {
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort ob = new QuickSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("-------------");
        System.out.println("Array before sorting:");
        QuickSort.PrintArray(arr);

        ob.QuickSorting(arr, 0, n - 1);
        System.out.println("Array after sorting:");
        PrintArray(arr);
        sc.close();
    }
}
