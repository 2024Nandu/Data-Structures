package String;

import java.util.Scanner;

public class Append {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO: Ask user for input strings
		System.out.println("Enter a str1, str2, str3 : ");
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		String str3 = scanner.nextLine();
		// TODO: Append strings using StringBuffer
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		sb.append(str2);
		sb.append(str3);
		// TODO: Print the result
		System.out.println("The concatenated string is '" + sb.toString() + "'.");

		scanner.close();
	}
}
