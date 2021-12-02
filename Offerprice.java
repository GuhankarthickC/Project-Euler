package com.Java;

import java.util.Scanner;

public class Offerprice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first product price");
		int a=sc.nextInt();
		System.out.println("Enter your second product price");
		int b=sc.nextInt();
		System.out.println("Enter your third product price");
		int c=sc.nextInt();
		int total=a+b+c;
		double offer1=(0.2)*total;
		int least=0;
		if(a<b && a<c) {
			least=a;
		}
		else if(b<a && b<c){
			least=b;
		}
		else {
			least=c;
		}
		double payoffer1=total-offer1;
		double payoffer2=total-least;
		if(payoffer1<payoffer2) {
			System.out.println("Offer 1 is beneficial to the customer");
			System.out.println("Total "+total);
			System.out.println("Offer 1 discount -> "+offer1);
			System.out.println("Offer 2 least value -> "+least);
		}
		else {
			System.out.println("Offer 2 is beneficial to the customer");
			System.out.println("Total "+total);
			System.out.println("Offer 1 discount -> "+offer1);
			System.out.println("Offer 2 least value -> "+least);
		}
				
	}

}
