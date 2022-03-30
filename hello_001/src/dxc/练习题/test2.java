package dxc.练习题;

/*
 * 生产者消费者
 *
 * */
public class test2 {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        p1.setName("生产者");
        ConsumerT c1 = new ConsumerT(clerk);
        c1.setName("消费者");

        p1.start();
        c1.start();

    }

}

class Clerk {
    private int count = 0;

    // 生产
    public synchronized void productProduct() {
        if (count < 20) {
            System.out.println(Thread.currentThread().getName() + "开始生产第" + count+1 + "个产品");
            count++;
            notify();
        } else {
//等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //消费
    public synchronized void consumeProduct() {
        if (count > 0) {
            System.out.println(Thread.currentThread().getName() + "开始消费" + count+1);
            count--;
            notify();
        } else {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer extends Thread {  // 生产者
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + "开始生产");
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.productProduct();
        }
    }

}

class ConsumerT extends Thread {
    private Clerk clerk;

    public ConsumerT(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + "开始消费");
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }

}
