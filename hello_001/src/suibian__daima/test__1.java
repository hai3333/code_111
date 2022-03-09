package suibian__daima;


import java.util.Scanner;

public class test__1 {
    public static void ex(float a, float b, float c){
        //判断有无实根
        if(b*b-4*a*c<0){
            System.out.println("该方程无实根");
        }
        if(b*b-4*a*c==0){
            double x1= ((-b+Math.sqrt(b*b-4*a*c))/(2*a));
            System.out.println("该方程有两个相等的实数根"+x1);
        }
        if(b*b-4*a*c>0){
            double x1=((-b+Math.sqrt(b*b-4*a*c))/(2*a));
            double x2=((-b-Math.sqrt(b*b-4*a*c))/(2*a));
            System.out.println("该方程有两个不相等的实数根"+x1+","+x2);
        }
    }
    public static void main(String[] args) {
        System.out.println("请输入一元二次方程的三个系数a,b,c:\n");
        Scanner in = new Scanner(System.in );
        System.out.println("请输入a的值");
        float a=in.nextInt();
        System.out.println("请输入b的值");
        float b=in.nextInt();
        System.out.println("请输入c的值");
        float c=in.nextInt();
        ex(a,b,c);



    }

}
