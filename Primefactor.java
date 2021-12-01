package com.Java;

public class Primefactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a=600851475143L;
		for(int i=2;i<a;i++) {
			while(a%i==0) {
				a=a/i;
			}
		}
		if(a>2) {
			System.out.println(a);
		}
	}

}
