package pers.chenjiahao.singleton;

/**
 * 枚举单例
 * 不仅可以解决线程同步，还可以防止反序列化
 */
public enum Mgr08 {
    INSTANCE;
    public void m(){
        System.out.println("我是一个单例鸭");
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }
}
