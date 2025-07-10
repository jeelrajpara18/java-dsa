package Arrays;

import java.util.Scanner;

public class MaxFrequency {
    public static void findMax(int[] arr , int n){
        boolean []visited = new boolean[n];
        int max = 0;
        int element = 0;
        for(int i = 0 ; i < n ; i++){
            if(visited[i] == true){
                continue;
            }
            int count = 1;
            for(int j = i + 1 ; j < n ; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > max || (count == max && arr[i] > element)){
                max = count;
                element = arr[i];
            }
        }
        System.out.println("Element " + element + " has max frequency of " + max);
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
        findMax(arr, n);
        sc.close();
    }
}
