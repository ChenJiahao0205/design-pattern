package pers.chenjiahao.singleton;

/**
 * lazy loading
 * 懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题,两个线程同时访问的话可能会造成创建了两个实例对象的问题
 */
public class Mgr03 {
    // 这里不能写final 写了final必须初始化
    private static Mgr03 INSTANCE;
    private Mgr03(){
    }
    public static Mgr03 getInstance(){
        if (INSTANCE == null){
            // 模拟用代码
            /*try{
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            INSTANCE = new Mgr03();
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
                    System.out.println(Mgr03.getInstance().hashCode());
                }
            }).start();*/
            // java8的lambda表达式 对于接口只有一个方法 可以简化 (相当于上述代码)
            new Thread(()->{
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }
}
