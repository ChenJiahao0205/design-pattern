package pers.chenjiahao.builder.review.exam1;

/**
 * @Author ChenJiahao
 * @Date 2021/8/1 23:25
 */
public class Mine {
    int x,y,w,h;

    public Mine(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Mine{" +
                "x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", h=" + h +
                '}';
    }
}
