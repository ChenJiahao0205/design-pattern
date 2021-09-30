package pers.chenjiahao.templatemethod;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/29 0:00
 */
public class Test {
    public static void main(String[] args) {
        Game gameSubclass = new GameSubclass();
        // 不使用模板方法
        gameSubclass.op1();
        gameSubclass.op2();
        // 使用模板方法
        gameSubclass.doOp1AndOp2();
    }
}
