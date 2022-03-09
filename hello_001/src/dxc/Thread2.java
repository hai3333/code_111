package dxc;
/*
第二种创建多线程的方法
 */

 class MThread implements Runnable {
     @Override
     public void run() {
         for (int i=0;i<100;i++){
             if(i%2==0){
                 System.out.println(i);
             }
         }

     }
 }
 class ThreadTest {
     public static void main(String[] args) {
         MThread mThread =new MThread();
        Thread  t1= new Thread(mThread);
        t1.start();
     }
}
