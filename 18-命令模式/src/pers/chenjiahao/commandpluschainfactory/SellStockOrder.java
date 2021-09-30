package pers.chenjiahao.commandpluschainfactory;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/25 20:29
 */
public class SellStockOrder implements Order {
    private Stock abcStock;

    public SellStockOrder(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.operateStock("sell");
    }
}
