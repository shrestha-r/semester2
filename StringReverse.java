// Reverse string using stirng array

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input_string = scan.nextLine();
        char[] reverseString = input_string.toCharArray();
        String string= "";
        for(int i =0;i<input_string.length();i++){
            string = reverseString[i] + string;
        }
        System.err.println("Original Stirng is "+(input_string));
        System.out.println("Reverse String is "+string);
    }
}

// Output of the code
// Enter a String: HelloWorld
// Original Stirng is HelloWorld
// Reverse String is dlroWolleH
