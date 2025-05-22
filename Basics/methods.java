package Basics;
/* A method is a collection of statements that perform specific tasks and return a result to the caller. It can be declared with or without arguments, depending on the requirements. A method can take input values, perform operations, and return a result. */
class Students {
    private int id;
    private String name;

    // Constructor for initialization
    public Students (int id , String name){
        this.id = id;
        this.name = name;
    }

    // method demonstrating parameter passing
    public void printStudent(String header){
        System.out.println(header);
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
    }

    // Getter methods
    public int getId(){return id;}
    public String getName(){return name;}

}
public class methods {
    public static void main(String[] args) {
        Students obj = new Students(101, "xyz");
        obj.printStudent("Student Details");
    }
}
