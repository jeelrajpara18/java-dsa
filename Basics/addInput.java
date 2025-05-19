package Basics;
import java.util.*;
public class addInput {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = a+b ;
        System.out.println("Total is " + total);
        sc.close();
    }
}
