package dxc;

import java.util.concurrent.locks.ReentrantLock;

public class Window3Test implements Runnable {
    private int ticket = 100;
    //实例化
    private ReentrantLock lock = new ReentrantLock(true);   //参数表明是不是公平的

    @Override
    public void run() {
        while (true) {
            try {
                //调用lock方法 锁定
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "售票" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }finally {
                // 调用解锁的方法
                lock.unlock();
            }

        }
    }

}

class LockTest {
    public static void main(String[] args) {
        Window3Test w = new Window3Test();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("线程1");
        t2.setName("线程2");
        t3.setName("线程3");


        t1.start();
        t2.start();
        t3.start();
    }

}

