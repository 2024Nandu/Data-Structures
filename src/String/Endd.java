package String;

	import java.util.Scanner;
	public class Endd {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // TODO: Ask user for input string and positions
	        System.out.println("Enter a string");
	        String str = scanner.nextLine();
	        // TODO: Extract and print the substring
	        int start = scanner.nextInt();
	        int end = scanner.nextInt();
	        String result = str.substring(start, end);
	        System.out.print("Substring: ");
	        System.out.print("\"");
	        System.out.print(result);
	        System.out.print("\"");
	        

	        scanner.close();
	    }
	}
