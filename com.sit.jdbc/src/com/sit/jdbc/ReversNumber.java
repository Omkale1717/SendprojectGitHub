package com.sit.jdbc;

import java.util.Scanner;

public class ReversNumber {
	public static void main(String[] args) {
		int n=0;
		int r=0;
		Scanner Sc=new Scanner (System.in);
		System.out.println("Enetr Your Number");
		n=Sc.nextInt();
		while(n>0) {
			r=n%10;
			System.out.println("The Revers Oder Is :"+r);
			n=n/10;
		}
		
	}

}
