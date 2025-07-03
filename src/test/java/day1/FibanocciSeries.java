package day1;

import java.util.Scanner;

public class FibanocciSeries {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		s.close();
		System.out.println("Fibanocci Series up to " + num + " is");
		int a = 0, b = 1;
		while (a <= num) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}
	}
}
