package pers.chenjiahao.review;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/1 20:16
 */
public class Test {
    public static void main(String[] args) {
        // 个人原价 70
        PersonalVisitor personalVisitor = new PersonalVisitor();
        new Fruit().accept(personalVisitor);
        System.out.println(personalVisitor.totalPrice);

        // 商户七折 49
        WholesalerVisitor wholesalerVisitor = new WholesalerVisitor();
        new Fruit().accept(wholesalerVisitor);
        System.out.println(wholesalerVisitor.totalPrice);
    }
}
