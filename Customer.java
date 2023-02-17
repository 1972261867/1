public class Customer {
/**    integral 积分; card type 卡类型; */
    int integral;
    String cardtype;
    void show(){
        System.out.println("积分："+integral+",卡类型："+cardtype);
        if (cardtype.equals("金卡")){
            if(integral>1000){
                System.out.println("回馈500分！");
            }
        }else{
            if(integral>5000){
                System.out.println("回馈500分！");
            }
        }
    }
}
