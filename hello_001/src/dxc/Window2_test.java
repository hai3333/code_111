package dxc;

/*
第二种方法实现卖票

方式一：  同步代码块
    synchronized(同步监视器){
    // 需要被同步的代码

    说明： 操作共享数据的代码就叫需要被同步的代码
        ； 比如操作票的数据
     同步监视器：  俗称 锁  任何一个类的对象都可以充当
                锁
                要求： 多个线程必须要共用同一把锁

        缺点：  操作同步代码的时候其他线程必须要等待 相当于是单线程

        用Runnable可以用this充当监视器 但要保证唯一  或者可以用当前类当监视器
}

方式二： 同步方法
    如果操作共享数据的操作都在同一个方法内 可以考虑用同步方法解决


 */
class window2 implements Runnable {
    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //错误写法
            //synchronized (this){   因为有三个对象

            // 正确写法  或者 synchronized(Window2.class)
            synchronized (obj) {
                if (ticket > 0) {
                    try{
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票：票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}


public class Window2_test {
    public static void main(String[] args) {
        window2 w=new window2();

        Thread t1=new Thread(w);
        Thread t2=new Thread(w);
        Thread t3=new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
