package demo_001;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String username = "ahai774";
        String password = "123456";
        int i = 2;
        while (i>=0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入账户:");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String pwd = sc.nextLine();
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("密码输入错误,你还有"+i+"次机会");
            }
            i--;
        }

    }
}
