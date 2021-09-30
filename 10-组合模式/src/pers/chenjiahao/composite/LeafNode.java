package pers.chenjiahao.composite;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/14 19:50
 */
public class LeafNode extends Node{
    String content;

    public LeafNode(String content){
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}
