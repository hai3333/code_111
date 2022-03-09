package myinterface;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        Plane plane = new Plane();
        plane.fly();
    }
}
interface  Flyable{
    //全局常量
    //public static  final  int MAX_SPEED =70000;  前面可以省略
    int MAX_SPEED=7000;
    void stop();
    void fly();
}
class Plane implements  Flyable{
    @Override
    public  void fly(){
    System.out.println("fly");
}
    @Override
    public  void stop (){
    System.out.println("fly2");
}

}