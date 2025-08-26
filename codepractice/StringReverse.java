package codepractice;

import java.util.Scanner;

public class StringReverse {

    public static String reverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String original = sc.nextLine();
        String reversed = StringReverse.reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

}
