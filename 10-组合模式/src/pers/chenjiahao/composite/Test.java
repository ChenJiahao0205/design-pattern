package pers.chenjiahao.composite;

/**
 * @Author ChenJiahao(程序员五条)
 * @Date 2021/9/14 19:42
 */
public class Test {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode chapter2 = new BranchNode("chapter2");
        Node c11 = new LeafNode("c11");
        Node c12 = new LeafNode("c12");
        BranchNode b21 = new BranchNode("section21");
        Node c211 = new LeafNode("c211");
        Node c212 = new LeafNode("c212");

        root.add(chapter1);
        root.add(chapter2);
        chapter1.add(c11);
        chapter1.add(c12);
        chapter2.add(b21);
        b21.add(c211);
        b21.add(c212);
        // 递归打印出树 第二个参是为了看结构的 深度
        tree(root,0);
    }

    static void tree(Node b, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("--");
        }
        b.print();
        if (b instanceof BranchNode){
            // 说明下面有子节点
            for (Node n :((BranchNode) b).nodes){
                tree(n,depth + 1);
            }
        }
    }
}
