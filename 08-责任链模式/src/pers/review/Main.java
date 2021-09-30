package pers.review;

/**
 * @Author ChenJiahao
 * @Date 2021/8/1 13:50
 */
public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        message.setMsg("大家好:)，<script>，欢迎访问 mashibing.com，大家都是996");
        // 过滤表情和HTML的链条
        FilterChain filterChain = new FilterChain();
        filterChain.add(new FaceFilter()).add(new HtmlFilter());

        // 过滤996的链条
        FilterChain filterChain1 = new FilterChain();
        filterChain1.add(new SensitiveFilter());

        // 两个链条合并(也可以单用)
        filterChain.add(filterChain1);

        // 执行链条
        filterChain.doFilter(message);
        System.out.println(message);
    }
}
