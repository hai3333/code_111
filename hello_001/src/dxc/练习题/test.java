package dxc.练习题;

public class test {
    public static void main(String[] args) {
        Account acct=new Account((double) 0);
        Customer c1=new Customer(acct);
        Customer c2=new Customer(acct);

        c1.setName("甲");
        c2.setName("乙");

        c1.start();
        c2.start();


    }
}

class Account {
    private  double balance;
    public  Account(Double balance){

        this.balance=balance;
    }
    //存钱

    public synchronized void deposit( double amt){
        balance+=amt;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"存钱成功 余额是"+balance);
    }



}

class  Customer extends Thread{
    private Account acct;
    public  Customer(Account acct){
        this.acct=acct;
    }
    @Override
    public void run(){
        for(int i=0;i<3;i++){
            acct.deposit(1000);
        }
    }
}
