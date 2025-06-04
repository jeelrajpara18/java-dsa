package OOPS;

import java.util.Scanner;

public class Heroian {
    private int sideA;
    private int sideB;
    private int sideC;

    public Heroian (int a , int b , int c){
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    public int PerimeterOfTriangle(){
        return sideA + sideB + sideC;
    };

    public double AreaOfTriangle(){
        double s = PerimeterOfTriangle();
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    };

    public boolean IsHeroianTriangle(){
        double a = AreaOfTriangle();
        return a == Math.floor(a);
    };

    public void displayInfo(){
        System.out.println("Perimeter of triangle : " + PerimeterOfTriangle());
        System.out.println("Area of triangle : " + AreaOfTriangle());
        System.out.println("Heronian Triangle: " + (IsHeroianTriangle() ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of triangle");
        int sideA = sc.nextInt();
        int sideB = sc.nextInt();
        int sideC = sc.nextInt();

        Heroian h1 = new Heroian(sideA, sideB, sideC);
        h1.displayInfo();
    }
}
