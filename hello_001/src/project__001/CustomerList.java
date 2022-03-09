package project__001;

public class CustomerList {
    private  Customer[] customers;//保存客户对象的数组
    private  int total;  //客户数量
    public  CustomerList( int totalCustomer){
        customers=new Customer[totalCustomer];
    }
    /*
    添加客户
     */
    public boolean Customer_Add(Customer customer){
        if (total >= customers.length){
            return false;
        }
        customers[total]=customer;
        total++;
        return true;
    }
    /*
    删除客户
     */
    public boolean Customer_delete(int index){
        if(index<=0 || index>customers.length){
            return false;
        }
        for(int i=index;i<=total-1;i++){
            customers[i]=customers[i+1];
        }
            customers[total-1]=null;
            total--;
            return  true;
    }
    /*
    替换客户
     */
    public  boolean Customer_replace(int index,Customer cust){
        if (index<=0 || index> customers.length){
            return false;
        }
        customers[index]=cust;
        return true;
    }
    /*
    返回全部客户
     */
    public Customer [] Customers__GetAll(){   //返回值是Customer
        Customer [] sc=new Customer[total];
    for(int i =0;i<total;i++)  {
        sc[i]=customers[i];
    }
    return sc;
    }
    /*
    返回该位置的用户
     */
    public Customer Customer_Get(int index){
      if (index<0 || index>customers.length) {
          System.out.println("该位置没有客户");
      }
      return customers[index];
    }
    /*
    返回总的用户数量
     */
    public int  Total_Get(){
        return total;
    }


}
