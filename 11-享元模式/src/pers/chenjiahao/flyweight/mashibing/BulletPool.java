package pers.chenjiahao.flyweight.mashibing;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 子弹类
 */
class Bullet{
    public UUID id = UUID.randomUUID();
    boolean living = true;

    @Override
    public String toString() {
        return "Bullet{"+
                "id=" + id +
                '}';
    }
}

/**
 * 子弹池
 */
public class BulletPool {
    // 这个List用来装子弹
    List<Bullet> bullets = new ArrayList<>();
    {
        // 装了5种子弹
        for (int i = 0; i < 5; i++) {
            bullets.add(new Bullet());
        }
    }
    public Bullet getBullet(){
        for (int i = 0; i < bullets.size(); i++) {
            Bullet b = bullets.get(i);
            if (!b.living){
                return b;
            }
        }
        return new Bullet();
     }
    public static void main(String[] args) {
        BulletPool bp = new BulletPool();
        for (int i = 0; i < 10; i++) {
            Bullet b = bp.getBullet();
            System.out.println(b);
        }
    }
}
