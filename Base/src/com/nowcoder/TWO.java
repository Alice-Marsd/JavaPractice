package com.nowcoder;

import java.util.Scanner;

public class TWO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {1,2,3,5,6,4,0};
		int n=7;
		System.out.println( getMex(A,n));

	}
	 public static int getMex(int[] A, int n) {
	        // write code here
	        int i;
	        boolean[] B=new boolean[n];
	        for(i=0;i<n;++i)
	        	B[i]=true;
	        for(i=0;i<n;++i)
	        { 
	            if( A[i]<=n )
	            {
	                B[A[i]-1]=false;
	            }
	        }
	        for(i=0;i<n;++i)
	        {
	            if(B[i])
	                break;
	        }
	        return i+1;
	    }
	 	
}
