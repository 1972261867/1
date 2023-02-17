import java.util.Scanner;

public class TextCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.print("积分：");
        int integral1 = Integer.parseInt(scanner.nextLine());
        System.out.print("卡类型：");
        String ct1 = scanner.nextLine();
        customer.integral = integral1;
        customer.cardtype = ct1;
        customer.show();
    }
}
