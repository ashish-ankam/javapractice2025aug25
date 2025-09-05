package constructor;
// Copy Constructor Example
// A copy constructor is a special type of constructor that creates a new object as a copy of an existing object.
// It takes a reference to an object of the same class as a parameter and copies its values
// to the new object.
// This is useful when you want to create a new object with the same state as an existing
// object without affecting the original object.
// Note: Java does not provide a default copy constructor like C++. You have to define it explicitly.
// Here is an example of a copy constructor in Java:



public class CopyConstructorExample {
    int var1;
    int var2;

    // Parameterized constructor
    public CopyConstructorExample(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
        System.out.println("Parameterized constructor called.");
    }

    // Copy constructor
    public CopyConstructorExample(CopyConstructorExample example) {
        this.var1 = example.var1;
        this.var2 = example.var2;
        System.out.println("Copy constructor called.");
    }

    public void display() {
        System.out.println("var1: " + var1 + ", var2: " + var2);
    }

    public static void main(String[] args) {
        CopyConstructorExample original = new CopyConstructorExample(30, 40); // Output: Parameterized constructor called.
        CopyConstructorExample copy = new CopyConstructorExample(original); // Output: Copy constructor called.

        original.display(); // Output: var1: 30, var2: 40
        copy.display(); // Output: var1: 30, var2: 40
    }
}
