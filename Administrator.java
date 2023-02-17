import java.util.Scanner;

public class Administrator {
    Scanner scanner = new Scanner(System.in);
    String name;
    String password;

    void authority(){
        if(name.equals("admin")&&password.equals("111111")){
            System.out.println();
            System.out.print("请输入新密码：");
            String password1 = scanner.nextLine();
            password=password1;
            System.out.println("修改成功，您的新密码为："+password);
        }else{
            System.out.println("用户名或密码错误");
        }
    }
}
