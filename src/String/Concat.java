package String;
import java.util.Scanner;
	public class Concat {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // TODO: Read the original username
	        System.out.println("Enter str1 and str2: ");
	        String str1 = scanner.nextLine();
	        // TODO: Read the suffix to append
	        String str2 = scanner.nextLine();

	        // TODO: Create a new username
	        String str3 = str1 + str2;
	        // TODO: Print both the original and new usernames
	        System.out.println("Original Username: " + str1);
	        System.out.println("New Username: " + str3);
	        scanner.close();
	    }
	}	
	

