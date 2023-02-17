import java.util.Scanner;

public class TextCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int sum3 = Integer.parseInt(sc.nextLine());
        System.out.println("请输入+,-,*,/");
        String way1 = sc.nextLine();
        System.out.println("请输入第二个数:");
        int sum4 = Integer.parseInt(sc.nextLine());
        double result2;
        if(way1.equals("+")){
            result2=sum3+sum4;
        }else if(way1.equals("-")){
            result2=sum3-sum4;
        }else if(way1.equals("*")){
            result2=sum3*sum4;
        }else{
            result2=sum3/sum4;
        }
        calculator.sum1=sum3;
        calculator.sum2=sum4;
        calculator.way=way1;
        calculator.result=result2;
        calculator.result1();
    }
}
