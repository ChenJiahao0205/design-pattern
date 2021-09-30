package pers.chenjiahao.commandpluschainfactory;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/25 20:27
 */
public class BuyStockOrder implements Order {

    private Stock abcStock;

    public BuyStockOrder(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.operateStock("buy");
    }
}
