package bijiao;

public class Goods implements Comparable {
    private String name;
    private  double price;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;

    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // 按照比较大小 按照价格
    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods goods=(Goods) o;
            if(this.price>goods.price){
                return 1;
            }else if(this.price<goods.price){
                return -1;
            }else{
                return 0;
            }
            // 方式2
            //return Double.compare(this.price,goods.price);
        }
        throw  new RuntimeException("传入数据异常");
    }
}
