
import java.util.Scanner;
public class AddingArray {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // TODO: Create a 1D array of integers with size 5
	        System.out.println("Enter the size of an array: ");
	        int size = scanner.nextInt();   
	        int arr[] = new int[size];
	    
	        // TODO: Populate the array with user input
	        System.out.println("Enter the array elements: ");
	        for (int i = 0; i <= arr.length-1; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        // TODO: Calculate the sum of all elements in the array
	        int sum = 0;
	        for(int i = 0; i <= arr.length-1; i++) {
	            sum = sum + arr[i];
	        }
	        System.out.print("Array: ");
	        System.out.print("[");
	        for(int i = 0; i <= arr.length-1; i++) {
	            if (i < size - 1)
	            {
	                System.out.print(arr[i] + ", ");
	            } else {
	                System.out.print(arr[i]);
	            }
	        }
	        System.out.println("]");
	        System.out.println("Sum: " + sum);
	        // TODO: Print the original array and the calculated sum
	        
	        scanner.close();
	    }
	
}
