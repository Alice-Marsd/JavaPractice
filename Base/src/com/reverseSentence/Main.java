package com.reverseSentence;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=null;
		while(scan.hasNextLine())
		{
			str=scan.nextLine();
			reverseSentence(str);
			
		}

	}

	private static void reverseSentence(String str) {
		if (str.isEmpty() || str.equals("")) return ;
		String[] words=str.split(" ");
		for (int i =words.length-1; i > 0; i--) 
		{
			System.out.print(words[i]+" ");
		}
		System.out.print(words[0]);
	}

}
