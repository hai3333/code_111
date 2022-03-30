package dxc;
/*
 *
 * 创建多线程方法二 ： 使用Runnable接口
 *1.创建实现接口的类
 * 2 实现类去实现run
 * 3创建实现类的对象
 * 4将此对象作位参数传递到Thread类的构造器中 创建Thread类的对象
 * 5通过Thread类的对象调用start();
 *
 *
 * */

class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i += 2) {
            System.out.println(i);
        }
    }
}


public class threadTest2 {

    public static void main(String[] args) {
        MThread mThread = new MThread();
        Thread t = new Thread(mThread);
        Thread t1 = new Thread(mThread);
        t.start();
        t1.start();
    }

}
