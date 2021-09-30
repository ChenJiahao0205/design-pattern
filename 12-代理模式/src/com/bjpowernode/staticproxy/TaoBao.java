package com.bjpowernode.staticproxy;

/**
 * 淘宝是一个商家，代理金士顿u盘的商家
 */
public class TaoBao implements UsbSell {
    // 声明 商家代理的厂家具体是谁
    UsbSell factory = new UsbKingFactory();
    @Override
    public float sell(int amount) {
        // 向厂家发送订购单，告诉厂家，我买了U盘，厂家发货
        float price = factory.sell(amount); // 厂家的价格
        // 商家需要加价，代理加价
        price = price + 25;
        // 增加的价格
        return price;
    }
}
