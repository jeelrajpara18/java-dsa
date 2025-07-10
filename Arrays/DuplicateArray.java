package Arrays;

import java.util.Scanner;

public class DuplicateArray {
    public static void findDuplicate(int[] arr , int n ){
        boolean[] visited = new boolean[n];
        for(int i = 0 ; i < n ; i++){
            if(visited[i] == true){
                continue;
            }
            boolean isDuplicate = false;
            for(int j = i+ 1 ; j< n ; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    isDuplicate = true;
                }
            }
            if(isDuplicate){
                System.out.print(arr[i] + "  ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the number of elements in array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findDuplicate(arr, n);
        sc.close();
    }
}
