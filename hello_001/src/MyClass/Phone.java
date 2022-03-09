package MyClass;

public class Phone {
    String brand;
    private float price;
    public void GetPrice( int n){
        price=n;
    }
    public float  SetPrice(){
        return price;
    }
    public void call(){
        System.out.println("这个是打电话的方法");
    }
}
