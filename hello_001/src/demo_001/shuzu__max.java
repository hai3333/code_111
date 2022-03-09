package demo_001;

import java.util.Arrays;

public class shuzu__max {
    public static void main(String[] args) {
        int arr[]={12,45,37,66,90,1000};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        System.out.println();
        Arrays.sort(arr);//排序
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        int[] newarr=Arrays.copyOf(arr,arr.length);//复制数组
        for(int i=0;i<newarr.length;i++) {
            System.out.println(newarr[i]);
        }
        System.out.println();
        Arrays.sort(arr);
        int index=Arrays.binarySearch(arr,1000);//要先排序
        System.out.println(index);

    }
}
