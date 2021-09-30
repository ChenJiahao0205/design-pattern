package pers.chenjiahao.singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用
 * 唯一缺点：不管用不用，类加载时就完成实例化
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();
    // 下面这行代码的意思就是其他类new不出来Mgr01
    private Mgr01(){};
    // 别的类想调只能用getInstance
    public static Mgr01 getInstance(){
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }
    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1==m2);
    }
}
