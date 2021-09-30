package pers.chenjiahao.review;

/**
 * review
 * 静态内部类方式
 * JVM保证单例 JVM只加载一次外部类 调用内部类后只加载一次内部类
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 * 完美的写法之一
 * @Author ChenJiahao
 * @Date 2021/7/31 16:06
 */
public class ReviewMgr07 {
    private ReviewMgr07(){
    }
    private static class ReviewMgr07Holder{
        private static final ReviewMgr07 INSTANCE = new ReviewMgr07();
    }
    public static ReviewMgr07 getInstance(){
        return ReviewMgr07Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(ReviewMgr07.getInstance().hashCode());
            }).start();
        }
    }
}
