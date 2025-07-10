package Arrays.Search;

import java.util.Scanner;

public class RBinarySearch {

    int RecursiveBinary(int arr[], int low, int high, int target) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return RecursiveBinary(arr, mid + 1, high, target);
        } else {
            return RecursiveBinary(arr, low, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int array[] = new int[n];

        System.out.print("Enter elements of array (sorted): ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int low = 0;
        int high = n - 1;

        RBinarySearch ob = new RBinarySearch();
        int result = ob.RecursiveBinary(array, low, high, target);

        if (result == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element is present at index: " + result);
        }

        sc.close();
    }
}
