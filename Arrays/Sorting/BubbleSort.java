package Arrays.Sorting;

import java.util.Scanner;

public class BubbleSort {
    void BubbleSorting(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array after sorting");
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
        BubbleSort ob = new BubbleSort();

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("-------------");
        System.out.println("Array before sorting");
        ob.PrintArray(arr);

        ob.BubbleSorting(arr, n);
        sc.close();
    }
}
