package strings;

public class StringExample {
    public static void main(String[] args) {
        // Creating strings
        String str1 = "Hello";
        String str2 = "World";

       // Creating a string using the new keyword
       //difference between above and below is that above is string literal and below is string object
       // String literal are stored in string pool and string objects are stored in heap memory
       // String literals are more memory efficient as they are reused if the same value is assigned again
// String objects are created in heap memory and are not reused
// Example:
// String str1 = "Hello"; // String literal
// String str2 = "Hello"; // Reuses the same string from the string pool    
// String str3 = new String("Hello"); // Creates a new string object in heap memory
// String str4 = new String("Hello"); // Creates another new string object in heap memory
// In the above example, str1 and str2 point to the same memory location in the string pool, while str3 and str4 point to different memory locations in heap memory
// This can lead to increased memory usage if many identical strings are created using the new keyword
       // Therefore, it is generally recommended to use string literals unless there is a specific need to create a new string object
       // like when you want to create a mutable string using StringBuilder or StringBuffer
       // or when you want to ensure that a new object is created for security reasons
       // or when you want to use specific constructors of the String class
       // However, for most common use cases, string literals are preferred for their simplicity and memory efficiency
       
       String str4 = new String("String Object example");

        // Concatenating strings
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated string: " + str3); // Output: Concatenated string: Hello World

        // String length
        System.out.println("Length of str3: " + str3.length()); // Output: Length of str3: 11

        // Character at a specific index
        System.out.println("Character at index 1 in str3: " + str3.charAt(1)); // output: Character at index 1 in str3: e

        // Substring
        System.out.println("Substring of str3 from index 6 to 11: " + str3.substring(6, 11)); // Output: Substring of str3 from index 6 to 11: World
    }
}
