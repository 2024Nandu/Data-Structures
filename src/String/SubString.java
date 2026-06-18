package String;

	
	import java.util.Scanner;
	public class SubString {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // TODO: Ask user for input string
	        System.out.println("Enter the String: ");
	        String str1 = scanner.nextLine();
	        // TODO: Ask user for two indices
	        int start = scanner.nextInt();
	        int end = scanner.nextInt();
	        // System.out.println(str1);
	        // System.out.println(str1.length());
	        if(end > str1.length()){
	            System.out.println("Invalid indices.");
	        }else{
	        str1.substring(start, end);
	        System.out.println("The substring is " + str1.substring(start, end) + ".");
	        }
	        // TODO: Print the substring between the two indices
	        scanner.close();
	    }
	}