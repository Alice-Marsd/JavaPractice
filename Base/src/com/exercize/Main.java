package com.exercize;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PrintTab(2,3);
	}

	private static void PrintTab(int a,int b) {
		// TODO Auto-generated method stub
		if(a<0||b<0) return ;
		//a行b列
		//a行|  每行b+1个+
		int i,j;
		for(j=0;j<2*a+1;++j)
		{
			if(j%2==0)
			{
				for(i=0;i<=b;++i)
				{
					System.out.print("+");
					if(i<b)
					{
						System.out.print("---");
					}
				}
				System.out.println();
			}else {
				for(i=0;i<=b;++i)
				{
					System.out.print("|   ");
				}
				System.out.println();
				
			}
				
		}
		
		
	}
	

}
