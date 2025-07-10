/* Linear Search in array */
package Arrays.Search;

import java.util.Scanner;

public class LinearSearch {
    static void findingElementMethod(int x , int arr[]) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("The number is at " + i + " position");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The number is not found in the array.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to find: ");
        int x = sc.nextInt();

        findingElementMethod(x, arr);
        sc.close();
    }
}
