package strings;

public class StringMethodsExample {
    public static void main(String[] args) {
        // Creating a string
        //default value is null
        // String str; // Declaration without initialization
        // System.out.println(str); // This will cause a compile-time error
        //why? because local variable must be initialized before use
        // To fix this, we can initialize the string
        String str1 = null; // Declaration with initialization to null
        // System.out.println(str1.length()); // This will cause a NullPointerException
        //why? because str1 is null and we are trying to call a method on it
        // To fix this, we can initialize the string to an empty string or a valid string
        str1 = ""; // Now str1 is an empty string   
        System.out.println("Length of str1: " + str1.length()); // Output: Length of str1: 0
        str1 = "Hello"; // Now str1 is a valid string
        System.out.println("Length of str1: " + str1.length()); // Output:
        String str = "Hello World";

        // Convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr); // Output: Uppercase: HELLO WORLD

        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr); // Output: Lowercase: hello world

        // Check if string contains a substring
        boolean containsHello = str.contains("Hello");
        System.out.println("Contains 'Hello': " + containsHello);// Output: Contains 'Hello': true

        // Replace characters in string
        String replacedStr = str.replace('l', 'p');
        System.out.println("Replaced 'l' with 'p': " + replacedStr);// Replaced 'l' with 'p': Heppo Worpd

        // Split string
        String[] parts = str.split(" ");
        System.out.println("Split string:");// Output: Split string:
        for (String part : parts) {
            System.out.println(part);
        }
        // Hello
        // World
    }
}
