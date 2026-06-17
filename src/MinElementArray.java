


	
	import java.util.Scanner;

	public class MinElementArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // TODO: Ask user for array size and create the 
	        System.out.println("Enter the size of an array: ");
	        int size = scanner.nextInt();
	        int arr[] = new int[size];
	        
	        // TODO: Populate the array with user input
	        System.out.println("Enter the elements: ");
	        for(int i=0; i<=arr.length-1; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        System.out.print("Array: ");
	        System.out.print("[");
	        for(int i = 0; i<=arr.length-1; i++) {
	            if(i == arr.length-1) {
	                System.out.print(arr[i]);
	            } else {
	                System.out.print(arr[i] + ", ");
	            }
	        }
	        System.out.println("]");
	        
	        // TODO: Find the minimum value in the array
	        int min = arr[0];
	        for(int i = 0; i < arr.length - 1; i++){
	            if(min > arr[i + 1]){
	                min = arr[i + 1];
	            }
	        }
	        System.out.print("Minimum value: " + min);
	        
	        // TODO: Print the original array and the minimum value
	        
	        scanner.close();
	    }
	}
