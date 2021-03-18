package com.competition;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=0;
		while(scan.hasNextInt())
		{
			num=scan.nextInt();
			Competition(1,num);
		}
	}

	private static void Competition(int i,int j) {
		if(j==1) return;
		System.out.print("(");
		Competition(j/2,j);
		System.out.print(i+","+j);
		Competition(i,j);
		System.out.print(")");
		
	}



}
