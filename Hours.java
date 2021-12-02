package com.Java;

import java.util.Scanner;

public class Hours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total salary paid:");
		int paid=sc.nextInt();
/*		80(x+10)+50x=2750
		80x+800+50x=2750
				130x=2750-800
				x=1950/130=15*/
		int x=paid-800;
		int Weekends=x/130;
		int Weekdays=Weekends+10;
		System.out.println("Number of weekday hours is :"+Weekdays );
		System.out.println("Number of weekend hours is :"+Weekends );
		
		

	}

}
