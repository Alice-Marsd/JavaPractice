package com.competition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int num=0;
		String result=null;
		while(scan.hasNextInt())
		{
			num=scan.nextInt();
			result=Competition(num);
			System.out.println(result);
		}
	}

	private static String Competition(int num) 
	{
		ArrayList<String> list=new ArrayList();
		String value=null;
		for (int i = 0; i <= num; i++) {
			list.add(String.valueOf(i));	
		}
		while(num!=0)
		{
			for (int i = 1,j = num; i < j; i++,j--)
			{
				value="("+list.get(i)+","+list.get(j)+")";
				list.set(i, value);			
			}
			num=num/2;
		}
		
		return list.get(1);
	}



}
