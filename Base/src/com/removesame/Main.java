package com.removesame;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str;
//		int a='z';				//A 65,Z 90,a 97,z 122
//		System.out.println(a);
		while(scan.hasNextLine())
		{
			str=scan.nextLine();
			removeSame(str);
			//System.out.println(str);
		}
	}

	private static void  removeSame(String str) {
		String result=new String();
		int[] temp=new int[26];
		for (int i = 0; i < temp.length; i++) {
			temp[i]=0;
		}
		for (int i = 0; i < str.length(); i++) {
			char cc=str.charAt(i);
			if( cc<='z' && cc>='a' && temp[cc-'a']==0 && temp[cc-'a']<2)
			{
				temp[cc-'a']=1;
				System.out.print(cc);
			}
				
				
		}
		
	}
}