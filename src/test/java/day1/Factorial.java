package day1;

public class Factorial {

	public static long factorial(int num) {
		long result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		int num = 15;
		System.out.println("The Factotial of the number : " + num + " is " + factorial(num));
	}
}
