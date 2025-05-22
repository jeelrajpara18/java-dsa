package Basics;

import java.util.Scanner;

/* Create an abstract class “Shape” with abstract methods “getArea()” and “getPerimeter()”. Implement two subclasses “Rectangle” and “Circle” which extend “Shape” and implement the abstract methods. Create a “Square” class which extends “Rectangle” and overrides the necessary methods. Create objects of all classes and test their behavior. */
// abstract class Shape {
//     abstract double getArea();
//     abstract double getPerimeter();
// }

// class Rectangle extends Shape{
//     private double length; 
//     private double breadth;

//     public Rectangle(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter length and breadth of rectangle");
//         length = sc.nextInt();
//         breadth = sc.nextInt();
//         sc.close();
//     }

//     public double getArea(){
//         return length *breadth;
//     }

//     public double getPerimeter(){
//         return 2 * (length + breadth);
//     }
// }

// class Circle extends Shape {
//     private double radius;

//     public Circle(double radius){
//         this.radius = radius;
//     }

//     public double getArea(){
//         return Math.PI * radius * radius;
//     }

//     public double getPerimeter(){
    //         return 2 * Math.PI * radius;
    //     }
    // }
abstract class Employee{
    protected String name;
    protected int age;
    protected String gender;

    abstract double calculateSalary();
    abstract void displayEmployeeDetails();
}

class Manager extends Employee{
    protected double baseSalary;
    protected double bonus;

    public Manager (Scanner sc){
        System.out.println("Enter manager name ");
        name = sc.next();
        System.out.println("Enter manager age");
        age = sc.nextInt();
        System.out.println("Enter manager gender");
        gender = sc.next(); 
        System.out.println("Enter base salary");
        baseSalary = sc.nextDouble(); 
        System.out.println("Enter bonus");
        bonus = sc.nextDouble();
    }

    public double calculateSalary(){
        return baseSalary + bonus;
    }

    public void displayEmployeeDetails(){
        System.out.println("Manager Name: " + name);
        System.out.println("Manager Age: " + age);
        System.out.println("Manager Gender: " + gender);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Worker extends Employee{
    protected double hourlyRate;
    protected int hoursWorked;
    
    public Worker (Scanner sc){
        System.out.println("Enter worker name:");
        name = sc.next();
        System.out.println("Enter worker age:");
        age = sc.nextInt();
        System.out.println("Enter worker gender:");
        gender = sc.next();
        System.out.println("Enter hourly rate:");
        hourlyRate = sc.nextDouble();
        System.out.println("Enter hours worked:");
        hoursWorked = sc.nextInt();
    }

    public double calculateSalary(){
        return hourlyRate * hoursWorked;
    }

    public void displayEmployeeDetails(){
        System.out.println("Worker Name: " + name);
        System.out.println("Worker Age: " + age);
        System.out.println("Worker Gender: " + gender);
        System.out.println("Hourly rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class SalesPerson extends Manager{
    protected double commisionRate;
    
    public SalesPerson (Scanner sc){
        super(sc); // Get baseSalary and bonus from Manager
        System.out.println("Enter commission rate:");
        commisionRate = sc.nextDouble();
    }

    public double calculateSalary(){
        return super.calculateSalary() + commisionRate;
    }
    
    public void displayEmployeeDetails(){
        System.out.println("Sales Person Name: " + name);
        System.out.println("Sales Person Age: " + age);
        System.out.println("Sales Person Gender: " + gender);
        System.out.println("Commsion rate: " + commisionRate);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
public class abstraction {
    public static void main(String[] args) {
        // Shape rectangle = new Rectangle();
        // Shape circle = new Circle(10);

        // System.out.println("Area of rectangle is : " + rectangle.getArea());
        // System.out.println("Perimeter of rectangle is : " + rectangle.getPerimeter());
        
        // System.out.println("----------------------");

        // System.out.println("Area of circle is : " + circle.getArea());
        // System.out.println("Perimeter of circle is : " + circle.getPerimeter());
        
        Scanner sc = new Scanner(System.in);
        Employee manager = new Manager(sc);
        System.out.println();
        Employee worker = new Worker(sc);
        System.out.println();
        Employee salesPerson = new SalesPerson(sc);
        System.out.println();

        manager.displayEmployeeDetails();
        System.out.println();

        worker.displayEmployeeDetails();
        System.out.println();

        salesPerson.displayEmployeeDetails();
        System.out.println();
        sc.close();
    }
}

/* Create an abstract class “Employee” with abstract methods “calculateSalary()” and “displayEmployeeDetails()”. Implement two subclasses “Manager” and “Worker” which extend “Employee” and implement the abstract methods. Create a “SalesPerson” class which extends “Manager” and overrides the necessary methods. Create objects of all classes and test their behavior. */
