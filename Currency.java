package com.Java;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the paid amount:");
		int paid=sc.nextInt();
		int n100,n50,n10,n5,n2,n1=0;
		n100=paid/100;
		paid=paid%100;
		n50=paid/50;
		paid=paid%50;
		n10=paid/10;
		paid=paid%10;
		n5=paid/5;
		paid=paid%5;
		n2=paid/2;
		paid=paid%2;
		n1=paid;
		int total=n100+n50+n10+n5+n2+n1;
		System.out.println(n100+ " "+n50+ " "+n10+ " "+n5+ " "+ n2+" "+n1);
		System.out.println(total+" is the minimum number of currency notes, so the output is "+total);
		

	}

}
