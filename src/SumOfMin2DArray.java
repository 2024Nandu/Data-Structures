
import java.util.Scanner;

public class SumOfMin2DArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: Ask user for array dimensions and create the 2D array
		 System.out.println("Enter the 2D array: ");
		int arr[][] = new int[3][4];
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr.length - 1; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		// TODO: Populate the array with user input
		 System.out.println("Enter the elements: ");
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			int min = arr[i][0];
			for (int j = 0; j <= arr.length - 1; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
			sum = sum + min;
		}

		// TODO: Find min element in each row and calculate their sum
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr.length - 1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sum of min: " + sum);
		scanner.close();
	}

}
