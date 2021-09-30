package pers.chenjiahao.strategy.comparaotr;

import java.util.Arrays;

/**
 * 使用Comparator
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/12 17:08
 */
public class Test {
    public static void main(String[] args) {
        // 使用Comparator
        Cat[] a = {new Cat(3,3),new Cat(5,5),new Cat(1,1)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(a,new CatComparator());
        System.out.println(Arrays.toString(a));
    }
}
