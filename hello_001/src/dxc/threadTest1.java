package dxc;
/*
*yield  释放当前cpu占有的进程  释放之后进程之间重新竞争
* join()  释放当前进程  等你做完了之后我在上
* stop（） 强制停止线程 不推荐使用
*
* 创建两个线程 一个遍历100 以内的偶数，一个负责遍历100以内的奇数
* sleep()  让当前线程休息一段时间
*
*
*
* 线程的优先级：
* getPriority()
* setPriority()
* 高优先级的线程概率上会抢占低优先级的进程
*
*
* */
public class threadTest1 {
    public static void main(String[] args) {
        Ph1 ph1=new Ph1();
        Ph2 ph2=new Ph2();
        // 设置线程的优先级
        ph1.setName("主线程");
//     ph1.setPriority(Thread.MAX_PRIORITY);
//        ph2.setPriority(Thread.MIN_PRIORITY);

        ph1.start();
        ph2.start();
    }

}
 class Ph1 extends Thread{
    @Override
     public void  run(){
      //  synchronized(this){
        for(int i=0;i<100;i+=2){
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
    //}
    }
 }

 class Ph2 extends  Thread{
    @Override
     public void run(){
        //synchronized(this) {
            for (int i = 1; i < 100; i += 2) {
                System.out.println(Thread.currentThread().getName() + "======" + i);
            }
        //}
    }
 }