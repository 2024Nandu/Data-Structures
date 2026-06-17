
	import java.util.Scanner;

	public class SumOfLayers {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // TODO: Ask user for array dimensions and create the 3D ar
	        System.out.println("Enter the rows cols depth");
	        int depth = scanner.nextInt();
	        int rows = scanner.nextInt();
	        int columns = scanner.nextInt();

	        int arr[][][] = new int[depth][rows][columns];

	        
	        System.out.println("Enter elements: ");
	        // TODO: Populate the array with user input
	        for(int i = 0; i <= arr.length-1; i++) {
	            for(int j = 0; j <= arr[i].length-1; j++) {
	                for (int k = 0; k <= arr[i][j].length-1; k++) {
	                    arr[i][j][k] = scanner.nextInt();
	                }
	            }
	        }
	        
	        System.out.println("3D Array: ");
	         for(int i = 0; i <= arr.length-1; i++) {
	        System.out.println("Layer " + (i + 1) + ": ");
	            for(int j = 0; j <= arr[i].length-1; j++) {
	                for (int k = 0; k <= arr[i][j].length-1; k++) {
	                    System.out.print(arr[i][j][k] + " ");
	                }
	                System.out.println();
	            }
	        }

	        int sum = 0;
	        for(int i = 0; i <= arr.length-1; i++) {
	            for (int j = 0; j <= arr[i].length-1; j++) {
	                for (int k = 0; k<= arr[i][j].length-1; k++) {
	                    sum += arr[i][j][k];
	                }
	            }
	        System.out.println("Sum of layer " + (i + 1) + ": " + sum);
	        sum = 0;
	        }
	        scanner.close();
	    }
	}
