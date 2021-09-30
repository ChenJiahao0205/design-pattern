package pers.chenjiahao.review;

/**
 * 枚举单例
 * 不仅可以解决线程同步，还可以防止反序列化
 * @Author ChenJiahao
 * @Date 2021/7/31 16:06
 */
public enum ReviewMgr08 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(ReviewMgr08.INSTANCE.hashCode());
            }).start();
        }
    }
}
