package demo_001;
//foreach语句遍历数组
public class shuzu__foreach {
    public static void main(String[] args) {
        int arr1[]={1,2,3,6,4,22,33};
        System.out.println("数组中的元素是：");
        for(int x :arr1){
            System.out.println(x);
        }
    }
}
