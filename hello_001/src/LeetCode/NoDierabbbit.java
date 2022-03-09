package LeetCode;

import java.util.Scanner;

public class NoDierabbbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        Rabbit(a);
        //System.out.println("第"+a+"年的兔子对数为"+nums);
    }
    public  static  int Rabbit(int num){
        int arr[]=new int [1000];
         arr[0]=1;
         arr[1]=1;
         for(int  i=2;i<num;i++){
             arr[i]=arr[i-1]+arr[i-2];

         }
        System.out.println(arr[num-1]);
        return 1;
    }
}
