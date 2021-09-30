package com.bjpowernode.staticproxy;

public class ShopMan {
    public static void main(String[] args) {
        // 创建代理的商家淘宝
        UsbSell usbSell = new TaoBao();
        float price = usbSell.sell(1);
        System.out.println("通过淘宝商家购买U盘单价" + price);
    }
}
