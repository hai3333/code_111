package project__001;

public class CustomerView {
    private CustomerList customerList =new CustomerList(10);
    public CustomerView(){
        Customer customer=new Customer("阿海",19, '男',"13258111412","ahai@qq.com");
        customerList.Customer_Add(customer);
    }



    /*
    显示界面
     */
    public void enterMainMenu(){
        boolean flag=true;
        while(flag) {


            System.out.println("*******************客户信息管理软件*******************");
            System.out.println("                       1:添加客户");
            System.out.println("                       2:修改客户");
            System.out.println("                       3:删除客户");
            System.out.println("                       4:客户列表");
            System.out.println("                       5:退出\n");
            System.out.println("请选择1——5");
            char menu  =cc.readMenuSelection();
            switch (menu){
                case '1':
                    addNewCustomer();
                    break;
                case'2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case '5':
                    System.out.print("是否确认退出Y/N      ");
                    char c=cc.readConfirmSelection();
                    if(c=='Y'){
                        flag=false;
                    }

            }
        }
    }
    private  void addNewCustomer(){
        System.out.println("******************添加客户*******************");
        System.out.print("姓名:");
        String name=cc.readString(8);
        System.out.print("性别：");
        char gender=cc.readChar();
        System.out.print("年龄：");
        int age=cc.readInt();
        System.out.print("电话：");
        String phone=cc.readString(13);
        System.out.print("邮箱");
        String email=cc.readString(20);

        Customer customer=new Customer(name,age,gender,phone,email);
        boolean success=customerList.Customer_Add(customer);
        if(success){
            System.out.println("添加成功！");
        }
        else{
            System.out.println("客户目录已满！");
        }



    }
    private  void modifyCustomer(){
        System.out.println("******************修改客户*******************");
        Customer cust;
        int number;
        for(;;) {
            System.out.print("请输入要修改的客户编号,输入-1结束：");
            number = cc.readInt();
            if (number == -1) {
                return;
            }
            cust = customerList.Customer_Get(number - 1);
            if (cust == null) {
                System.out.println("找不到客户！");
            } else {
                break;
            }
        }
        //修改客户信息
        System.out.print("姓名+("+cust.getName()+")+");
        String name=cc.readString(10,cust.getName());
        System.out.print("性别("+cust.getGender()+"):");
        char gender=cc.readChar(cust.getGender());

        System.out.print("年龄("+cust.getAge()+"):");
        int age=cc.readInt(cust.getAge());

	    System.out.print("电话("+cust.getPhone()+"):");
	    String phone=cc.readString(13, cust.getPhone());
        System.out.print("邮箱("+cust.getEmail()+")");
        String email =cc.readString(20,cust.getEmail());
        Customer NewCust=new Customer(name,age,gender,phone,email);

        //customerList.Customer_replace(number-1,NewCust);
        boolean IsReplace=customerList.Customer_replace(number-1,NewCust);
        if(IsReplace){
            System.out.println("修改成功！");
        }
        else{
            System.out.println("修改失败！");
        }



    }

    private  void deleteCustomer(){
        System.out.println("******************删除客户*******************");
        int num;
        for(;;){
        System.out.print("请输入你要删除的客户编号，输入——1退出：");
        num=cc.readInt();
        if(num==-1) {
            return;
        }
        Customer customer=customerList.Customer_Get(num-1);
        if(customer==null){
            System.out.println("客户不存在");
        }
        else{
            break;
            }
        }
        System.out.println("确定要删除用户?(Y/N)");
        char IsDelete=cc.readConfirmSelection();
        if(IsDelete=='Y'){
            customerList.Customer_delete(num-1);
        }


    }
    private void listAllCustomer(){
        System.out.println("*******************客户列表*******************");
        int total= customerList.Total_Get();
        if (total==0){
            System.out.println("没有客户信息");
        }
        else{
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            Customer[] custs=customerList.Customers__GetAll();
            for (int i=0;i<custs.length;i++){
                Customer cust=custs[i];
                System.out.println((i+1)+"\t"+cust.getName()+"\t"+cust.getGender()+"\t"+cust.getAge()+"\t"+cust.getPhone()+"\t"+cust.getEmail());
            }
        }


        System.out.println("******************************************");

    }
    public static  void main(String[] args){
    CustomerView view=new CustomerView();
    view.enterMainMenu();

    }
}
