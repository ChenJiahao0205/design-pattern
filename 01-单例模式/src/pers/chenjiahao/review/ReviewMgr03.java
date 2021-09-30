package pers.chenjiahao.review;

/**
 * review
 * 懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题,两个线程同时访问的话可能会造成创建了两个实例对象的问题
 * @Author ChenJiahao
 * @Date 2021/7/31 16:05
 */
public class ReviewMgr03 {
    // 这里不能写final 写了final必须初始化
    private static ReviewMgr03 INSTANCE;
    private ReviewMgr03(){
    }
    public static ReviewMgr03 getInstance(){
        if (INSTANCE == null){
            // 问题就出在这里,如果当前线程睡眠一下，别的线程也能进来，那么会创造出多个对象
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new ReviewMgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(ReviewMgr03.getInstance().hashCode());
            }).start();
        }
    }
}
