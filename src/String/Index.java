package String;
	import java.util.Scanner;
	public class Index {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // TODO: Ask user for input string
	        System.out.println("Enter the string :");
	        String str1 = scanner.nextLine();
	        // TODO: Ask user for a character to find
	        // str1.indexOf('J');
	        // TODO: Print the index of the first occurrence
	        if(str1.indexOf('a') == -1){
	            System.out.println("Character not found.");
	        }else{
	        System.out.println("The index of the first occurrence is " + str1.indexOf('a') + ".");
	        }
	        scanner.close();
	    }
	}
