public class Visitor {
    String name;
    int age;

    public void price() {
        if (60 <= age || age <= 18) {
            System.out.println(name + "的年龄为:" + age + ",门票免费");
            System.out.println();
        } else {
            System.out.println(name + "的年龄为:" + age + ",门票免费");
            System.out.println();
        }
    }
}
