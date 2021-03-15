package Matrix;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Main {//�Ѿ�����Ϊһ�����󿴣����ʻ��Ƕ�ָ��k�������Ʒֽ⣬���󲻶Ϸ���Ȼ��ȡ���õľͺ�
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
					matrix2.matirx[i][j] = 1;//�˴���ʼ������һ����λ��
			}	
		}
		while(k>0)
		{
			if(k%2==1)	//�������������ô��λ����
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
		// TODO �Զ����ɵĹ��캯�����
		 this.n=n;
		 this.matirx=new int[n][n];
	 }
}
