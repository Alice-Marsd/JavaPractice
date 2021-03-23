package money;

import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        // 输入
        Scanner scanner = new Scanner(System.in);
        int K = Integer.parseInt(scanner.nextLine()), M = Integer.parseInt(scanner.nextLine());
        String[] str1 = scanner.nextLine().split(",");
        String[] str2 = scanner.nextLine().split(",");
        int n = str1.length;
        // 生成净利率和启动资金列表
        int[] profits = new int[n];
        int[] capital = new int[n];
        // 判断是否启动
        boolean[] project = new boolean[n];
        // 初始化
        for (int i = 0; i < n; i++) {
            profits[i] = Integer.parseInt(str1[i]);
            capital[i] = Integer.parseInt(str2[i]);
            project[i] = false;
        }
        // 最大利润
        int max_prof = -1, index = 0;
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < n; j++) {
                if (!project[j] && max_prof < profits[j] && M >= capital[j]) {
                    max_prof = profits[j];
                    index = j;
                }
            }
            if (max_prof != -1) {
                M += max_prof;
                // 标记为已启动
                project[index] = true;
                max_prof = -1;
            }
        }
        System.out.println(M);
    }
}

