package suibian__daima;
import java.util.Scanner;

public class _3cosx {

    public static void main(String[] args) {
        double x;
        int n;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        n = sc.nextInt();


        double cosx=0;
        double former=1;//为公式中每一项的绝对值

        for(int i = 0;i<=n;)
        {
            cosx += former*Math.pow(-1, i);//一加一减

            ++i;//防止在循环的第一次，i=0，下一行除0

            //下一项是在上一项的基础上，乘x，再乘x，除以2*i，再除以2*i-1
            former = former*x*x/(2*i)/(2*i-1);
        }
        System.out.printf("%.8f\n",cosx);
    }
}

