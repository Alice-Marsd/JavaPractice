package tentet;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class MAin {
	public static Scanner scan=new Scanner(System.in);
	static class Point
	{
		long x,y;
	}
	public static void main(String[] args) {
		
		Collection<Point> A = null;
		Collection<Point> B = null;
		int n;
		n=scan.nextInt();
		inital(A,n);
		inital(B,n);
		System.out.println(ditance(A,B));;
	}
	private static double ditance(Collection<Point> a, Collection<Point> b) {
		// TODO Auto-generated method stub
		
		Iterator<Point> ita=a.iterator();
		Iterator<Point> itb=b.iterator();
		double min=Math.sqrt((ita.next().x-itb.next().x)*(ita.next().x-itb.next().x)
				+(ita.next().y-itb.next().y)*((ita.next().y-itb.next().y)));
		double temp;
		while(ita.hasNext())
		{
			while(itb.hasNext())
			{
				temp=Math.sqrt((ita.next().x-itb.next().x)*(ita.next().x-itb.next().x)
						+(ita.next().y-itb.next().y)*((ita.next().y-itb.next().y)));
				if(temp<min)
					min=temp;
			}
		}
		return min;
	}
	private static void inital(Collection<Point> a,int n) {
		// TODO Auto-generated method stub	
		for (int i = 0; i < n; i++) {
			Point e=new Point();
			e.x=scan.nextInt();
			e.y=scan.nextInt();
			a.add(e);
		}
	}
}

