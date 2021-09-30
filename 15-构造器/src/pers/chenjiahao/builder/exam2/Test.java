package pers.chenjiahao.builder.exam2;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/22 22:55
 */
public class Test {
    public static void main(String[] args) {
        // 下面.后面的不想要的可以注掉
        Person p = new Person.PersonBuilder()
                .basicInfo(1,"zhangsan",18)
                // .score(20)
                .weight(200)
                // .loc("bj","23")
                .build();
        System.out.println(p);
    }
}
