package String;

	import java.util.Scanner;
	public class Equals {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // TODO: Ask user for two input strings
	        System.out.println("The Strings are: ");
	        String str1 = scanner.nextLine();
	        String str2 = scanner.nextLine();
	        // TODO: Compare the strings and print the result
	        if(str1.equals(str2)){
	            System.out.println("The strings are equal.");
	        } else {
	            System.out.println("The strings are not equal.");
	        }
	        scanner.close();
	    }
	}
