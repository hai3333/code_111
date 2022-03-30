package dxc;

/*

以下方法只能使用在同步代码块中
* wait（） 执行之后当前线程进入阻塞 释放同步监视器
* notify()   一旦执行唤醒被wait的方法 如果有多个 则唤醒优先级最高的
* notifyAll  唤醒所有被wait的方法
* 这几个方法定义在obj中
*
*
* */

public class CommunityTest {
    public static void main(String[] args) {
        ah a=new ah();
        Thread t1=new Thread(a);
        Thread t2=new Thread(a);
        t1.start();
        t2.start();

    }
}
class  ah implements  Runnable {
private int i=1;
    @Override
    public void run() {
       while(true) {
           synchronized (this) {
               notifyAll();
               if (i <= 100) {
                   try {
                       Thread.sleep(10);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(Thread.currentThread().getName() + "打印了" + i);
                   i++;
                   try {
                       // 阻塞线程
                       wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }

               } else {
                   break;
               }
           }
       }
    }
}
