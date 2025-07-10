package Arrays.Search;

import java.util.Scanner;

public class IBinarySearch {
    int IterativeBinary(int arr[] , int n , int x){
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[mid] < x){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.print("Enter elements of array : ");
        for(int i = 0 ; i < n ; i++){
            array[i] = sc.nextInt();
        }

        System.out.print("Enter element to search : ");
        int x = sc.nextInt();
        
        IBinarySearch ob = new IBinarySearch();
        int binarySearch = ob.IterativeBinary(array, n, x);
        if(binarySearch == -1){
            System.out.println("Element is not present in the array");
        }
        else{
            System.out.println("Element is present at index : " + binarySearch );
        }
        sc.close();
    }
}