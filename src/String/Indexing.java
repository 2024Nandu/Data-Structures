package String;
	
	import java.util.Scanner;
	public class Indexing {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // TODO: Ask user for input string
	        System.out.println("Enter the string: ");
	        String str1 = scanner.nextLine();
	        // TODO: Ask user for an index
	        int index = scanner.nextInt();
	        if(index > str1.length()){
	            System.out.println("Invalid index.");
	        }else{
	        str1.charAt(index);
	        System.out.println("The character at index 5 is " + str1.charAt(index) + ".");
	        }
	        // System.out.println(str1);
	        // TODO: Print the character at the specified index
	        scanner.close();
	    }
	}
