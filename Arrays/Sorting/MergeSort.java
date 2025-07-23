package Arrays.Sorting;

import java.util.Scanner;

public class MergeSort {
    void divide(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            divide(arr, l, mid);
            divide(arr, mid + 1, r);

            Merge(arr, l, mid, r);
        }
    }

    static void Merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        // copy data to temp arrays
        for (int copyLeft = 0; copyLeft < n1; copyLeft++) {
            lArr[copyLeft] = arr[l + copyLeft];
        }
        for (int copyRight = 0; copyRight < n2; copyRight++) {
            rArr[copyRight] = arr[mid + 1 + copyRight];
        }

        // Merge temp arrays
        int i = 0, j = 0;

        // Initial index of subarrays array
        int k = l;

        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining element of left and right array
        while (i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }

    static void PrintArray(int arr[]) {
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSort ob = new MergeSort();
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
        MergeSort.PrintArray(arr);

        ob.divide(arr, 0, n - 1);
        System.out.println("Array after sorting:");
        PrintArray(arr);
        sc.close();
    }
}
