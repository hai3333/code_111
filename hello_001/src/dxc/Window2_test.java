package dxc;

/*
第二种方法实现卖票
 */
class window2 implements Runnable {
    private static int ticket = 100;
    //private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (this){
            //synchronized (obj) {
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
