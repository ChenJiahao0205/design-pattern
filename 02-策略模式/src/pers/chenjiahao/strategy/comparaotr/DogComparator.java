package pers.chenjiahao.strategy.comparaotr;

/**
 * Dog比较器
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/12 17:03
 */
public class DogComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.food < o2.food){
            return -1;
        }else if (o1.food > o2.food){
            return 1;
        }else{
            return 0;
        }
    }
}
