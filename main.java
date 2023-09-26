/**
 * dr. Johnson
 * @author tylerlericos
 * CS215
 * Assignment 2.2 PalindromeTest
 */
import java.util.*;
public class main {
	
	public static void main(String args[]) {
		
		Stack palindrome = new Stack();
		Scanner scan = new Scanner(System.in);
		String p1;
		
		System.out.println("Enter your palindrome: ");
		//Taking the Palindrome
		p1 = scan.next();
		//Prints the String
		System.out.println("You're String: " + p1);
		
		//=====================================================
		//Testing for Palindrome
		//=====================================================
		
		
		
		//Pushes all the characters into the stack
		for (int i = 0; i < p1.length(); i++) {
            palindrome.push(p1.charAt(i));
        }
		//Creates a reversed string for the 
        String reverseString = "";
        //While loop for testing the palindrome until the palindrome stack is not empty
        while (!palindrome.isEmpty()) {
            reverseString = reverseString+palindrome.pop(); // reverse string is all the popped items of the original palindrome
        }
        //Printing the Reversed String
        System.out.println("Reversed String: " + reverseString);
        //Prints out if the reverse string equals your input!
        if (p1.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");
		
		
		
		
	}
	
}
