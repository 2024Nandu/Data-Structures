package String;
	
	import java.util.Scanner;
	public class Upper {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // TODO: Ask user for input string
	        System.out.println("Enter a string: ");
	        String str1 = scanner.nextLine();
	        // TODO: Print the string in uppercase
	        System.out.println("The string in uppercase is " + str1.toUpperCase() + ".");
	        System.out.println("The string in lowercase is " + str1.toLowerCase() + ".");
	        // TODO: Print the string in lowercase
	        scanner.close();
	    }
	}
