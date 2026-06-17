

	import java.util.Scanner;

	public class Sum2DArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // TODO: Ask user for array dimensions and create the 2D array
	        int rows = scanner.nextInt();
	        int cols = scanner.nextInt();
	        int arr[][] = new int[rows][cols];
	        for(int i=0; i <= arr.length-1; i++) {
	            for (int j = 0; j<= arr.length-1; j++) {
	                arr[i][j] = scanner.nextInt();
	            }
	        }
	        
	        // TODO: Populate the array with user input
	        System.out.println("Array: ");

	        for(int i = 0; i<=arr.length-1; i++) {
	            for(int j = 0; j <= arr.length-1; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }

	        int min = 0;
	        int sum = 0;
	        for(int i = 0; i <= arr.length - 1; i++){
	            min = arr[i][0];
	            for(int j = 0; j < arr.length -1; j++){
	                if(arr[i][j] < min){
	                    min = arr[i][j];
	                }
	            }
	                sum = sum + min;
	            System.out.println("Minimum of row " + (i + 1) + ": " + min);
	        }
	            System.out.println("Sum of minimum elements: " + sum);
	            scanner.close();
	    }

	        
	    }

