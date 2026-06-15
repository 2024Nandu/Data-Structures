import java.util.Scanner;

public class PracticeTwoDArray {

	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = scan.nextInt();
		System.out.println("Enter the number of columns: ");
		
		int columns = scan.nextInt();
		
		int a[][] = new int[rows][columns];
		
		System.out.println("Enter the elements: ");
		for(int i = 0; i< rows; i++) {
			for(int j=0; j< columns; j++) {
				a[i][j] = scan.nextInt();
				}
		}
		
		System.out.println("Array elements are: ");
		for(int i = 0; i< rows; i++) {
			for(int j = 0; j< columns; j++) {
				System.out.print(a[i][j] + " ");
			}
System.out.println();
scan.close();
	}
	}
}
