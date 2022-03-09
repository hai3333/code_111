package bijiao;

/*
java 不能能用<>比较 使用接口可以比较
Compareble 或 Comparator
 2: Comparble
 重新写的方法
3: 自定义类想实现排序，可以重写comparble接口
 */

import org.junit.Test;

import java.lang.reflect.Array;
import java.text.RuleBasedCollator;
import java.util.Arrays;
import java.util.Comparator;

public class CompareTest  {
    // 2 的使用举例
    @Test
    public  void test1(){
        String [] arr = new String[]{"AA","BB","CC","DD","ZZ","PP"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2(){
        Goods[] arr=new Goods[4 ];
        arr[0]=new Goods("zhongxing",34);
        arr[1]=new Goods("huawei",900);
        arr[2]=new Goods("xiaomi",12);
        arr[3]=new Goods("kele",99);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*
    Comparatar 接口的使用 定制排序
    元素类型未实现接口或者不符合当操作规则可以考虑这个方法

     */
    @Test
    public  void test3(){
        String [] arr1 = new String[]{"AA","BB","CC","DD","ZZ","PP"};
        Arrays.sort(arr1, new Comparator() {
            @Override
            public int compare(Object o1,Object o2) {
                if(o1 instanceof  String && o2 instanceof String){
                    String s1=(String) o1;
                    String s2=(String)  o2;
                    return  -s1.compareTo(s2);
                }
                throw  new RuntimeException("输入错误");
            }

        });
        System.out.println(Arrays.toString(arr1));
    }


}
