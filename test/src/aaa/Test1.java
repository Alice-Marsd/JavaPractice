package aaa;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,L,R,avg;
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();	//??ί??
		
		int q=scan.nextInt();	//ѯ????
		int a[] = new int[n+1];
		for(i=1;i<n+1;++i)
		{
			a[i]=scan.nextInt();
			
		}
		for(i=1;i<q+1;++i)
		{
			L=scan.nextInt();//??
			R=scan.nextInt();//??
			avg=average(a,L,R);
			if(avg!=0)
				System.out.println(avg);
			else
				System.out.println("NoScore");
		}
		

	}

	private static int  average(int[] a, int l, int r) {
		// TODO Auto-generated method stub
		if((r-l)<2) return 0;
		int sum=0,max=a[l],min=a[l],i;
		for(i=l;i<=r;++i)
		{
			if(a[i]>max) max=a[i];
			if(a[i]<min) min=a[i];
			sum+=a[i];
		}	
		return (sum-max-min)/(r-l-1);
	}

}
