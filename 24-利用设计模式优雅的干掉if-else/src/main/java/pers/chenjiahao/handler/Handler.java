package pers.chenjiahao.handler;

import org.springframework.beans.factory.InitializingBean;

/**
 * 策略设计模式
 */
public interface Handler extends InitializingBean {

    public void AAA(String name);
}