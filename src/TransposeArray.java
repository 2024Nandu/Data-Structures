
	
	import java.util.Scanner;

	public class TransposeArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // TODO: Ask user for msions and create the 2D array
	        System.out.println("Enter the rows and cols: ");
	        int rows = scanner.nextInt();
	        int cols = scanner.nextInt();
	        int arr[][] = new int[rows][cols];
	        System.out.println("Enter the element of atray: ");

	        for(int i = 0; i <= arr.length-1; i++) {
	            for(int j = 0; j <= arr.length-1; j++) {
	                arr[i][j] = scanner.nextInt();
	            }
	        }

	        // TODO: Populate the matrix with user input
	       
	        System.out.println("Original Matrix: ");
	        for(int i = 0; i <= arr.length-1; i++) {
	            for (int j = 0; j <= arr.length-1; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	            System.out.println();

	        // TODO: Calculate and print the transpose of the matrix

	        int trans[][] = new int[rows][cols];
	        for(int i = 0; i <= arr.length-1; i++) {
	            for(int j = 0; j <= arr.length-1; j++) {
	               trans[j][i]= arr[i][j];
	            }
	        }

	        System.out.println("Transpose of the Matrix: ");
	        for(int i = 0; i <= trans.length-1; i++) {
	            for (int j = 0; j <= trans.length-1; j++) {
	                System.out.print(trans[i][j] + " ");
	            }
	            System.out.println();
	        }
	        scanner.close();
	    }
	}
