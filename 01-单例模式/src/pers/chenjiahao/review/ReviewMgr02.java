package pers.chenjiahao.review;

/**
 * review
 * 跟ReviewMgr01是一个意思
 * @Author ChenJiahao
 * @Date 2021/7/31 16:05
 */
public class ReviewMgr02 {
    private static final ReviewMgr02 INSTANCE;
    static {
        INSTANCE = new ReviewMgr02();
    }
    public static ReviewMgr02 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        ReviewMgr02 instance = ReviewMgr02.getInstance();
        ReviewMgr02 instance1 = ReviewMgr02.getInstance();
        System.out.println(instance == instance1);
    }
}
