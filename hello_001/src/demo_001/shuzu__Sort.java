package demo_001;

import java.sql.SQLOutput;

public class shuzu__Sort {
    public static void main(String[] args) {
        int arr[]={2,4,12,1,-1,-99};
        BubbleSort(arr);
        SelectSort(arr);
        FanzhuanSort(arr);
    }
/*
输出方法
 */
    public static void Print(int[] nums) {
        for(int i: nums){
            System.out.print(i+"\t");
        }
        System.out.println();
    }
/*

冒泡排序：外层控制循环，次数等于数组长度减1；内层负责邻近数组比较，长度小于length-外层层数
 */
    public static void BubbleSort(int[] nums) {
        for(int i=1;i<nums.length;i++){
            for(int j=0;j< nums.length-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
       Print(nums);

    }
/*
选择排序:每次找最大，最大值放到length-i的位置上
 */
    public static void SelectSort(int[] nums) {
        for(int i=1;i< nums.length;i++){
            int index=0;
            for(int j=0;j<=nums.length-i;j++){         //j<=nums.length-i
                if (nums[j]>nums[index]){
                    index=j;
                }
            }
            int temp=nums[nums.length-i];
            nums[nums.length-i]=nums[index];
            nums[index]=temp;
        }
        Print(nums);

    }
    /*
    反转排序
     */
    public static void FanzhuanSort(int [] nums) {
        System.out.println("排序前");
        Print(nums);
        int temp;
        int len= nums.length;
            for(int j=0;j< nums.length/2;j++){
               temp=nums[j];
               nums[j]=nums[len-1-j];
               nums[len-1-j]=temp;
            }

        System.out.println("反转后");
        Print(nums);

    }
}
