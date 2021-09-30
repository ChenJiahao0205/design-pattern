package pers.chenjiahao.singleton;
/**
 * lazy loading
 * 懒汉式
 * 试着通过减小同步代码块的方式提高效率，!!!!!!!!!!!不可行!!!!!!!
 * 反而会造成无法确保只有一个实例对象
 * 比如说两个线程都进入null了，一个先拿到锁，另外一个等。所以就创建了两个实例化对象
 */
public class Mgr05 {
    // 这里不能写final 写了final必须初始化
    private static Mgr05 INSTANCE;
    private Mgr05(){
    }
    // 锁的是Mgr05.class对象
    public static Mgr05 getInstance(){
        if (INSTANCE == null){
            // 不可行！！！！！！！！！ 反而不安全了
            synchronized (Mgr05.class){
                // 模拟用代码
                try{
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
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
                    System.out.println(Mgr05.getInstance().hashCode());
                }
            }).start();*/
            // java8的lambda表达式 对于接口只有一个方法 可以简化 (相当于上述代码)
            new Thread(()->{
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }
}
