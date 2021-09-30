package pers.chenjiahao.singleton;

/**
 * lazy loading
 * 懒汉式
 * 双重检查!!!!!!!!!!!!!!!!!!!
 */
public class Mgr06 {
    // 这里不能写final 写了final必须初始化
    // volatile需要写，不知道为啥
    private static volatile Mgr06 INSTANCE;
    private Mgr06(){
    }
    // 锁的是Mgr06.class对象
    public static Mgr06 getInstance(){
        // 双重检查
        if (INSTANCE == null){
            synchronized (Mgr06.class){
                // 双重检查
                if (INSTANCE == null) {
                    // 模拟用代码
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            /*new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Mgr06.getInstance().hashCode());
                }
            }).start();*/
            // java8的lambda表达式 对于接口只有一个方法 可以简化 (相当于上述代码)
            new Thread(()->{
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();
        }
    }
}
