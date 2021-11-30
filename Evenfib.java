package com.Java;

public class Evenfib {

	public static void main(String[] args) {
		int m=0,n=1,temp=0,sum=0;
		int a=4000000;
		do {
			temp=m+n;
			m=n;
			n=temp;
			if(temp%2==0) {
				sum +=temp;
			}
			
		}while(m<a);
		System.out.println(sum);

	}

}
