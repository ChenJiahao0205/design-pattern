package pers.chenjiahao.strategy.comparaotr;

/**
 * Cat比较器
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/12 17:03
 */
public class CatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.weight < o2.weight){
            return -1;
        }else if (o1.weight > o2.weight){
            return 1;
        }else{
            return 0;
        }
    }
}
