package pers.chenjiahao.review;

/**
 * review饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用
 * 唯一缺点：不管用不用，类加载时就完成实例化
 * @Author ChenJiahao
 * @Date 2021/7/31 16:01
 */
public class ReviewMgr01 {
    private static final ReviewMgr01 INSTANCE = new ReviewMgr01();
    private ReviewMgr01() {
    }
    public static ReviewMgr01 getInstance(){
        return INSTANCE;
    }
    public static void main(String[] args) {
        ReviewMgr01 instance = ReviewMgr01.getInstance();
        ReviewMgr01 instance1 = ReviewMgr01.getInstance();
        System.out.println(instance == instance1);
    }
}