package pers.chenjiahao.strategy.comparable;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/12 16:54
 */
public class Dog implements Comparable<Dog>{
    int food;

    public Dog(int food) {
        this.food = food;
    }

    /**
     * 定义一下两只狗怎么比较大小
     * @param d 比较的Dog对象
     * @return 利用数字判断大小
     */
    @Override
    public int compareTo(Dog d) {
        if (this.food < d.food){
            return -1;
        }else if (this.food > d.food){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
