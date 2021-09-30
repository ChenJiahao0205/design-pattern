package pers.chenjiahao.review;

/**
 * review
 * 懒汉式
 * 可以通过synchronized解决，但也带来了效率下降的问题,每次都要先判断锁
 * @Author ChenJiahao
 * @Date 2021/7/31 16:05
 */
public class ReviewMgr04 {
    private static ReviewMgr04 INSTANCE;
    private ReviewMgr04(){
    }
    // ReviewMgr04.class对象
    public static synchronized ReviewMgr04 getInstance(){
        if (INSTANCE == null){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new ReviewMgr04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(ReviewMgr04.getInstance().hashCode());
            }).start();
        }
    }
}
