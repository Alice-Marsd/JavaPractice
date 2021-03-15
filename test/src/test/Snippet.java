package test;

import java.util.Scanner;

public class Snippet {
	public static boolean[][] bool = new boolean[31][31];
		static boolean[] vis = new boolean[31];
		public static int[] x = new int[31];
		public static int[] y = new int[31];
		public static int[] r = new int[31];
		public static int n = 0, max = -1;
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				r[i] = sc.nextInt();
			}
			for (int i = 1; i <= n; i++) {
				for (int j = i + 1; j <= n; j++) {
					boolean bo = ((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) > (r[i] + r[j])
							* (r[i] + r[j]));
					bool[i][j] = bo;
					bool[j][i] = bo;
				}
			}
			sc.close();
			dfs(1);
			System.out.println(max);
		}
	
		public static void dfs(int step) 
		{
			if (step > n) {
				int sum = 0;
				for (int i = 1; i <= n; i++) {
					System.out.print(vis[i]+" ");
					if (vis[i]) {
						sum += (r[i] * r[i]);
					}
				}
				max = Math.max(sum, max);
				System.out.println(max);
				return;
			}
	
			vis[step] = false;
			dfs(step + 1);
			for (int i = 1; i < step; i++) {
				if (vis[i] && !bool[i][step]) {
					System.out.print("~");
					return;
				}
			}
			vis[step] = true;
			dfs(step + 1);
		}
	}

