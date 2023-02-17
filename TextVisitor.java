import java.util.Scanner;

public class TextVisitor {
    public static void main(String[] args) {
        Visitor visitor = new Visitor();
        while (1==1) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入姓名 ：");
            String name1 = scanner.nextLine();
            if(name1.equals("n")){
                System.out.println("退出程序");
                break;
            }
            System.out.print("请输入年龄：");
            int age1 = Integer.parseInt(scanner.nextLine());
            visitor.name = name1;
            visitor.age = age1;
            visitor.price();
        }
    }
}
