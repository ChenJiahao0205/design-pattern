package pers.chenjiahao.review;

/**
 * review
 * 懒汉式
 * 双重检查
 * @Author ChenJiahao
 * @Date 2021/7/31 16:05
 */
public class ReviewMgr06 {
    // 不能加final 需要加volatile，要保证有序性，跟synchronized意思差不多
    private static volatile ReviewMgr06 INSTANCE;
    private ReviewMgr06(){
    }
    public static ReviewMgr06 getInstance(){
        // 双重检查
        if (INSTANCE == null){
            synchronized (ReviewMgr06.class){
                // 双重检查
                if (INSTANCE == null){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new ReviewMgr06();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(ReviewMgr06.getInstance().hashCode());
            }).start();
        }
    }
}
