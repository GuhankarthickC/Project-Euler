package com.euler;

public class Summationprimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
		for(long i = 2; i < 2000000; i++) {
		if(isPrime(i)) {
		sum += i;
		}
		}
		System.out.println(sum);
		}

		private static boolean isPrime(long n) {
		int count = 0;
		long sqrt = (long)Math.sqrt(n);

		for(long i = 1; i <= sqrt; i++) {
		if(n % i == 0) {
		count++;
		}
		if(count > 1) {
		return false;
		}
		}
		return true;
		}

}
