package Arrays;

import java.util.Scanner;

public class SumOfDoublet {
    public static void subOfNumbers(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println("Output: [" + i + " , " + j + "]");
                    return;
                }
            }
        }
        System.out.println("No such pair found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target number: ");
        int target = sc.nextInt();

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        subOfNumbers(arr, n, target);
        sc.close();
    }
}
