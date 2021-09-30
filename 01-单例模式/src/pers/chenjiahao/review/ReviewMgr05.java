package pers.chenjiahao.review;

/**
 * review
 * 懒汉式
 * 试着通过减小同步代码块的方式提高效率，!!!!!!!!!!!不可行!!!!!!!
 * 反而会造成无法确保只有一个实例对象
 * 比如说两个线程都进入null了，一个先拿到锁，另外一个等。所以就创建了两个实例化对象
 * @Author ChenJiahao
 * @Date 2021/7/31 16:05
 */
public class ReviewMgr05 {
    private static ReviewMgr05 INSTANCE;
    private ReviewMgr05(){
    }
    // 减小同步代码块的范围
    public static ReviewMgr05 getInstance(){
        if (INSTANCE == null){
            synchronized (ReviewMgr05.class){
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new ReviewMgr05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(ReviewMgr05.getInstance().hashCode());
            }).start();
        }
    }
}
