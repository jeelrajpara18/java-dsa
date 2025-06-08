package Arrays;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter marks of students : ");
        for(int i = 0 ; i<=n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] <= 35){
                System.out.print("Roll number of student having marks less than 35 are : " + i);
            }
        }
        sc.close();
    } 
}
