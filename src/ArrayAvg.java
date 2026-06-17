	
	import java.util.Scanner;

	public class ArrayAvg {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // TODO: Ask user for array size and create the array
	        System.out.println("Enter the size of an array: ");
	        int size = scanner.nextInt();
	        int arr[] = new int[size];
	        System.out.println("Enter the elements: ");
	        // TODO: Populate the array with user input
	        for(int i = 0; i<=arr.length-1; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        System.out.print("Array: ");
	        System.out.print("[");
	        for(int i = 0; i <= arr.length-1; i++) {
	            // arr[i] = scanner.nextInt();
	            if(i == arr.length - 1){
	            System.out.print(arr[i]);
	            }else{
	            System.out.print(arr[i] + ", ");
	            }
	        }
	        System.out.println("]");
	        
	        // TODO: Calculate the average of array elements
	        double sum = 0;
	        for(int i = 0; i <= arr.length-1; i++) {
	            sum = sum + arr[i];
	        }
	        double Ave = sum/arr.length;
	        
	        // TODO: Print the original array and the average
	        System.out.print("Average: " + Ave);
	        
	        scanner.close();
	    }
	}