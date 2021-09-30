package pers.chenjiahao.interpreter;

/**
 * @Author ChenJiahao(五条)
 * @Date 2021/8/27 16:53
 */
public class Test {

    // 规则：Robert或John是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert,john);
    }

    // 规则：Julie是一个已婚的女性
    public static Expression getMarriedWomenExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie,married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWomen = getMarriedWomenExpression();

        System.out.println("John or Robert is male? " + isMale.interpret("John"));
        System.out.println("Julia is a married women? " + isMarriedWomen.interpret("Married Julie"));
    }
}
