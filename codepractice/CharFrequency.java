package codepractice;

import java.util.Scanner;

public class CharFrequency {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int[] frequency = charFrequency(input);
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + ": " + frequency[i]);
            }
        }
    }

    private static int[] charFrequency(String input) {
       
        int[] freq = new int[256]; // Assuming ASCII
        for (char c : input.toCharArray()) {
            freq[c]++;
        }
        return freq;
    }

}
