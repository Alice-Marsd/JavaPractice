package com.circle;

import java.util.Scanner;

public class Main {
	final static double PI=Math.atan(1.0)*4;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int r=scan.nextInt();
		System.out.println(String.format("%.7f", PI*r*r));
	}
}
