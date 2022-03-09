package MyClass;

public class Phone_demo {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.brand ="小米";
        p.GetPrice(3000);
        System.out.println("手机的品牌是"+p.brand +"价格是"+p.SetPrice());
        p.call();
    }
}
