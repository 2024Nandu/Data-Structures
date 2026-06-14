import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
				System.out.println("Enetr the size of an array: ");
				int size = scan.nextInt();
				int a[] = new int[size];
				System.out.println("Enter elements: ");
				for(int i=0; i<=a.length-1; i++) {
					a[i] = scan.nextInt();
				}
				System.out.println("Array elements are: ");
				System.out.print("[");
				for(int i=0; i<=a.length-1; i++) {
					if(i != size-1) {
						System.out.print(a[i] + ", ");
					}
					else {
						System.out.print(a[i]);
					}
				}
				System.out.print("]");
		}
}
