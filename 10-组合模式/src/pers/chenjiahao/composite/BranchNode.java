package pers.chenjiahao.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/14 19:42
 */
public class BranchNode extends Node{
    List<Node> nodes = new ArrayList<>();
    String name;

    public BranchNode(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public void add(Node node){
        nodes.add(node);
    }
}
