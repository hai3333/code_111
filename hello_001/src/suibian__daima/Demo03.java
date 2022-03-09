package suibian__daima;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        double x=0.0,sum=1.0;
        int n;
        Scanner sc1 = new Scanner(System.in);
        x = sc1.nextDouble();
        n = sc1.nextInt();
        sc1.close();
        double temp=1; // 第i项绝对值
        for (int i = 1; i <= n; i++) {
            temp = (-1)*temp*x*x/(2*i*(2*i-1));
            sum += temp;
        }
//		System.out.printf("%.8f", sum);
        System.out.println(String.format("%.8f", sum));
    }
}
