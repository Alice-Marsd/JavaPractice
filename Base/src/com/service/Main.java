package com.service;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt())
		{
			int n=scan.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;++i)
			{
				a[i]=scan.nextInt();
			}
			PrintSort(a,0,n-1);
			PrintLink(a,n);
		}
		

	}

	private static void PrintLink(int[] a, int n) {
		int i;
		for(i=0;i<n-1;++i)
		{
			if(a[i]!=a[i+1])
				System.out.println(a[i]);
		}
		System.out.println(a[n-1]);
	}

	private static void PrintSort(int[] a,int low, int high) 
	{
		if(low < high)
		{
			int mid= getIndex(a,low,high);
			PrintSort(a,low,mid-1);
			PrintSort(a,mid+1,high);
		}
		
	}

	private static int getIndex(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		int base=a[low];
		while(low<high)
		{
			while(a[high]>=base && low<high) high--;
			a[low]=a[high];
			while(a[low]<base && low<high) low++;
			a[high]=a[low];
		}
		a[low]=base;
		return low;
	}

}
