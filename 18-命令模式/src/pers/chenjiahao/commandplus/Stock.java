package pers.chenjiahao.commandplus;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/25 20:23
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name:" + name + "Quantity:" + quantity + "] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name:" + name + "Quantity:" + quantity + "] sold");
    }
}
