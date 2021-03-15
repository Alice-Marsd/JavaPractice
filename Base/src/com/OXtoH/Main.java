package com.OXtoH;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=Integer.valueOf(scan.nextLine());
		String a[]=new String[n];
		for(int i=0;i<=n;i++)
		{
			System.out.println("µÚ"+i+"ÊäÈë");
			a[i]=scan.nextLine();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("-------"+a[i]+"---------");
		}
//		for (int i = 0; i < a.length; i++)
//		{
//			char[] b=a[i].toCharArray();
//			for (int j = 0; j < b.length; j++) 
//			{
//				
//				Stack stack=new Stack();
//				System.out.println(b[j]);
//				int n1=Integer.valueOf(b[j]);
//				System.out.println(n1);
//				while(n!=0)
//				{
//					
//					stack.push(b[j]%2);
//					b[j]=(char) (b[j]/2);
//				}
//				
//
//			for (int j = 0; j < a[i].length(); j++) {
//				
//			}
//			
//		}
	}

}
