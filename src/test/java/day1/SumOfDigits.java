package day1;

public class SumOfDigits {
	public static int sumOfDigits(int num) {
		int sum = 0, rem = 0;
		while (num > 0) {
			rem = num % 10;
			sum += rem;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num = 378;
		System.out.println("The Sum of the digits " + sumOfDigits(num));
	}
}
