package dxc;
/*
*
* 创建线程池的方法4：
* 线程池
*
* */


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Number implements  Runnable{

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }
}


public class ThreadPool {
    public static void main(String[] args) {
        //提供指定线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //执行指定线程操作 粗腰提供实现Runnable接口或者Callable接口实现类
        executorService.submit(new Number());// 适合于Callable
        // executorService.execute()   适合Runnable
        //executorService.submit(new Number1());
        executorService.shutdown();// 关闭线程池
    }
}
