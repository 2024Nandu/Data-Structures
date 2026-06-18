package String;

	import java.util.Scanner;
	public class Concatination {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // TODO: Ask user for input string
	        System.out.println("Enter str1 and str2: ");
	        String str1 = scanner.nextLine();
	        String str2 = scanner.nextLine();
	        // TODO: Concatenate the strings

	        // TODO: Print the concatenated result
	        System.out.println("The full name is " + str1.concat(str2) + ".");
	        scanner.close();
	    }
	}
