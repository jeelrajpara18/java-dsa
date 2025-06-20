package Arrays;

import java.util.Scanner;

public class OddEven {
    static void separateOddEven(int size, int arr[]) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        int evenArray[] = new int[even];
        int oddArray[] = new int[odd];
        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[evenIndex++] = arr[i];
            } else {
                oddArray[oddIndex++] = arr[i];
            }
        }
        System.out.print("Odd elements : ");
        for (int i = 0; i < odd; i++) {
            System.out.print(oddArray[i] + " ");
        }

        System.out.println();

        System.out.print("Even elements : ");
        for (int i = 0; i < even; i++) {
            System.out.print(evenArray[i] + " ");
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
        separateOddEven(n, arr);
        sc.close();
    }
}
