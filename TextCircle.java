import java.util.Scanner;

public class TextCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入半径:");
        int radius1 = Integer.parseInt(sc.nextLine());
        circle.radius=radius1;
        circle.area();
    }
}
