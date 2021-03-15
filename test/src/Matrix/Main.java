package Matrix;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Main {//把矩阵作为一个对象看，本质还是对指数k做二进制分解，矩阵不断翻倍然后取有用的就好
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T=scanner.nextInt();
		while(T>0)
		{
			T--;
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			scanner.nextLine();
			Matrix matrix=new Matrix(n);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					matrix.matirx[i][j] = scanner.nextInt();
				}
			scanner.nextLine();
			}
		
			Matrix matrix2=fastpow(matrix, k);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(matrix2.matirx[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
	public static Matrix mutiply(Matrix matrix,Matrix matrix2) {
		int n=matrix.n;
		Matrix matrix3=new Matrix(n);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int m=0;m<n;m++)
					matrix3.matirx[i][j]+=(matrix.matirx[i][m]*matrix2.matirx[m][j]);
			}
		}
		return matrix3;
	}
	
	public static Matrix fastpow(Matrix matrix,int k) {
		int n=matrix.n;
		Matrix matrix2=new Matrix(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i==j)
					matrix2.matirx[i][j] = 1;//此处初始化阵是一个单位阵
			}	
		}
		while(k>0)
		{
			if(k%2==1)	//如果是奇数，那么单位矩阵
				matrix2=mutiply(matrix2, matrix);
			k/=2;
			matrix=mutiply(matrix,matrix);
		}
		return matrix2;
	}
}
class Matrix{
	int[][] matirx;
	int n;
	 public Matrix(int n) {
		// TODO 自动生成的构造函数存根
		 this.n=n;
		 this.matirx=new int[n][n];
	 }
}
