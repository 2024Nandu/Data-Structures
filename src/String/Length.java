package String;

	import java.util.Scanner;
	public class Length {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // TODO: Ask user for input string
	        System.out.println("Enter the string: ");
	        String str1 = scanner.nextLine();
	        // TODO: Print the length, even if the string is empty
	        System.out.println("The length of the string is " + str1.length() + ".");
	        scanner.close();
	    }
	}
