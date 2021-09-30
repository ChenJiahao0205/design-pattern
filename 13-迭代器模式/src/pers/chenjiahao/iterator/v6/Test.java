package pers.chenjiahao.iterator.v6;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/8/28 21:05
 */
public class Test {
    public static void main(String[] args) {
        String[] names = {"Robert" , "John" ,"Julie" , "Lora"};
        NameRepository namesRepository = new NameRepository(names);
        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
