package dxc;
/*
    创建三个窗口卖票100张

     */

class window implements Runnable {
    private static  int ticket = 100;

    @Override
    public void run() {
        while (true) {

            show();
        }
    }
  private synchronized void show(){
       // synchronized (this) {
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
                ticket--;

            }
        //}
  }

}

class WindowTest {
    public static void main(String[] args) {
    window w1=new window();
    Thread t1=new Thread(w1);
    Thread t2=new Thread(w1);
    Thread t3=new Thread(w1);

    t1.start();
    t2.start();
    t3.start();




    }
}

