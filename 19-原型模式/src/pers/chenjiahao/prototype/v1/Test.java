package pers.chenjiahao.prototype.v1;

/**
 * 浅克隆 两个对象指向同一个引用，会有影响
 * 这样克隆有个问题
 * p1对象改变了，p2对象也变了，不能这样
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/26 22:27
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        try {
            Person p2 = (Person) p1.clone();
            System.out.println(p2.age + " " + p2.score );
            System.out.println(p2.loc);

            System.out.println(p1.loc == p2.loc);
            p1.loc.street = "sh";
            System.out.println(p2.loc);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class Person implements Cloneable{
    int age = 8;
    int score = 100;
    Location loc = new Location("bj",22);

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Location{
    String street;
    int roomNo;

    public Location(String street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }
}
