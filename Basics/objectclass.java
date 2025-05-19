package Basics;

import java.util.Scanner;

class Car {
    int carId ;
    String carType;
    int carRent;

    public void getCar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car Id : ");
        carId = sc.nextInt();
        System.out.println("Enter car type : ");
        carType = sc.next();
        sc.close();
    }

    public void getRent(){
        if(carType.equals("Small")){
            carRent = 1000;
        }
        else if(carType.equals("Van")){
            carRent = 800;
        }
        else if(carType.equals("SUV")){
            carRent = 2500;
        }
        else{
            System.out.println("Enter proper car type");
        }
    }

    public void showCar(){
        System.out.println("Car Id : " +carId);
        System.out.println("Car type : " +carType);
        System.out.println("Car Rent : " +carRent);
    }
}

class Supply {
    int Code;
    String FoodName;
    String Sticker;
    String FoodType;

    public void GetType (){
        if(Sticker.equals("Green")){
            FoodType = "Vegetarian";
        }
        else if(Sticker.equals("Yellow")){
            FoodType = "Contains Egg";
        }
        else if(Sticker.equals("Red")){
            FoodType = "Non-vegetarian";
        }
        else{
            System.out.println("Enter valid Sticker type");
        }
    }

    public void FoodIn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter food code : ");
        Code = sc.nextInt();
        System.out.println("Enter Food Name : ");
        FoodName = sc.next();
        System.out.println("Enter sticker");
        Sticker = sc.next();
        GetType();
        sc.close();
    }

    public void FoodOut(){
         System.out.println("You Entered ");
        System.out.println("Code : " + Code);
        System.out.println("Food Name : " + FoodName);
        System.out.println("Sticker : " + Sticker);
        System.out.println("Food Type : " + FoodType);
    }
}
public class objectclass {
    public static void main(String[] args) {
        // Car obj = new Car();
        // obj.getCar();
        // obj.getRent();
        // obj.showCar();

        Supply obj = new Supply();
        obj.FoodIn();
        obj.FoodOut();
    }
}
