package pers.chenjiahao.iterator.v4;

/**
 * 如何对容器进行遍历?
 */
public class Main {
    public static void main(String[] args) {
        Collection_ list = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            list.add(new String("s" + i));
        }
        System.out.println(list.size());

        ArrayList_ al = (ArrayList_) list;
        for (int i = 0; i < al.size(); i++) {
            // 如果用这种方式遍历，就不能实现通用了
        }
    }
}
