package com.bjpowernode.staticproxy;

/**
 * 金士顿厂家，不接受用户的单独购买
 */
public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        // 一个128G的U盘 85元
        // 后期可以根据amount，可以实现不同的价格
        return 85.0f;
    }
}
