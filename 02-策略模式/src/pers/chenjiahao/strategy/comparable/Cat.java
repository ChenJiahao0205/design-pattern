package pers.chenjiahao.strategy.comparable;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/12 16:54
 */
public class Cat implements Comparable<Cat> {
    int weight;
    int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    /**
     * 定义一下两只猫怎么比较大小
     * @param o 比较的Cat对象
     * @return 利用数字判断大小
     */
    @Override
    public int compareTo(Cat o) {
        if(this.weight < o.weight){
            return -1;
        }else if (this.weight > o.weight){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
