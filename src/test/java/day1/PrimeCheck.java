package day1;

import java.util.Scanner;

public class PrimeCheck {
	public static Boolean isPrime(int num) {
		if (num == 1)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		num = s.nextInt();
		if (isPrime(num)) {
			System.out.println("The number " + num + " is prime");
		} else {
			System.out.println("The number " + num + " is not prime");
		}
		s.close();
	}
}
