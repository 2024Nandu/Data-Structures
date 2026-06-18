package String;

	import java.util.Scanner;
	public class Compare {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // TODO: Ask user for input password
	        System.out.println("Enter the str1 and str2: ");
	        String str1 = scanner.nextLine();
	        // TODO: Compare the input password with a predefined password
	        String str2 = scanner.nextLine();

	        // TODO: Print the comparison result
	        System.out.println(str1.equals(str2));
	        scanner.close();
	    }
	}