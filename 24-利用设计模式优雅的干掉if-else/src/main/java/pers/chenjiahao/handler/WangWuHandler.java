package pers.chenjiahao.handler;

import org.springframework.stereotype.Component;
import pers.chenjiahao.handler.factory.Factory;

@Component
public class WangWuHandler implements Handler {

    @Override
    public void AAA(String name) {
        // 业务逻辑A
        System.out.println("王五完成任务");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Factory.register("王五", this);
    }
}
