package com.euler;

public class Sumofsqaures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,sumOfSquare=0,difference=0,squareOfSum=0;
		for(int i=1;i<=100;i++)
		{
		sum=sum+i;
		sumOfSquare += (i * i);
		}
		squareOfSum =sum*sum;
		difference=squareOfSum - sumOfSquare;
		System.out.println(difference);

		}

	

}
