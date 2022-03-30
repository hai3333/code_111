package dxc;
/*
 * 线程创建方式3
 * 实现Callable接口  jdk5.0 新增
 *
 *如何理解Callable接口的方法比Runnable方法强大
 *call() 方法可以有返回值
 * call() 可以抛出来异常，被外面的操作捕获
 * Callable可以支持泛型
 *
 * */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// 1 创建一个实现Callable的实现类
class NumThread implements Callable {


    //实现call()方法，将此线程需要执行的操作声明在方法中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }

        return sum;
    }
}


public class ThreadNew {
    public static void main(String[] args) {
        // 创建实现Callable接口实现类的对象
        NumThread n=new NumThread();
        //将此实现类的对象作为参数传递到FutureTask构造器中 创建对象
        FutureTask futureTask = new FutureTask(n);
        // 将FutureTask的对象作为参数传递到Thread类的构造器中 ，创建Thread类并调用start方法
         new Thread(futureTask).start();

        try {
            //
            //get的返回值即使futureTask实现类重写call的返回值
            Object sum=futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
