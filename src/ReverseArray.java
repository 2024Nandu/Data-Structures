import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = scan.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}

		int revArr[] = new int[size];
		int j = revArr.length - 1;
		for (int i = 0; i <= arr.length - 1; i++) {
			revArr[i] = arr[j];
			j--;
		}

		System.out.println("Reversed elements are: ");
		for (int i = 0; i <= revArr.length - 1; i++) {
			System.out.print(revArr[i] + " ");
		}
	}

}
