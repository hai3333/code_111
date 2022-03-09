package changyonglei;

import org.junit.Test;

public class String_test {

    @Test
    public void test1(){
        String s1="abc";
        String s2="abc";
        //s1="hello";
        String s5=s2.replace('a','h');// 替换字母

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s5);

    }

    @Test
    public void test2(){
        // 通过字面量定义的方法
        String s1="java1";
        String s2="python";
        // 通过New+构造器的方法
        String s3=new String ("hfssb");

    }

}
