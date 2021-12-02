package com.Java;

import java.util.Scanner;

public class Archery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the target:");
		int points=0;
		int target=sc.nextInt();
		for(int i=1;i<=target;i++) {
			System.out.println("Your turn for scoring!");
			int turn=sc.nextInt();
			points+=turn;
			if(points>=target) {
				System.out.println("Scored points :"+points);
				System.out.println("No of turns :"+i);
				break;
			}
			
		}

	}

}
