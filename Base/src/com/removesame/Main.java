package com.removesame;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str;
		while(scan.hasNextLine())
		{
			str=scan.nextLine();
			removeSame(str);
		}
	}

	private static void  removeSame(String str) {
		String result=new String();
		boolean[] temp=new boolean[26*2];
		for (int i = 0; i < temp.length; i++) {
			temp[i]=true;
		}
		for (int i = 0; i < str.length(); i++) {
			char cc=str.charAt(i);
			if( cc<='z' && cc>='a' && temp[2*(cc-'a')])
			{
				temp[2*(cc-'a')]=false;
				System.out.print(cc);	
			}else if( cc<='Z' && cc>='A'&& temp[2*(cc-'A')+1]){
				temp[2*(cc-'A')+1]=false;
				System.out.print(cc);	
			}		
		}	
		System.out.println();
	}
}
