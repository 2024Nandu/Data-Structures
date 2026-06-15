import java.util.Scanner;

public class OneDArray1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter the elements");
		for(int i=0; i<=4; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("Elements elements");
		for(int i=0; i <= 2; i++) {
			System.out.println(a[i]);
			
		}
		scan.close();
	}


}
