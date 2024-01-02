package oopsConcept;

import java.util.Scanner;

public class Encapsulation {
    private String name;
    private int age;

    // public constructor to initialize the data fields
    public Encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public getter method for name
    public String getName() {
        return name;
    }

    // public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // public getter method for age
    public int getAge() {
        return age;
    }

    // public setter method for age
    public void setAge(int age) {
        // check if the age is valid
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        Encapsulation p1 = new Encapsulation(name, age);

        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());

        System.out.print("Enter the new name: ");
        name = sc.next();
        p1.setName(name);

        System.out.print("Enter the new age: ");
        age = sc.nextInt();
        p1.setAge(age);

        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());

        System.out.print("Enter an invalid age: ");
        age = sc.nextInt();
        p1.setAge(age); // prints "Invalid age"
    }

}