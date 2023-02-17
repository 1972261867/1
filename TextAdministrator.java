import java.util.Scanner;

public class TextAdministrator {
    public static void main(String[] args) {
        Administrator administrator= new Administrator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String name1= scanner.nextLine();
        System.out.print("请输入密码：");
        String password2= scanner.nextLine();
        administrator.name =name1;
        administrator.password=password2;
        administrator.authority();
    }
}
