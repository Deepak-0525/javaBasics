package oopsConcept;

public class ClassMethods {
    static void StaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void PublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {
        StaticMethod(); // Call the static method

        ClassMethods Obj = new ClassMethods(); // Create an object of ClassMethods
        Obj.PublicMethod(); // Call the public method on the object
    }
}
