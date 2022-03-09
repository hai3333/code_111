package project__001;

public class Customer {
    private String name;
    private char gender;
    private  int age;
    private  String  phone;
    private  String email;


    public  Customer(){

    }

    public Customer(String name, int age, char gender, String phone, String email) {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.phone=phone;
        this.email=email;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  int getAge(){
        return age;
    }
    public  void  setGender(char gender){
        this.gender=gender;
    }

    public char getGender() {

        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {

        return email;
    }
    public  void  setPhone(String phone){
        this.phone=phone;
    }

    public String getPhone() {

        return phone;
    }

}
