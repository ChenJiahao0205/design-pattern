package pers.chenjiahao.templatemethod;

/**
 * doOp1AndOp2()为模板方法
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/28 23:59
 */
public abstract class Game {
    // 防止恶意操作，模板方法上都会加上final
    final void doOp1AndOp2(){
        op1();
        op2();
    }
    abstract void op1();
    abstract void op2();
}
