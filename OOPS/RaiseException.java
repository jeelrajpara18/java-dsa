package OOPS;

import java.util.Scanner;

public class RaiseException {
    public static void ReadException(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name : ");
        String name = sc.nextLine();
        System.out.print("Enter employee id : ");
        String employeeid = sc.nextLine();
        System.out.print("Enter employee age : ");
        int age = sc.nextInt();

        try {
            if(age < 18){
                throw new IntegerException();
            }
            else if(age > 50){
                throw new CharacterException();
            }
            else{
                System.out.println("Employee name : " +name.toLowerCase());
                System.out.println("Employee id : "+employeeid.substring(1));
                System.out.println("Employee age : "+age);
            }
        } catch (IntegerException e) {
            System.out.println("Age cannot be less than 18");
        }
        catch (CharacterException e){
            System.out.println("Age cannot be greater than 50");
        }
    }
    static class IntegerException extends Exception{}
    static class CharacterException extends Exception {}

    public static void main(String[] args) {
        ReadException();
    }
}

/* 
 A leather manufacturing company maintains a DB with the details of their employees. The details maintained are name, employeeid, age. Age of the employees in the company can only be 18 to 50. Write a C++ function to read the details of employees from user, the function should print the details if it is valid.

When age < 18, raise an integer exception and print ‘Age cannot be less than 18’

When age > 50, raise a character exception and print ‘Age cannot be greater than 50’

Example 1
If the details entered are Ramu, E123 and 25 then print the details ramu, 123 and 25, one in each line.

Example 2
If the details entered are Ramu, E123 and 15 then raise an exception and print ‘Age cannot be less than 18’.

Example 3
If the details entered are Ramu, E123 and 55 then raise an exception and print ‘Age cannot be greater than 50’.

Input Format

First line contains name of the employee

Second line contains employee ID of the employee

Third line contains age of the employee

Input Format

Print either the details of the employee entered. One detail in each line or print ‘Age cannot be less than 18’ or ‘Age cannot be greater than 50’ when invalid age is entered
 */