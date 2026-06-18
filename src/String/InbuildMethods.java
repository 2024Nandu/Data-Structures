package String;
	import java.util.Scanner;
	public class InbuildMethods {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // TODO: Read input from the user
	        System.out.println("Enter str1 and str2: ");
	        String input = scanner.nextLine();
	        
	        // TODO: Create a string using double quotes
	        String str1 = input;
	        // TODO: Create a string using the new keyword
	        String str2 = new String(input);
	        // TODO: Display both strings
	        System.out.println("Enter a line of text: String created using double quotes: " + str1);
	        System.out.println("String created using new keyword: " + str2);

	        // TODO: Compare references using '=='
	        System.out.println("Are the two strings equal by '=='? " + (str1 == str2));
	        // TODO: Compare contents using 'equals()'
	        System.out.println("Are the two strings equal by 'equals()'? " + str1.equals(str2));
	        // TODO: Display the results

	        scanner.close();
	    }
	}