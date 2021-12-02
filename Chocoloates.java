package com.Java;

import java.util.Scanner;

public class Chocoloates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of chocolates:");
		int chocolates=sc.nextInt();
		System.out.println("Enter the number of children:");
		int children=sc.nextInt();
		int given=0;
		for(int i=1;i<=children;i++) {
			if(chocolates>=i) {
				chocolates=chocolates-i;
				given++;
				
			}
		}
		System.out.println("Chocolates remaining:"+(chocolates));
		System.out.println("childrens got the chocolates:"+given);

	}

}
